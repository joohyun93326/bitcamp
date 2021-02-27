/* 
 * 현업
 * 설계도가 많다(업무가 복잡하다) 하나의 설계도 불가 >> 여러 개의 설계도 나누어서 
 * 쇼핑몰 >> 회원관리, 배송관리, 주문관리, 상품관리 ... >> 각각의 설계도 서로 관계
 * 
 * 여러 개의 설계도를 어떤 기준에서 나누고 합치고 할까?
 * 
 * 1. is ~ a  // 은 ~이다 (부모를 뒤에) >> 상속
 * 2. has a  // 은 ~을 가지고 있다 >> 포함
 * 
 * 예)
 * 원, 도형
 * - 원은 도형이다 (O) 
 * - 원은 도형을 가지고 있다 (X)
 * >> 원 extends 도형 
 * 
 * 원, 점
 * - 원은 점이다 (X)
 * - 원은 점을 가지고 있다 (O) == 컴퓨터는 모니터를 가지고 있다
 * >> class 원 { 점 } == class Computer { 모니터 }
 * 
 * 경찰, 권총
 * - 경찰은 권총이다 (X)
 * - 경찰은 권총을 가지고 있다 (O)
 * >> class 권총 {}
 * >> class 경찰 {
 *      void 출동(권총)
 * }
 * 
 * 예) 원, 삼각형, 사각형 만드는 설계도를 작성하세요.
 * - 원은 도형이다
 * - 삼각형은 도형이다
 * - 사각형은 도형이다
 * 도형 : 추상화, 일반화 >> 공통 자원 >> 그리다, 색상 
 * 원 : 구체화, 특수화 >> 본인이 가지는 특징 >> 반지름, 한 점 
 * 점 : 좌표값 >> (x,y)
 * - 원은 점을 가지고 있다
 * - 사각형은 점을 가지고 있다
 * - 삼각형은 점을 가지고 있다
 * 
 * class Shape {그리다(기능), 색상(속성)} >> 상속관계 (부모)
 * class Point {x, y} >> 포함 
 * default 1,1
 * parameter 입력받기 기능
 *
 */

class Shape {
    String color = "red";
    void draw() {
        System.out.println("그리다");
    }
}

class Point {
    int x;
    int y;
    Point() {
        this(1,1);
    }
    Point(int x, int y) {
        this.x = x;
        this.y =y;
    }
    
}

//원을 만드세요 (원의 정의는 한점과 반지름을 가지고 있다)
//1. 원은 도형이다
//2. 원은 점을 가지고 있다 (member field >> Point)
//3. 원은 반지름을 가지고 있다 특수성(r)

//원의 반지름은 초기값 10을 가진다
//점의 좌표는 초기값 (10,15)을 가진다
//기본(초기값)을 설정하지 않으면 반지름과 점의 값을 입력받을 수 있다  

class Circle extends Shape { //Shape 상속 
    Point point; //포함 
    int r; //원의 구체화, 특수성 
    
    Circle() { //초기화를 통한 default값을 받는다
        //this.r = 10;
        //this.point = new Point(10,15);
        this(10, new Point(10,15));
    }
    
    Circle(int r, Point point) { //사용자가 정한 값으로 초기화
        this.r = r;
        this.point = point;
    }
}


//위 원 만든 것을 참조해서 삼각형을 만드세요.
//삼각형 클래스를 만드세요.
//삼각형은 3개의 점과 그리다 라는 기능을 가지고 있다.
//위에서 만든 Shape와 Point 제공받아서 사용
//default로 만들 수 있고, 세개의 좌표값을 받아서 만들 수도 있다.

//100점  (Point x;Point y;Point z;) >> Point[] pointarray
class Triangle extends Shape{
  Point x;
  Point y;
  Point z;
  
  Triangle() {
      //this.x = new Point(10,20);
      //this.y = new Point(30,40);
      //this.z = new Point(50,60);
      this(new Point(10,20),new Point(30,40),new Point(50,60));
  }
  
  Triangle(Point x, Point y , Point z) {
      this.x = x;
      this.y = y;
      this.z = z;
  }
  
  //구체화 , 특수화 
  //추가적인 기능 언제나 가능
  void trianglePoint() {
      System.out.printf("x : (%d,%d)\t",x.x,x.y);
      System.out.printf("y : (%d,%d)\t",y.x,y.y);
      System.out.printf("z : (%d,%d)\t",z.x,z.y);
      System.out.println();
  }
}

//100점 Triangle2  삼각형 클래스
class Triangle2 extends Shape{
    /*point x;
    point y;
    point z;*/
    Point[] pointarray;
  
  Triangle2() {
      /*
      this.pointarray = new Point[3];
      pointarray[0] = new Point(10,20);
      pointarray[1] = new Point(30,40);
      pointarray[2] = new Point(50,60);
      this(this.pointarray);
      */
      this(new Point[] {new Point(10,20) , new Point(30,40) , new Point(50,60)});
  }
  
  Triangle2(Point[] pointarray){
      this.pointarray = pointarray;
  }
  
  //기능
  void trianglePoint() {
      for(Point point : this.pointarray) {
          System.out.printf("point : (%d , %d)\t\n",point.x ,point.y);
      }
  }
}




public class Ex02_Inherit_Composition {

    public static void main(String[] args) {
        
        Circle circle = new Circle(); //default 생성자를 쓴 원
        System.out.println("반지름 : " +circle.r);
        System.out.println("부모자원 : " +circle.color);
        System.out.println("좌표 : " +circle.point.x);
        System.out.println("좌표 : " +circle.point.y);
        circle.draw();
        System.out.println("-------------");
        
        Circle circle2 = new Circle(20, new Point(10,20)); //내가 정의한 반지름, 좌표 
        System.out.println("반지름 : " +circle2.r);
        System.out.println("부모자원 : " +circle2.color);
        System.out.println("좌표 : " +circle2.point.x);
        System.out.println("좌표 : " +circle2.point.y);
        circle2.draw();
        
        Triangle triangle = new Triangle();
        triangle.trianglePoint();
        triangle.draw();
        
        System.out.println("************************");
        Triangle triangle2 = new Triangle(new Point(1,2),new Point(3,4),new Point(5,6));
        triangle2.trianglePoint();
        triangle2.draw();
        
        System.out.println("*************************");
        Point[] pointarr = {new Point(11,21),new Point(31,41),new Point(51,61)};
        Triangle2 tri3 = new Triangle2(pointarr);
        tri3.trianglePoint();
        tri3.draw();

    }

}
