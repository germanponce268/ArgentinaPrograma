package Clase2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Consigna:
Implemente un método que reciba como parámetro una lista de strings y una interfaz
funcional que transforme cada String de la lista en mayúsculas. El método debe devolver un
nuevo listado de String transformados.
*/
public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hola");
        stringList.add("Mundo");
        stringList.add("Todo");
        stringList.add("Bien");

        TransformString transformString = string -> string.stream()
                                                        .map(s -> s.toUpperCase())
                                                                .collect(Collectors.toList());

        transform(stringList, transformString).forEach(string -> System.out.println(string));


    }
    public static List<String> transform(List<String> stringList, TransformString transformString) {
        return transformString.transform(stringList);
    }
}

@FunctionalInterface
interface TransformString{

    public  abstract List<String> transform(List<String> string);
}
