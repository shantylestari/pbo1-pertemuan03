package string;

public class OperasiString {
    public static void main(String[] args) {
        String Kota = "Yogyakarta";
        System.out.println(Kota);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);

        System.out.println(uniskaString);

        System.out.println(Kota.toUpperCase());
        System.out.println(Kota.toLowerCase());
        System.out.println(Kota.substring(5));
        System.out.println(Kota.substring(0,4));

    }
}
