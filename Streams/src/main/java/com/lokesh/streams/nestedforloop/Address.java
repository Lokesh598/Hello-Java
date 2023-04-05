package com.lokesh.streams.nestedforloop;

public class Address {
    private int P_No;
    private String Street_Name;
    private String City;
    public Address(int p_No, String street_Name, String city) {
        P_No = p_No;
        Street_Name = street_Name;
        City = city;
    }

    public Address() {

    }

    public int getP_No() {
        return P_No;
    }

    public void setP_No(int p_No) {
        P_No = p_No;
    }

    public String getStreet_Name() {
        return Street_Name;
    }

    public void setStreet_Name(String street_Name) {
        Street_Name = street_Name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }


//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return
                "P_No=" + P_No +
                ", Street_Name='" + Street_Name + '\'' +
                ", City='" + City + '\'';
    }
}