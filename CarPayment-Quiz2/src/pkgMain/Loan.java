package pkgMain;
import java.lang.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Loan {

	int CC;
	// Car Cost
	int DP;
	// Down Payment
	double IR;
	//Interest Rate of Loan
	int Months;
	int LA;
	// Loan Amount
	
	public Loan(int cC, int dP, double iR, int months, int lA) {
		
		this.CC = cC;
		this.DP = dP;
		this.IR = iR;
		this.Months = months;
		this.LA = lA;
	}
	
	public int getCC() {
		return CC;
	}

	public void setCC(int cC) {
		CC = cC;
	}

	public int getDP() {
		return DP;
	}

	public void setDP(int dP) {
		DP = dP;
	}

	public double getIR() {
		return IR;
	}

	public void setIR(double iR) {
		IR = iR;
	}

	public int getMonths() {
		return Months;
	}

	public void setMonths(int months) {
		Months = months;
	}

	public int getLA() {
		return LA;
	}

	public void setLA(int lA) {
		LA = lA;
	}

	public double MonPay() {
		return CC / Months;
	}


	public double Rate() {
		return IR / 1200;
	}
	
	public String IROTL() { 
	// Interest Rate Over Time of Loan
		//NumberFormat df = new DecimalFormat("#0.00");
		return String.format("%.2f",( CC * Rate() * (Math.pow(1+Rate(), Months))) / (Math.pow(1+Rate(), Months) - 1));
		//return (df.format(xx));
	}
	
}
