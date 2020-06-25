package com.miguelrohdez.operadores;

public class Operadores {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        double r = 0;
        //Suma
        r = a + b;
        System.out.println("Suma de a + b: " + r);
        //Resta
        r = a - b;
        System.out.println("Resta de a - b: " + r);
        //Multiplicacion
        r = a * b;
        System.out.println("Multiplicacion de a * b: " + r);
        //Division
        r = a / b;
        System.out.println("Division de a / b: " + r);
        //Modulo
        r = a % b;
        System.out.println("Modulo de a % b: " + r);

        //Operador asiganacion
        r = 2;
        r += a;
        System.out.println(" r+=: " + r);
        r -= a;
        System.out.println(" r-=: " + r);
        r *= a;
        System.out.println(" r*=: " + r);
        r /= a;
        System.out.println(" r/=: " + r);
        r %= a;
        System.out.println(" r%=: " + r);

        //Operadores incremento y decremento
        r = 0;
        r++; //Primero asigna y luego incrementa
        ++r; //Primero incrementa y luego asigna

        //Operadores de equidad
        a = 2;
        b = 2;
        System.out.println("a es igual de b: " + (a==b) );
        System.out.println("a es diferente de b: " + (a!=b) );
        //Operadores relacionales
        a = 5;
        b = 3;
        System.out.println("a es mayor que b: " + (a>b) );
        System.out.println("%i es menor que b: " + (a<b) );
        System.out.println("a es mayor igual que b: " + (a>=b) );
        System.out.println("%i es menor igual que b: " + (a<=b) );

        //Operadores logicos
        /*
        Tabla de verdad operador AND(&&)
        |a|b|a&&b|
        |0|0|0|
        |0|1|0|
        |1|0|0|
        |1|1|1|

        Tabla de verdad operador OR(||)
        |a|b|a||b|
        |0|0|0|
        |0|1|1|
        |1|0|1|
        |1|1|1|

        Operador NOT (!variable)

         */

        boolean i = true;
        boolean j = false;
        System.out.println("i AND j: " + (i && j) );
        System.out.println("i OR j: " + (i && j) );
        System.out.println("NOT j : " + (!j) );



    }
}
