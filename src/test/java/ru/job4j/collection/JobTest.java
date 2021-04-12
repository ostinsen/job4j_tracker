package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority =
                new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameDown() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("AAA bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Collections.sort(jobs, new JobAbcByName());
        List<Job> expected = List.of(
                new Job("AAA bug", 4),
                new Job("Fix bug", 1),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        assertThat(jobs, is(expected));
    }

    @Test
    public void whenCompatorByPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByProrityDown() {
        Comparator<Job> cmpNamePriority = new Job123ByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 11),
                new Job("Fix bug", 10)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByName() {
        Comparator<Job> cmpNamePriority = new JobDescByName();
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 11),
                new Job("Nix bug", 10)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityDown() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 10),
                new Job("AAA bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Collections.sort(jobs, new JobDescByName().thenComparing(new Job123ByPriority()));
        List<Job> expected = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bug", 2),
                new Job("Fix bug", 10),
                new Job("AAA bug", 4)

        );
        assertThat(jobs, is(expected));
    }
}