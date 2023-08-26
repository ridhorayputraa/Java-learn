public class TipeDataBukanPrimitiif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 100000L;

        Byte iniByte = null;
//        harus di berikan value sebagai default
//        value adalah null

        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

//    konversi dari primitif ke bukan primitf
        int iniInt = 100;
Integer iniIntegerBukanPrimitif = iniInt;


//  Konversi dari tipe primitf
        int age = 30;

//        Punya property Object untuk komnversi nya
        Integer iniObject = age;

//        tipe data yang bukan primif punya function/method
        short iniShort = iniObject.shortValue();
long iniLong2 = iniObject.longValue();
float  inFloat = iniObject.floatValue();
    }
}


