public class Cart implements HotelService {

    // Provides the requested number of luggage carts
    public void requestCart(int numberOfCarts) {
        System.out.println("Cart Service: "
                + numberOfCarts + " luggage cart(s) requested.");
    }

    @Override
    public void performService() {
        System.out.println("Luggage cart service is available.");
    }
}
