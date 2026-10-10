
public class HouseKeeping implements HotelService {

    // Cleans the specified hotel room
    public void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping: Room "
                + roomNumber + " is being cleaned.");
    }

    @Override
    public void performService() {
        System.out.println("Housekeeping service is available.");
    }
}
