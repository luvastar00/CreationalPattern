
package Bai3;

/**
 *
 * @author GIGABYTE
 */
public class Main {
    
    public static void main(String[] args) {
        ShapeFactory shape = new ShapeFactory();
        
        Shape circle = shape.createShape(ShapeType.circle);
        circle.setBrush("dùng bút màu");
        circle.setFrame("không khung");
        circle.setPaper("vẽ trên giấy");
        System.out.println(circle.toString());
        
        Shape circle2 = Circle.createInstance();
        circle2.setBrush("dùng bút chì");
        circle2.setFrame("khung gỗ");
        circle2.setPaper("vẽ lên vải");
        System.out.println(circle.toString());
        
        Shape rectangle = shape.createShape(ShapeType.rectangle);
        System.out.println(rectangle.toString());
        Shape rectangle2 = shape.createShape(ShapeType.rectangle);
        rectangle2.setPaper("vẽ lên vải");
        System.out.println(rectangle.toString());
    }
}