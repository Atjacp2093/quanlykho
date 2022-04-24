/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitepac;

/**
 *
 * @author Anhdt993<https://anhdt2093.000webhostapp.com>
 */
public class site {
    private int idSite;
    private String name;
    private String address;
    private String contactName;
    private String phoneNumber;
    private String created_at;
    private int country_code;
    public site(){
    }

        public site(int idSite, String name, String address, String contactName, String phoneNumber, String created_at, int country_code) {
        this.idSite = idSite;
        this.name = name;
        this.address = address;
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.created_at = created_at;
        this.country_code = country_code;
    }
    public site(String name, String address, String contactName, String phoneNumber, String created_at, int country_code) {
        this.name = name;
        this.address = address;
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.created_at = created_at;
        this.country_code = country_code;
    }

    public int getIdSite() {
        return idSite;
    }

    public void setIdSite(int idSite) {
        this.idSite = idSite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public int getCountry_code() {
        return country_code;
    }

    public void setCountry_code(int country_code) {
        this.country_code = country_code;
    }

}
