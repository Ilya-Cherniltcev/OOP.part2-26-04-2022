package pro.sky;

public class Bicycle extends Transport{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Bicycle(String modelName) {
        super(modelName, 2);
    }


    @Override
    public void updateTyre() {
        super.updateTyre();
    }

    @Override
    public void checkEngine() {

    }
}
