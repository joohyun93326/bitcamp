/*
 * 프로그램이 실행되려면 최소한 하나의 스레드(Stack)를 가지고 있다.
 * JVM이 하나의 main thread(stack)를 생성해준다.
 * 
 * 지금까지는 싱글 프로세스 >> 싱글 스레드(stack 1개) >> main함수가 올라가서 실행 
 * stack >> 한번에 1개의 함수만 실행 가능 (10개가 있더라도 동시 실행이 아니라 순차적으로 1개씩 실행)
 * **지금까지는 하나의 stack을 사용해서 현재 실행되는 함수는 스택의 가장 위에있는 함수 1개 !!!**
 * 
 * 
 */
public class Ex01_Single_Thread {

    public static void main(String[] args) {
        System.out.println("나 main 함수 일꾼이얌 ");
        worker();
        worker2();
        
        System.out.println("main 종료 ");

    }
    
    static void worker() {
        System.out.println("나 1번 일꾼이얌 ");
    }
    
    static void worker2() {
        System.out.println("나 2번 일꾼이얌 ");
    }

}
