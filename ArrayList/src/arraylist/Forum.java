package arraylist;
import java.util.ArrayList;

public class Forum {
    
    private int id;
    private String name;
    private String url;
    private ArrayList<Message> message;
    
    public Forum(){
        message = new ArrayList<>();
    }
    
    public Forum(int id, String name, String url){
        this.setId(id);
        this.setName(name);
        this.setUrl(url);
    }
    
    public final void setId(int id){
        this.id = id;
    }
    
    public final void setName(String name){
        this.name = name;
    }
    
    public final void setUrl(String url){
        this.url = url;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getUrl(){
        return this.url;
    }
    
    public void addMessage(int id, String name, String url, Person person){
        this.message.add(new Message(id, name, person));
    }
    
    public ArrayList<Message> getMessage(){
        return message;
    }

    @Override
    public String toString() {
        return "Forum{" + "id=" + id + ", name=" + name + ", url=" + url + ", message=" + message + '}';
    }
    
    
}
