interface Engine{//interfaces are purely abstract class
    void start();
}
interface Music extends Engine{
    void sound();
}
class Car implements Engine,Music{
    public void start(){
        System.out.println("Engine Started");
    }
    public void sound(){
        System.out.println("Honk");
    }
}

public class Interface {
    public static void main(String[] args) {
        Car a=new Car();
        a.start();
        a.sound();
    }
}
