public class Seller {

    private String name;
    private String product;
    private int price;

    private IMediator mediator;

    public Seller(String name, String product, int price, IMediator mediator) {
        this.name = name;
        this.product = product;
        this.price = price;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    public void buyProduct(){
        mediator.sendToSeller(this);
    }

}
