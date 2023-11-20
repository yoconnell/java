package override;

public class ShutDownButton extends Button{
    public ShutDownButton(){
        super("ShutDown"); // 부모의 생성자 호출
    }

    @Override
    public void func(){
        System.out.println("프로그램 종료"); // 부모의 메소드를 override
    }
}
