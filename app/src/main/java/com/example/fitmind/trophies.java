package com.example.fitmind;

/**
 * Created by Valerie_Tshiani on 03-Jul-17.
 */

public class trophies {

    public String trophyName;
    public int pic;

//    public trophies(String trophyName, int pic) {
//        this.trophyName= trophyName;
//        //this.report_info = report_info;
//        this.pic = pic;
//    }

    public trophies( int pic) {
        //this.trophyName= trophyName;
        //this.report_info = report_info;
        this.pic = pic;
    }

    public String getTrophyName( ) {
        return trophyName;
    }
    public void  setTrophytName(String subjectName) {
        this.trophyName = trophyName;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
