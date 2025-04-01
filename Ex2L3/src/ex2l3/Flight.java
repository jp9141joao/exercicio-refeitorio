package ex2l3;

public class Flight {
   
    private int id;
    private String origin;
    private String destination;

    public Flight(){
    }
    
    public Flight(int id, String origin) {
        this.id = id;
        this.origin = origin;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Flight{" + "id=" + id + ", origin=" + origin + ", destination=" + destination + '}';
    }
 
    
}
