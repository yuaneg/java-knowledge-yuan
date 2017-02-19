package com.yuan.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {

		// 设置 Server 端口
		ServerSocket serverSocket = new ServerSocket(8080);
		Socket socket = serverSocket.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String line = br.readLine();
		System.out.println("接收到的数据:" + line);
		// 发送数据
		PrintWriter pw = new PrintWriter(socket.getOutputStream());
		pw.print(line);
		pw.flush();
		br.close();
		socket.close();
		serverSocket.close();
	}
}
