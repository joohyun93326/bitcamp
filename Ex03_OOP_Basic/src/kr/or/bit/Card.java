package kr.or.bit;
/* 
 * 카드를 만들어 판매하는 회사. 
 * 고객의 요청에 따라 카드 53장을 제작하게 되었습니다. >> 메모리에 올리겠다.
 * 
 * 요구사항.    
 * 카드는 카드의 번호를 가지고있고, 모양을 가지고 있다.
 * 카드는 크기를 가지고 있고, 크기는 높이와 너비를 의미합니다.
 * 카드의 크기는 h = 50; w =20;
 * 
 * 모든 카드의 높이와 너비는 동일 
 * ??? 카드의 크기를 나중에 변경해달라고 하면??
 * 
 * 설계도를 다시 변경하지 않고 53장 카드의 크기를 변경할 수 있을까?
 * 
 */
public class Card {
    public int number; //default
    public String kind;
    
    //public int h = 50; //초기화
    //public int w = 20;
    
    public static int h = 50; //static으로 변수를 변경해서 카드 크기를 변경할 수 있게 한다.
    public static int w = 20;
    
    
    public void cardInfo() {
        System.out.printf("번호: %d , 모양: %s , h:%d , w:%d \n", number, kind, h, w);
    }

}
