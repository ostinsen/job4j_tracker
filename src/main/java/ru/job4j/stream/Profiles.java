package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    List<Address> collect(List<Profile> profiles){
        return profiles.stream()
                .map(p -> p.getAddress())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Profile> profiles = Arrays.asList(
                new Profile(new Address("Moskva", "Lenina",24, 6)),
                new Profile(new Address("Saint Petersburg", "Pushina",44, 16))
        );
        System.out.println(new Profiles().collect(profiles));

    }
}
