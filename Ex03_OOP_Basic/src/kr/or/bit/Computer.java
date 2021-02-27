package kr.or.bit;

class MainBody {
    int price;
    String brand;
    int number;
    int cpu;
    int memory;
    
    boolean status;
}

class Monitor {
    int LCD;
    int holder;
    String brand;
    int button;
}

class Keyboard {
    int button;
    int Led;
    String brand;
}


public class Computer {
    private int price; //가격
    private int number; //시리얼 넘버
    private String brand; //브랜드
    private String color; //색깔
    
    boolean lowMode;
    String space;
    
    MainBody mainbody = new MainBody();
    Monitor monitor = new Monitor();
    Keyboard keyboard = new Keyboard();
    
    //공간 ( space ) 에 입력, 출력
    public void SpaceInput(String space) {
        this.space = space;
    }
    public void SpacePrint() {
        System.out.println(this.space);
    }
    
    //컴퓨터 전원 키고, 끄기
    public void ComputerOn() {
        mainbody.status = true;
    }
    public void ComputerOff() {
        mainbody.status = false;
    }
    
    //절전모드 키고, 끄기
    public void lowModeOn() {
        lowMode = true;
    }
    public void lowModeOff() {
        lowMode = false;
    }
    
    
    public void CalculateAdd(double a, double b) {
        double result = a + b;
        System.out.println("더하기 값 :" + result);
        }

    public void CalculateMinus(int a, int b) {
        double result = a - b;
        System.out.println("빼기 값 :" + result);   
         }

    public void CalculateMulti(int a, int b) {
        double result = a * b;
        System.out.println("곱하기 값 :" + result);
         }
         
    public void Calculatedivide(int a, int b) {
        double result = a / b;
        System.out.println("나누기 값 :" + result);
         }

}



