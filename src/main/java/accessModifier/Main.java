package accessModifier;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone=new SmartPhone();

        String pb = phone.powerButton;
        String ss = phone.sdCardSlot;
        //String cu = phone.cpu; <-- private 이라 접근불가

        Button button=new Button('1',1);
        //Button.mode ="OCEAN";
        //  private static String mode = "LIGHT"; 따라서 바로 접근 불가

        button.switchMode();

        //button.space(3);
        // private int space; -> private 이기에 불가

        button.setSpace(3);
        button.setSpace(-1);

        //char buttonPrint=button.print;
        // private char print; -->private 불가

        String buttonInfo = button.getButtonInfo();
        //- `private` : 클래스 내부에서만 접근할 수 있음
        //    - 스마트폰의 부속품들이 기기 안쪽에서만 연결/접근되는것처럼…

        Product ballPen = new Product("볼펜", 1000);

        ballPen.setName("삼색볼펜");
        ballPen.setName("");

        int ballPenPrice = ballPen.getPrice();

        ballPen.setPrice(1500);
    }
}
