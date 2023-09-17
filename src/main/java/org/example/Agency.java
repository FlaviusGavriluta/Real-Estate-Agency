package org.example;

import org.example.enums.DistrictCodes;
import org.example.model.Ad;
import org.example.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

public class Agency {
    List<User> users;
    List<Ad> ads;

    public Agency() {
        this.users = new ArrayList<>();
        this.ads = new ArrayList<>();
    }

    public void addUsers(User user) {
        this.users.add(user);
    }

    public void addAds(Ad ad) {
        this.ads.add(ad);
    }

    public void listAds() {
        ads.forEach(System.out::println);
    }

    public List<Ad> filterAds(Predicate<Ad> criteria) {
        return ads.stream()
                .filter(criteria)
                .collect(Collectors.toList());
    }

    public List<Ad> filterByDistrict(DistrictCodes district) {
        return ads.stream()
                .filter(ad -> ad.getDistrict().equals(district))
                .collect(Collectors.toList());
    }

    public List<Ad> filterByPrice(int price) {
        return ads.stream()
                .filter(ad -> ad.getPrice() == price)
                .collect(Collectors.toList());
    }

    public List<Ad> filterByFurnished(boolean isFurnished) {
        return ads.stream()
                .filter(ad -> ad.isFurnished() == isFurnished)
                .collect(Collectors.toList());
    }
}
