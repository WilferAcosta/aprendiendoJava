public class SentenciaIfElse {
    public static void main(String[] args) {
        float promedio = 4.8f;

        if(promedio >= 6.5){
            System.out.println("felicitacion exelente promedio");
        } else if(promedio >=6.0){
            System.out.println("muy buen proemdio ");
        }else if (promedio >= 5.5){
            System.out.println("el promedio es bueno");
        }else if(promedio >= 5.0){
            System.out.println("el promedio es regular");
        }else if (promedio >= 4.0){
            System.out.println("insuficiente su promedio");
        }else {
            System.out.println("reprobo la materia");
        }
        System.out.println("promedio = " + promedio);
    }
}
