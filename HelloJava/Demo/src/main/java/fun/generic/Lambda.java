package fun.generic;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda {
    public static void main(String[] args) {

        long time1 = System.currentTimeMillis();
        Integer[] a={2,43,12,87,64,86,14,74,32,123,45,67,89,12,34,56,78,90};

        //匿名内部类
        Arrays.sort(a,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;}
        });
        System.out.println(Arrays.toString(a));
        long time2 = System.currentTimeMillis();
        System.out.println("cost time:"+(time2-time1)+"ms");

        //lambda表达式
        Arrays.sort(a,(o1, o2)-> {
            return o1-o2;
        });
        System.out.println(Arrays.toString(a));
    }
}
