package polymorphism;

public class Main {
    public static void main(String[] args) {
        //  가능 - 자식 클래스는 부모 클래스에 속함
        // 자식 클래스의 인스턴스는 부모 클래스 자료형에 속함
        Button button1 = new Button("Enter");
        Button button2 = new ShutDownButton();
        Button button3 = new ToggleButton("CapsLock", true);

        //  불가
//        ShutDownButton button4 = new Button("Enter");
//        ToggleButton button5 = new ShutDownButton();

        Button[] buttons = {
                new Button("Space"),new ToggleButton("NumLock",false),new ShutDownButton()
        };
        // 이처럼 특정 자료형의 자리에 여러 종류가 들어올 수 있는 것 - 다형성

        for(Button button: buttons){
            button.func();
        }

        Slime slime = new Slime();
        FireSlime fireSlime = new FireSlime();

        slime.attack(fireSlime); // ⭐ 클래스가 다른데 가능한 이유 : 다음 강에서
        fireSlime.attack(slime);

        //instanceof 연산자
        //- 뒤에 오는 클래스의 자료형에 속하는 인스턴스인지 확인
        //- 상속관계가 아닌 클래스끼리는 컴파일 오류
        //  true
        boolean typeCheck1 = button1 instanceof Button;
        boolean typeCheck2 = button2 instanceof Button;
        boolean typeCheck3 = button3 instanceof Button;

        //  false
        boolean typeCheck4 = button1 instanceof ShutDownButton;
        boolean typeCheck5 = button1 instanceof ToggleButton;

        //  ⚠️ 컴파일 에러
//        boolean typeCheck6 = button3 instanceof ShutDownButton;
//        boolean typeCheck7 = button2 instanceof ToggleButton;

        for (Button btn : buttons) {
            if (btn instanceof ShutDownButton) continue; // ⭐️
            btn.func();
        }

        EeAcompny stores[] ={
                new EeAcompny(3,"newYork"), new EeAcompny(1,"seoul"),new EeAOnlineStore(2,"amsterdam")
        };

        for(EeAcompny store: stores){
            if(store instanceof EeAOnlineStore) ((EeAOnlineStore) store).takeOnlineOrder();
            else store.takeOrder();
        }

        Object obj1 = new Object();

        Object obj2 = new EeAcompny(3, "Ams");
        Object obj3 = new ShutDownButton();
        Object obj4 = new FireSlime();

        //  원시 자료형들도 Object의 인스턴스로
        Object obj5 = true;
        Object obj6 = 1;
        Object obj7 = "Hello";

        Object[] objs = {
                1, false, 3.45, '가', "안녕하세요", new Button("Space")
        };

        for (Object obj : objs) {
            System.out.println(obj);
        }
    }
}
