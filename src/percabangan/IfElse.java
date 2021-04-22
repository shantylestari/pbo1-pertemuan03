package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDidompet = 25000;

        if(uangDidompet<totalBelanja){
            System.out.println("Uang Kurang, kurangi jajan anda");
        }else{
            System.out.println("Uang cukup, selamat menikmati");
        }
    }
}
