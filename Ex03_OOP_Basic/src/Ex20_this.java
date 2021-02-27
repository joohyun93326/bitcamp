/*
 * 원칙 : 생성자는 객체 생성 시 1개만 호출 (Car c = new Car() or Car c = ner Car(100))
 * 예외적으로
 * this를 활용하면 여러개의 생성자를 호출할 수 있다.
 * 
 */

/* Before
class Zcar {
    String color;
    String geartype;
    int door;
    
    Zcar() {
        this.color = "red";
        this.geartype = "auto";
        this.door = 2;
    }
    
    Zcar(String color, String geartype, int door) {
        this.color = color;
        this.geartype = geartype;
        this.door = door;
    }
    
    void print() {
        System.out.printf(this.color, this.geartype, this.door);
    }
}
*/

//After
class Zcar {
    String color;
    String geartype;
    int door;
    
    //default 
    Zcar() {
        this("red", "auto", 2); //다시 호출 //parameter 3개짜리 호출 
        System.out.println("default constructor");
    }
    
    Zcar(String color, String geartype, int door) {
        this.color = color;
        this.geartype = geartype;
        this.door = door;
        System.out.println("overloading constructor");
    }
    
    void print() {
        System.out.printf(this.color +"," + this.geartype + "," + this.door);
    }
}


class Zcar2 {
    String color;
    String geartype;
    int door;
    
    Zcar2() { //default constructor
        this("red" ,1);
        System.out.println("default constructor");
    }
    
    Zcar2(String color, int door) { //overloading constructor
        this(color, door, "auto");
        System.out.println("overloading constructor param 2개");
    }
    Zcar2(String color, int door, String geartype) { //overloading constructor
        this.color = color;
        this.door = door;
        this.geartype = geartype;
        System.out.println("overloading constructor param 3개");        
    }
    void print() {
        System.out.printf(this.color +"," + this.geartype + "," + this.door);
    }
}

public class Ex20_this {

    public static void main(String[] args) {
        //Zcar zcar = new Zcar(); //default 호출 
        //zcar.print();
        
        //Zcar zcar = new Zcar("pink", "auto", 4);
        //zcar.print();
        
        //Zcar2 zcar = new Zcar2();
        //zcar.print(); 
        //default = red, auto, 1
        
        Zcar2 zcar = new Zcar2("white", 4);
        zcar.print();
        //white, auto, 4 >> param 2개
        
         
    }

}


