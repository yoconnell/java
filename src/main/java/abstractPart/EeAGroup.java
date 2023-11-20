package abstractPart;

public abstract class EeAGroup {
    protected static final String Creed = "everything everywhere all at once in %s";

    //클래스 메소드는 abstract 불가
    // abstract static String getCreed();

    protected final int no;
    protected final String name;

    // protected 같은 패키지 내의 클래스와 해당 클래스를 상속한 클래스에서 접근 가능합니다.

    //final 필드여서 필드 선언할 때 넣어주거나 아니면 생성자에서 바로 값을 넣어줘야한다.

    protected EeAGroup(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public String intro(){
        return "%d호 %s점입니다".formatted(no,name);
    }

    //이건 무조건 구현해야함
    public abstract void takeOrder();

    //### `abstract` 클래스
    //
    //- 그 자체로 인스턴스 생성 불가
    //- 부모 클래스로서는 일반 클래스와 같음
    //- 다형성 역시 구현됨


    //### `abstract` 메소드
    //
    //- 추상 클래스에서만 사용 가능
    //- 스스로는 선언만 하고 구현하지 않음
    //- 자식 클래스에서 반드시 구현
    //- 구현하지 않을 시 컴파일 에러

    }
