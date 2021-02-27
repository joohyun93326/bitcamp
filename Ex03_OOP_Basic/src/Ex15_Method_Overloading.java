class Human3 {
    String name;
    int age;
}

class Test2 {
    Human3 add(Human3 h) {
        h.name = "나야나";
        h.age = 20;
        return h;
    }
    
    Human3 add(Human3 h, Human3 h2) {
   
        return null;
    }
}


public class Ex15_Method_Overloading {

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        Human3 h = new Human3();
        t2.add(h);
        
        t2.add(new Human3(), new Human3());

    }

}
