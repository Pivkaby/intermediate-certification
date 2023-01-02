package exercuse1;

public class Main {
    public static void main(String[] args) {
        Basket basketAndrey = new Basket();
        basketAndrey.add("Milk", 40);
        basketAndrey.add("Bread", 55, 2);
        basketAndrey.add("Apple", 55, 3,0.3);
        basketAndrey.print("Корзина Андрея");

        System.out.println();

        Basket basketAnton = new Basket();
        basketAnton.add("Orange", 50,3 ,0.4);
        basketAnton.add("Apple", 55, 5,0.3);
        basketAnton.print("Корзина Антона");

        System.out.println();
        System.out.println("Количество всех товаров во всех корзинах: " + Basket.getCountGoodsAll() + " шт.");
        System.out.println("Стоимость всех товаров во всех корзинах: " + Basket.getTotalPriceAll() + " руб.");
        System.out.println("Средняя стоимость всех товаров во всех корзинах: " + Basket.getAveragePriceGoods() + " руб.");
        System.out.println("Средняя стоимость корзины: " + Basket.getAveragePriceBasket() + " руб.");
    }
}