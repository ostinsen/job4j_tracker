package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    @Test
    public void whenTwoAddress(){
        List<Profile> profiles = Arrays.asList(
                new Profile(new Address("Moskva", "Lenina",24, 6)),
                new Profile(new Address("Saint Petersburg", "Pushina",44, 16))
        );
        List<Address> exp = Arrays.asList(
                new Address("Moskva", "Lenina",24, 6),
        new Address("Saint Petersburg", "Pushina",44, 16)
        );

        List<Address> rsl = new Profiles().collect(profiles);

        assertThat(exp, is(rsl));
    }

    @Test
    public void whenSortedAddress(){
        List<Profile> profiles = Arrays.asList(
                new Profile(new Address("Moskva", "Lenina",24, 6)),
                new Profile(new Address("Saint Petersbu", "Pushina",44, 16)),
                new Profile(new Address("Saint Petersburg", "Pushina",44, 16)),
                new Profile(new Address("Saint Petersbur", "Pushina",44, 16)),
                new Profile(new Address("Moskva", "Lenina",24, 6)),
                new Profile(new Address("Saint Petersbu", "Pushina",44, 16)),
                new Profile(new Address("Saint Petersbu", "Pushina",44, 16)),
                new Profile(new Address("Moskva", "Lenina",21, 6))
        );
        List<Address> exp = Arrays.asList(new Address("Moskva", "Lenina",24, 6),
                new Address("Moskva", "Lenina",21, 6),
                new Address("Saint Petersbu", "Pushina",44, 16),
                new Address("Saint Petersbur", "Pushina",44, 16),
                new Address("Saint Petersburg", "Pushina",44, 16));

        List<Address> rsl = new Profiles().collect(profiles);

        assertThat(exp, is(rsl));
    }
}