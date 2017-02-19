package com.yuan.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {
		String msg = "hello world";
		Socket socket = new Socket("127.0.0.1", 8080);
		PrintWriter pw = new PrintWriter(socket.getOutputStream());
		pw.println(msg);
		BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		pw.flush();
		String line = is.readLine();
		System.out.println(line);
		pw.close();
		is.close();
		socket.close();
	}
}
