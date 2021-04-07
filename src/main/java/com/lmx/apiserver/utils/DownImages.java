package com.lmx.apiserver.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;

/**
 * @author: lmx
 * @create: 2021/4/7
 **/
public class DownImages {

    public static void main(String[] args) {
        DownImages images = new DownImages();
        images.Download("http://wework.qpic.cn/wwhead/duc2TvpEgST9hicuyypLEKAUSgXn3oIwCCibha3cmDZGR2tBq5kYAibdh5ria4JY67o2xV380D2icnug/0");
    }

    //下载图片
    private void Download(String url) {
        try {
            //开始时间
            Date begindate = new Date();
            Date begindate2 = new Date();
            String imageName = "tt.jpg";
            URL uri = new URL(url);
            InputStream in = uri.openStream();
            FileOutputStream fo = new FileOutputStream(new File("/opt/" + imageName));//文件输出流
            byte[] buf = new byte[1024];
            int length = 0;
            System.out.println("开始下载:" + url);
            while ((length = in.read(buf, 0, buf.length)) != -1) {
                fo.write(buf, 0, length);
            }
            //关闭流
            in.close();
            fo.close();
            System.out.println(imageName + "下载完成");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("下载失败");
        }
    }

}
