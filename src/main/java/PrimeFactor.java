import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by jiaLiu on 9/16/16.
 */
public class PrimeFactor {
    public boolean IsPrimeNumber(int number) {
        double sqrtNumber = Math.ceil(Math.sqrt(number));
        for (int i = 2; i <= sqrtNumber; i++) {
            if (number % i == 0 && i != number){
                return false;
            }
        }
        return true;
    }

    public List<Integer> GetAllFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        double sqrtNumber = Math.ceil(Math.sqrt(number));
        for (int i=2; i<= sqrtNumber; i++){
            if(number % i == 0){
                if(!factors.contains(i)){factors.add(i);}
                if(!factors.contains(number/i)){factors.add(number/i);}
            }
        }
        return factors;
    }

    public List<Integer> GetPrimeFactors(int number) {
        List<Integer> factors = GetAllFactors(number);
        List<Integer> primeFactors = new ArrayList<Integer>();
        for (int i = 0; i < factors.size(); i++) {
            if (IsPrimeNumber(factors.get(i))){
                primeFactors.add(factors.get(i));
            }
        }
        Collections.sort(primeFactors);
        return primeFactors;
    }
}
