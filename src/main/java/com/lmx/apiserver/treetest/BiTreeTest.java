package com.lmx.apiserver.treetest;

/**
 * @author: lmx
 * @create: 2020/10/15
 **/
public class BiTreeTest {

    public void search(BiTree t, Integer type, BiTree p) {
        if (type < t.data) {
            search(t.left, type, p);
        }
        if (type > t.data) {
            search(t.right, type, p);
        }
        if (type == t.data) {
            p = t;
        }
    }

    public boolean insert(BiTree t, Integer type) {
        if (t == null) {
            t = new BiTree(type);
            return true;
        } else if (type.equals(t.data)) {
            return false;
        } else if (type < t.data) {
           return insert(t.left, type);
        } else {
           return insert(t.right, type);
        }
    }

}
