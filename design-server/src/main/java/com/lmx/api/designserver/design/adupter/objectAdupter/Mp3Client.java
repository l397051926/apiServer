package com.lmx.api.designserver.design.adupter.objectAdupter;

/**
 * @author: lmx
 * @create: 2020/8/22
 **/
public class Mp3Client {

    public static void main(String[] args) {
        Mp3 mp3 = new Mp3();
        mp3.listen(new Mp3HeadSetAdupter(new TtHeadSet()));
    }

}
