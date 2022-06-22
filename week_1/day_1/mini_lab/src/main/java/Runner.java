public class Runner {
    public static void main(String[] args) {

        Planet mars = new Planet("Mars",908973);
        String name = mars.getName();
        int size = mars.getSize();
        System.out.println(name + " is " + size);
        String explode = mars.explode(name);
        System.out.println(explode);
    }
}