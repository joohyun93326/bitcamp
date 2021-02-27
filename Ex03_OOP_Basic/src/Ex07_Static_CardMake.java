import kr.or.bit.Card;

public class Ex07_Static_CardMake {

    public static void main(String[] args) {
        //Card 53장을 만들어야 함.
        //객체니까 heap에 만들어진다.
        Card c = new Card();
        c.number = 1;
        c.kind = "heart";
        c.h = 80;   //여기서 카드의 크기를 변경한다. 
        c.w = 50;
        c.cardInfo();
        
        Card c2 = new Card();
        c2.number = 1;
        c2.kind = "heart";
        c2.cardInfo();
        
        //카드 53장을 다 만들었다고 친다.
        //그런데 고객이 카드 사이즈를 변경 요청함.
        //1.53장 카드 h,w 일일이 변경 
        //2.설계도 변경
        //h, w 변수를 static으로 변경하고 main에서 크기를 변경한다. >>메모리에 올린 후 변경 
        
        
        

    }

}
