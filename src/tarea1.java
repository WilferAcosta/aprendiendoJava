import java.util.Scanner;

public class tarea1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite el nombre de la factura");
        String factura = scanner.nextLine();

        System.out.println("digite el valor del primer producto");
        double producto1 = scanner.nextDouble();
        System.out.println("digite el valor del segundo producto");
        double producto2 = scanner.nextDouble();

        double totalProducto = producto1 + producto2;

        double valorImpuesto = totalProducto * 0.19;

        double totalCompra = totalProducto + valorImpuesto;

        System.out.println("La factura "+ factura + " tiene un total bruto de "+ totalProducto + ",con un impuesto de "+ valorImpuesto +"y el monto despues de impuesto es de "+totalCompra);
    }
}
