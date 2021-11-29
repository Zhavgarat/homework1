package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //1
        byte s = 1;
        short m = 170;
        int e = 50000;
        long v = 10000000000000L;
        float p = 1.5f;
        double j = 2.0000004;
        System.out.println(s);
        System.out.println(m);
        System.out.println(e);
        System.out.println(v);
        System.out.println(p);
        System.out.println(j);

        //2
        float boxerOne = 78.2f;
        float boxerTwo = 82.7f;
        float boxerWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес двух бойцов равен " + boxerWeight + "кг");
        float difWeight = boxerTwo - boxerOne;
        System.out.println("Разница между весами бойцов " + difWeight + "кг");

        //3
        byte bananasSh = 5;
        byte bananasWeightOne = 80;
        int bananasWeight = bananasSh * bananasWeightOne;
        short milkSh = 200;
        short milkWeightOne = 105;
        int milkWeight = (milkSh / 100) * milkWeightOne;
        byte iceSh = 2;
        byte iceWeightOne = 100;
        int iceWeight = iceSh * iceWeightOne;
        byte eggSh = 4;
        byte eggWeightOne = 70;
        int eggWeight = eggSh * eggWeightOne;

        int allWeight = bananasWeight + milkWeight + iceWeight + eggWeight;
        System.out.println("Вес завтрака в граммах " + allWeight);
        int Kg = 1000;
        float engWeight = (float) allWeight/Kg;
        System.out.println("Вес завтрака в килограммах " + engWeight);

        //4
        byte u = 7;
        int gramInKg = 1000;
        int q = 250;
        int r = 500;
        int n = u * gramInKg;
        int howQ = n / q;
        System.out.println("Если боец будет худеть на 250г в день, то он похудеей за " + howQ + " дней");
        int howR = n / r;
        System.out.println("Если боец будет худеть на 500г в день, то он похудеей за " + howR + " дней");
        int meanDay = (howQ + howR)/2;
        System.out.println("Среднее количество дней, чтобы боец похудел " + meanDay);

        //5
        int Masha = 67760;
        int Denis = 83690;
        int Kris = 76230;
        float add = 10/100f;
        byte months = 12;
        float addMasha = (Masha * add) + Masha;
        int MashaOldYear = Masha * months;
        float MashaNewYear = addMasha * months;
        float MashaDif = MashaNewYear - MashaOldYear;
        System.out.println("Маша теперь получает " + addMasha + " рублей. Годовой доход вырос на " + MashaDif + " рублей");

        float addDenis = (Denis * add) + Denis;
        int DenisOldYear = Denis * months;
        float DenisNewYear = addDenis * months;
        float DenisDif = DenisNewYear - DenisOldYear;
        System.out.println("Денис теперь получает " + addDenis + " рублей. Годовой доход вырос на " + DenisDif + " рублей");

        float addKris = (Kris * add) + Kris;
        int KrisOldYear = Kris * months;
        float KrisNewYear = addKris * months;
        float KrisDif = KrisNewYear - KrisOldYear;
        System.out.println("Кристина теперь получает " + addKris + " рублей. Годовой доход вырос на " + KrisDif + " рублей");

    }
}
