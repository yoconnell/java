package override;

public class Main {
    public static void main(String[] args) {
        //부모 클래스의 요소들 갖고 있음 확인 - 상속 inheritance
        EeAOnlineStore store1 = new EeAOnlineStore(1,"newYork");
        store1.takeOrder();
        store1.takeOnlineOrder();
        store1.setOnlineStoreOpen(false);
        store1.takeOnlineOrder();
        // 부모 클래스의 protected 필드들을 private 으로 바꿔 볼 것
        // 상속이 안 되는 것은 아님 - 자식클래스의 코드에서 사용하지 못할 뿐
        //부모 클래스에서 protected로 선언된 멤버 변수는 자식 클래스에서 접근할 수 있지만,
        // private으로 변경하면 자식 클래스에서 접근할 수 없게 됩니다. 하지만 상속은 여전히 유지됩니다.
        // 자식 클래스에서 private으로 변경한 멤버 변수를 부모 클래스의 메서드를 통해 사용할 수 있습니다.

        Button start = new Button("Start");
        ShutDownButton shutDownButton= new ShutDownButton();
        ToggleButton toggleButton=new ToggleButton("Toggle",false);

        start.func();;
        System.out.println("\n- - - - -\n");
        shutDownButton.func();
        System.out.println("\n- - - - -\n");
        toggleButton.func();
        toggleButton.func();
        toggleButton.func();

        Slime slime=new Slime();
        FireSlime fireSlime=new FireSlime();

        slime.attack(fireSlime);
        fireSlime.attack(slime);
    }
}
