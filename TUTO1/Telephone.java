public class Telephone{
    // instance variable
    private String areaCode;
    private String number;
    private static int numberOfTelephoneObject = 0;

    // constructor
    public Telephone(String areacode, String num){
        this.areaCode = areacode;
        this.number = num;
        // numberOfTelephoneObject++;
        // System.out.println(numberOfTelephoneObject);
    }

    // accessor method
    public String getAreaCode(){
        return this.areaCode;
    }
        
    public String getNumber(){
        return this.number;
    }

    // mutator method
    public void setAreaCode(String areaCode){
        this.areaCode = areaCode;
    }

    public void setNumber(String num){
        this.number = num;
    }

    // method
    public String makeFullNumber(){
        return areaCode + "-" + number + numberOfTelephoneObject++;
    }

}