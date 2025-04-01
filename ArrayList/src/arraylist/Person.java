package arraylist;

public class Person {
    
    private int id;
    private String name,user;
    
    public Person(){}
    
    public Person(int id, String name, String user){
        this.setId(id);
        this.setName(name);
        this.setUser(user);
    }
    
    public final void setId(int id){
        this.id = id;
    }
    
    public final void setName(String name){
        this.name = name;
    }
    
    public final void setUser(String user){
        this.user = user;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }

    public String getUser(){
        return this.user;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", user=" + user + '}';
    }
}
