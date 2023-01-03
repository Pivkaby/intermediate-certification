public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

        System.out.println();

        int a = 0;
        for (int i = 0; i <= 65536; i++,a++) {
            if ((char)i == 'Ё' || (char)i == 'ё' || ((char)i >= 'А' && (char)i <= 'я')) {
                System.out.println(a + " - " + (char)i);
            }
        }
    }
}
