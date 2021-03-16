package kennel;

public class Husky extends Dog {
    public Husky(String name) {
        super(name);

        public void feed (){
            getHappiness() = getHappiness()+4;
        }

        public void play (int hours){
            getHappiness() = getHappiness()*hours*3;
        }
    }
}
