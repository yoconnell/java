package constructor;

public class EeACmpny {
    int no;
    String name;

    //  ⭐ 생성자(constructor) : 인스턴스를 만드는 메소드
    //  ⭐ this : 생성될 인스턴스를 가리킴
    public EeACmpny(int no, String name) {
        this.no = no;
        this.name = name;
    }
    // `this`  - 만들어질 인스턴스를 가리킴
    //- 메소드 내에서 같은 이름의 변수나 인자가 없다면 식별자는 `this` 의 필드를 가리킴
    //- 같은 이름의 변수나 인자가 있다면 덮어씌워짐


    //- 자동생성
    //        - 윈도우: `alt` + `insert`
    //        - 맥: `command` + `N`


    String intro(){
        EeACmpny thisStore =this;
        return "%d호 %s 점입니다.".formatted(no,name);
    }

    //String intro(): 이 메소드는 no와 name 필드의 값을 문자열로 반환합니다.
    // %d호 %s 점입니다. 문자열에 no와 name 값을 포맷하여 반환합니다.
}
