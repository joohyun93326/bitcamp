package kr.or.bit;

//창문의 수를 가지고 있다.
//속도를 가지고 있다.
//2가지 속성 캡슐화
//속도는 마이너스 값이 오면 0으로 초기화한다. 나머지는 그냥 사용

//속도를 10씩 올리거나 감소하는 기능을 만드세요. (함수)
//속도가 마이너스 값을 가지면 0으로 초기화한다. 나머지는 그냥 사용


public class Car {
    private int window; //창문의 수
    private int speed; //속도
    
    //캡슐화 자동
    public int getWindow() {
        return window;
    }
    public void setWindow(int window) {
        this.window = window;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if(speed < 0) {
            this.speed = 0;
        }else {
        this.speed = speed;
        }
    }
    
    public void speedUp() {
        this.speed += 10;
    }
    
    public void speedDown() {
        if(speed < 0) {
            this.speed = 0;
        }else {
            this.speed -= 10;
        }
    }
    
    
    
}
    
