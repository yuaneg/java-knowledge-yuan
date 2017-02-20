package com.yuan.socket.niosocket;

import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;

public class Server {

	public static void main(String[] args) throws Exception {
		
		//创建socketChannel
		ServerSocketChannel ssc = ServerSocketChannel.open();
		//绑定端口
		ssc.socket().bind(new InetSocketAddress(8080));
		//配置为非阻塞模式
		ssc.configureBlocking(false);
		
		Selector selector = Selector.open();
		//注册selector
		ssc.register(selector, SelectionKey.OP_ACCEPT);

		Handler handler = new Handler(1024);
		
		while (true) {
			if (selector.select(3000) == 0) {
				System.out.println("等待请求时间超时");
				continue;
			}
			System.out.println("处理请求......");
			Iterator<SelectionKey> keyIter = selector.selectedKeys().iterator();
			while (keyIter.hasNext()) {
				SelectionKey key = keyIter.next();
				try {
					if (key.isAcceptable()) {
						handler.handleAccept(key);
					}
					if (key.isReadable()) {
						handler.handleRead(key);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				keyIter.remove();
			}
		}
	}

}
