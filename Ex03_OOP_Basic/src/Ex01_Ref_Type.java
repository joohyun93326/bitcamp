import kr.or.bit.Apt;
import kr.or.bit.BodyInfo;
import kr.or.bit.Car;
import kr.or.bit.Emp;
import kr.or.bit.Person;
import kr.or.bit.Tv;

public class Ex01_Ref_Type {
    
    public static void main(String[] args) {
        Emp emp = new Emp(); //참조변수 (주소값 변수)
        //System.out.println(emp.toString());
        //kr.or.bit.Emp@28a418fc 주소값(변형)
        //kr.or.bit.Emp + @ + 주소
        
        
        emp.number =- 100;
        System.out.println(emp.number);
        
        emp.setNum(55);
        int result = emp.getNum();
        System.out.println("result: " + result);
        
        
        emp.setEname("박주현");
        String name = emp.getEname();
        System.out.println("name : " + name);
        
        
        
        int num = 100; //값타입 변수
        System.out.println(num);
        
        
        //답: 객체를 만드는 사용자마다 다른 값을 가질 수 있게 하기 위해
        Apt sapt = new Apt();
        //new를 사용하면 heap이라는 공간에 올라간다.
        
        sapt.door = 20;
        System.out.println(sapt.door);
        System.out.println("주소값 : "+sapt);
        //주소값 : kr.or.bit.Apt@555590
        
        Apt lapt = new Apt();
        lapt.door = 10;
        System.out.println(lapt.door);
        System.out.println("주소값 : "+lapt);
        //주소값 : kr.or.bit.Apt@6d1e7682
        
        Apt mapt = new Apt();
        System.out.println(mapt.door);
        System.out.println("주소값 : "+mapt);
        //주소값 : kr.or.bit.Apt@424c0bc4
        
        //메모리 공간이 다르니 주소값이 다 다르다.
        
        //값할당
        int i = 10;
        int j;
        j = i;
        j = 100;
        System.out.println("i :" + i );
        System.out.println("i :" + j );
        
        //i : 10 , j : 100
        
        //주소값 할당
        Apt apt = new Apt();
        Apt kapt = apt;

        apt.door = 9999;
        System.out.println(kapt.door);
        
        System.out.println("apt :" + apt);
        System.out.println("kapt :" + kapt);
        
        //apt :kr.or.bit.Apt@3c679bde
        //kapt :kr.or.bit.Apt@3c679bde
        
        
        int[] arr = new int[5];
        int[] arr2 = arr; //주소값 할당
        //같은 주소를 참조한다.
        System.out.println("arr : " +arr);
        System.out.println("arr2 : " +arr2);
        //arr : [I@16b4a017
        //arr2 : [I@16b4a017
        
        
        //값타입 (8가지)
        //참조타입 (class, Array) : 객체의 주소를 가지고있다.
        
        Apt ap; //선언 (stack 영역에 공간만 확보한다. 공간의 크기는 default 4byte)
        ap = new Apt(); //할당 (ap라는 변수가 메모리를 갖는다. == 객체의 주소값을 갖는다)
        //선언과 할당을 분리할 수 있다.
        
        System.out.println("ap 주소값: " +ap);
        ap = null;
        System.out.println("ap 주소값: " +ap);
        
        //초기화
        Apt ap2; //main 함수 안에 있는 변수 scope local >> 사용 >> 초기
        ap2 = null;
        System.out.println(ap2); //초기화 안하면 출력 못함. null로 초기화 필요
        
        //함수 안에 있는 변수는 초기화 필수 (local variable)
        Car car;
        car = null;
        System.out.println(car);
        
        
        //클래스 안에 있는 변수 초기화 필요 없음 
        Apt ap3 = new Apt();
        System.out.println(ap3.car);
        
        Apt ap4 = new Apt();
        Apt ap5 = ap4; //ap4의 주소값을 ap5에 할당
        
        //주소값 비교
        System.out.println(ap3 == ap4); //false
        System.out.println(ap4 == ap5); //true
        
        
        //Tv 한대를 생산하세요.
        //제조사 : 비트
        //채널 정보 : 5번
        //정보 출력
        Tv bittv = new Tv();
        bittv.brandname = "비트";
        //bittv.ch = 5; 이게 아니고 호출을 5번 하라는 뜻
        bittv.ch_Up();
        bittv.ch_Up();
        bittv.ch_Up();
        bittv.ch_Up();
        bittv.ch_Up(); //이렇게
        
        bittv.tv_Info();
        
        //사원 1명 생성하세요.
        //사번 : 7788, 이름 : 김유신, 부서 : IT, 급여 : 1000
        //신체정보 : 키 190, 몸무게 40
        
        Person person = new Person();
        person.empno = 7788;
        person.ename = "김유신";
        person.job = "IT";
        person.sal = 1000;
        
        //방법 1.
        person.bodyinfo = new BodyInfo(); 
        person.bodyinfo.height = 190;
        person.bodyinfo.weight = 40;
        //이게 더 효율적이다.
        
        
        //방법 2.
        BodyInfo info = new BodyInfo();
        //굳이 info를 만들어서 스택에 할당돼서 메모리만 많이 차지
        info.height = 190;
        info.weight = 40;
        person.bodyinfo = info; //주소값 할당 ** 이제 한 몸이 되었다.
        System.out.println(person.bodyinfo.height);
        System.out.println(person.bodyinfo.weight);

        
    }
    

}
