import java.util.Properties;

/*
Properties : Map 인터페이스를 구현한 클래스
특수한 목적 : <String, String> 강제 
App 전체에 사용되는 자원 관리
환경변수, 프로그램 버전, 공통파일 경로, 공통변수, DB연결정보 ( id, pwd )

 */

public class Ex16_Properties {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("admin", "bit@bit.co.kr");
        prop.setProperty("version", "i.x.x.x");
        prop.setProperty("path", "C:\\Temp\\images");
        
        //각각의 개발페이지
        System.out.println(prop.getProperty("admin"));
        System.out.println(prop.getProperty("version"));
        
    }
}
