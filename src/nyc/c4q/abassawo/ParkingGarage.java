package nyc.c4q.abassawo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Abass
 *
 * ParkingGarage class implemented with an internal HashMap that maps floor numbers to a List of
 * AbstractCar and subclasses of AbstractCar.
 */
public class ParkingGarage {

    private Map<Integer, List<AbstractCar>> internalMap;

    public ParkingGarage(int numberOfFloors){
        makeMap(numberOfFloors);
    }

    public void makeMap(int size){
        internalMap = new HashMap<>(size);
        for (int i = 0; i < size ; i++) {
            internalMap.put(i, new ArrayList<AbstractCar>());
        }
    }

    @Override
    public String toString() {
        /*TODO - Modify the toString method to print every car in your Parking Garage*/
        return "Levels : " + internalMap.size() + " & " + internalMap.get(0).size() + " cars ";
    }

    public void parkCar(int number, AbstractCar car){
        /*TODO - Implement this method by retrieving the List of Cars,
         and adding the parameterizer car to it.*/
        List<AbstractCar> cars = internalMap.get(number);
        if(cars == null){
            cars = new ArrayList<>();
        }
        cars.add(car);
        internalMap.put(number, cars);
    }

    public void removeCar(int number, AbstractCar car){
          /*TODO - Implement this method by retrieving the List of Cars,
         and removing the parameterizer car from it.*/
          List<AbstractCar> cars = internalMap.get(number);
          if(cars != null){
              cars.remove(car);
          }
    }


}
