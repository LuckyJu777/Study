package shapeTest;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShapTest {

    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<>();
        //객체 생성
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        list.add(c);
        list.add(r);
    }

}