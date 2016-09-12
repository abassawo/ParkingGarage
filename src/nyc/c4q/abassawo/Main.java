package nyc.c4q.abassawo;




public class Main {

    public static void main(String[] args) {
	// write your code here
        ParkingGarage garage = new ParkingGarage(4);
        System.out.println(garage);
        AbstractCar car = new AbstractCar() {
            @Override
            public void airConditioning() {

            }
        };

        garage.parkCar(0, car);
        System.out.println(garage);
    }
}
