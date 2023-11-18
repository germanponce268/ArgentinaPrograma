package Clase4;

public class Reproductor {

    public void reproducir(Cancion cancion){
        cancion.getPopularidad().cambiarEstado(cancion);
        cancion.getPopularidad().cambiarEstado(cancion);
        System.out.println(cancion.getPopularidad().mostrar());

    }
}
