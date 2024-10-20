import java.util.ArrayList;

public class ListTest02 {

    public static void main(String[] args) {
        int array[] = {3,4,2,5,2,3,6,7,5,7,9};

        ConvertList li = new ConvertList();
        ArrayList<Integer> list = li.convertList(array);

        System.out.println(list.toString());
    }

}