package stockAI;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class stockDeal {
	public static ArrayList<String> stockBuyCalc(double availableMoney,double buyPercent,double stockPrice)
	{
		double availableBuyMoney;   //可购买的金额
		int buyAmount;		//买入多少手
		double costMount;		//花费
		double lastMoney;		//剩余金额
		
		ArrayList<String> buyList = new ArrayList<String>();
		
		DecimalFormat df2 = new DecimalFormat("0.0");
		
		availableBuyMoney=availableMoney*buyPercent;   //可购买的金额
		
		buyAmount=(int)(availableBuyMoney/(stockPrice*100));  //单位手
		
		costMount=buyAmount*stockPrice*100; //花费金额
		
		lastMoney=availableMoney-(int)buyAmount*stockPrice*100;  //剩余金额
		
		buyList.add(df2.format(availableMoney));	//当前总金额
		buyList.add(df2.format(availableBuyMoney));//可购买的金额
		buyList.add(df2.format(buyAmount));		//单位手
		buyList.add(df2.format(costMount));		//花费金额
		buyList.add(df2.format(lastMoney));		//剩余金额
		
		System.out.println(buyList);
		
		System.out.println("当前总金额:" + buyList.get(0) + "\n可以购买的金额:" + buyList.get(1) 
		+ "\n买入手数: " + buyList.get(2)+ "\n花费: " + buyList.get(3) + "\n剩余金额:" +buyList.get(4));
		
		return buyList;
		
	}
	public String stockSellCalc()
	{
		return null;
	}

}
