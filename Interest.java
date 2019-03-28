package Interest;

public class Interest {
        public double simpleinterest(double p,double r,double years) {
        	return (p*r*years/100);
        }
        public double compoundInterest(double p,double r,int years) {
        	double c=(1+(r)/100);
        	double y=Math.pow(c,years)*p;
        	return y;
        }
}
