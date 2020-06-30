package com.miguelrohdez.POO;

public abstract class Netflix {
    private String titulo;
    private String genero;
    private String creador;
    private int duracion;
    private boolean visto = false;
    private int tiempoVisto=0;
    //Const Defaul
    public Netflix() {
    }
    //Const dos atributos
    public Netflix(String titulo,String creador) {
        this.titulo = titulo;
        this.creador = creador;

    }
    //Const todos atributos
    public Netflix(String titulo, String genero, String creador, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean getVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public int getTiempoVisto() {
        return tiempoVisto;
    }

    public void setTiempoVisto(int tiempoVisto) {
        this.tiempoVisto = tiempoVisto;
    }

    @Override
    public String toString() {

        System.out.println("\nTitulo: " + titulo );
        System.out.println("Genero: " + genero);
        System.out.println("Creador es: " + creador);
        System.out.println("Duración(min): " + duracion );
        System.out.println("Visualizado: " + visto );
        System.out.println("Tiempo total(min): " + tiempoVisto );


        return "-------------";
    }

}
