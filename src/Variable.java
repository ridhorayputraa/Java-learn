public class Variable {
    public static void main(String[] args) {
        
// Kalo ga pengen langsung inisilaalsiasi
        String name;
//        default value nya nul
        name = "Ridho ganteng";

        System.out.println(name);

//        Kalo pengen langsung di inisialisasi bisa
        int age = 19;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Ridho ray putra";

        System.out.println(name);


//        Part Var
        var fitstName = "Ridho";
        var middleName = "Ray";
        var lastName = "Putra";
        var umur = 20;

        var desc = "My age is" + " " + umur;

        System.out.println(fitstName + " " + middleName + " " + lastName +  " " + desc);

//        kata Kunci Final
        final String Namesaya = "Ridho";
//        Namesaya = "Ray";

    }
}
