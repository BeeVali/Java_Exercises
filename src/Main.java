import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Basics PART1
        //1 Afisare Hello si numele meu
        /*
         System.out.println("Hello");
        System.out.println("Necula Valentin-Cristian");
        */
        //2 Suma 2 numere
        /*
         int sum=0;
        Scanner sc = new Scanner(System.in);
        int a2 = sc.nextInt();
        int b2= sc.nextInt();
        sum=a2+b2;
        System.out.println("The sum of these 2 numbers is " + sum);
        */
        //3 Impartirea a 2 numere
        /*
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int div=a/b;
        System.out.println(div);
         */
        //4 Operatii
        /*
        System.out.println(-5+(8*6));
        System.out.println((55+9)%9);
        System.out.println(20+(-3*5)/8);
        System.out.println(5+(15/3*2)-(8%3));
         */
        //5 Produsul a 2 numere
        /*Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int prod=a*b;
        System.out.println(a+" X " + b+ " = " + prod);
        */
        //6 Suma, Scaderea, Inmultirea, Impartirea, Modulus
        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=a+b;
        int scad=a-b;
        int inm=a*b;
        int imp=a/b;
        int mod=a%b;
        System.out.println(sum + " " + scad + " " + inm + " " + imp + " " + mod);
         */
        // 7 n de la tastatura si inmultirea lui de la 1 -> 10
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(n + " x " + i + " = " + n*i);
         */
        //8 Scrie JAVA cu System.out.println
        /*
        System.out.println("    J     a   v      v    a     ");
        System.out.println("    J    a a   v    v    a a    ");
        System.out.println(" J  J   aaaaa   v  v    aaaaa   ");
        System.out.println("  JJ   a     a    v    a     a  ");
        */
        //9 Testare calcul: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        /*
        double n=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(n);
       */
        //10 Testare calcul: 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)
        /*
        double n=4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(n);
        */
        //11  Raza = 7.5; P,A= ?
        /*
        double r=7.5;
        double Perimetru=2*Math.PI*r;
        double Arie=Math.PI*Math.pow(r,2);
        System.out.println(Perimetru + " " + Arie);
        */
        //12 Media aritmetica a 3 nr.
        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        int ma=sum/3;
        System.out.println(ma);
        */
    }
}