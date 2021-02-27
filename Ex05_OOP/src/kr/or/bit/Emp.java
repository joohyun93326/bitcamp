package kr.or.bit;

public class Emp {
    private int empno;
    private String ename;
    
    public Emp(int empno, String ename) {
        this.empno = empno;
        this.ename = ename;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
    
    //Object를 가지는 재정의
    @Override
    public String toString() {
        return "Emp [empno=" + empno + ", ename=" + ename + "]";
    }    
    //Object가 가지고 있는 toString()을 재정의 (멤버필드 검증 용도)
    
    
    
    
    

    

}
