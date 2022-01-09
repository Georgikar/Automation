package Poly;

public class FirmaET extends Company implements Invoice {



private String nameoffounder;
private double primarycapital;
private double actualcapital;


    public FirmaET(String nameoffounder, double primarycapital, double actualcapital) {
        setNameoffounder(nameoffounder);
        setPrimarycapital(primarycapital);
        setActualcapital(actualcapital);
    }

    public String getNameoffounder() {
        return nameoffounder;
    }

    public void setNameoffounder(String nameoffounder) {
        this.nameoffounder = nameoffounder;
    }

    public double getPrimarycapital() {
        return primarycapital;
    }

    public void setPrimarycapital(double primarycapital) {
        this.primarycapital = primarycapital;
    }

    public double getActualcapital() {
        return actualcapital;
    }

    public void setActualcapital(double actualcapital) {

        this.actualcapital = actualcapital;
    }


    public void setprofit() {
        double profit = this.actualcapital - this.primarycapital;
    }


    @Override
    public void createInvoice() {
        System.out.println(getNameofcompany()+getDateoffound()+getBulstat());
    }
}
