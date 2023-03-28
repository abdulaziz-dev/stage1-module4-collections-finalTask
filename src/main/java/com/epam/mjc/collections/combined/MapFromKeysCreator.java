package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        HashMap<Integer, Set<String>> resultMap = new HashMap<>();
        Set<Integer> mySet = new HashSet<>();
        sourceMap.forEach((K, V) -> mySet.add(K.length()));

        for (Integer x : mySet) {
            Set<String> set = new HashSet<>();
            sourceMap.forEach((K, V) ->
            {
                if (K.length() == x) set.add(K);
            });
            resultMap.putIfAbsent(x, set);
        }

        return resultMap;
    }
}
