public class BurguerDecoratorPattern {

    public static void main(String[] args) {
        System.out.println("Welcome to the Decorator Pattern Restaurant, check our complete menu!");

        Burguer baconBurguer = new BaconBurguer(new DefaultBurguer());
        System.out.println("Bacon Burguer:");
        System.out.println(baconBurguer.ingredients());

        Burguer cheeseBurguer = new CheeseBurguer(new DefaultBurguer());
        System.out.println("Cheese Burguer:");
        System.out.println(cheeseBurguer.ingredients());

        Burguer tomatoBurguer = new TomatoBurguer(new DefaultBurguer());
        System.out.println("Tomato Burguer:");
        System.out.println(tomatoBurguer.ingredients());

        Burguer completeBurguer = new BaconBurguer(new CheeseBurguer(new TomatoBurguer(new DefaultBurguer())));
        System.out.println("Special Burguer:");
        System.out.println(completeBurguer.ingredients());

    }
}
