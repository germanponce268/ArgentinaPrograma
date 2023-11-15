package Clase4;

import java.util.HashMap;

public class Cancion {
    private String titulo;
    private String artista;
    private String album;
    private int anio;
    private Estado popularidad;
    private int reproducciones;


    public Cancion(String titulo, String artista, String album, int anio, int reproducciones) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.anio = anio;
        this.reproducciones = reproducciones;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


    public Estado getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(Estado popularidad) {
        this.popularidad = popularidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombre() {
        return titulo;
    }

    public void setNombre(String nombre) {
        this.titulo = nombre;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }
}
