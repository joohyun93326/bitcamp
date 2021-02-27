import java.io.IOException;

/*
 * 게임 CD PC 설치
 * 1. 설치파일 > C:\Temp 복사
 * 2. 복사한 파일 >> 게임설치 
 * 3. 정상 설치 >> C:\Temp 복사한 파일 삭제
 * 4. 비정상 문제 발생 (강제 종료) >> 복사한 파일 삭제 
 * 
 * 
 */

public class Ex03_finally {
    
    static void startInstall() {
        System.out.println("INSTALL");
    }
    static void copyFiles() {
        System.out.println("COPY FILES");
    }
    
    static void fileDelete() {
        System.out.println("FILE DELETE");
    }
    public static void main(String[] args) {
        //위 3개 함수 정상임
        //실제로는 예외가 아니지만 어떤 상황에 대해서 강제로 예외로 지칭 가능 
        //1이면 정상 2이면 강제로 예외를 발생해서 catch로 보냄
        //throw new IOException()
        
        try {
            copyFiles();
            startInstall();
            throw new IOException("install 도중 문제가 발생 "); //개발자 임의로 예외 발생 
        }catch (Exception e) {
            System.out.println("예외 메시지 출력: " + e.getMessage());
            
        }finally { //예외가 발생하든 말든 무조건 실행됨 
            fileDelete();
            //함수로 강제 종료 (return을 만나면 함수 종료) 
            //예외적으로 finally는 return에 의해서 종료되기 전에 호출됨 
            
        }
        //fileDelete(); 여기에 구문을 쓰면 return을 만나면 종료가 되니까 실행이 안된다.
        System.out.println("main end");

    }

}
