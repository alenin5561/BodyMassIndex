public class BmiService {

    public double calculate (int weight , double height_m) {
        double result;
        result = weight/(height_m*height_m);

        return result;


    }
}
