public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 45;
        double height = 1.65;
        double bmiIndex = service.calculate(mass, height);
        System.out.printf("%.1f", bmiIndex);
    }
}
