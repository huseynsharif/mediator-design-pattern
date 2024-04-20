import java.util.ArrayList;
import java.util.List;

public class Mediator implements IMediator{

    private final List<Seller> sellers;
    private final List<Producer> producers;

    public Mediator() {

        sellers = new ArrayList<>();
        producers = new ArrayList<>();

    }

    @Override
    public void addSeller(Seller seller) {
        sellers.add(seller);
    }

    @Override
    public void addProducer(Producer producer) {
        producers.add(producer);
    }

    @Override
    public void buyFromProducer(Producer producer) {

        Seller seller = findBestSeller();

        logEvent(producer, seller);

    }

    @Override
    public void sendToSeller(Seller seller) {

        Producer producer = findBestProducer();

        logEvent(producer, seller);

    }

    private void logEvent(Producer producer, Seller seller) {
        System.out.printf("%s adli istehsalci %s adli saticiya" +
                " %d qiymetine mehsul satdi%n", producer.getName(), seller.getName(), seller.getPrice());
    }

    private Seller findBestSeller() {

        Seller seller = null;

        for (Seller s : sellers) {
            if (seller == null || s.getPrice() > seller.getPrice()){
                seller = s;
            }
        }

        return seller;

    }

    private Producer findBestProducer() {
        Producer producer = null;

        for (Producer p : producers) {
            if (producer == null || p.getPrice() < producer.getPrice()){
                producer = p;
            }
        }

        return producer;
    }
}
