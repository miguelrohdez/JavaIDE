package com.miguelrohdez.POO;

public class Pelicula extends Netflix implements IVisualizable{
    private int anio;

    public Pelicula() {

    }

    public Pelicula(String titulo, String creador) {
        super(titulo, creador);
    }

    public Pelicula(String titulo, String genero, String creador, int duracion, int anio) {
        super(titulo, genero, creador, duracion);
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        super.toString();
        System.out.println("Año: " + anio);

        return "Pelicula";
    }

    public void marcarVisto() {
        setVisto(true);
    }

    @Override
    public boolean esVisto() {
        return getVisto();
    }

    @Override
    public int tiempoVisto(int tiempoTot) {
        setTiempoVisto(tiempoTot);
        return tiempoTot;
    }

}
