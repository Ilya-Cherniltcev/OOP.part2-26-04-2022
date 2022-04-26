package pro.sky;

public class ServiceStation {

    public void check(Car car) {
        if (car != null) {
            System.out.println(" ****************  Обслуживаем " + car.getModelName() + " **************** ");
            for (int i = 0; i < car.getWheelsCount(); i++) {
                System.out.println("-- " + (i + 1) + " -е:");
                car.updateTyre();
            }
            System.out.println("==============================");
            car.checkEngine();
        }
    }

    public void check(Truck truck) {
        if (truck != null) {
            System.out.println(" ****************  Обслуживаем " + truck.getModelName() + " **************** ");
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                System.out.println("-- " + (i + 1) + " -е:");
                truck.updateTyre();
            }
            System.out.println("==============================");
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println(" ****************  Обслуживаем " + bicycle.getModelName() + " **************** ");
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                System.out.println("-- " + (i + 1) + " -е:");
                bicycle.updateTyre();
            }
            System.out.println("==============================");

        }
    }
}




