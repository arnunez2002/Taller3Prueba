package co.edu.unbosque.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.System.Logger;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executors;

/**
 * Example from: https://cs.lmu.edu/~ray/notes/javanetexamples/
 *
 * A server program which accepts requests from clients to capitalize strings.
 * When a client connects, a new thread is started to handle it. Receiving
 * client data, capitalizing it, and sending the response back is all done on
 * the thread, allowing much greater throughput because more clients can be
 * handled concurrently.
 */
public class CapitalizeServer {

	Socket socket;
	BufferedReader br;
	BufferedWriter bw;
	 ServerSocket sk;

	/**
	 * Runs the server. When a client connects, the server spawns a new thread to do
	 * the servicing and immediately returns to listening. The application limits
	 * the number of threads via a thread pool (otherwise millions of clients could
	 * cause the server to run out of resources by allocating too many threads).
	 */
	public static void main(String[] args) throws Exception {

		try (var listener = new ServerSocket(59897)) {

			System.out.println("The capitalization server is running...");

			var pool = Executors.newFixedThreadPool(20);

			while (true) {
				pool.execute(new Capitalizer(listener.accept()));
			}

		}

	}
	
	public CapitalizeServer () {
		
	}

	public void esperarCliente() {
		try {
			socket = sk.accept();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void crearFlujo() {
		try {
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			br = new BufferedReader(isr);

			OutputStream os = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 public  void  abrirPuerto () {
	        try {
	            sk =  new  ServerSocket ( 59897 );
	        } catch ( IOException ex) {
	        }
	    }
	public void enviarMensaje (String mensaje) {
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

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public BufferedReader getBr() {
		return br;
	}

	public void setBr(BufferedReader br) {
		this.br = br;
	}

	public BufferedWriter getBw() {
		return bw;
	}

	public void setBw(BufferedWriter bw) {
		this.bw = bw;
	}
    
}