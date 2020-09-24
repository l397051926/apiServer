package com.lmx.apiserver.leetcode2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: lmx
 * @create: 2020/9/24
 **/
public class FindMode {

    public int[] findMode(TreeNode root) {

        Integer t = 0;
        Integer k = 0;
        Map<Integer, Integer> map = new HashMap<>();
        find(root,map);
        map.forEach((x,v)->{
            if (t > v){

            }
        });
        return null;

    }

    public void find(TreeNode root, Map<Integer, Integer> maps) {
        if (root == null) {
            return;
        }
        if (maps.containsKey(root.val)) {
            maps.put(root.val, maps.get(root.val) + 1);
        } else {
            maps.put(root.val, 1);
        }
        find(root.left, maps);
        find(root.right, maps);
    }
}
