public class Valet implements HotelService {

    // Picks up or retrieves a vehicle using its plate number
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet: Vehicle " + plateNumber
                + " is ready for pick-up.");
    }

    @Override
    public void performService() {
        System.out.println("Valet service is available.");
    }
}
