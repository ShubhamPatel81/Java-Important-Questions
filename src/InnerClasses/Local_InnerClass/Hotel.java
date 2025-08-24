package src.InnerClasses.Local_InnerClass;

public class Hotel {
    private String name;
    private  int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void setReservedRoom(String guestName, int numberOfRoom){
        class ReservationValidator{
            boolean validate(){
                if (guestName == null || guestName.isBlank()){
                    System.out.println("Guest Name cannot be empty");
                    return false;
                }
                if (numberOfRoom < 0){
                    System.out.println("Number of Should be positive");
                    return false;
                }
                if (reservedRooms + numberOfRoom > totalRooms){
                    System.out.println("NO Enough Rooms are available");
                    return false;
                }
            return true;
            }
        }
        ReservationValidator validator = new ReservationValidator();
        if (validator.validate()){
            reservedRooms +=numberOfRoom;
            System.out.println("Reservation comfirmed for "+guestName +" for "+numberOfRoom+" rooms");
        }else {
            System.out.println("Reservation Failed!!");
        }
    }
}
