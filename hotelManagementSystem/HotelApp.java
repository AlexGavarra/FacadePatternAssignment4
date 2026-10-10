public class HotelApp {

    public static void main(String[] args) {

        // Create the FrontDesk facade
        FrontDesk frontDesk = new FrontDesk();

        // Request vehicle pick-up
        frontDesk.requestVehicle("ABC-1234");

        // Request room cleaning
        frontDesk.requestRoomCleaning(205);

        // Request two luggage carts
        frontDesk.requestLuggageCart(2);
    }
}
