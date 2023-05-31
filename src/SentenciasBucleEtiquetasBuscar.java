public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "tres tristes trigues tragan trigo en un triagal";
        String palabra = "trigo";

        int maxfrase = frase.length();
        int maxpalabras = palabra.length();

        int cantidad = 0;
        buscar:
        for (int i =0;i<maxfrase;i++){
            int k = i ;
            for(int j=0;j< maxpalabras; j++)
            if (frase.charAt(k++)!= palabra.charAt(j)){
                continue buscar;
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad+ " veces el caracter '" + palabra + "' en la frase");
    }
}
