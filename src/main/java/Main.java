import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5,5);
        Circle circle = new Circle(5);
        System.out.println(circle.getArea());
        System.out.println(cylinder.getVolume());
        Rectangle rectangle = new Rectangle(12,52);
        System.out.println(rectangle.getArea());
        Cuboid cuboid = new Cuboid(12,52,5);
        System.out.println(cuboid.getVolume());
    }
}