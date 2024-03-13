public class MinMax {
    public static <T extends Comparable<T>> String minmax (T[] arr){
        T min = arr[0];
        T max = arr[0];
        
        for(int i = 0; i < arr.length; i++){
            if(min.compareTo(arr[i]) > 0) // > 0 == min when compare min first
                min = arr[i];
            else if(max.compareTo(arr[i]) < 0) // < 0 == max when compare max first
                max = arr[i];
        }
        return "Min = " + min.toString() + " Max = " + max.toString();
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 7, 1, 4, 9, 8, 2};
        String[] strArray = {"red", "blue", "orange", "tan"};

        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
}
