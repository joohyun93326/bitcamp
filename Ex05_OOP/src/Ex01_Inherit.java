/*
 * <<OOP>>
 * 1. 상속
 * 2. 캡슐화
 * 3. 다형성
 * 
 * 1. 상속 
 * java : child extends Base (확장 개념)
 * c# : child : Base (같은 뜻)
 * 
 * - 특징
 * 1. 다중 상속은 불가능
 * 2. 단일 상속만 가능 (계층적 상속 : 여러 개의 클래스 상속 가능)
 * 3. 다중 상속 지원 (단, interface만 가능)
 * 
 * - 진정한 의미 : 재사용성 (한번 만들어둔 클래스를 재사용)
 * - 단점 : 초기 설계 비용이 많이 든다.
 * - 재사용성 >> 설계 >> 비용 (공통분모(추상화))
 * 
 * - 상속 관계
 * GrandFather >> Father >> Child
 * Child child = new Child()
 * 내가 new를 하면 상속 관계를 판단해서 GrandFther >> Father >> Child 순서로 heap에 올라간다.
 * 
 */

//상속 관계에서는 제일 최상위 클래스가 Object를 상속한다.
class GrandFather { //extends Object 생략되어 있다. 굳이 쓸 필요는 없다 (컴파일러가 해줌) 
    public GrandFather() { 
        System.out.println("GrandFther");
    }
    public int gmoney = 5000;
    private int pmoney = 1000; //접근자 private : 상속 관계에서도 접근 불가
    
    //public void call() {
    //    System.out.println(pmoney); //private도 우회하면 접근이 가능하긴 하다.
    //}
}



class Father extends GrandFather {
    public Father() {
        System.out.println("Fther");
    }
    public int fmoney = 3000;
}

class Child extends Father {
    public Child() {
        System.out.println("Child"); //생성자를 만들어 메모리에 올라가는 순서를 확인한다.
    }
    public int cmoney = 1000;
}

class Car { //extends Object 생략
    
}
//사용자가 만드는 모든 클래스는
//class Car extends Object가 생략되어 있다. 
//== default로 Object(최상위) 클래스를 상속한다.
//Object 는 가장 추상화, 가장 일반화 되어있다.
//가지는 자원 : 모든 클래스가 공통으로 사용하는 것들 (주소 확인, 공통 함수, ...)


public class Ex01_Inherit {

    public static void main(String[] args) {
        
        Child child = new Child();
        System.out.println(child.gmoney); //할아버지 돈 내돈
        System.out.println(child.fmoney); //아버지 돈 내돈
        System.out.println(child.cmoney); //내돈 역시 내돈 
        
        //child.call(); private 우회 접근 
        Car car = new Car();
        
    }

}
