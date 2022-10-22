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

        LogicalOperations logicOp = new LogicalOperations();
        int biggest = logicOp.checkBiggerNumber(2,3);
        String fast = "FastTrackIT";
        System.out.println("The bigger number is: " + biggest);
        System.out.println(logicOp.textComp("FastTrackIT"));
        System.out.println(logicOp.textNumberReturn(fast,1));
        System.out.println(logicOp.forecast(6));
        System.out.println(logicOp.numberCompare(2));
        logicOp.printNumber(32123);
        System.out.println(logicOp.isNumberEven(9));
        System.out.println(logicOp.isEligibleToVote(19));
        System.out.println(logicOp.theMaxNumber(12,9,3));
        System.out.println(logicOp.theMaxNumber2(12,19,3));

    }
    public static void Saluta() {
        System.out.println("Hello \nDebora ");
    }

    public static void Javi() {
        System.out.println("   J    a   V     V  a   \n   J   a a   V   V  a a  \nJ  J  aaaaa   V V  aaaaa \n JJ  a     a   V  a     a ");
    }

    public static void Smile() {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '_' | ");
        System.out.println(" +-----+" );

    }

}

