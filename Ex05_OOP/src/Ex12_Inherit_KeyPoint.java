/*
 *
다형성 예제 !!!

시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라는 전자제품 매장이 오픈되면 

[클라이언트 요구사항]
가전제품은 제품의 가격 , 제품의 포인트 정보를 공통적으로 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름을 가지고 있다

ex)
각각의 전자제품은 이름을 가지고 있다(ex: Tv , Audio , Computer)
각각의 전자제품은 다른 가격을 가지고 있다(Tv:5000, Audio:6000 ....)
제품의 포인트는 가격의 10% 적용한다

시뮬레이션 시나리오
구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다 
예를 들면 : 10만원 , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게되면 가지고 있는 돈은 감소하고 포인트는 올라간다
구매자는 처음 초기 금액을 가질 수 있다
 * 
 */

class Product {
    int price;
    int bonuspoint;
    Product(int price) { 
        this.price = price;
        this.bonuspoint = (int)(this.price/ 10.0);
    }
}

class KtTv extends Product {
    //가격정보 부모
    KtTv() { //default 생성자 호출   
        super(500); 
    }
    
    @Override
    public String toString() {
        return "KtTv";
    }
    
}


class Audio extends Product {
    //가격정보 부모
    Audio() { //default 생성자 호출   
        super(100); 
    }
    
    @Override
    public String toString() {
        return "Audio";
    }
    
}

class NoteBook extends Product {
    //가격정보 부모
    NoteBook() { //default 생성자 호출   
        super(150); 
    }
    
    @Override
    public String toString() {
        return "NoteBook";
    }
    
}

//구매자
class Buyer {
    int money = 1000;
    int bonuspoint;
    
    
    //다형성 : 모든 제품의 부모는 product >> product타입의 주소가 자식 타입의 주소를 가질 수 있다.

    //구매자는 구매 행위를 할 수 있다 (기능)
    //구매행위 (잔액 - 제품가격 , 포인트 - 갱신(증가)
    //*****구매자는 매장에 있는 모든 물건을 구매할 수 있다*****
    void Buy (Product n) { //구매자가 어떤 물건을 사는지 정보를 알아야 그 물건의 가격을 얻어올 수 있다   
        if(this.money < n.price) {
            System.out.println("고객님 잔액이 부족합니다. ㅠㅠ" +this.money);
            return; //함수 종료 
        }
        //실제 구매 행위
        this.money -= n.price; //잔액 
        this.bonuspoint += n.bonuspoint; //누적 
        System.out.println("구매한 물건은 : " + n.toString());
    }
    
}

//toString() : 최상위 클래스인 Object가 가진 자원 
//Tv tv = new tv(); 를 하면
//이때 System.out.println(tv.toString()); 하면 tv공간에 담긴 Tv객체의 주소가 나옴.
//이걸 이용해서 Tv클래스에서 toString() 주소가 아니라 초기화한 값이 찍히도록 오버라이딩을 해두면
//System.out.println(tv.toString()); 했을 때 내가 원하는 값으로 tv가 잘 초기화됐는지 확인할 때 쓴다.

//자식클래스에서 오버라이딩된 toString()을 재정의되기 전에 원래 기능으로 쓰려면 super.toString()



public class Ex12_Inherit_KeyPoint {

    public static void main(String[] args) {
        KtTv kttv = new KtTv();
        Audio audio = new Audio();
        NoteBook notebook = new NoteBook();
        
        Buyer buyer = new Buyer();
        /*buyer.Audio(audio);
        buyer.KttvBuy(kttv);
        buyer.Audio(audio);
        buyer.NoteBook(notebook);
        buyer.NoteBook(notebook);
        */
        
        buyer.Buy(kttv);
        buyer.Buy(audio);
        buyer.Buy(notebook);
        buyer.Buy(kttv);
        
    }

}
