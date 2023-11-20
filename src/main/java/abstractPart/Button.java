package abstractPart;

public class Button extends FormElement{
    private String print;

    public Button(int space, String print) {
        super(space);
        this.print = print;
    }

    //자바에서 객체 생성 시 아래와 같은 규칙이 적용됩니다:
    //하위 클래스의 생성자가 호출되면, 먼저 해당 클래스의 생성자 코드가 실행됩니다.
    //생성자 코드에서 super()를 통해 상위 클래스의 생성자를 명시적으로 호출할 수 있습니다.
    //만약 하위 클래스에서 super()를 호출하지 않으면, 자동으로 상위 클래스의 기본 생성자가 호출됩니다.
    //만약 상위 클래스에 매개변수가 있는 생성자가 있다면, 하위 클래스의 생성자에서는 super()를 사용하여 해당 생성자에 필요한 인자를 전달해주어야 합니다. 이렇게 함으로써 상위 클래스의 필요한 초기화 작업이 먼저 이루어지게 됩니다.

    @Override
    void func() {
        System.out.println(print + "입력적용");
    }
}