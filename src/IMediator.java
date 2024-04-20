public interface IMediator {

    void addSeller(Seller seller);

    void addProducer(Producer producer);

    void buyFromProducer(Producer producer);

    void sendToSeller(Seller seller);
}
