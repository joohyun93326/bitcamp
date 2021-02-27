import kr.or.bit.Emp;

class Test2 {
    int x = 100;
    void print() {
        System.out.println("부모함수 Test2");
    }
}

class Test3 extends Test2 {
    int x = 300; //c# 부모 무시하기 //이런 식의 코드는 쓰지마세요 !!  
    
    @Override
    void print() {
        System.out.println("자식이 부모 함수를 재정의");
    }
    
    void print(String str) { //오버로딩
        System.out.println("나 오버로딩이야" +str);
    }
}


public class Ex05_Inherit_Override {

    public static void main(String[] args) {
        Test3 t3 = new Test3();
        System.out.println(t3.x); //자식 클래스가 갖고있는 300이 출력됨 
        
        t3.print();
        t3.print("hello");
        
        Emp emp = new Emp(1000, "박주현");
        System.out.println(emp); //조작된 주소 kr.or.bit.Emp@6d1e7682 출력됨 
        System.out.println(emp.toString()); //kr.or.bit.Emp@6d1e7682
        //emp라고 출력하면 사실은 toString()이 뒤에 숨어있다 
        //toString()은 Object가 가지는 자원 
        //Emp.java에서 toString() 재정의 한 후에 다시 실행하면 출력 제대로 됨 

    }

}
