package kr.or.bit;

import java.io.IOException;

//클래스 == 설계도 == 타입
//내 설계도를 사용하는 개발자가 예외를 강제로 처리했으면 좋겠다.
//>>생성자 함수같은 곳에서 강제 예외 처리할 수 있게 한다.

public class MyClass {
    public MyClass(String path) throws IOException, NullPointerException { //예외들 
        System.out.println(path);
        
        
    }

}
