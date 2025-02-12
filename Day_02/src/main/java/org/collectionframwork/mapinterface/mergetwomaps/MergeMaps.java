package org.collectionframwork.mapinterface.mergetwomaps;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {

    public static Map<String, Integer> mergeTwoMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        // Copying map1 into mergedMap
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        // Iterating through map2 and merging values
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            mergedMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        // Return statement
        return mergedMap;
    }
}
