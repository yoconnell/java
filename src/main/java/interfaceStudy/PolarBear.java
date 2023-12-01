package interfaceStudy;

public class PolarBear extends Mamal implements Hunter, Swimmer {
    public PolarBear() {
        super(false);
    }

    @Override
    public void hunt() {
        System.out.println(position+":사냥");
    }

    @Override
    public void swim() {
        System.out.println("네발로 수영");
    }
}
