package accessModifier;

import java.util.Locale;

public class Button {
    private static String mode = "LIGHT";
    public static void switchMode(){
        mode=mode.equals("LIGHT")?"DARK":"LIGHT";
    }
    private char print;
    private int space;

    public Button(char print, int space) {
        this.print = print;
        this.space = space;
    }

    public void setSpace(int space){
        if(space <1 || space>4) return;
        this.space=space;
    }

    public String getButtonInfo(){
        return "%c 버튼, %d픽셀 차지".formatted(print,space*4096);
    }


    // Button 클래스에는 다음과 같은 속성이 있습니다:

    //  private static String mode: 이 속성은 버튼 모드를 나타냅니다. "LIGHT" 또는 "DARK" 중 하나의 값을 가집니다.
    //  private char print: 버튼의 문자를 나타내는 속성입니다.
    //  private int space: 버튼이 차지하는 공간을 픽셀 단위로 나타내는 속성입니다.
    //  public Button(char print, int space) 생성자: 이 생성자는 print와 space 매개변수를 받아서 Button 객체를 초기화합니다.

    //  public void setSpace(int space) 메서드: 이 메서드는 버튼의 space 속성을 설정합니다. 그러나 space 값이 1 미만 또는 4 초과일 경우 아무 작업도 수행하지 않습니다.

    // public String getButtonInfo() 메서드: 이 메서드는 버튼에 관한 정보를 문자열로 반환합니다. 버튼의 문자 (print)와 차지하는 픽셀 (space * 4096)을 포함한 정보를 제공합니다.
}
