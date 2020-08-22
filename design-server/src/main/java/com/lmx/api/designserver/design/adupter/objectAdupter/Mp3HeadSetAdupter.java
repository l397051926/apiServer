package com.lmx.api.designserver.design.adupter.objectAdupter;

/**
 * @author: lmx
 * @create: 2020/8/22
 **/
public class Mp3HeadSetAdupter implements Mp3HeadSet {

    private TtHeadSet ttHeadSet ;

    public Mp3HeadSetAdupter(TtHeadSet ttHeadSet){
        this.ttHeadSet = ttHeadSet;
    }

    @Override
    public void headSet() {
        ttHeadSet.headset();
        System.out.println("转换成MP3 headset");
    }
}
