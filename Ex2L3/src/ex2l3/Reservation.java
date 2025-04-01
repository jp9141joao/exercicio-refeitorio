package ex2l3;
import java.util.ArrayList;

public class Reservation {
   
    private int id;
    private String date;
    private Passenger passenger;
    private Flight flight;

    public Reservation(int id, String date, Passenger passenger, Flight flight) {
        this.id = id;
        this.date = date;
        this.passenger = passenger;
        this.flight = flight;
    }
    

    public int getId() {
        return id;
    }

    public final void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public final void setDate(String date) {
        this.date = date;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", date=" + date + ", passenger=" + passenger + ", flight=" + flight + '}';
    }
    
}
