package ArrayListproblems;

import java.util.ArrayList;
import java.util.Collections;

public class basic
{
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(5);//5
        list.add(10);//5 10
        list.add(15);//5 10 15
        list.add(1,8);//5 8 10 15
        list.set(2,3);//5 8 3 15
        list.remove(3);//5 8 3
        Collections.sort(list);//3 5 8
     
        for(int i=0;i<list.size();i++)
        {   
            int val=list.get(i);
            System.out.println(val);
        }
    }
}
