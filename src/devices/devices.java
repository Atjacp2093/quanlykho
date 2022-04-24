/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devices;

/**
 *
 * @author author Anhdt993<https://anhdt2093.000webhostapp.com>
 */
public class devices {

    private int idSite;
    private String serviceTag;
    private String producer;
    private String model;
    private String state;
    private int idContractors;
    public devices(){
        
    }
    
    public devices(int idSite, String serviceTag, String producer, String model, String state, int idContractors) {
        this.idSite = idSite;
        this.serviceTag = serviceTag;
        this.producer = producer;
        this.model = model;
        this.state = state;
        this.idContractors = idContractors;
    }

    public devices( String serviceTag, String producer, String model, String state, int idContractors) {
        this.serviceTag = serviceTag;
        this.producer = producer;
        this.model = model;
        this.state = state;
        this.idContractors = idContractors;
    }

    public int getIdSite() {
        return idSite;
    }

    public void setIdSite(int idSite) {
        this.idSite = idSite;
    }

    public String getServiceTag() {
        return serviceTag;
    }

    public void setServiceTag(String serviceTag) {
        this.serviceTag = serviceTag;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getIdContractors() {
        return idContractors;
    }

    public void setIdContractors(int idContractors) {
        this.idContractors = idContractors;
    }
    
}
