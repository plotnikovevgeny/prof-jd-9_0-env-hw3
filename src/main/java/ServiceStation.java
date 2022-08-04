import org.jetbrains.annotations.NotNull;

public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            check(car);
        } else if (truck != null) {
           check(truck);
        } else if (bicycle != null) {
            check(bicycle);
            }
    }

    private void updateTyre(@NotNull Car car){
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
    }

    private void updateTyre(@NotNull Truck truck){
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
    }

    private void updateTyre(@NotNull Bicycle bicycle){
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }

    public void check(Car car){
        updateTyre(car);
        car.checkEngine();
    }

    public void check(Truck truck){
        updateTyre(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

    public void check(Bicycle bicycle){
        updateTyre(bicycle);
    }

}
