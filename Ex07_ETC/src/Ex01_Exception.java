/*
 * 에러(error) : 네트워크 장애, 메모리 이상, 하드웨어 >> 개발자가 코드적으로 해결 불가
 * 예외(exception) : 개발자의 실수에 의한 비정상적인 종료 >> 예외처리 >> 방어적 코드
 * 
 * 예외처리 : 예외가 발생하지 않도록 하는 것이 아니고 예외가 발생하더라도 넘어갈 수 있게 하는 것,,,
 * 
 * 문법)
 * try { 
 *      >>문제가 발생할 수 있는 코드 
 *      >>문제가 발생하면 catch로 보냄
 * }catch(Exception e) {
 *      >>문제가 생기면 catch 문제를 파악
 *      >>처리 유도
 *      >>1. 관리자에게 email
 *      >>2. 로그파일에 문제 기록
 *      >>3. 강제 종료 막음 
 *      >> 개발자의 코드 수정이 필요하다 (try ~catch는 문제점을 아는 용도)
 *      
 * }finally{
 *      >>문제가 발생하든지 말든지 강제로 수행되어야 할 코드 
 *      >>DB 연결 해제 
 * }
 * 
 * 예외가 발생하면 개발자 예외 발생 건에 대해서 파악 (어떤 자원, 어떤 행동에 의해 발생했는지 등등) 
 * 예외에 관련된 클래스 설계 >> 예외가 발생하면 
 */

public class Ex01_Exception {

    public static void main(String[] args) {
        System.out.println("main start");
        try {
            //System.out.println(0/0); // new ArithmeticExceptiron() 
            
        }catch (Exception e) { //e는 Exception의 주소값을 받는다.
                               //Exception 클래스는 ArithmeticExceptiron의 부모 타입 (다형성)
            //문제에 대한 파악
            e.printStackTrace();
            
            //System.out.println("발생 원인 : " +e.getMessage());
        }
        System.out.println("main end");
    }
}

