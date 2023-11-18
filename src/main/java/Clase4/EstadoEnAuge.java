package Clase4;

public class EstadoEnAuge extends Estado{
    private static final Integer MAX_REPRODUCCIONES = 50000;
    public static final Integer MAX_LIKES = 20000;
    public static final Integer MAX_DISLIKES = 5000;
    private Cancion cancion;

    public EstadoEnAuge(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String mostrar() {
        return Icono.ROCKET.texto() + " - " + this.cancion.getArtista() + " - " + cancion.getTitulo() + " (" + cancion.getAlbum() + "-" + cancion.getAnio() + ")";

    }
    public void cambiarEstado(Cancion cancion){
        if(this.cancion.getReproducciones() > MAX_REPRODUCCIONES && this.cancion.getLikes() > MAX_LIKES ){
           cancion.setPopularidad(new EstadoTendencia(cancion));
        } else if (this.cancion.getDislikes() > MAX_DISLIKES) {
            cancion.setPopularidad(new EstadoNormal(cancion));
        }
    }
}
