package accessModifier;

public class SmartPhone {
    String powerButton = "OnOff";
    public String sdCardSlot="Sd Card";
    private String cpu ="m1";

    //| 접근 가능 | public | protected | default | private |
    //| --- | --- | --- | --- | --- |
    //| 해당 클래스 안에서 | ✅ | ✅ | ✅ | ✅ |
    //| 동일 패키지 안에서 | ✅ | ✅ | ✅ |  |
    //| 동일 패키지 또는 자손 클래스 안에서 | ✅ | ✅ |  |  |
    //| 다른 패키지 포함 어느 곳에서든 | ✅ |  |  |  |
}
