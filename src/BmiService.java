public class BmiService {

    public double calculate(int weight, double heightMetr) {
        double result;
        result = weight / (heightMetr * heightMetr);

        return result;


    }
}
