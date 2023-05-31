public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = " creando un odjeto de la clase String ... que tal!";

        Number num = 7;

        Boolean b1 = texto instanceof String;
        System.out.println("es del tipo String" + b1);
        b1 = texto instanceof Object;
        System.out.println("b1 = " + b1);
        b1 = texto instanceof Integer;
        System.out.println("b1 = " + b1);
        b1 = num instanceof Integer;
        System.out.println("b1 = " + b1);

        b1 = num instanceof Number;
        System.out.println("b1 = " + b1);
        b1 = num instanceof Object;
        System.out.println("b1 = " + b1);

        Double decimal = 4.55;
        b1 = decimal instanceof Number;
        System.out.println("decimal = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 = " + b1);
    }
}
