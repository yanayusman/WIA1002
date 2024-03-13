public class CompareMax {
    public static <T extends Comparable<T>> T maximum(T c1, T c2, T c3){
        if(c1.compareTo(c2) > 0 && c1.compareTo(c3) > 0)
            return c1;
        if(c2.compareTo(c3) > 0 && c2.compareTo(c3) > 0)
            return c2;
        if(c3.compareTo(c1) > 0 && c3.compareTo(c2) > 0)
            return c3;
        else
            return null;
    }

    public static void main(String[] args) {
        System.out.println("Maximum number : " + maximum(234, 54, 5435));
    }
}
