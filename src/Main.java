import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nombres de los productos
        String bubblegum = "Bubblegum";
        String toffee = "Toffee";
        String iceCream = "Ice cream";
        String milkChocolate = "Milk chocolate";
        String doughnut = "Doughnut";
        String pancake = "Pancake";

        // Precios de los productos
        double bubblegumPrice = 202.0;
        double toffeePrice = 118.0;
        double iceCreamPrice = 2250.0;
        double milkChocolatePrice = 1680.0;
        double doughnutPrice = 1075.0;
        double pancakePrice = 80.0;

        // Calcular el ingreso total
        double income = bubblegumPrice + toffeePrice + iceCreamPrice +
                milkChocolatePrice + doughnutPrice + pancakePrice;


        // Imprimir los resultados
        System.out.println("Earned amount:");
        System.out.println(bubblegum + ": $" + bubblegumPrice);
        System.out.println(toffee + ": $" + toffeePrice);
        System.out.println(iceCream + ": $" + iceCreamPrice);
        System.out.println(milkChocolate + ": $" + milkChocolatePrice);
        System.out.println(doughnut + ": $" + doughnutPrice);
        System.out.println(pancake + ": $" + pancakePrice);
        System.out.println();


        System.out.println("Income: $" + income);

        System.out.print("Staff expenses: $" );
        double staff = scanner.nextDouble();

        System.out.print("Other expenses: $" );
        double other = scanner.nextDouble();

        // Calcular el ingreso neto
        double net = income - (staff + other);
        System.out.println("Net income: $" + net);
    }
}
