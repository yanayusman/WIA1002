public class Container<T> {
    private T t;

    // no-arg constructor
    public Container(){
    }

    public void contains(T t){
        this.t = t;
    }

    // generic method that return T datatype
    public T retrieve(){
        return t; //return the original t not the current t
    }

    // not ArrayList derrr
    public static void main(String[] args){
        Container<Integer> intContainer = new Container<>();
        Container<String> strContainer = new Container<>();

        intContainer.contains(50);
        strContainer.contains("Java");
       
        System.out.println("Integer : " + intContainer.retrieve());
        System.out.println("String : " + strContainer.retrieve());
    }
}
