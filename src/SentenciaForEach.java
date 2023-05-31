public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1,3,5,7,9,11,13,15};
        for (int num: numeros){
            System.out.println("num = " + num);
        }
        String[] nombres = {"wilfer","orlando","acosta","rodriguez","pepe","mylady"};
        for(String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }
        String[] datos = {"futboll","micro","basket","beisbol"};
        for(String dato : datos ){
            System.out.println("datos = "+dato);
        }
    }
}
