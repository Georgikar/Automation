package Poly;

public class Company {

    String nameofcompany;
    String dateoffound;
    String bulstat;




    public String getNameofcompany() {
        return nameofcompany;
    }

    public void setNameofcompany(String nameofcompany) {
        this.nameofcompany = nameofcompany;
    }

    public String getDateoffound() {
        return dateoffound;
    }

    public void setDateoffound(String dateoffound) {
        this.dateoffound = dateoffound;
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        if(bulstat.length() <= 10);
        this.bulstat = bulstat;
    }
}
