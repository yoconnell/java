package polymorphism;

public class ToggleButton extends Button {
    private boolean on;

    public ToggleButton(String print, boolean on) {
        super(print); //super의 생성자 불러냄
        this.on=on;
    }

    @Override
    public void func(){
        super.func();//  부모에서 정의한 메소드 호출
        this.on = !this.on;
        System.out.println("대문자입력:"+ (this.on? "on": "off")
                );
}
}
