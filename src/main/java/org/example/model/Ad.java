package org.example.model;

import org.example.enums.DistrictCodes;

public class Ad {
    private int id;
    private String address;
    private DistrictCodes district;
    private Agent agent;
    private int price;
    private boolean furnished;
    private boolean furnish;

    public Ad(int id, String address, DistrictCodes district, Agent agent, int price) {
        this.id = id;
        this.address = address;
        this.district = district;
        this.agent = agent;
        this.price = price;
        this.furnished = furnish;
    }

    public void setFurnish() {
        furnished = true;
    }

    public boolean isFurnished() {
        if (furnished)
            return true;
        return furnished;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DistrictCodes getDistrict() {
        return district;
    }

    public void setDistrict(DistrictCodes district) {
        this.district = district;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFurnished(boolean furnished) {
        this.furnished = furnished;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", district=" + district +
                ", agent=" + agent +
                ", price=" + price +
                ", furnished=" + furnished +
                '}';
    }
}
