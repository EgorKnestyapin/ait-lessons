package ait.generic;

import ait.generic.utils.JsonWrapper2;

public class JsonWrapper2Appl {
    public static void main(String[] args) {
        JsonWrapper2<Integer> wrapper2 = new JsonWrapper2<>(10);
        System.out.println(wrapper2);
        Integer a = wrapper2.getValue();
    }
}
