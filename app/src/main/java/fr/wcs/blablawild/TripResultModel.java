package fr.wcs.blablawild;


import java.util.Date;

public class TripResultModel {

    private String mFirstName;
    private Date mDepartureDate;
    private int mPrice;

    public TripResultModel(String mFirstName, Date mDepartureDate, int mPrice) {
        this.mFirstName = mFirstName;
        this.mDepartureDate = mDepartureDate;
        this.mPrice = mPrice;
    }
    public String getmFirstName(){

        return this.mFirstName;
    }
    public Date getmDepartureDate(){
        return this.mDepartureDate;
    }
    public int getmPrice(){
        return this.mPrice;
    }

    public void setmFirstName(String mFirstName){
        this.mFirstName = mFirstName;
    }
    public void setmDepartureDate(Date mDepartureDate) {
        this.mDepartureDate = mDepartureDate;
    }
    public void setmPrice(int mPrice) {
        this.mPrice = mPrice;
    }

}
