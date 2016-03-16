package Lab2_15__1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 16.03.2016.
 */
public class Main {
    public static void main (String [] args){
        List<String> list = new ArrayList<>();
        for (int i=0; i<=10; i++){
            list.add("number_" + i);
        }
        for (String element:list) {
            System.out.println(element);
        }
    }

}
