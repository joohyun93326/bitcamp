import kr.or.bit.Car;
import kr.or.bit.Mouse;
import kr.or.bit.NoteBook;

public class Ex04_MethodCall {
    public static void main(String[] args) {
        
        NoteBook notebook = new NoteBook();
        notebook.setColor("red");
        notebook.setYear(-2000);
        
        System.out.println(notebook.getColor());
        System.out.println(notebook.getYear());
        
        Mouse mouse = new Mouse();
        notebook.handle(mouse);
        System.out.println(mouse.x);
        System.out.println(mouse.y);
        
        //notebook 3대 생성하고
        //2000, red
        //2010, blue
        //2020, white
        //명시하고 정보를 출력하세요. (배열 사용)
        
        //POINT
        //객체배열은 [방의 생성]과 [객체 생성] 2번 작업 !!
        //객체배열을 만들면 처음에 방이 비어있고,
        //new를 통해서 각각의 방에 주소를 넣어줘야 한다.

        NoteBook[] notebooks = new NoteBook[3];
        //배열의 notebook 객체의 주소를 담을 수 있는 방 생성
        
        //주소값 넣기 전 (null)
        System.out.println(notebooks[0]);
        
        //new를 통해서 각각의 방에 주소값 넣기
        notebooks[0] = new NoteBook();
        notebooks[1] = new NoteBook();
        notebooks[2] = new NoteBook();
        
        //주소값 넣은 후 (kr.or.bit.NoteBook@555590)
        System.out.println(notebooks[0]);
        
        notebooks[0].setYear(2000);
        notebooks[0].setColor("red ");
        notebooks[0].noteBookInfo();
        
        notebooks[1].setYear(2010);
        notebooks[1].setColor("blue ");
        notebooks[1].noteBookInfo();
        
        notebooks[2].setYear(2020);
        notebooks[2].setColor("white ");
        notebooks[2].noteBookInfo();
        
        for(int i = 0; i < notebooks.length; i++) {
            notebooks[i].noteBookInfo();
        }
        //개선된 for문
        for(NoteBook no : notebooks) {
            no.noteBookInfo();
        }
        
        
        //2.int[] arr = new int[] {1, 2, 3}
        NoteBook[] notebooks2 =
                new NoteBook[] {new NoteBook(), new NoteBook(), new NoteBook()};
        
        
        //3. 컴파일러에게 new를 맡김 = (int[] arr = {1, 2, 3}) 사용 빈도가 제일 높다 !
        NoteBook[] notebooks3 = {new NoteBook(), new NoteBook(), new NoteBook()};
        
        
        //Car.java
        Car car = new Car(); //Car 객체 생성
        car.speedUp(); //속도 증가
        car.speedUp();
        System.out.println(car.getSpeed()); //getSpeed() 호출
        
        car.speedDown();
        car.speedDown();
        car.speedDown();
        car.speedDown();
        System.out.println(car.getSpeed());
        
        
    }
}
