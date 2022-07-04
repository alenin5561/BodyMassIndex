public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(87, 1.9);
        System.out.println("Индекс массы тела равен=" + index);
    }
}