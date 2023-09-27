package seminars.second.hw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    //  Проверить, что экземпляр объекта Car также является экземпляром транспортного средства, используя оператор instanceof).
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertInstanceOf(Vehicle.class, car);
    }

    // Проверить, что объект Car создается с 4-мя колесами.
    @Test
    public void testFourWheelsCar() {
        Car car = new Car("Toyota", "Corolla", 2003);
        assertEquals(4, car.getNumWheels());
    }

    // Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    public void testTwoWheelsMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Virago", 2004);
        assertEquals(2, motorcycle.getNumWheels());
    }

    // Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testCarSpeedSixty() {
        Car car = new Car("Toyota", "Corolla", 2003);
        car.testDrive();
        assertTrue(car.getSpeed() >= 60,"Не набрали 60 км/ч");
    }

    // Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testMotorcycleSpeedSeventyFive() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Virago", 2004);
        motorcycle.testDrive();
        assertTrue(motorcycle.getSpeed() >= 75,"Не набрали 75 км/ч");
    }

    // Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    public void testCarStop() {
        Car car = new Car("Toyota", "Corolla", 2003);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    // Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    public void testMotoStop() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Virago", 2003);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}