package ru.job4j.stream;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    List<Address> collect(List<Profile> profiles){
        return profiles.stream().sorted(Comparator.comparing(profile -> profile.getAddress().getCity()))
                .map(p -> p.getAddress())
                .distinct()
                .collect(Collectors.toList());
    }
}
