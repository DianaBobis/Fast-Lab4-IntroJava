import javax.swing.*;

/**
 * Created by Diana on 22.10.2016.
 */
public class Exercitii_lab4 {

    public static void main(String[] args) {

        //  1. Sa se determine daca un nr n exista in sir si daca da sa se afiseze, altfel sa se afiseze -1.


//        int[] sir = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
//        int nr = SkeletonJava.readIntConsole("Introduceti nr: ");
//        int v = 0;
//        int v2 = 0;
//
//          //Ex.1 varianta cu while
////        while (v < 10) {
////            if (sir[v] == nr) {
////                                v++;
////                                v2 = 1;
////            } else {
////                                v++;
////            }
////
////        }
////        if (v2 == 1)
////            SkeletonJava.printConsole("Numarul " + nr + " exista in sir");
////        else
////            SkeletonJava.printConsole("Numarul " + nr + " nu exista in sir");
//
//        //Ex. 1 varianta cu for
//        for (int i=0; i<sir.length; i++)
//            if (sir[i] == nr) {
//                v++;
//                v2=i+1;
//            }
//            else v++;
//
//        if (v2 != 0)
//           SkeletonJava.printConsole("Numarul " + nr + " exista in sir pe pozitia " + v2);
//        else
//            SkeletonJava.printConsole("Numarul " + nr + " nu exista in sir");
//    }


        //2. Se se calculeze suma primelor n numere naturale, unde n este declarat ca si
        // int n = 20; //sau o alta valoare

        //Ex. 2 varianta cu n declarat

//        int n=20;
//        int suma=0;
//        for (int i=1; i<=20; i++) {
//            suma = suma + i;
//        }
//        SkeletonJava.printConsole("Suma primelor " + n + " numere naturale este " + suma);
//        }

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
//        for (int i=1; i<=n-1; i++) {
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

       // int [] sir7 = {11,13,9,8,16};

    }
}