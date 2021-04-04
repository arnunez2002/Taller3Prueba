package co.edu.unbosque.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CapitalizeClient {

	Socket socket;
	BufferedReader br;
	BufferedWriter bw;

	public static void main(String[] args) throws Exception {

		try (var socket = new Socket("127.0.0.1", 59897)) {

			System.out.println("Connected: " + socket);
			System.out.println("Bienvenido a pet-citizen -- Ciudadanos de 4 patas");

			System.out.println("(1) - Crear caso" + "\n" + "(2) Hablar con un agente");

			var scanner = new Scanner(System.in);
			var in = new Scanner(socket.getInputStream());
			var out = new PrintWriter(socket.getOutputStream(), true);

			while (scanner.hasNextLine()) {
				out.println(scanner.nextLine());
				System.out.println(in.nextLine());
			}

		}

	}


	
	
	
	public void enviarMensaje(String mensaje) {
		try {
			bw.write(mensaje);
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String recibirMensaje () {
		try {
			String mensaje = br.readLine();
			return mensaje;
		} catch (IOException e) {		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "-";
	}
	
	public void run () {
		while (true) {
			String mensaje = recibirMensaje();
			safePrintln("El cliente: " + mensaje);
		}
	}
    public void safePrintln(String s) {
        synchronized (System.out) {
            System.out.println(s);
        }
    }
	
	
	

}