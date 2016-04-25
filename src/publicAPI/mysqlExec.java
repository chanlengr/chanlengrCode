package publicAPI;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class mysqlExec
{
  public Connection con;
  public Statement stmt;

  public void mysqlConnect(String url, String dbName, String dbPasswd)
  {
    try
    {
      Class.forName("com.mysql.jdbc.Driver");
    }
    catch (ClassNotFoundException e)
    {
      System.err.print("ClassNotFoundException:");
      System.err.println(e.getMessage());
    }
    try
    {
      this.con = DriverManager.getConnection(url, dbName, dbPasswd);
      this.stmt = this.con.createStatement();
    }
    catch (SQLException ex)
    {
      System.err.println("SQLException:" + ex.getMessage()); }
  }

  public void mysqlDisConnect() {
    try {
      this.stmt.close();
      this.con.close();
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void insertDate(String sql)
  {
    int rs;
    try {
      rs = this.stmt.executeUpdate(sql);

      if (rs == 1) return;

      System.out.println("插入异常");
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
  }

  public ArrayList<String> selectDate(String sql)
  {
	ResultSet rs;
    ArrayList stockList = new ArrayList();
    try {
      rs = this.stmt.executeQuery(sql);
      while (rs.next())
      {
        stockList.add(rs.getString("stockId"));
      }
    }
    catch (java.lang.Exception e)
    {
    }

    return stockList;
  }
}