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
    }
}