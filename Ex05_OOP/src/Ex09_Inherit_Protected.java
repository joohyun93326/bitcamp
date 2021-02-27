import kr.or.bit.Bird;

//Bird 상속받아서 구현

class Bi extends Bird {
    
    @Override
    protected void moveFast() {
        super.moveFast();
    }
    
}

class Ostrich extends Bird {
    void run() {
        System.out.println("RUN");
    }
    
    @Override
    protected void moveFast() {
        run();
    }
}



public class Ex09_Inherit_Protected {

    public static void main(String[] args) {
        Bi bi = new Bi();
        bi.fly();
        //POINT
        //bi.moveFast(); //moveFast는 default여서 상속 관계에서만 쓸 수 있다.
        bi.moveFast(); //Override한 후 쓸 수 있음.
        
        
        Ostrich o = new Ostrich();
        o.run();
        o.moveFast();
        
        
        
    }

}
