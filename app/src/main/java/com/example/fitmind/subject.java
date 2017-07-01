package com.example.fitmind;

/**
 * Created by TSHVAL003 on 2017/07/01.
 */

public class subject {
 // inights into the kids
    public String subjectName;
    public String subject_info;
    public int pic;
    String year;

    public subject(String subjectName,String subject_info, int pic) {
        this.subjectName= subjectName;
        this.subject_info = subject_info;
        this.pic = pic;

    }

    public String getSubjectName( ) {
        return subjectName;
    }

    public void  setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }


    public String getSubject_info()
    {
        return  subject_info;
    }

    public void setSubject_info(String subject_info) { this.subject_info = subject_info; }



    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }



    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


}
