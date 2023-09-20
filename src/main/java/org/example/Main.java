package org.example;

import org.example.enums.DistrictCodes;
import org.example.model.Ad;
import org.example.model.Agent;
import org.example.model.User;

import java.util.function.Predicate;

public class Main {
    public static <List> void main(String[] args) {
        Agency RealEstateAgency = new Agency();

        User user1 = new User("Gigel", "gigel@gmail.com");
        Agent agent1 = new Agent("001", "001@gmail.com");

        RealEstateAgency.addUsers(user1);
        RealEstateAgency.addUsers(agent1);

        Ad ad1 = new Ad(1, "Iasi", DistrictCodes.V, agent1, 100000, false);
        Ad ad2 = new Ad(2, "Cluj", DistrictCodes.VI, agent1, 150000, true);

        RealEstateAgency.addAds(ad1);
        RealEstateAgency.addAds(ad2);

//        user1.sendDMToUser(agent1, "Is the property still available?");
//
//        RealEstateAgency.listAds();

        System.out.println(RealEstateAgency.filterByDistrict(DistrictCodes.V));
        System.out.println(RealEstateAgency.filterByPrice(150000));
        System.out.println(RealEstateAgency.filterByFurnished(true));

        Predicate<Ad> filterByDistrict = ad -> ad.getDistrict() == DistrictCodes.V;
        Predicate<Ad> filterByPrice = ad -> ad.getPrice() >= 100000;
        Predicate<Ad> filterByFurnished = Ad::isFurnished;

        java.util.List<Ad> filteredAds = RealEstateAgency.filterAds(filterByDistrict.and(filterByPrice.and(filterByFurnished)));

        filteredAds.forEach(System.out::println);
    }
}