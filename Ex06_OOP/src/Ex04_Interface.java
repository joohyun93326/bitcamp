interface Irepairable {  
}

class Unit2 {
    int hitpoint; //기본 에너지
    final int MAX_HP; //최대 에너지
    
    Unit2(int hp) {
        this.MAX_HP = hp;
    }
}

//지상 유닛
class GroundUnit extends Unit2 {
    
    GroundUnit(int hp) {
        super(hp);
    }
}

//공중 유닛 
class AirUnit extends Unit2 {
    
    AirUnit(int hp) {
        super(hp);
    }
}

//건물
class CommandCenter implements Irepairable {

}

//Tank2
class Tank2 extends GroundUnit implements Irepairable {
    
    Tank2() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }
    @Override
    public String toString() {
        return "[Tank2]";
    }
}

//Marine2
class Marine2 extends GroundUnit {
    Marine2() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }
    @Override
    public String toString() {
        return "[Marine2]";
    }
}

//Scv 자원채취 (광물, 치료, 에너지 ...)
class Scv extends GroundUnit implements Irepairable {
    Scv() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }
    @Override
    public String toString() {
        return "[Scv]";
    }
    
    //Scv 만의 구체화, 특수화된 기능
    //repair(수리하다)
    /*
    void repair(Tank2 tank) {
        if(tank.hitpoint != tank.MAX_HP) {
            System.out.println("파손 ! ");
            tank.hitpoint += 5;
        }
    }
    
    void repair(Scv scv) {
        if(scv.hitpoint != scv.MAX_HP) {
            System.out.println("파손 ! ");
            scv.hitpoint += 5;
        }
    }
    
    Unit 종류가 30개 (수리 개수 25개)
    Scv repair 해야하는 Unit 개수가 증가하면 함수의 개수도 같이 증가 
    고민 : 하나의 함수가 Unit을 repair하면 되지 않을까 ?
    
    repair의 정의 : hippoint를 MAK_HP 까지 증가시켜줘야 한다
    
    repair 대상 : Scv, Tank2, CommandCenter
    >>Marine은 사람이라 Scv의 repair대상이 아니다 
    >>CommandCenter 또한 Unit과 연관성이 없다

    그렇다면 이 모든 것들의 부모 인터페이스를 만들어서 연관을 시켜볼까?    
    
    인터페이스 Irepairable 을 부모로 가지게 만들자.
    class CommanCenter implements Irepairable
    class Tank2 extends GroundUnit implements Irepairable
    class Scv extends GroundUnit implements Irepairable 
    >>부모타입은 자식타입의 주소를 가질 수 있다.
    >>자식타입이 부모타입의 주소를 가지려면 다운캐스팅 해야 한다.
    */
    
    
    void repair(Irepairable repairunit) {
        //repairunit parameter는 Irepairable 인터페이스를 구현하는 객체의 주소값이 올 수 있다 
        //void repair (new Tank2())
        //void repair (new CommandCenter())
        //void repair (new Scv())
        //Unit2 타입을 파라미터로 받으면 사람, 탱크가 같이 수리받는게 된다
        //정리
        //1. CommandCenter와 Tank2, Scv는 수리 방법이 틀리다 (탱크와 건물이니까)
        //2. Irepairable repairunit은 수리할 자원을 가지고 있지 않다 
        //그럼 Irepairable repairunit을 통해서 위 3가지 Unit 가지고 온다고 가정하고 분류해 보자 
        
        //CommandCenter 와 Tank2, Scv 구분점은 Unit2 이냐 아니냐 ?? >>Tank2, Scv 만 Unit2 임 
        //>> 타입 비교 (연산자 : instanceof 활용)
            if(repairunit instanceof Unit2) { //Tank2, Scv, CommandCenter 너네 Unit2 타입이야?
                //부모타입 Unit2인 경우
                //최상위부모 repairunit 타입 / 자식 Unit2 
                //부모타입의 주소를 자식이 가지려면 자식타입으로 다운캐스팅해야 한다. 
                Unit2 unit = (Unit2)repairunit; //unit >> Tank2, Marine
                
                //인터페이스는 최상위부모 인데 hp값을 자신의 값으로 가지고있지 않아서 Unit2로 다운캐스팅해야 볼 수 있음
                
                //Tank2 에서 부모타입인 Unit2 자원만 접근 
                if(unit.hitpoint != unit.MAX_HP) {
                    unit.hitpoint = unit.MAX_HP;
                }
            }else {
                //부모타입 Unit2가 아닌 경우 
                System.out.println("Unit2 타입이 아닙니다 !! 다른 충전 방식을 선택하세요 ");
            }
    }
}

public class Ex04_Interface {
    public static void main(String[] args) {
        Tank2 tank = new Tank2();
        Marine2 marine = new Marine2();
        Scv scv = new Scv();
        
        //전투
        tank.hitpoint -= 20;
        System.out.println("탱크 : " +tank.hitpoint);
        System.out.println("Scv 수리 요청");
        scv.repair(tank);
        System.out.println("탱크 수리 완료 : " +tank.hitpoint);
        
        scv.hitpoint -= 10;
        System.out.println("scv : " +tank.hitpoint);
        System.out.println("Scv 수리 요청");
        scv.repair(tank);
        System.out.println("scv 수리 완료 : " +tank.hitpoint);
        
        CommandCenter center = new CommandCenter();
        scv.repair(center);
        
        
    }

}
