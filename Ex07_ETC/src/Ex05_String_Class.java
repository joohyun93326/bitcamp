/*
 * String >> 클래스 >> new를 통해서 사용 가능 >> 근데 new를 하지 않고도 사용이 가능함 
 * >>일반적인 값타입처럼 사용해도 문제가 없다 (컴파일러가 알아서 한다)
 * String이 가지고 있는 다양한 함수 활용 
 * - static 함수(new하지않고 씀) ex) String. ~~
 * - 일반 함수 
 * 최소 15개~20개 암기하면 삶이 편해져요 
 * 
 */
public class Ex05_String_Class {

    public static void main(String[] args) {
        String str = "";
        //int , double 과 같이 사용 
        
        String[] strarr = {"aaa", "bbb"};
        for(String s : strarr) {
            System.out.println(s);
        }
        //////////////////////////지금까지////////////////////////////
        
        String str2 = "홍길동";
        System.out.println(str2.length());
        System.out.println(str2.toString()); //Object toString() 재정의 
        System.out.println(str2); //toString() 생략 
        
        String str3 = new String("김유신");
        
        //1. String name = "가나다라마";
        //String 클래스의 내부적으로 저장되는 자료구조 char[] >> [가][나][다][라][마]
        //class String extends Object {char[] value.....toString() ... length()}
        
        String str4 = "AAA";
        String str5 = "AAA";
        System.out.println(str4);
        System.out.println(str5.toString());
        System.out.println(str4 == str5); //true
        // == 연산자 : 값을 비교 (str4(주소값), str5(주소값))
        // 주소가 아니라 값을 비교하고 싶다.
        
        System.out.println(str4.equals(str5)); //true
        
        String str6 = new String("BBB");
        String str7 = new String("BBB");
        System.out.println(str6 == str7); //false 
        //String 만들 때 new를 사용하면 강제적으로 힙 메모리에 할당됨 
        System.out.println(str6.equals(str7)); //true 
        
        //문자열 비교는 equals 를 사용하자 !!!
        
        //넌센스 
        String s = "A";
        s+= "B";
        s+= "C";
        System.out.println(s);
        s = "A";
        System.out.println(s);
        //String 10000개의 문자를 누적하면? 성능상 안좋다. 메모리에 1000번 할당되니까 !
        //String에 누적값 쓰면? 바보다..
        //누적을 다루는 StringBuffer , StringBuilder 를 쓴다
        
        
        
        
    }

}
