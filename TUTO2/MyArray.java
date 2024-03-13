import java.util.*;

public class MyArray {
    public static void main(String[] args){
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Jane", "Tom", "Bob"};
        Character[] character = {'a', 'b', 'c'};

        listAll(numbers);
        listAll(names);
        listAll(character);
    }

    public static <T> void listAll(T[] arrays){
        System.out.println("Array : ");
        for(T array : arrays){
            System.out.println(array + "");
        }
        System.out.println();
    }
}
