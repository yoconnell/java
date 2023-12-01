package interfaceStudy;

public interface FoodSafety {
    static void announcement(){
        System.out.println("식품안전 관련 공지");
    }

    default void regularInspection(){
        System.out.println("정기 체크");
    }

    //announcement 메서드: 이 메서드는 static으로 선언되어 있어서 인터페이스 자체의 메서드로 호출됩니다. "식품안전 관련 공지"를 출력합니다.
    //
    //regularInspection 메서드: 이 메서드는 default로 선언되어 있어서 해당 인터페이스를 구현하는 클래스에서 재정의하지 않아도 됩니다. "정기 체크"를 출력합니다.
    void cleanKitchen ();
    void employeeEducation ();
}
