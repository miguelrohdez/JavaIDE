package com.miguelrohdez.POO;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPeli = new Pelicula("El titulos", "Yo");
        Serie miSerie = new Serie("La serie", "Yo");
        Pelicula []peliculas = new Pelicula[5];
        Serie []series = new Serie[5];

        //Creando las peliculas
        peliculas[0] = new Pelicula();
        peliculas[1] = new Pelicula("La red social","David Fincher");
        peliculas[2] = new Pelicula("Toy Story 3", "Lee Unkrich");
        peliculas[3] = new Pelicula("El Señor de los Anillos: las dos torres","Fantasia/Aventura", "Peter Jackson",223, 2002);
        peliculas[4] = new Pelicula("Gladiador", "Accion/Aventura", "Ridley Scott", 171, 2000);
        //Creando las series
        series[0] = new Serie();
        series[1] = new Serie("Juego de tronos", "HBO");
        series[2] = new Serie("Breaking Bad", "Vince Gilligan");
        series[3] = new Serie("Vikingos", "Aventura/Drama/Historica" ,"History Channel",60,6);
        series[4] = new Serie("Friends", "Comedia", "Marta Kauffman", 22,10);

        //Marcando en Visto Peliculas y Series
        peliculas[3].marcarVisto();
        peliculas[4].marcarVisto();
        series[3].marcarVisto();
        series[4].marcarVisto();
        //Estableciendo tiempo total visto
        peliculas[3].tiempoVisto(670);
        peliculas[3].tiempoVisto(1200);
        series[3].tiempoVisto(3060);
        series[4].tiempoVisto(4187);

        System.out.println("****************** Mostrando Peliculas ******************");

        for (Pelicula todasPelis : peliculas) {
            todasPelis.toString();

        }

        System.out.println("****************** Mostrando Series ******************");

        for (Serie todasSeries : series) {
            todasSeries.toString();

        }

        System.out.println("\n****************** Series con mas temporardas ******************");
        int serieMasTemp =0;
        int aux = 0;
        for (int i = 0; i < series.length; i++) {
            if (series[i].getNoTemporadas() > aux ){
                aux = series[i].getNoTemporadas();
                serieMasTemp = i;
            }
        }
        series[serieMasTemp].toString();

        System.out.println("\n****************** Pelicula mas reciente ******************");
        int peliMasReciente =0;
        aux = 0;
        for (int i = 0; i < series.length; i++) {
            if (peliculas[i].getAnio() > aux ){
                aux = peliculas[i].getAnio();
                peliMasReciente = i;
            }
        }
        peliculas[peliMasReciente].toString();


    }
}
