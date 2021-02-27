import kr.or.bit.AirPlane;

public class Ex06_Static_AirPlane {

    public static void main(String[] args) {
        /*AirPlane air = new AirPlane();
        air.makeAirPlane(707, "대한");
        
        AirPlane air2 = new AirPlane();
        air.makeAirPlane(708, "대한");

        AirPlane air3 = new AirPlane();
        air.makeAirPlane(709, "대한");
        
        air3.airPlaneTotalCount();
        */
        
        //리팩토링
        AirPlane airplane = new AirPlane(707, "대한항공");
        airplane.airPlaneInfo();
        airplane.airPlaneTotalCount();
        
        

    }

}
