package Main;



import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


public class Example {
    public static void main(String[] args) throws Exception {
        Map<Point, List<Heroes>> groups = new HashMap<>();

        try {
            Point point1 = new Point(123, 121);
        }
        catch (Exception e) {
            System.out.println("Неверно задана точка");
        }
        LinkedList<Heroes> list1 = new LinkedList<>();
        list1.add(new Warrior("Bob"));
    }
}
