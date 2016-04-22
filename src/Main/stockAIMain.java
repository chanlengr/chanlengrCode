package Main;
import java.math.BigDecimal;
import java.text.DecimalFormat;

import stockAI.stockDeal;

public class stockAIMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*float t=1.0;11
		float a=31253.3;
		DecimalFormat df2 = new DecimalFormat("0.00");
		t=(3125.3/(3.24*100));
		
		float x;
		x=(float) (3125.3-(int)t*100*3.24);*/
		//x=(int)t*100*3.241;
		//x=(3125-3.24*(int)t*100);
		stockDeal.stockBuyCalc(3.24,5100.1,0.5);
		//x=200%3;
		/*System.out.println((int)t);
		System.out.println(df2.format(t));
		System.out.println(x);
		System.out.println(df2.format(x));*/
	}

}
