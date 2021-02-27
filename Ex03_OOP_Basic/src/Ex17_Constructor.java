/*
 * 자동차 영업소
 * 기본 사양, 옵션 구매 가능
 * 기본 사양 : 문의 개수 4개, 색상 red 
 *
 * 그런데 고객은
 * 문의 개수만 변경 가능하고 자동차의 색상은 red 로 할 수 있고
 * 문의 개수는 기본으로 하고 자동차의 색상 변경이 가능하고 
 * 문의 개수와 자동차의 색상 모두 변경을 하여 차를 구매할 수 있다.
 * 
 * 1. 기본 사양
 * 2. 옵션 : 문 변경, 자동차 색상 기본
 * 3. 옵션 : 자동차 색상 변경, 문 기본
 * 4. 옵션 : 자동차 색상 변경, 문 변경
 * 
 */

//이 코드가 좋은 코드가 아닌 이유
//1. parameter 이름이 애매함 (member field명 충돌) >> this로 해결
//2. 개발자는 반복되는 코드를 싫어함. >> this로 해결

class Car6 {
    int door;
    String color;
    
    public Car6() { //default constructor일 때.
        door = 4;
        color = "red";
    }
    public Car6(int d) { //문 개수 변경 가능하니 parameter로 받음
        door = d;
        color = "red";
    }
    public Car6(String s) { //색상 변경 가능하니 parameter로 받음
        door = 4;
        color = s;
    }
    public Car6(int d, String s) { //둘 다 변경 가능
        door = d;
        color = s;
    }
    //출력
    public void carInfo() {
        System.out.println("door :" + door + ", color :" + color);
    }
}


public class Ex17_Constructor {

    public static void main(String[] args) {
        Car6 car = new Car6(); //default constructor
        car.carInfo();         // 4 door, red color
        
        Car6 car2 = new Car6("pink");
        car2.carInfo();
        
        Car6 car3 = new Car6(6);
        car3.carInfo();
        
        Car6 car4 = new Car6(2, "black");
        car4.carInfo();

    }

}
