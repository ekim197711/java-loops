public class MyForLoop {
    public static void main(String[] args) {

        String[] spaceships = {"round", "pyramid", "sourcer", "humming"};

        for (int i = 0, l = 100, o = 10; i < 100 && l < 1000 && o < 25;i++,l=l+10, o=o+10){
            System.out.println(i);
            System.out.println(l);
            System.out.println(o);
        }

        for (int i = 0; i < 100;i++){
            System.out.println(i);
        }

        for (String spaceship : spaceships){
            System.out.println(spaceship);
        }

    }
}
