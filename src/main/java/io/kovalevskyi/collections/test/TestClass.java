package io.kovalevskyi.collections.test;

import org.openjdk.jmh.annotations.Benchmark;

import java.util.*;

public class TestClass {

    @Benchmark
    public void test1() {
        add(new ArrayList<Integer>());
    }

    @Benchmark
    public void test2() {
        add(new LinkedList<Integer>());
    }

    @Benchmark
    public void test3() {
        add(new Vector<Integer>());
    }

    public void add(final List<Integer> list) {
        for (int i = 0; i < 10_000; i++)
            list.add(i);
    }

}
