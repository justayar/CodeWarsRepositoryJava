import java.text.DecimalFormat;

public class NthSeries {
	public static String seriesSum(int n) {
	    float sum = 0;
			for(int i=0;i<n;i++){
				 double d = (1 / (100.0 * (3*i+1)))*100.0;		       
			   sum+=d;		        
			}
			return String.format("%.2f", sum);
	}
}