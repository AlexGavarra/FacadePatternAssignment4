public class FrontDesk {

    // Create the hotel service objects
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    // Initialize the services
    public FrontDesk() {
        valet = new Valet();
        houseKeeping = new HouseKeeping();
        cart = new Cart();
    }

    // Forward the vehicle pick-up request to Valet
    public void requestVehicle(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    // Forward the room cleaning request to HouseKeeping
    public void requestRoomCleaning(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
    }

    // Forward the luggage cart request to Cart
    public void requestLuggageCart(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }
}
