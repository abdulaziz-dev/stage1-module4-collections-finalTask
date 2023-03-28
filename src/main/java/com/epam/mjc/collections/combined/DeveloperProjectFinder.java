package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        projects.forEach((K, V) -> {
            if (V.contains(developer)){
                list.add(K);
            }
        });
        Comparator<String> comp = new StringComp();
        list.sort(comp);
        return list;
    }

    class StringComp implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            if (o1.length() > o2.length()){
                return -1;
            } else if (o1.length() < o2.length()){
                return 1;
            } else return -o1.compareTo(o2);
        }
    }
}
