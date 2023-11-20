package simpleEg;

public class Main {
    public static void main(String[] args) {
        Army usa = new Army();
        Army russia = new Army();
        //같은 클래스의 인스턴스지만, 필드의 값은 각기 별개임 주목

        usa.attack(russia);

        /*----------------------------------------------*/

        int[] ary1 = {3, 5, 9, 2, 8, 1, 4};
        int[] ary2 = {382, 194, 27, 915, 138};

        IntArrayInfo aryInf1 = new IntArrayInfo(ary1);
        IntArrayInfo aryInf2 = new IntArrayInfo(ary2);

        int ary1Max = aryInf1.max; // private 값이 아니라서 setter 나 getter 없이도 들고 올 수 있음
        double ary2Avg = aryInf2.average;
        int ary1n2Sum = aryInf1.sum + aryInf2.sum;


        /*----------------------------------------------*/

        //1. `EaACompny` 클래스:
        //   - 이 클래스는 `EaACompny`라는 회사를 나타내는 클래스입니다.
        //   - 클래스에는 세 가지 필드가 있습니다.
        //     - `no`: 회사의 번호를 나타내는 정수 값
        //     - `name`: 회사의 이름을 나타내는 문자열
        //     - `products`: 제품 목록을 나타내는 `Product` 배열
        //   - 생성자를 통해 `no`, `name`, 및 `products` 필드를 초기화할 수 있습니다.
        //   - `orderProduct` 메소드는 제품의 이름을 입력받아 해당 이름과 일치하는 제품을 찾아 반환하는 역할을 합니다.
        //
        //2. `Product` 클래스:
        //   - 이 클래스는 제품을 나타내는 클래스입니다.
        //   - 클래스에는 세 가지 필드가 있습니다.
        //     - `name`: 제품의 이름을 나타내는 문자열
        //     - `price`: 제품의 가격을 나타내는 정수 값
        //     - `line`: 제품 라인을 나타내는 문자열 (기본값은 "summer"로 설정됨)
        //   - 생성자를 통해 `name`, `price`, 및 `line` 필드를 초기화할 수 있습니다.
        //
        //이 두 클래스는 회사와 그 회사의 제품을 표현하기 위해 사용되며,
        // `EaACompny` 클래스는 `Product` 배열을 가지고 있어서 여러 제품을 관리할 수 있습니다.
        Product[] items={
                new Product("겨울자켓",10000),
                new Product("여름치마",8000),
                new Product("봄코트",4000)
        };

        EaACompny  newYorkStore = new EaACompny(1,"뉴욕",items);

        Product product1 = newYorkStore.orderProduct("겨울자켓");

        Product product2= newYorkStore.orderProduct("여름바지");

        /*----------------------------------------------*/
        int int1 = 1;
        int int2 = int1;
        int1 = 2;

        String str1 = "헬로";
        String str2 = str1;
        str2 = "월드";

        Product item1 = new Product("치마바지", 1000);
        Product item2 = item1;
        item1.price = 1200;
        int price = item2.price;
        // 객체는 주소값을 같은 곳을 바라보고 있다.


    }
}
