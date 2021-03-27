package Service;

public class GoNeng implements HelloService{
    @Override
    public int print(String name) {
        System.out.println("其他人写好的一个功能方法...");
        return 2;
    }
}
