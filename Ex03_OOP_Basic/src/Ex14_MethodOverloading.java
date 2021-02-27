/*
 * OOP(객체 지향 프로그래밍) >> 설계도 만들기
 * 1.상속(재사용성)
 * 2.캡슐화(은닉화) : private(직접할당 막고 간접할당) >> getter(읽기), setter(쓰기) 
 * 3.다형성 : 하나의 타입으로 여러개의 객체 주소를 가진다.
 * 
 * method overloading : 하나의 이름으로 여러가지 기능을 하는 함수
 * System.out.println() >> println() 이름은 1개, 기능은 여러개 
 * 1. 성능 향상과는 상관이 없다 !
 * 2. 설계자가 개발자의 편리성을 위해서 제공 (편하게 써라)
 * 
 * 문법) 함수의 이름은 같고 parameter[개수]와 [타입]을 다르게 만드는 것.
 * 1. 함수의 이름은 같아야 한다.
 * 2. parameter의 개수 또는 타입은 달라야 한다.
 * 3. return type은 오버로딩의 판단 기준이 아니다.
 * 4. parameter의 순서가 다름을 인정한다. ***주의***
 * 
 *
class out {
    public void println(){}
    public void println(int i){}
    public void println(String s){}
}
*/
class Human2 {
    String name;
    int age;
}

class OverTest {
    int add(int i) {
        return 100+i;
    }
    
    //오버로딩 O 
    //add 이름은 같고 parameter 개수는 다르다.
    int add(int i, int j) {
        return i+j;
    }
    
    //오버로딩 X
    //return type은 오버로딩 판단 기준이 아니다. 
    //String add(int j) {
    //    return "";
    //}
    
    //오버로딩 O
    String add(String s) { //parameter의 타입이 다르다.
        return "Hello" + s;
    }
    
    //오버로딩 O
    String add(String s, int i) { //parameter의 타입이 다르다.
        return null;
    }
    
    //오버로딩 O.
    String add(int i, String s) { //순서가 달라도 인정한다.
        return null;
    }
    
    //오버로딩 O
    void add(Human2 human) {
        human.name = "박주현";
        human.age = 29;
        System.out.println(human.name + " , " + human.age);
    }
    
}


public class Ex14_MethodOverloading {
    public static void main(String[] args) {
        OverTest ot = new OverTest();
        ot.add(100);
        ot.add(100,200);
        
        ot.add(new Human2());
        
        String result = ot.add("하이");
        System.out.println(result);


    }

}




