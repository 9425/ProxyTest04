package Test;

import Hander.MyInvocationHander;
import Service.GoNeng;
import Service.HelloService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        GoNeng goNeng=new GoNeng();
        //放入需要代理的对象，执行代理对象中的方法
        InvocationHandler handler=new MyInvocationHander(goNeng);
        System.out.println("goNeng.GetClass().getInterfaces()="+goNeng.getClass().getInterfaces()[0].getName());
        HelloService proxy=(HelloService) Proxy.newProxyInstance(goNeng.getClass().getClassLoader(),goNeng.getClass().getInterfaces(),handler);
        int num=proxy.print("市场...");
        System.out.println("我们期望的 num=="+num);
    }
}
