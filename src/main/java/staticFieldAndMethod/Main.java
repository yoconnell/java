package staticFieldAndMethod;

public class Main {
    public static void main(String[] args) {
        String branName =EeACmpny.brand;
        String contactToEeAcmpnyHeadOffic=EeACmpny.contact();

        //String name = EeACmpny.name;
        //String intro = EeACmpny.intro();

        EeACmpny store1 = new EeACmpny(1,"seoul");
        String store1Intro = store1.intro();

        //  인스턴스에서는 클래스의 필드와 메소드 사용 가능
        //  편의상 기능일 뿐, 권장하지 않음 (혼란 초래. IDE에서 자동완성 안 됨 주목)

        //String store1Brand = store1.brand; // < -- 여기 자동완성 안됨 오류: 클래스 필드는 인스턴스로 접근할 필요가 없습니다.
        //String store1Contact = store1.contact(); // <--- 여기두 오류: 클래스 메서드는 인스턴스로 호출할 필요가 없습니다.

        String store1Brand = EeACmpny.brand; // 정상적으로 클래스 이름을 사용하여 접근
        String store1Contact = EeACmpny.contact(); // 정상적으로 클래스 이름을 사용하여 메서드 호출



        //- 클래스(정적 *static*) 요소: 메모리 중 한 곳만 차지
        //- 인스턴스 요소들: 각각이 메모리에 자리를 차지
        //- 각각의 자신만의 프로퍼티 값을  가지고 있음

        EeACmpny store2 = new EeACmpny("LA");
        EeACmpny store3 = new EeACmpny("USA");


        Button button1 =new Button('1',1);
        Button button2 =new Button('+',3);
        Button button3 =new Button('C',2);

        Button[] buttons ={button1, button2, button3};

        System.out.println(Button.mode);
        for(Button button : buttons){button.place();}





    }
}
