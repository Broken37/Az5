public class PrototypePatternDemo {
    public static void main(String[] args) {

        System.out.println("Creating a Rectangle with width 3 and height 4.");
        Rectangle r = Rectangle(3, 4)
        System.out.println("Rectangle area is : " + r.computeArea());
        
        r.setHeight(5)
        System.out.println("Rectangle area is : " + r.computeArea());
   }
}