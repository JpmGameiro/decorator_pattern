public class CheeseBurguer extends BurguerDecorator {

    public CheeseBurguer(Burguer burguer) {
        super(burguer);
    }

    @Override
    public String ingredients() {
        return super.ingredients() + "\n" + "Cheese.";
    }
}
