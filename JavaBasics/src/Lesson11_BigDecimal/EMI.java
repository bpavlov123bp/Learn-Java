package Lesson11_BigDecimal;
//Приравнена месечна вноска e фиксирана сума за плащане,
// направена от кредитополучател на кредитор на определена дата всеки календарен месец.
// Приравнени месечни вноски се използват за изплащане на лихви и главници всеки месец,
// така че за определен брой години заемът се изплаща изцяло заедно с лихвите. /източник wikipedia/
//Купил съм си апартамент, за който съм заел от банка 10 000 000 евро при годишна лихва 10.5%
//и смятам да го изплатя за 10 години.
//Колко ще е моята месечна вноска?
//ИЗПОЛЗВАЙТЕ BigDecimal!
//Отпечатайте така: System.out.println(A.setScale(10, RoundingMode.HALF_UP));
import java.math.BigDecimal;
import java.math.RoundingMode;
public class EMI {
  public static void main(String[] args)
  {
    BigDecimal P = new BigDecimal("10000000");
    BigDecimal r = new BigDecimal("10.5").divide(new BigDecimal("12"));
    r = r.divide(BigDecimal.valueOf(100));
    int n = 120;
    BigDecimal part = (r.add(BigDecimal.valueOf(1))).pow(n);
    BigDecimal num = r.multiply(part);
    BigDecimal d = part.subtract(BigDecimal.ONE);
    BigDecimal A = P.multiply(num.divide(d, RoundingMode.HALF_UP));
    System.out.println(A.setScale(10, RoundingMode.HALF_UP));
  }
}
