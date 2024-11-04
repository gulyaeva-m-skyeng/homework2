///1 задача
public class Main {
    public static void main(String[] args) {
        int myInt = 15;
        byte myByte = 12;
        short myShort = 31;
        long myLong = 15000000000L;
        float myFloat = 2.5f;
        double myDouble = 3.2;
        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myByte с типом int равно " + myByte);
        System.out.println("Значение переменной myShort с типом int равно " + myShort);
        System.out.println("Значение переменной myLong с типом int равно " + myLong);
        System.out.println("Значение переменной myFloat с типом int равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом int равно " + myDouble);
    }
}
//2 задача

public class Main {
    public static void main(String[] args) {
        double a = 27.12;
        long b = 987678965549L;
        float с = 2.786f;
        int d = 569;
        short e = 27897;
        byte g = 67;
    }
}

//3 задача
public class Main {
    public static void main(String[] args) {
        int studentsOfClass1 = 23;
        int studentsOfClass2 = 27;
        int studentsOfClass3 = 30;
        int totalSheets = 480;

        int totalStudents = studentsOfClass1 + studentsOfClass2 + studentsOfClass3;
        int sheetsPerStudent = totalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано" + sheetsPerStudent + " листов бумаги");
    }
}

//4 задача
public class Main {
    public static void main(String[] args) {
        int bottlesPerMinute = 8;
        int minutesInDay = 1440;
        int minutesIn3Day = 3 * minutesInDay;
        int minutesInMonth = 30 * minutesInDay;

        int bottlesIn20Minutes = bottlesPerMinute * 20;
        int bottlesInDay = bottlesPerMinute * minutesInDay;
        int bottlesIn3Days = bottlesPerMinute * minutesIn3Day;
        int bottlesInMonth = bottlesPerMinute * minutesInMonth;


        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        System.out.println("За сутки машина производит " + bottlesInDay + "  штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesInMonth + " штук бутылок");
    }
}

//5 задача
public class Main {
    public static void main(String[] args) {
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;


        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;

        System.out.println("В школе, где " + totalClasses + " классов, нужно" + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");
    }
}

//6 задача
public class Main {
    public static void main(String[] args) {
        int bananasCount = 5;
        int bananasWeight = 80;
        int milkVolume = 200;
        double iceCreamWeight = 2 * 100;
        int eggsCount = 4;
        int eggsWeight = 70;

        int totalWeight = bananasCount * bananasWeight + milkVolume * 105 / 100 + (int) iceCreamWeight + eggsCount * eggsWeight;
        double totalWeightInKg = totalWeight / 1000.0;

        System.out.printf("Общий вес завтрака: %d грамм (%.2f кг)", totalWeight, totalWeightInKg);
    }
}