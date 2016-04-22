package stockAI;

import java.text.DecimalFormat;

public class stockDeal {
	public static String stockBuyCalc(double stockPrice,double availableMoney,double buyPercent)
	{
		double availableBuyMoney;   //可以购买的金额
		double buyAmount;		//买入多少手
		double lastMoney;
		double costMount;
		DecimalFormat df2 = new DecimalFormat("0.00");
		
		availableBuyMoney=availableMoney*buyPercent;
		
		buyAmount=availableBuyMoney/(stockPrice*100);  //单位手
		costMount=(int)buyAmount*stockPrice*100;
		lastMoney=availableMoney-(int)buyAmount*stockPrice*100;
		System.out.println("可以购买的金额:" + availableBuyMoney + "\n买入手数: " + (int)buyAmount+ "\n花费: " + costMount + "\n剩余金额:" +df2.format(lastMoney));
		
		return null;
		
	}
	public String stockSellCalc()
	{
		return null;
	}

}
