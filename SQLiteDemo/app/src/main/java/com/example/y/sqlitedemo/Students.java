package com.example.y.sqlitedemo;


public class Students {
    String id;
    String idnum;
    String firstname;
    String lastname;
    String firstnamevalue;
    String lastnamevalue;


    public Students() {

    }

    public Students(String id,String idnum,String firstname,String firstnamevalue,String lastname, String lastnamevalue) {
        this.id = id;
        this.idnum = idnum;
        this.firstname = firstname;
        this.firstnamevalue = firstnamevalue;
        this.lastname =lastname;
        this.lastnamevalue = lastnamevalue;

    }
    public String getidnum() {return idnum;}
    public String getid(){return "Id:";}
    public String getfirstname(){return "First Name:";}
    public String getlastname(){ return "Last Name:"; }
    public String getfirstnamevalue() {return this.firstnamevalue;}
    public String getlastnamevalue() {return this.lastnamevalue;}

    public void setidnum(String idnum){this.idnum = idnum;}
    public void setid(String id){this.id = id;}
    public void setfirstname(String firstname)
    {
        this.firstname = firstname;
    }
    public void setfirstnamevalue(String firstnamevalue)
    {
        this.firstnamevalue = firstnamevalue;
    }
    public void setlastname(String lastname) {this.lastname = lastname;}
    public void setlastnamevalue(String lastnamevalue)
    {
        this.lastnamevalue = lastnamevalue;
    }

}
