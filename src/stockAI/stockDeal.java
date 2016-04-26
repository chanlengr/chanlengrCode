package stockAI;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class stockDeal {
	public static ArrayList<String> stockBuyCalc(double availableMoney,double buyPercent,double stockPrice,double rate)
	{
		double availableBuyMoney;   //可购买的金额
		int buyAmount;		//买入多少手
		double costMount;		//花费
		double lastMoney;		//剩余金额
		double fee;
		
		ArrayList<String> buyList = new ArrayList<String>();
		
		DecimalFormat df2 = new DecimalFormat("0.00");
		
		availableBuyMoney=availableMoney*buyPercent;   //可购买的金额
		
		buyAmount=(int)(availableBuyMoney/(stockPrice*100));  //单位手

		costMount=buyAmount*stockPrice*100; //购买金额
		
		fee=costMount*rate;//手续费
		
		lastMoney=availableMoney-(int)buyAmount*stockPrice*100-fee;  //剩余金额
		
		
		buyList.add(df2.format(availableMoney));	//当前资金
		buyList.add(df2.format(availableBuyMoney));//可购买的金额
		buyList.add(df2.format(stockPrice));		//股票价格
		buyList.add(df2.format(buyAmount));		//单位手
		buyList.add(df2.format(costMount));		//买入金额
		buyList.add(df2.format(fee));		//手续费
		buyList.add(df2.format(lastMoney));		//剩余金额
		
		//System.out.println(buyList);
		
		System.out.println("当前资金:" + buyList.get(0) + "\n可以购买的金额:" + buyList.get(1) + "\n股票价格: " + buyList.get(2)
		+ "\n买入手数: " + buyList.get(3)+ "\n买入金额: " + buyList.get(4) + "\n手续费:" +buyList.get(5)+ "\n剩余可用资金:" +buyList.get(6));
		
		return buyList;
		
	}
	public static ArrayList<String> stockSellCalc(double availableMoney,double sellPercent,double stockPrice,double stockCount,double rate)
	{
		int sellAmount;
		double lastMoney;
		double getMoney;
		double fee;
		double lastStockCount;
		
		ArrayList<String> sellList = new ArrayList<String>();
		DecimalFormat df2 = new DecimalFormat("0.00");
		
		sellAmount=(int) (stockCount*sellPercent);//卖出手数
		lastStockCount=stockCount-sellAmount;
		getMoney=sellAmount*stockPrice*100;//卖出获得金额
		fee=getMoney*rate;//手续费
		
		lastMoney=availableMoney+getMoney-fee;//剩余资金
		
		
		sellList.add(df2.format(availableMoney));	//当前资金
		sellList.add(df2.format(stockPrice));		//股票价格
		sellList.add(df2.format(stockCount));		//当前股票手数
		sellList.add(df2.format(sellAmount));	//卖出手数
		sellList.add(df2.format(lastStockCount));	//剩余手数
		sellList.add(df2.format(getMoney));		//卖出获得金额
		sellList.add(df2.format(fee));		//手续费
		sellList.add(df2.format(lastMoney));		//剩余可用资金		
		
		System.out.println("当前资金:" + sellList.get(0) + "\n股票价格:" + sellList.get(1)
		+ "\n当前手数" + sellList.get(2) + "\n卖出手数:" + sellList.get(3) + "\n剩余手数:" +sellList.get(4)
		+ "\n卖出获得金额:" + sellList.get(5) + "\n手续费:" +sellList.get(6)+ "\n剩余可用资金:" + sellList.get(7));
		return null; 
	}

}
