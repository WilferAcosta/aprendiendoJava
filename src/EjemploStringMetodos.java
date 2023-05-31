import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "wilfer";
        //para correr cuanto es el largo del caracter
        System.out.println("nombre.length() = " + nombre.length());
        //para convertir el string todo a mayuscula
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        //para convertir el string todo a miniscula
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        //para comparar el contenido del string
        System.out.println("nombre.equals(\"wilfer\") = " + nombre.equals("wilfer"));
        System.out.println("nombre.equals(\"wilfer\") = " + nombre.equals("Wilfer"));
        //conparar no importa si tiene mayusculas o minusculas
        System.out.println("nombre.equalsIgnoreCase(\"wilfer\") = " + nombre.equalsIgnoreCase("wilfer"));
        //orden lecsico otra forma de comprar como el equals
        System.out.println("nombre.compareTo(\"wilfer\") = " + nombre.compareTo("wilfer"));
        System.out.println("nombre.compareTo(\"orlando\") = " + nombre.compareTo("orlando"));
        //convertir un strin en caracteres se pone el numero del caracter
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(nombre.length()-1));
        //para que comience desde donde le indique a corar el caracter del string
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        //tambien se puede poner desde hasta donde quiero que me muestre los caracteres 
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        //para remplazar las a por puntos
        String trabalenguas = "trabalenguas";
        System.out.println("nombre = " + trabalenguas.replace("a","."));
        //retorna el vlaor de la posicion dependiendo del caracter
        System.out.println("trabalenguas = " + trabalenguas.indexOf('a'));
        //retorna el valor que encuentre de atras para adelante cuando no encuentra da como resultado -1
        System.out.println("trabalenguas = " + trabalenguas.lastIndexOf('a'));
        //retorna un boolean si encuentra un areglo dentro de un string
        System.out.println("trabalenguas = " + trabalenguas.contains("t"));
        //para ver si comienza 
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        //para ver como termina
        System.out.println("trabalenguas.endsWith(\"tr\") = " + trabalenguas.endsWith("tr"));
        //metodo para quitar los espacios bacios
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim());


        
    }
}
