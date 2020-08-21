package com.lmx.api.designserver.design.prototype.dto;

import lombok.Data;

import java.io.*;

/**
 * @author: lmx
 * @create: 2020/8/21
 **/
@Data
public class Sheep implements Serializable, Cloneable {

    private static final long serialVersionUID = 1;

    private Wool wool;
    private String name;

    /**
     * 通过序列化方式
     *
     * @return
     */
    public Sheep deepClone() {
        Sheep p2 = null;
        Sheep p1 = this;
        PipedOutputStream out = new PipedOutputStream();
        PipedInputStream in = new PipedInputStream();
        try {
            in.connect(out);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream bo = new ObjectOutputStream(out);
             ObjectInputStream bi = new ObjectInputStream(in);) {
            bo.writeObject(p1);
            p2 = (Sheep) bi.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return p2;

    }

    /**
     * 通过conle方式
     *
     * @return
     * @throws CloneNotSupportedException
     */

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep) super.clone();
        sheep.setWool((Wool) sheep.getWool().clone());
        return super.clone();
    }
}
