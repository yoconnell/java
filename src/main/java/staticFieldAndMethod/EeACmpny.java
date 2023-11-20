package staticFieldAndMethod;

public class EeACmpny {
    //   클래스/정적 필드와 메소드들 : 본사의 정보와 기능
    //  인스턴스마다 따로 갖고 있을 필요가 없는 것들에 사용
    static String brand = "head office";

    static String contact(){
        return "%s 입니다.".formatted(brand);
    }

    int no;
    String name;

    public EeACmpny(int no, String name) {
        this.no = no;
        this.name = name;
    }

    String intro(){
        return  "안녕하세요, %s %d 호 %s 입니다".formatted(brand, no, name);
    }

    //이 코드는 Java로 작성된 클래스인 `EeACmpny`를 보여줍니다. 이 클래스는 정적 필드와 메서드를 가지고 있습니다. 각 부분을 설명하겠습니다.
    //
    //1. 정적 필드:
    //   - `brand`: 이 필드는 클래스 수준에서 공유되며 모든 인스턴스에서 동일한 값을 갖습니다. "head office" 문자열을 저장합니다.
    //
    //2. 정적 메서드:
    //   - `contact()`: 이 메서드는 `brand` 값을 반환합니다. `%s 입니다.` 문자열로 포맷되어 반환됩니다.
    //
    //3. 인스턴스 필드:
    //   - `no`: 정수 값을 저장하는 필드로, 각 인스턴스에 대해 고유한 값을 가집니다.
    //   - `name`: 문자열 값을 저장하는 필드로, 각 인스턴스에 대해 고유한 값을 가집니다.
    //
    //4. 생성자:
    //   - `EeACmpny(int no, String name)`: 이 생성자는 `no`와 `name` 매개변수를 받아 인스턴스의 초기화를 수행합니다.
    //
    //5. 인스턴스 메서드:
    //   - `intro()`: 이 메서드는 인스턴스의 상태를 사용하여 포맷된 문자열을 반환합니다. "안녕하세요, %s %호 %s 입니다" 문자열에 `brand`, `no`, 및 `name` 값을 포맷하여 반환합니다.

    static int lastNo=0;

    public EeACmpny(String name) {
        no = ++lastNo;
        this.name = name;
    }
    // 클래스 변수를 활용하여 생성마다 새 번호 부여
}
