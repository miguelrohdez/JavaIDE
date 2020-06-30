package com.miguelrohdez.POO;

public class Serie extends Netflix implements IVisualizable{
    private int noTemporadas = 1;

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        super(titulo, creador);
    }

    public Serie(String titulo, String genero, String creador, int duracion, int noTemporadas) {
        super(titulo, genero, creador, duracion);
        this.noTemporadas = noTemporadas;
    }

    public int getNoTemporadas() {
        return noTemporadas;
    }

    public void setNoTemporadas(int noTemporadas) {
        this.noTemporadas = noTemporadas;
    }

    public String toString() {
        super.toString();
        System.out.println("Numero de temporadas: " + noTemporadas);

        return "Serie";
    }

    @Override
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
