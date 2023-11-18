package Clase4;

public class Main {
    public static void main(String[] args) {
        Cancion caso1 = new Cancion("Coldplay", "A Rush of Blood to the head", "The Scientist", 2002, 200, 100, 50);
        Cancion caso2 = new Cancion("Coldplay", "A Rush of Blood to the head", "The Scientist", 2002, 1200, 100, 50);
        Cancion caso3 = new Cancion("Coldplay", "A Rush of Blood to the head", "The Scientist", 2002, 1200, 100, 50050);
        Cancion caso4 = new Cancion("Coldplay", "A Rush of Blood to the head", "The Scientist", 2002, 100200, 20100, 50);
        Cancion caso5 = new Cancion("Coldplay", "A Rush of Blood to the head", "The Scientist", 2002, 0, 0, 50);
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(caso1);
        reproductor.reproducir(caso2);
        reproductor.reproducir(caso3);
        reproductor.reproducir(caso4);
        reproductor.reproducir(caso5);
    }

}
