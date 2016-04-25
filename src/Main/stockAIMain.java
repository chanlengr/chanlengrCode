package Main;

import java.util.ArrayList;

import stockAI.stockDeal;

public class stockAIMain {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		ArrayList<String> buyList;// = new ArrayList<String>();
		buyList = stockAI.stockDeal.stockBuyCalc(100000,0.75,50.31);
		System.out.println(buyList);
		stockAI.stockDeal.stockSellCalc(5000.4,0.35,13.3,810);
	}
}
