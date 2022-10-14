public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello\nDebora");
//        System.out.println(6+3);
//        System.out.println(10.0/3);
//        System.out.println( -5 + 8 * 6);
//        System.out.println((55+9) % 9);
//        System.out.println(20 + -3*5 / 8);
//        System.out.println(5 + 15 / 3 * 2 - 8 % 3 );
//        System.out.println("Hello world!");
//        byte myByteVariable = 100;
//        String myString = " ceva ";
//        System.out.println(myByteVariable);
//        myByteVariable += 2; // myByteVariable = myByteVariable + 2;
//        System.out.println(myByteVariable);
//        int x = myByteVariable + 2;
//        System.out.println(myByteVariable);
//        System.out.println(x);
//        int z = x + myByteVariable;
//        System.out.println("valoarea z: " + z);
//        System.out.println(100 + 200);
//        System.out.println("rezultatul este: " + (x + 100 + 200));
//        double a = 123123.123;
//        float q = 123.123F;
//        long o = 12311231231231L;
//        String author = "Cosmin" + "" + " " + "";
//        int duration = 20;
//        int nrCursanti = 15;
//        int nrCursantiFizic = 4;
//        String poveste = author + " pleaca la cursul QA29 la ora 17:00 de acasa, pe ruta\n" +
//                "Turda - Cluj. Pe drum, " + author + " face " + duration + " de minute. Cursul de azi este de Java,\n" +
//                "si va tine 3 ore. La curs au fost 20 de cursanti. Din acesti 20 de cursanti, 4 au fost\n" +
//                "fizic, iar restul de " + (nrCursanti - nrCursantiFizic) + " au fost online. Lui " + author + " ii place tare mult cursul de Java.";
//        System.out.println(poveste);
//        int i = 2;
//        i += i += i++ + ++i;
//        System.out.println(i++);
//        System.out.println(i);
//*/
////        float aaa = 15 / 2f;P
        Saluta();

        int s = Sum(2,3);
        System.out.println(s);
        float r = Rest(10,3);
        System.out.println(r);
        float o1 = Oper1(-5,8,6);
        System.out.println(o1);
        float o2 = Oper2(55,9,9);
        System.out.println(o2);
        float o3 = Oper3(20,-3,5,8);
        System.out.println(o3);
        float o4 = Oper4(5,15,3,2,8,3);
        System.out.println(o4);
        Java();
        float m = Med(1,2,3);
        System.out.println(m);
       double d = Distanta(2);
        System.out.println(d);
        float t = (float) Temperatura(100);
        System.out.println(t+" grade Celsius");
       String v = Viteza(1000,0,6,0);
        System.out.println(v);


    }



    public static void Saluta() {
        System.out.println("Hello \nDebora ");
    }
    public static int Sum(int first, int second) {
        int result = first + second;
        return result;
    }

    public static float Rest(float first, float second){
        float result = first/second;
        return result;
    }
    public static float Oper1(float first, float second, float third) {
        float result = first + second * third;
        return result;
    }
    public static float Oper2(float first, float second, float third) {
        float result = (first + second) % third;
        return result;
    }
    public static float Oper3(float first, float second, float third,float forth) {
        float result = first + second * third/forth;
        return result;
    }public static float Oper4(float first, float second, float third, float forth, float fifth,float sixth) {
        float result = first + second / third*forth-fifth%sixth;
        return result;
    }
    public static void Java() {
        System.out.println("   J    a   V     V  a   \n   J   a a   V   V  a a  \nJ  J  aaaaa   V V  aaaaa \n JJ  a     a   V  a     a ");
    }
    public static float Med(float first, float second, float third) {
        float result = (first + second + third)/3;
        return result;
    }

    public static double Distanta(float first){
        double result = first * 0.0254;
        return result;
    }
    public static double  Temperatura(float first){
       float result = (float) (5.0/9*(first-32));
        return result;
    }
    public static String  Viteza(float first, int second, int third, int forth){
        float result1 = (float) (first/(second*360+third*60+forth));
        float result2 = (float) (result1*1000/360);
        float result3 = (float) (result1*1609/360);
        String s= result1+ "  m/s \n" + result2 + "  km/h \n" + result3 + "  mile/h";
        return s;

    }


}

