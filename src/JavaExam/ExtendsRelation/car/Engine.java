package car;

public class Engine {
    String sn;
    String year;

    public Engine() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Engine(String sn, String year) {
        super();
        this.sn = sn;
        this.year = year;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}