package com.hust.soict.nguyen.client_server;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;

public class Client {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1",9898);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			String message;
			while((message = new Scanner(System.in).nextLine()) != null) {
				out.print(message);
			}
			out.close();
			in.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
