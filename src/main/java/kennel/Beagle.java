package kennel;

public class Beagle extends Dog {

    public Beagle(String name) {
        super(name);

    }


    public void feed (){
      getHappiness() = getHappiness()+2;
    }

    public void play (int hours){
        getHappiness() = getHappiness()*hours*2;
    }
}
