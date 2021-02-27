/*
 * Thread : 프로세스에서 하나의 최소 실행 단위(흐름)
 * 
 * Thread 생성 방법 
 * 1. Thread 라는 클래스를 상속 : class Test extends Thread >> 새로운 stack에서 놀거야
 * >> run() 함수 >> 새로운 stack에서 가장 먼저 실행되는 함수  >> Thread 스스로 객체 생성 가능 
 * 
 * 2. Runnable 인터페이스를 구현 : class Thread_2 implements Runnable 
 * >> 클래스가 갖고 있는 문제점때문에 인터페이스를 구현 : 다중 상속 안된다는 점
 * 
 * 
 */

class Thread_2 implements Runnable{ //run() 재정의 강제

    @Override
    public void run() {
        for(int i = 0 ; i < 10000 ; i++) {
            System.out.println("Thread_2 : " + i);
        }
        System.out.println("Thread_2 run() END.........");
        
    }
    
}


class Thread_1 extends Thread { //thread 클래스 상속해서 만드는 방법 
    @Override
    public void run() { //함수는 main()함수와 동일한 역할 
                        //새로운 stack에서 처음 올라가서 실행되는 함수 run()
        for(int i = 0; i < 10000; i++) {
            System.out.println("Trread : " + i + this.getName());
        }
        System.out.println("Thread_1 run() END !!!");
        
    }
}


public class Ex02_Multi_Thread {

    public static void main(String[] args) {
        //1번
        Thread_1 th = new Thread_1();
        //POINT
        th.start(); 
        //start() 메모리에 새로운 call stack을 생성 후 run()함수를 stack에 올리고 종료하는 함수 
        
        //2번 
        //Thread_2 th2 = new Thread_2(); //thread 가 아니다
        //Thread thread = new Thread(th2);
        //위 구문을 아래처럼 바꿔서 쓰자 
        Thread thread = new Thread(new Thread_2());
        thread.start();
        
        
        for(int i = 0 ; i < 10000 ; i++) {
            System.out.println("main : " + i);
        }
        System.out.println("Main END");
    }

}





