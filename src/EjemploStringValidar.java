public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        boolean  esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);
        if (esNulo ) {
            curso = "";//"Programacion Java";
        }
        boolean esVaio = curso.length() == 0;
        System.out.println("esVaio = " + esVaio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if(esBlanco == false) {
            System.out.println(curso.toUpperCase());
            System.out.println("bienvenido al curso".concat(curso));
        }
    }
}
