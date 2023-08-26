public class TipeDataNumber {
    public static void main(String[] args) {

//        INTEGER NUMBER
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInteger = 100000;
        long iniLong = 1000000000L;


//        Float Number
        float iniFloat = 10.6F;
        double iniDuble = 3.4;

        System.out.println(iniFloat + iniDuble);


//        Kode : LIterls
        int decimalInt = 34;
        int hexaDecimal = 0xFFFFF;
        int binaryDecimal = 0b101010;

//        Kode : Underscore
        long balance = 1_000_000_00L;


//        Konversi tipe data number (2)

//        1.) wdiering Casting(Otomatis)
        byte iniByte2 = 10;
        short iniShort2 = iniByte2;
        int iniInt2 = iniShort2;

//        Gabisa gini
//        byte iniByte3 = iniInt2;

//        2.) Narrowing Casting (Manual)
        int iniint2 = 1000;
        byte iniByte3 = (byte) iniInt2;
//      Hati hati apabila mengkonversi DARI YANG PALING BESAR KE YANG PALING KECIL




    }
}
