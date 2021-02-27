public class Ex10_Static_Method {
    int number;
    
    public void print() {
        System.out.println("나 일반 함수 number : " + number);        
    }
    
    public static void method() {
        System.out.println("나 static 함수");        
    }
        

    public static void main(String[] args) {
        method(); //static 함수는 바로 알 수 있다. 이미 메모리에 올라가 있어서 !
        
        Ex10_Static_Method ex10 = new Ex10_Static_Method();
        ex10.print(); //일반 함수는 부르려면 new를 해줘야 한다!!
        
        

    }

}
