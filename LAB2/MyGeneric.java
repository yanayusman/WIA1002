public class MyGeneric <E>  {
    private E e;

    public MyGeneric(){
    }

    public MyGeneric(E e){
        this.e = e;
    }

    // accessor 
    public E getE(){
        return this.e;
    }

    // mutator
    public void setE(E e){
        this.e = e;
    }

    public static void main(String[] args){
        MyGeneric<String> strObj = new MyGeneric<>("Ciao");
        MyGeneric<Integer> intObj = new MyGeneric<>(123456);

        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
}
