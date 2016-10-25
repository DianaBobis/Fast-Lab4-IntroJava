import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by Diana on 22.10.2016.
 */
public class Exercitii_lab4 {

    public static void main(String[] args) {

        //  1. Sa se determine daca un nr n exista in sir si daca da sa se afiseze, altfel sa se afiseze -1.

//
//        int[] sir = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
//        int nr = SkeletonJava.readIntConsole("Introduceti nr: ");
//        int v = 0;
//        int v2 = 0;
//
//          //Ex.1 varianta cu while
//        while (v < 10) {
//            if (sir[v] == nr) {
//                v++;
//                v2 = 1;
//            } else {
//                v++;
//            }
//
//        }
//        if (v2 == 1)
//            SkeletonJava.printConsole("Numarul " + nr + " exista in sir");
//        else
//            SkeletonJava.printConsole("Numarul " + nr + " nu exista in sir");
//
//        //Ex. 1 varianta cu for
//        for (int i=0; i<sir.length; i++) {
//            if (sir[i] == nr) {
//                v++;
//                v2 = i + 1;
//            } else v++;
//        }
//
//        if (v2 != 0)
//           SkeletonJava.printConsole("Numarul " + nr + " exista in sir pe pozitia " + v2);
//        else
//            SkeletonJava.printConsole("Numarul " + nr + " nu exista in sir");



        //2. Se se calculeze suma primelor n numere naturale, unde n este declarat ca si
        // int n = 20; //sau o alta valoare

        //Ex. 2 varianta cu n declarat

//        int n=20;
//        int suma=0;
//        for (int i=1; i<=n; i++) {
//            suma = suma + i;
//        }
//        SkeletonJava.printConsole("Suma primelor " + n + " numere naturale este " + suma);


        //Ex.2 Varianta in care n se citeste de la tastatura
//        int suma = 0;
//        int n = SkeletonJava.readIntConsole("Introduceti un numar natural");
//        for (int i = 1; i <= n; i++) {
//            suma = suma + i;
//        }
//        SkeletonJava.printConsole("Suma primelor " + n + " numere naturale este " + suma);


        //3. Se citesc numere naturale pânã când se introduce numãrul 0.
        // Afisati suma obtinutã prin adunarea doar a numerelor mai mari decat 4 si mai mici decat 11.

//        int suma=0;
//        int nr=0;
//        do {
//        nr = SkeletonJava.readIntConsole("Introduceti un numar natural: ");
//        if (nr>4 && nr<11)
//            suma=suma+nr;}
//        while (nr!=0);
//    SkeletonJava.printConsole("Suma numerelor mai mari decat 4 si mai mici decat 11 este "+suma);


        //4. Se da un numar. Sa se afiseze ‘true' daca numarul apartine intervalului [9,24].
        // Altfel sa se afiseze ‘false'.

//        int test=0;
//        int n=SkeletonJava.readIntConsole("Introduceti un nr: ");
//        for (int i=9; i<=24; i++) {
//            if (n==i)
//            test=1;
//        }
//        if (test==1)
//            SkeletonJava.printConsole("true");
//        else
//            SkeletonJava.printConsole("false");


        //5. Se dau doua numere a si n. sa se afiseze numarul a la puterea n

//        int a=SkeletonJava.readIntConsole("Introduceti numarul: ");
//        int n=SkeletonJava.readIntConsole("Introduceti puterea");
//        int b=a;
//        for (int i=1; i<n; i++) {
//            b=b*a;
//
//        }
//        SkeletonJava.printConsole(a +" la puterea " + n + " este " + b);

        //6. Sa se calculeze factorialul unui numar a .

//        int a=SkeletonJava.readIntConsole("Introduceti numarul: ");
//
//        int fact=1;
//        for(int i=1; i<=a; i++) {
//            fact=fact*i;
//        }
//        SkeletonJava.printConsole("Factorialul lui " + a + " este " + fact);


        //7. Se da un sir de numere. Sa se afiseze perechile de numere pentru care
        // primul numar este mai mare decat al doilea.

//        int [] sir7 = {29,26,9,8,5};
//        java.util.List RezultatInt = new ArrayList<Integer>();
//        java.util.List RezultatFin = new ArrayList<Integer>();
//
//        for(int i=0; i<sir7.length-1; i++) {
//            if (sir7[i]>sir7[i+1]) {
//                RezultatInt.add(sir7[i]);
//                RezultatInt.add(sir7[i+1]);
//
//            }
//        }
//            RezultatFin=RezultatInt;
//
//            System.out.println(RezultatFin);
        // Cum se poate afisa rezultatul sub forma de perechi?




        //8. Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
        //suma = 1+(x la puterea 1) +(x la puterea 2) + (x la puterea 3) + ….+ (x la puterea n) .

//        int x=SkeletonJava.readIntConsole("Introduceti un numar: ");
//        int n=SkeletonJava.readIntConsole("Introduceti puterea: ");
//        int b=1;
//        int suma=0;
//
//        for (int i=1; i<=n; i++) {
//            b = b * x;
//            suma = suma + b;
//
//        }
//        suma++;
//        System.out.println("Suma puterilor lui "+x+ " pana la puterea "+n+" este: "+ suma );

        //9. Se da un sir. Sa se verifice daca sirul este ordonat crescator ,
        // iar daca nu este sa se ordoneze si sa se afiseze in ordine crescatoare
        //de ex pt sirul {2,3,4} se va afisa “crescator” iar pt sirul {3,2,4}  si va ordina si afisa {2,3,4}
//
//        int[] sir1 = {1,3,4,5,6,5};
//        java.util.List Cresc = new ArrayList<Integer>();
//        int a = 0;
//        String test = "0";
//        for (int i = 0; i < sir1.length; i++) {
//            for (int j = i + 1; j < sir1.length; j++) {
//                if (sir1[i]<sir1[j]) {
//                    test = "crescator";
//                }
//
//                else  {
//                    a = sir1[j];
//                    sir1[j] = sir1[i];
//                    sir1[i] = a;
//                    Cresc.add(sir1[i]);
//                }
//
//
//            }
//
//        }
//        if (Cresc.isEmpty())
//            System.out.println(test);
//            else
//
//            System.out.println(Cresc); //incorect



        //10. Se da un sir. Pentru prima jumatate a sirului sa se afiseze numerele dublate, iar pentru
        // a doua jumatate sa se afseze numerele triplate daca sunt impare si numerele asa cum sunt in sir daca sunt pare.

//        int[] sir10 = {1, 5, 6, 9, 7, 8, 1, 3, 5, 10};
//        java.util.List SirFin = new ArrayList<Integer>();
//
//        for (int i = 0; i < (sir10.length / 2); i++) {
//            sir10[i] = sir10[i] * 2;
//            SirFin.add(sir10[i]);
//        }
//
//            for (int j = sir10.length/2; j < sir10.length; j++) {
//                if (sir10[j] % 2 != 0) {
//                    sir10[j] = sir10[j] * 3;
//                    SirFin.add(sir10[j]);
//                }
//                  else SirFin.add(sir10[j]);
//
//        }
//
//            System.out.println(SirFin);


        //11. Se da un sir. Sa se extraga toate numerele intre doua valori si
        // sa se puna intr-un alt sir care apoi sa se afiseze.

//        int [] sir11 = {12, 5, 89, 100, 2, 56, 9, 3, 40};
//        java.util.List Interval = new ArrayList <Integer>();
//        int a = SkeletonJava.readIntConsole("Capatul 1 de interval: ");
//        int b = SkeletonJava.readIntConsole("Capatul 2 de interval: ");
//
//        for (int i=0; i<sir11.length; i++) {
//            if (sir11[i]>a && sir11[i]<b)
//                Interval.add(sir11[i]);
//        }
//
//        System.out.println(Interval);

    }
}