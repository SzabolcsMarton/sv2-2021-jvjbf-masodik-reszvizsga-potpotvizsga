package railwaystation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class RailwayStation {

    private List<Train> trains = new ArrayList<>();

    public List<Train> getTrains() {
        return trains;
    }

    public void addTrain(Train train) {
        if (trains.size() > 9) {
            throw new IllegalArgumentException("Too much trains!");
        }
        trains.add(train);
    }

    public Train getLongestTrain() {
        return trains
                .stream()
                .max(Comparator.comparing(Train::getTotalLength))
                .orElseThrow(()-> new IllegalStateException("No trains in the Station"));

    }

    public int getHowManyTrainsHaveName() {
        return (int)trains
                .stream()
                .filter(train -> train.getName() != null)
                .count();
    }

    public List<Train> getTrainsWithPassengersMoreThan(int number) {
        return trains
                .stream()
                .filter(train -> train.calculateTravellingPeople() > number)
                .toList();
    }
}
