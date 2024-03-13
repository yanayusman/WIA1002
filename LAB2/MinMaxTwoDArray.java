public class MinMaxTwoDArray {
    public static <E extends Comparable<E>> E min(E[][] list){
        E minArr= list[0][0];

        for(int row = 0; row < list.length; row++){
            for(int column = 0; column < list[row].length; column++){
                if(minArr.compareTo(list[row][column]) >= 0)
                    minArr = list[row][column];
            }
        }
        return minArr;
    }

    public static <E extends Comparable<E>> E max(E[][] list){
        E maxArr = list[0][0];

        for(int row = 0; row < list.length; row++){
            for(int column = 0; column < list[row].length; column++){
                if(maxArr.compareTo(list[row][column]) <= 0)
                    maxArr = list[row][column];
            }
        }
        return maxArr;
    }

    public static void main(String[] args) {
        Integer[][] numbers = {{4, 5, 6}, {1, 2, 3}};              

        System.out.println("Minimum number : " + min(numbers));
        System.out.println("Maximum number : " + max(numbers));
    }
}
