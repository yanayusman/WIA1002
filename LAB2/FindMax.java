public class FindMax {

    private static class Circle implements Comparable<Circle>{
        private double radius;

        Circle(double rad){
            this.radius = rad;
        }

        @Override
        public int compareTo(Circle r){
            if(this.radius > r.radius)
                return 1;
            if(this.radius < r.radius)
                return -1;
            else 
                return 0;
        } 

        public String toString(){
            return Double.toString(this.radius);
        }
    }
    
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];

        for(int i = 0; i < list.length; i++){
            if(max.compareTo(list[i]) < 0)
            max = list[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] arrI = {1, 2, 3};
        String[] arrS = {"red", "green", "blue"};
        Circle[] arrO = {new Circle(3), new Circle(2.9), new Circle(5.9)};

        System.out.println("Integer array : " + max(arrI));
        System.out.println("String array : " + max(arrS));
        System.out.println("Object array : " + max(arrO));
    }
    
}