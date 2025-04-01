package ex2l3;

public class Passenger {
   
    private int id;
    private String name;
    private String cpf;
    
    public Passenger(){}

    public Passenger(int id, String name, String cpf) {
        this.setId(id);
        this.setName(name);
        this.setCpf(cpf);
    }

    public int getId() {
        return id;
    }

    public final void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Passenger{" + "id=" + id + ", name=" + name + ", cpf=" + cpf + '}';
    }
    
    
}
