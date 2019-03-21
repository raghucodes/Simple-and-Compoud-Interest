package interest;
/**
 * program to calculate simple and compound interest
 * @author raghu
 *
 */
public class SimpleCompoundInterest {
	double principle,rateofinterest,time;
	/**
	 * constructor to initialize the data
	 * @param p
	 * @param r
	 * @param t
	 */
	public SimpleCompoundInterest(double p,double r,double t) {
		principle = p;
		rateofinterest = r;
		time = t;
	}
	/**
	 * calculates simple interest
	 * @return simple interest
	 */
	public double simpleInterest() {
		return (principle*time*rateofinterest)/100;
	}
	
	public double compoundInterest() {
		return principle* Math.pow((1 + rateofinterest / 100), time);
	}

}
