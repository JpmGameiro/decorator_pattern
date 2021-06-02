public class BurguerDecorator implements Burguer {

    Burguer burguer;

    public BurguerDecorator(Burguer burguer) {
        this.burguer = burguer;
    }

    @Override
    public String ingredients() {
        return this.burguer.ingredients();
    }
}
