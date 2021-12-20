public class Cycle {
    public static void main(String [] args){
        Cycle[] cycles = new Cycle[]{
                new Cycle(), new Unicycle(),
                new Bicycle(), new Tricycle()
        };
        for (Cycle c : cycles) {
            c.tire();
            System.out.println("wheels = " + c.tire());
            c.balance();

            ((Unicycle) c).balance();
        }
    }

    private void balance() {
        System.out.println("Base Balance");
    }

    private int tire() {
        return 0;
    }
}
class Unicycle extends Cycle{
    int tire(){
        return 1;
    }
    void balance(){
        System.out.println("Should balance");
    }
}

class Bicycle extends Cycle{
    int tire(){
        return 2;
    }
    void balance(){
        System.out.println("Should balance byclye");
    }
}
class Tricycle extends Cycle{
    int tire(){
        return 3;
    }
}