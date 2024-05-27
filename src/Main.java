public class Main {
    public static void main(String[] args) {
        // task1
        byte varByte=1;
        int varInt=200;
        short varShort=10000;
        long varLong=10000000L;
        float varFloat=5.5f;
        double varDouble=3.14159265358;
        System.out.println("Значение переменной varByte с типом byte равно: "+varByte);
        System.out.println("Значение переменной varInt с типом int равно: "+varInt);
        System.out.println("Значение переменной varShort с типом short равно: "+varShort);
        System.out.println("Значение переменной varLong с типом long равно: "+varLong);
        System.out.println("Значение переменной varFloat с типом float равно: "+varFloat);
        System.out.println("Значение переменной varDouble с типом double равно: "+varDouble);
        //task2
        float a=27.12f;
        long b=987678965549L;
        float c=2.786f;
        short d=569;
        int e=-159;
        short f=27897;
        byte g=67;
        //task3
        byte class1=23;
        byte class2=27;
        byte class3=30;
        short totalPaper=480;
        System.out.println("На каждого ученика рассчитано "+(totalPaper/(class1+class2+class3))+" листов бумаги");
        //task4
        byte productivityPerMinute=16/2;
        byte time1=20;
        short time2=60*24;
        int time3=time2*3;
        int time4=time2*30;
        System.out.println("За 20 минут машина произвела "+(productivityPerMinute*time1)+" бутылок");
        System.out.println("За сутки машина произвела "+(productivityPerMinute*time2)+" бутылок");
        System.out.println("За 3 дня машина произвела "+(productivityPerMinute*time3)+" бутылок");
        System.out.println("За месяц (30 дней) машина произвела "+(productivityPerMinute*time4)+" бутылок");
        //task5


    }
}