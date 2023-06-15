import java.util.ArrayList;

public class ConvertList {
    public void ConvertList() {

    }

    public ArrayList<Integer> convertList(int[] arry){
        ArrayList<Integer> list = new ArrayList();
        for(int i =arry.length-1; i>=0; i--) {
            list.add(arry[i]);
        }
        return list ;
    }
}