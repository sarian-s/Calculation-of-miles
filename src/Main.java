public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        /*
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
        */

        System.out.println("20");
        System.out.println(service.calculate(20));
        System.out.println();

        System.out.print("1000 руб  ");
        System.out.print(service.calculate(1000));
        System.out.println(" бонусов");
        System.out.println();

        System.out.println("500 руб");
        System.out.print(service.calculate(500));
        System.out.println(" бонусов");
        System.out.println();

        System.out.println("4480 руб");
        System.out.print(service.calculate(4480));
        System.out.println(" бонусов");
    }
}
