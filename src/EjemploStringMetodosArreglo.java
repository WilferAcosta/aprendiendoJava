public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char [] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for(int i =0; i< largo; i++){
            System.out.println("arreglo = " + arreglo[i]);
        }

        System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));

        String[] areglo2 = trabalenguas.split("a");
        int l = areglo2.length;
        for(int j = 0;j<l;j++){
            System.out.println(arreglo[j]);
        }

        String archivo = "alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\."); // o tambie en ves de \\. puede ir [.]
        l = archivoArr.length;
        for(int j = 0;j<l;j++){
            System.out.println("archivoArr = " + archivoArr[j]);
        }
        System.out.println("extencion = " + archivoArr[l-1]);

      


        
    }
}
