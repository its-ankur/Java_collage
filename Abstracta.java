public class Abstracta {
    public static void main(String[] args) {
        abstract class Shape{
            //static method can never be abstract.
            Shape(){
                System.out.println("Shape made");
            }
            abstract void area();
        }
    }
}
