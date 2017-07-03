package com.example.fitmind;

/**
 * Created by Valerie_Tshiani on 03-Jul-17.
 */

public class report {

    public String reportName;
   // public String report_info;
    public int pic;

    public report(String reportName, int pic) {
        this.reportName= reportName;
        //this.report_info = report_info;
        this.pic = pic;
    }

    public String getReportName( ) {
        return reportName;
    }

    public void  setReporttName(String subjectName) {
        this.reportName = reportName;
    }


    //public String getReport_info()
    //{
       // return  report_info;
    //}

    //public void setReport_info(String subject_info) { this.report_info = report_info; }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }



}
