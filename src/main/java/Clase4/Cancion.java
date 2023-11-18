package Clase4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cancion {
    private String artista;
    private String album;
    private String titulo;
    private Integer anio;
    private Estado popularidad;
    private Integer reproducciones;
    private Integer likes;
    private Integer dislikes;

    public Cancion(String artista, String album, String titulo, Integer anio, Integer reproducciones, Integer likes, Integer dislikes) {
        this.artista = artista;
        this.album = album;
        this.titulo = titulo;
        this.anio = anio;
        this.reproducciones = reproducciones;
        this.likes = likes;
        this.dislikes = dislikes;
        this.popularidad = new EstadoNormal(this);
    }


}
