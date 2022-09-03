package Discussion;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Discussion {
    public static void main(String[] args) {
        int a [] = new int[5];
        Arrays.fill(a,55);
        IntStream intStream = Arrays.stream(a);
        intStream.forEach(System.out::println);
        System.out.println(a.length+"Length of the array ");
        System.out.println("---------------------------->");
        int [] array = Arrays.copyOf(a,a.length*2);
        IntStream intStream1 = Arrays.stream(array);
        intStream1.forEach(e-> System.out.print(e+" "));
        System.out.println("Length of the current array "+array.length);
        a = array.clone();
        Arrays.stream(a).forEach(e-> System.out.print(e+" "));
        System.out.println("-------------------------->");
        int x = 10;
        int y = 10;
        x++;
        ++y;
        System.out.println(x+" "+y);

    }
}
