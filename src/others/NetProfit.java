/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package others;

import java.util.Date;

/**
 *
 * @author yasser
 */
public class NetProfit {
    private double netProfitID;
    private Date netProfitDate;
    private double totalNetProfit;

    public NetProfit(double netProfitID, Date netProfitDate, double totalNetProfit) {
        this.netProfitID = netProfitID;
        this.netProfitDate = netProfitDate;
        this.totalNetProfit = totalNetProfit;
    }

    public double getNetProfitID() {
        return netProfitID;
    }

    public void setNetProfitID(double netProfitID) {
        this.netProfitID = netProfitID;
    }

    public Date getNetProfitDate() {
        return netProfitDate;
    }

    public void setNetProfitDate(Date netProfitDate) {
        this.netProfitDate = netProfitDate;
    }

    public double getTotalNetProfit() {
        return totalNetProfit;
    }

    public void setTotalNetProfit(double totalNetProfit) {
        this.totalNetProfit = totalNetProfit;
    }
    
    
    
}
