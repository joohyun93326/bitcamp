import java.util.HashSet;
import java.util.Iterator;

class Myclass {
    private int id;
    private String name;
    
    public Myclass() {
        
    }
    
    public Myclass(int id, String name) {
        super();
        this.name = name;
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    @Override 
    public String toString() {
        return "Myclass id= " + id + ", name= " + name;
    }
    public void displayInfo() {
        System.out.println("학번: " + this.id);
        System.out.println("이름: " + this.name);
    }
    
}


public class Ex10_Set_Object {

    public static void main(String[] args) {
        HashSet<Myclass> hset = new HashSet<Myclass>();
        hset.add(new Myclass(1, "abc"));
        hset.add(new Myclass(2, "def"));
        hset.add(new Myclass(3, "ghi"));
    
    for(Myclass m : hset) {
        m.displayInfo();
    }
    
    //iterator
    Iterator<Myclass> itr = hset.iterator();
    while(itr.hasNext()) {
       // 기본
       // MyClass mc = itr.next();
       // mc.displayInfo();
       // 아래처럼 해도 된다
       
       itr.next().displayInfo();
       // next()가 리턴하는 게 MyClass타입이기 때문에 바로 함수호출 가능
    }
    
    
    }
}
