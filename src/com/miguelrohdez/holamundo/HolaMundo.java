package com.miguelrohdez.holamundo;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo con IDE 2020-06-24");
        short i = 0; //2 byte
        byte j = 0; //1 bytes
        int k = 0;  //4 bytes
        long l = 0; //8 bytes
        //Tipos de datos de puntos flotantes
        float f = 0; //4 byte
        double d = 0; //8 bytes
        //Tipo de datos para variables
        char c = 'F';
        //Tipos booleanos
        boolean b = true;
        //Arreglos
        int arregloInt[] = new int[5];
        double arregloDoble[][] = new double[5][3];
        char arrglo3D[][][] = new char[2][2][2];

        System.out.println("Haciendo pruebas de variables");
        byte edad = 22;
        short year = 2020;
        int id = 4587654;
        long largo = 922288889;

        float estatura = 1.8f;
        double resultado = 156.4654655465;

        arregloInt[2] = 5;
        arregloDoble[1][1] = 2.3;
        arrglo3D[1][0][1] = 'C';
        System.out.println("Valor del arreglo: "+arregloInt[2]);
        System.out.println("Valor del arreglo doble: "+arregloDoble[1][1]);
        System.out.println("Valor del arreglo 3D: "+arrglo3D[1][0][1]);



    }
}
