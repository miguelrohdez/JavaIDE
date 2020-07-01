package com.miguelrohdez.POO;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        //Definiciendo el ArrayList Peliculas
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        //Definiciendo el ArrayList Series
        ArrayList<Serie> series = new ArrayList<Serie>();
        /*
        Pelicula miPeli = new Pelicula("El titulos", "Yo");
        Serie miSerie = new Serie("La serie", "Yo");
        Pelicula []peliculas = new Pelicula[5];
        Serie []series = new Serie[5];
        */
        //Creando las peliculas
        try {
            peliculas.add( new Pelicula() );
            peliculas.add( new Pelicula("La red social", "David Fincher") );
            peliculas.add( new Pelicula("Toy Story 3", "Lee Unkrich") );
            peliculas.add( new Pelicula("El Señor de los Anillos: las dos torres", "Fantasia/Aventura", "Peter Jackson", 223, 2002) );
            peliculas.add( new Pelicula("Gladiador", "Accion/Aventura", "Ridley Scott", 171, 2000) );
            //Creando las series
            series.add( new Serie() );
            series.add( new Serie("Juego de tronos", "HBO") );
            series.add( new Serie("Breaking Bad", "Vince Gilligan") );
            series.add( new Serie("Vikingos", "Aventura/Drama/Historica", "History Channel", 60, 6) );
            series.add( new Serie("Friends", "Comedia", "Marta Kauffman", 22, 10) );

            //Marcando en Visto Peliculas y Series
            peliculas.get(3).marcarVisto();
            peliculas.get(4).marcarVisto();
            series.get(3).marcarVisto();
            series.get(4).marcarVisto();

            //Estableciendo tiempo total visto
            peliculas.get(3).tiempoVisto(670);
            peliculas.get(4).tiempoVisto(1200);
            series.get(3).tiempoVisto(3060);
            series.get(4).tiempoVisto(4187);
           // series.add( new Serie());

        }catch (Exception e){
            System.out.println("Ocurrio un error al declarar las peliculas");
            e.printStackTrace();
        }

        System.out.println("****************** Mostrando todas las Peliculas y Series ******************");

        for (Pelicula todasPelis : peliculas)
            todasPelis.toString();
        for (Serie todasSeries : series)
            todasSeries.toString();


        System.out.println("****************** Mostrando todas las Peliculas y Series que se visualizaron ******************");

        for (Pelicula todasPelis : peliculas)
            if(todasPelis.getVisto())
                todasPelis.toString();

        for (Serie todasSeries : series)
            if(todasSeries.getVisto())
                todasSeries.toString();


        try {


            System.out.println("\n****************** Series con mas temporardas ******************");
            int serieMasTemp = 0;
            int aux = 0;
            for (int i = 0; i < series.size(); i++) {
                if (series.get(i).getNoTemporadas() > aux) {
                    aux = series.get(i).getNoTemporadas();
                    serieMasTemp = i;
                }
            }
            series.get(serieMasTemp).toString();

            System.out.println("\n****************** Pelicula mas reciente ******************");
            int peliMasReciente = 0;
            aux = 0;
            for (int i = 0; i < series.size(); i++) {
                if (peliculas.get(i).getAnio() > aux) {
                    aux = peliculas.get(i).getAnio();
                    peliMasReciente = i;
                }
            }
            peliculas.get(peliMasReciente).toString();
        }catch (Exception e){
            System.out.println("Ocurrio un error al procesar las peliculas y/o series");
            e.printStackTrace();
        }finally {
            System.out.println("\n\t******El programa termino correctamente******");
        }

    }
}
