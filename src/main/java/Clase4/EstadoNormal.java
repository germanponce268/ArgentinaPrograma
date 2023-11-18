package Clase4;

import lombok.Getter;
import lombok.Setter;


public class EstadoNormal extends Estado{
    private static final Integer MAX_REPRODUCCIONES = 1000;
    public static final Integer MAX_DISLIKES = 5000;
    private Cancion cancion;
    public EstadoNormal(Cancion cancion){
        this.cancion = cancion;
    }   @Override
    public String mostrar() {
        String detalle = Icono.MUSICAL_NOTE.texto() + " - " + this.cancion.getArtista() + "  (" + this.cancion.getAlbum() + " - " + this.cancion.getTitulo() + ")";
        return detalle;
    }
    @Override
    public void cambiarEstado(Cancion cancion){
        if(this.cancion.getReproducciones() > MAX_REPRODUCCIONES && this.cancion.getDislikes() < MAX_DISLIKES){
            cancion.setPopularidad(new EstadoEnAuge(cancion));
        } else if (this.cancion.getDislikes() > MAX_DISLIKES) {
            cancion.setPopularidad(new EstadoNormal(cancion));
        }
    }
}
