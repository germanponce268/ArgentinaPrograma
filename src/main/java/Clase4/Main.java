package Clase4;

public class Main {
    public static void main(String[] args) {
        Cancion jijiji = new Cancion("Jijiji", "Patricio Rey Y Sus Redonditos De Ricota", "Gulp",1986, 100000);
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(jijiji);
    }
}
