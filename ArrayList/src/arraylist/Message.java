package arraylist;

public class Message {
    
    private int id;
    private String text;
    private Person person;
    
    public Message(){}
            
    public Message(int id, String text, Person person){
        this.setId(id);
        this.setText(text);
        this.setPerson(person);
    }
    
    public final void setId(int id){
        this.id = id;
    }
    
    public final void setText(String text){
        this.text = text;
    }
    
    public final void setPerson(Person person){
        this.person = person;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getText(){
        return this.text;
    }
    
    public Person getPerson(){
        return this.person;
    }

    @Override
    public String toString() {
        return "Message{" + "id=" + id + ", text=" + text + ", person=" + person + '}';
    }
}
