package pro.sky;

public class Car extends Transport {

        public Car (String modelName, int wheelsCount) {
            super(modelName, wheelsCount);
        }

        public Car (String modelName) {
            super(modelName, 4);
        }


    @Override
    public void updateTyre() {
        System.out.println("Поднимаем домкратом колесо");
        System.out.println("Снимаем колесо");
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        super.checkEngine();
    }
}


