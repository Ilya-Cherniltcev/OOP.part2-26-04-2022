package pro.sky;

public class Truck extends Transport implements Wheelable, Engineable {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.print("###  Поднимаем домкратом колесо. ");
        System.out.print("Ставим дополнительную стойку под ось. ");
        System.out.print("Снимаем колесо. ");
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.print("###  Поднимаем кабину. ");
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("###  Проверяем прицеп");
    }
}

