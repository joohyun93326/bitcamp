package kr.or.bit;

public class NoteBook {
    private String color; 
    private int year;
    
    //직접 할당을 막고 간접 할당
    //간접 할당의 구현 (함수) >> 특수한 목적 (setter, getter)
    
    //손코딩
    public void setYear(int y) {
        if(y <= 0) {
            year = 1999;
        }else {
            year = y;
        }
    }
    public int getYear() {
        return year;
    }
    
    
    //자동화 !!!
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    //마우스를 가지고 있다
    //여러개의 속성과 기능
    //Mouse mouse; (마우스는 x,y 좌표를 가지고있다. 마우스는 클릭할 수 있다)
    
    public void handle(Mouse m) {
        m.x = 100;
        m.y = 200;
    }
    
    public void noteBookInfo() {
        System.out.println("color : " + color + "year : " + year);
        
    }

}


