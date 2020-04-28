public class Main {
    public static void main(String[] args){
        DoubleList<String> d = new DoubleList<>();

        d.insertFront("friday");
        d.insertFront("thursday");
        d.insertFront("monday");
        d.insertFront("saturday");

        d.insertAfter("tuesday", "monday");

        d.print();

        d.insertPrevious("thursday", "wednesday");

        d.print();
    }
}
