import java.util.*;

public class Duo <A, B> {
    private A first;
    private B second;

    public Duo(A st, B nd){
        this.first = st;
        this.second = nd;
    }

    public static void main(String[] args){
        Duo<String, Integer> firstObject = new Duo<>("john", 10);
        Duo<Double, Double> secondObject = new Duo<>(2.4, 4.1);
        
        ArrayList vehicle = new ArrayList<>();
        ArrayList transportation = new ArrayList<>();   

        ArrayList numOfCars = new ArrayList<>();
        ArrayList milesPerHour = new ArrayList<>();


    }

    public static void allTransportation(ArrayList<?> list1, ArrayList<?> list2){
    }

    public static void transportation(ArrayList<?> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
