package Main;

import java.util.ArrayList;

import publicAPI.mysqlExec;
import stockAI.stockDeal;

public class stockAIMain {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		ArrayList<String> buyList;// = new ArrayList<String>();
		buyList = stockAI.stockDeal.stockBuyCalc(100000,0.75,50.31,0.003);
		System.out.println("-------------------------------------");
		stockAI.stockDeal.stockSellCalc(5000.4,0.35,13.3,81,0.003);
		
	    String dbUrl = "jdbc:mysql://192.168.6.202:3306/stockDataBase";
	    String dbName = "root";
	    String dbPasswd = "159357";
	    String typeMsg = "FundMsg";
	    
	    /*String dbUrl = System.getProperty("dbUrl");
	    String dbName = System.getProperty("dbName");
	    String dbPasswd = System.getProperty("dbPasswd");
	    String typeMsg = System.getProperty("typeMsg");
	    String getStockSql = "select * from stockList";*/
	    mysqlExec mydb = new mysqlExec();
	    mydb.mysqlConnect(dbUrl, dbName, dbPasswd);
	    String sql="select * from stockList where stockId='sh600000'";
	    ArrayList stockList = mydb.selectDate(sql);
	    System.out.println(stockList);
		
	
	}
}
