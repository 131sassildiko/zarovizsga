package kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    List<Dog> dogList = new ArrayList<>();
    public void assDog (Dog dog) {
        dogList.add(dog);
    }
}
