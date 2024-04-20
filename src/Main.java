public class Main {
    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        Producer p1 = new Producer("Huseyn", "apple", 5, mediator);
        Producer p2 = new Producer("Shamil", "apple", 7, mediator);

        Seller s1 = new Seller("Sabir", "apple", 8, mediator);
        Seller s2 = new Seller("Kamil", "apple", 10, mediator);

        mediator.addProducer(p1);
        mediator.addProducer(p2);

        mediator.addSeller(s1);
        mediator.addSeller(s2);

        p2.sellProduct();
        s1.buyProduct();
    }
}