package pojoClasses;

public class RatesPojo {
	@Override
	public String toString() {
		return "RatesPojo [GBP=" + GBP + ", HKD=" + HKD + ", IDR=" + IDR + ", ILS=" + ILS + ", DKK=" + DKK + ", INR="
				+ INR + ", CHF=" + CHF + ", MXN=" + MXN + "]";
	}
	private double GBP;
	private double HKD;
	private double IDR;
	private double ILS;
	private double DKK;
	private double INR;
	private double CHF;
	private double MXN;
	
	public double getGBP() {
		return GBP;
	}
	public void setGBP(int gBP) {
		GBP = gBP;
	}
	public double getHKD() {
		return HKD;
	}
	public void setHKD(int hKD) {
		HKD = hKD;
	}
	public double getIDR() {
		return IDR;
	}
	public void setIDR(int iDR) {
		IDR = iDR;
	}
	public double getILS() {
		return ILS;
	}
	public void setILS(int iLS) {
		ILS = iLS;
	}
	public double getDKK() {
		return DKK;
	}
	public void setDKK(int dKK) {
		DKK = dKK;
	}
	public double getINR() {
		return INR;
	}
	public void setINR(int iNR) {
		INR = iNR;
	}
	public double getCHF() {
		return CHF;
	}
	public void setCHF(int cHF) {
		CHF = cHF;
	}
	public double getMXN() {
		return MXN;
	}
	public void setMXN(int mXN) {
		MXN = mXN;
	}
	

}
