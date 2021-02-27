import java.util.ArrayList;

/*
 *  Collection 클래스 >> 데이터 저장 공간 타입 >> Object 
 *  1. Object 타입 저항 >> 타입 문제 >> 처음 객체를 생성 >> Type 강제 >> 제너릭 
 *  2. 타입 안전성 (타입 강제성)
 *  3. 강제 형변환 (casting) : Car c = (Car)obj >>이제 이런 거 사용 안해요 
 *  
 */

/*제너릭 이용 전 
class MyGen<Object> { //type parameter 
    Object obj;
    
    void add(Object obj) {
        this.obj = obj;
    }
    
    Object get() {
        return this.obj;
    } 
}
*/

//제너릭을 이용한 클래스 설계 
class MyGen<T> { //type parameter 
    T obj;
    
    void add(T obj) {
        this.obj = obj;
    }
    
    T get() {
        return this.obj;
    }
}



//객체를 올려볼게요,,
class Person extends Object {
    int age = 100;
    
}


public class Ex06_Generic {

    public static void main(String[] args) {
        
        //T 를 Stiring 타입으로 변경해서 메모리에 올린다.
        //String 타입으로만 파라미터를 받는다. 
        MyGen<String> mygen = new MyGen<String>();
        mygen.add("문자열");
        String str = mygen.get();
        System.out.println(str);
        
        //제너릭 안 씀 
        ArrayList list = new ArrayList();
        //내부적인 저장 공간의 타입 : Object[] implements
        list.add(10);
        list.add(new Person());
        list.add("홍길동");
        
        for(Object obj : list) {
            //방 안에 있는 녀석들의 타입 정보를 다 확인 확인.......
            if(obj instanceof Person) {
                Person p = (Person)obj;
                System.out.println(p.age);
            }else {
                System.out.println(obj);
            } 
        }
        
        //제너릭 씀 !
        //Person 타입의 객체 주소값만 받겠다 !
        ArrayList<Person> plist = new ArrayList<Person>();
        plist.add(new Person());
        plist.add(new Person());
        
        for(Person p : plist) {
            System.out.println(p.age);
        }
    }
}


