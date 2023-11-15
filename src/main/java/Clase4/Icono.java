package Clase4;
public class Icono {
    public static  Icono NOTA_MUSICAL = new Icono(new int[]{0xD83C, 0xDFB5});
    public static  Icono ROCKET = new Icono(new int[]{0xD83D, 0xDE80});
    public static  Icono FIRE = new Icono(new int[]{0xD83D, 0xDD25});
    private int[] internalEncoding;
    public Icono(int[] internalEncoding){
        this.internalEncoding = internalEncoding;
    }
    public String texto() {
        return new String(internalEncoding, 0, internalEncoding.length);
    }
}
