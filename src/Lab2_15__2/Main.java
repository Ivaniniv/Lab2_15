package Lab2_15__2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Alex on 16.03.2016.
 */
public class Main {
    public static void main (String [] args){
        List<String> list = new LinkedList<>();
        for (int i=0; i<=10; i++){
            Random random = new Random();
            int position = random.nextInt(list.size() + 1);
            list.add(position, "number_" + i);
        }
        for (String element:list) {
            System.out.println(element);
        }
    }

}
