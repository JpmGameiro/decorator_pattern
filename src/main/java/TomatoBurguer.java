public class TomatoBurguer extends BurguerDecorator {

    public TomatoBurguer(Burguer burguer) {
        super(burguer);
    }

    @Override
    public String ingredients() {
        return super.ingredients() + "\n" + "Tomato.";
    }
}
