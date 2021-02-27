/*
 * this
 * 1. 객체 자신을 가르키는 this (앞으로 생성될 객체의 주소를 담을 곳이라고 가정) 
 * 2. this 객체 자신(생성자 호출) 
 * >> 생성자는 객체를 만들 때 한번만 호출하지만 this는 여러개의 생성자 호출이 가능하다!!
 * 
 */

class Test5 {
    int i; //this가 가리키는 i
    int j; //this가 가리키는 j
    
    Test5() {
        
    }
    Test5(int i, int j) {
        //i = i; 이렇게 쓰면 어떤 i인지 잘 모른다.
        //j = j;
        
        this.i = i;
        this.j = j; 
    }
}

class Book2 {
    String bookname;
    
    Book2(String bookname) { //parameter와 instance variable의 이름을 같게 한다.
        this.bookname = bookname; //이름을 같게하고 this로 class Book2를 가르킨다.
    }
}


//Today Point
class Socar {
    String color;
    String geartype;
    int door;
    
    public Socar() {
        this.color = "red";
        this.geartype = "auto";
        this.door = 4;
    }
    
    public Socar(String color, String geartype, int door) {
        this.color = color;
        this.geartype = geartype;
        this.door = door;
    }
    
    void print() {
        System.out.println(this.color +"," +this.geartype+ "," +this.door);
    }
}


public class Ex19_this {

    public static void main(String[] args) {        
        Socar socar = new Socar(); //default 일 때.
        socar.print();
        
        Socar socar2 = new Socar("white", "auto", 2); //parameter로 값을 받았을 때.
        socar2.print();

    }

}




