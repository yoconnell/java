package abstractPart;

public class Switch extends FormElement{
    private boolean on;

    public Switch(int space, boolean on) {
        super(space);
        this.on = on;
    }

    @Override
    void func() {
        on = !on;
        //on = !on은 변수 on의 현재 값의 논리 NOT(부정)을 취한 값을 다시 on에 할당하는 것
        System.out.println((on? "ON" :"OFF")+"으로 전환");
    }
}
