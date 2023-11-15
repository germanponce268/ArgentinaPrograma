package Clase4;

import java.util.List;

public class Reproductor {

    public void reproducir(Cancion cancion){
        if(cancion.getReproducciones() < 1000){
            cancion.setPopularidad(new Normal());
            System.out.println(cancion.getPopularidad().actualizarIcono() + " " + cancion.getArtista() + " Album:" + cancion.getAlbum() + " " +  cancion.getTitulo());
        }else if(cancion.getReproducciones() > 1000 && cancion.getReproducciones() < 50000){
            cancion.setPopularidad(new EnAuge());
            System.out.println(cancion.getPopularidad() + " " + cancion.getArtista() + " " + cancion.getTitulo() + " (" + cancion.getAlbum() + " - " + cancion.getAnio() + ")");
        }else if(cancion.getReproducciones() > 50000){
          cancion.setPopularidad(new EnTendencia());
            System.out.println(cancion.getPopularidad().actualizarIcono() + " "+  cancion.getTitulo() + " " + cancion.getArtista() + " (" + cancion.getAlbum() + cancion.getAnio() + ")");
        }
       System.out.println("Esta sonando " + cancion.getTitulo() + cancion.getPopularidad().actualizarIcono());
    }

}
