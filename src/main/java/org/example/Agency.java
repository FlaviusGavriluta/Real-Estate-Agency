package org.example;

import org.example.enums.DistrictCodes;
import org.example.model.Ad;
import org.example.model.User;

import java.util.List;
import java.util.stream.Collectors;

public class Agency {
    List<User> users;
    List<Ad> ads;

    public void filterForDistrict(DistrictCodes district) {
        ads.stream()
                .filter(ad -> ad.getDistrict().equals(district));
    }

    public List<Ad> filterForPrice(int price) {
        return ads.stream()
                .filter(ad -> ad.getPrice() == price)
                .collect(Collectors.toList());
    }

    public void filterForFurnished() {

    }
}
