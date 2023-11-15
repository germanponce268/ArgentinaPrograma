package Clase3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
    Ejercicio 1
    Implemente un método que reciba como parámetro una lista de strings y devuelva una nueva
    lista con los strings en mayúscula

    Ejercicio 2
    Implementar un método que reciba como parámetro una lista de strings y un entero "n". El
    método debe devolver un String que concatene separando por coma y espacio todas las
    palabras, en la lista, que tengan más de "n" caracteres
 */
public class Main {
    public static void main(String[] args) {

        List<String> stringList= new ArrayList<>();
        stringList.add("Hola");
        stringList.add("Mundo");
        stringList.add("Todo");
        stringList.add("Bien");
        stringList.add("estamos");
        stringList.add("practicando");
        stringList.add("un");
        stringList.add("poco");
        convert(stringList).forEach(string -> System.out.println(string));
        String concatList = concat(stringList, 4);
        System.out.println(concatList);

    }

    private static List<String> convert(List<String> stringList){
        return stringList.stream()
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());
    }

    private static String concat(List<String> stringList, int charNum){
        String auxString = "";
       List<String> concated = stringList.stream()
               .filter(string -> string.toCharArray().length > charNum)
                .collect(Collectors.toList());
       for(String con : concated){
           auxString += con + ", ";
       }
       return auxString;
    }
}
