package pro.sky;

public class Car extends Transport implements Wheelable, Engineable {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Car(String modelName) {
        super(modelName, 4);
    }

    @Override
    public void updateTyre() {
        System.out.print("###  Поднимаем домкратом колесо. ");
        System.out.print("Снимаем колесо. ");
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("###  Проверяем двигатель");
    }
}


