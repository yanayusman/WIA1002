public class Q1{
    public static void main(String[] args) {
        Telephone[] telephone = new Telephone[5];

        for(int i = 0; i < telephone.length; i++){
            telephone[i] = new Telephone("03", "7967630");
        }

        for(Telephone tele : telephone){
            System.out.println(tele.makeFullNumber());
        }
    }
}