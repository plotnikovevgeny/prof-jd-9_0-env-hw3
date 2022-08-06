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

    private void updateTyre(@NotNull Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }

    public void check(Car car) {
        updateTyre(car);
        car.checkEngine();
    }

    public void check(Truck truck) {
        updateTyre(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

    public void check(Bicycle bicycle) {
        updateTyre(bicycle);
    }

}
