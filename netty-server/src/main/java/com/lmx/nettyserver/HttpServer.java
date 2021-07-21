//package com.lmx.nettyserver;
//
//import java.nio.channels.SocketChannel;
//
///**
// * @Description: http netty server
// * @author: lmx
// * @date: 2021-07-21 5:46 下午
// */
//public class HttpServer {
//
//    private final int port;
//
//    public HttpServer(int port) {
//        this.port = port;
//    }
//
//    public static void main(String[] args) throws Exception {
//        if (args.length != 1) {
//            System.err.println(
//                    "Usage: " + HttpServer.class.getSimpleName() +
//                            " <port>");
//            return;
//        }
//        int port = Integer.parseInt(args[0]);
//        new HttpServer(port).start();
//    }
//
//    public void start() throws Exception {
//        ServerBootstrap b = new ServerBootstrap();
//        NioEventLoopGroup group = new NioEventLoopGroup();
//        b.group(group)
//                .channel(NioServerSocketChannel.class)
//                .childHandler(new ChannelInitializer<SocketChannel>() {
//                    @Override
//                    public void initChannel(SocketChannel ch)
//                            throws Exception {
//                        System.out.println("initChannel ch:" + ch);
//                        ch.pipeline()
//                                .addLast("decoder", new HttpRequestDecoder())   // 1
//                                .addLast("encoder", new HttpResponseEncoder())  // 2
//                                .addLast("aggregator", new HttpObjectAggregator(512 * 1024))    // 3
//                                .addLast("handler", new HttpHandler());        // 4
//                    }
//                })
//                .option(ChannelOption.SO_BACKLOG, 128) // determining the number of connections queued
//                .childOption(ChannelOption.SO_KEEPALIVE, Boolean.TRUE);
//
//        b.bind(port).sync();
//    }
//}