import java.util.ArrayList;
import java.util.Collections;

public class SampleJava {

    public static void main(String[] args) {
        sampleList();
        sampleList1();
    }

    public static void sampleList(){
        ArrayList list = new ArrayList();
        list.add("Testing");
        list.add("Kuzhanthaiyesu");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    public static void sampleList1(){
        ArrayList list = new ArrayList();
        list.add("Testing");
        list.add("Kuzhanthaiyesu");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
