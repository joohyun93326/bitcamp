import java.util.ArrayList;

/*
 * 자바가 가지는 8가지 기본 타입(값타입) : JAVA API 제공 
 * 
 * 8가지 기본 타입에 대해서 설계도를 생성 >> 8가지 기본 타입도 객체 형태로 사용 가능 >> wrapper class
 * 
 * 값 타입 대신 객체 형태 타입 >> generic (참조형태 parameter)
 * 1. 매개변수 객체 타입이 요구될 때 
 * 2. 기본형 값이 아닌 객체 형태로 저장 
 * 3. 객체간 값 비교 
 * 4. 타입 변환시 비교 
 * 
 */

public class Ex08_Wrapper_Class {

    public static void main(String[] args) {
        int i = 100;
        
        //Integer 함수의 parameter 
        //generic 
        ArrayList<Integer> li = new ArrayList<Integer>(); 
        li.add(100);
        li.add(200);
        li.add(300);
        
        for(int value : li) { //value 변수에 li 값을 넣겠다 
            System.out.println(value);
        }
    }

}
