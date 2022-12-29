public class Main {

    public static void main(String[] args) {
        Basket basketAndrey = new Basket();
        basketAndrey.add("Milk", 40);
        basketAndrey.add("Apple", 55, 3,0.3);
        basketAndrey.print("Корзина Андрея");

        System.out.println();

        Basket basketAnton = new Basket();
        basketAnton.add("Orange", 50,3 ,0.4);
        basketAnton.add("Apple", 55, 5,0.3);
        basketAnton.print("Корзина Антона");
    }
}
