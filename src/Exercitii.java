/**
 * Created by Diana on 22.10.2016.
 */
public class Exercitii {
    public static void main(String[] args) {
       /* int a= SkeletonJava.readIntGUI("introduceti primul numar");
        int b= SkeletonJava.readIntGUI("introduceti al doilea numar");
        double avg = (a+b)/2.0;
        SkeletonJava.printGUI("media este" + avg);*/

       /* int suma = 0;
        int max = SkeletonJava.readIntGUI("Cate numere");
        for (int i = 0; i < max; i++) {
            int val = i+1;
            int a = SkeletonJava.readIntGUI("Introduceti nr" + val + ":");
            suma = suma + a;

        }
        double media = suma / (double) max;
        SkeletonJava.printConsole("media este" + media);*/



      /* int nr = 0;
        int suma = 0;
       while (true) {
           nr++;
          int a = SkeletonJava.readIntGUI("Introduceti nr");
           if (a <= 0) {
               //nr--;
                   break;}
           suma = suma + a;
       }
       double media = suma / (nr-1);
        SkeletonJava.printGUI("media este" + media);*/

      int max = 0;
      int counter = 0;
      while (true) {
          counter++;
          int a = SkeletonJava.readIntGUI("introduceti un nr:");
          if (a<=0) {
              break;
          }
            if(max<a) {
                max = a;
            }

          }
          SkeletonJava.printGUI("Maximul este" + max);
          }
      }

