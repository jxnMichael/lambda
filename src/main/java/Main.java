import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by Михаил on 09.01.2018.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Map calc = new HashMap<String, Calculate<Double>>();

        Calculate<Double> var;

        calc.put("+", var = (a, b) -> a + b);

        calc.put("-", var = (a, b) -> a - b);

        calc.put("/", var = (a, b) -> a / b);

        calc.put("*", var = (a, b) -> a * b);

        Calculate<Double> var1 = (Calculate<Double>) calc.get("+");

        Calculate<Double> var2 = (Calculate<Double>) calc.get("-");

        Calculate<Double> var3 = (Calculate<Double>) calc.get("/");

        Calculate<Double> var4 = (Calculate<Double>) calc.get("*");

        System.out.println("Если нам нужно умножить: "+var4.exec(10d,20d));

        System.out.println("Прибавляем с помошью дефолтного метода "+var.getAdd(10d, 20d));

        System.out.println("Если поделить: "+var3.exec(10d,20d));

        System.out.println("Если прибавить: "+var1.exec(10d,20d));

        System.out.println("Если отнять: "+var2.exec(10d,20d));

    }
}


