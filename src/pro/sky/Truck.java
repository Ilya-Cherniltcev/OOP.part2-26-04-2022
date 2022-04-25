package pro.sky;

public class Truck extends Transport {
    public Truck (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Поднимаем домкратом колесо");
        System.out.println("Ставим дополнительную стойку под ось");
        System.out.println("Снимаем колесо");
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Поднимаем кабину");
        System.out.println("Проверяем двигатель");
    }
}

