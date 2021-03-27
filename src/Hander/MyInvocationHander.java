package Hander;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHander implements InvocationHandler {
    private  Object target=null;
    //1.传入需要代理的对象
    public MyInvocationHander(Object target){
        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //我在项目中记录数据库
        //调用目标方法，执行peint()得到2

        //此处进行功能增强
        Object res=method.invoke(target,args);
        if (res!=null){
            Integer num=(Integer)res;
            res=num*2;
        }
        return res;
    }
}
