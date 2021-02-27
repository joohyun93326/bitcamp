package kr.or.bit;
// TV 설계도 요구사항 정의
// 채널 정보 ( 1~200 )
// 브랜드 이름 ( 삼성, 엘지 )
// 채널 전환 기능 (한 채널씩 이동 가능)
//-> 채널 증가 기능 (함수)
//-> 채널 감소 기 (함수)

public class Tv {
    public int ch; //default 0
    public String brandname; //default null (String은 클래스여서 null)
    
    public void ch_Up() {
        ch++;
        
    }
    
    public void ch_Down() {
        ch--;
        
    }
    
    //채널 정보, 브랜드이름 출력기능 
    public void tv_Info() {
        System.out.printf("[%s] , [%d] \n", brandname, ch);
    } 
    
    

}
