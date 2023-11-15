package Clase4;

public class Normal extends Estado{


    @Override
    public String actualizarIcono() {
        return Icono.NOTA_MUSICAL.texto();
    }
}
