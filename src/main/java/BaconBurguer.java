public class BaconBurguer extends BurguerDecorator {

    public BaconBurguer(Burguer burguer) {
        super(burguer);
    }

    @Override
    public String ingredients() {
        return super.ingredients() + "\n" + "Bacon.";
    }
}
