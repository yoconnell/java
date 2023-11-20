package accessModifier;

public class Product {
    private static double discount = 0.2;
    private static double increaseLimit = 1.2;
//정적 변수 (Static Variables): static 키워드가 클래스의 변수 (멤버 변수) 앞에 사용되면 해당 변수는 클래스 변수 또는 정적 변수가 됩니다. 이는 클래스 수준에서 공유되며 모든 인스턴스에서 동일한 값을 가집니다. 이러한 변수는 클래스의 인스턴스화 없이 직접 클래스 이름을 통해 접근할 수 있습니다.
//예를 들어, 주어진 코드에서 private static double discount 및 private static double increaseLimit는 Product 클래스의 모든 인스턴스에서 동일한 할인율 및 가격 증가 한도를 공유합니다.
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name){
        if(name.isBlank())return;
        this.name =name;
    }

    public void setPrice(int price){
        int max = (int) (this.price * increaseLimit);
        this.price = (price < max) ? price : max;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
