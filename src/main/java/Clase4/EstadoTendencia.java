package Clase4;

public class EstadoTendencia extends Estado{
    private Cancion cancion;

    public EstadoTendencia(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String mostrar() {
        String detalle = Icono.FIRE.texto() + " - " + this.cancion.getArtista() + " (" + this.cancion.getAlbum() + " - " + this.cancion.getTitulo() + ")";
        return detalle;
    }
    @Override
    public void cambiarEstado(Cancion cancion) {

    }
}
