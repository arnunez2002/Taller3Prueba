package co.edu.unbosque.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Capitalizer implements Runnable {

	private Socket socket;

	public Capitalizer(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

		safePrintln("Connected: " + socket);

		try {

			var in = new Scanner(socket.getInputStream());
			var out = new PrintWriter(socket.getOutputStream(), true);

			while (in.hasNextLine()) {
				var message = in.nextLine();
				safePrintln("La opcion elegida fue " + message + " Crear caso");

				if (message.equals("1")) {
					String mensajeOpcion1 = "(1) - Perdida" + "\n" + "(2) - Robo" + "\n" + "(3) - Abandono"
							+ "(4) - Animal peligroso" + "\n" + "(5) - Manejo indebido en via publica";
					out.println(
							"(1) - Perdida / (2) - Robo / (3) - Abandono / (4) - Animal peligroso / (5) - Manejo indebido en via publica");

					var opcion1 = in.nextInt();
					safePrintln("La opcion elegida fue " + opcion1);

					if (opcion1 == 1) {
						in = new Scanner(socket.getInputStream());

						out.println("Especie");
						String especie = in.nextLine();

						out.println("Tamaño");
						String tamaño = in.nextLine();

						out.println("Localidad");
						String localidad = in.nextLine();

						out.println("Direccion");
						String direccion = in.nextLine();

						out.println("Nombre completo de la persona que reporta");
						String nombrePersona = in.nextLine();

						out.println("Telefono");
						String telefono = in.nextLine();

						out.println("Correo electronico");
						String email = in.nextLine();

						out.println("Comentarios");
						String comentarios = in.nextLine();

						safePrintln("----------------------------");
						safePrintln("Perdida");
						safePrintln("La info es" + "\n" + "Especie: " + especie + "\n" + "Tamaño: " + tamaño + "\n"
								+ "Localidad: " + localidad + "\n" + "Direccion: " + direccion + "\n"
								+ "Nombre de la persona: " + nombrePersona + "\n" + "Telefono: " + telefono + "\n"
								+ "Email: " + email + "\n" + "Comentarios: " + comentarios);
						safePrintln("----------------------------");

						safePrintln("El caso esta registrado");

					}
					if (opcion1 == 2) {
						out.println("Especie");
						var especie = in.nextLine();

						out.println("Tamaño");
						var tamaño = in.nextLine();

						out.println("Localidad");
						var localidad = in.nextLine();

						out.println("Direccion");
						var direccion = in.nextLine();

						out.println("Nombre completo de la persona que reporta");
						var nombrePersona = in.nextLine();

						out.println("Telefono");
						var telefono = in.nextLine();

						out.println("Correo electronico");
						var email = in.nextLine();

						out.println("Comentarios");
						var comentarios = in.nextLine();

						safePrintln("----------------------------");
						safePrintln("Perdida");
						safePrintln("La info es" + "\n" + "Especie: " + especie + "\n" + "Tamaño: " + tamaño + "\n"
								+ "Localidad: " + localidad + "\n" + "Direccion: " + direccion + "\n"
								+ "Nombre de la persona: " + nombrePersona + "\n" + "Telefono: " + telefono + "\n"
								+ "Email: " + email + "\n" + "Comentarios: " + comentarios);
						safePrintln("----------------------------");

						safePrintln("El caso esta registrado");

					}
					if (opcion1 == 3) {
						out.println("Especie");
						var especie = in.nextLine();

						out.println("Tamaño");
						var tamaño = in.nextLine();

						out.println("Localidad");
						var localidad = in.nextLine();

						out.println("Direccion");
						var direccion = in.nextLine();

						out.println("Nombre completo de la persona que reporta");
						var nombrePersona = in.nextLine();

						out.println("Telefono");
						var telefono = in.nextLine();

						out.println("Correo electronico");
						var email = in.nextLine();

						out.println("Comentarios");
						var comentarios = in.nextLine();

						safePrintln("----------------------------");
						safePrintln("Perdida");
						safePrintln("La info es" + "\n" + "Especie: " + especie + "\n" + "Tamaño: " + tamaño + "\n"
								+ "Localidad: " + localidad + "\n" + "Direccion: " + direccion + "\n"
								+ "Nombre de la persona: " + nombrePersona + "\n" + "Telefono: " + telefono + "\n"
								+ "Email: " + email + "\n" + "Comentarios: " + comentarios);
						safePrintln("----------------------------");

						safePrintln("El caso esta registrado");

					}
					if (opcion1 == 4) {
						out.println("Especie");
						var especie = in.nextLine();

						out.println("Tamaño");
						var tamaño = in.nextLine();

						out.println("Localidad");
						var localidad = in.nextLine();

						out.println("Direccion");
						var direccion = in.nextLine();

						out.println("Nombre completo de la persona que reporta");
						var nombrePersona = in.nextLine();

						out.println("Telefono");
						var telefono = in.nextLine();

						out.println("Correo electronico");
						var email = in.nextLine();

						out.println("Comentarios");
						var comentarios = in.nextLine();

						safePrintln("----------------------------");
						safePrintln("Perdida");
						safePrintln("La info es" + "\n" + "Especie: " + especie + "\n" + "Tamaño: " + tamaño + "\n"
								+ "Localidad: " + localidad + "\n" + "Direccion: " + direccion + "\n"
								+ "Nombre de la persona: " + nombrePersona + "\n" + "Telefono: " + telefono + "\n"
								+ "Email: " + email + "\n" + "Comentarios: " + comentarios);
						safePrintln("----------------------------");

						safePrintln("El caso esta registrado");

					}
					if (opcion1 == 5) {

						out.println("Especie");
						var especie = in.nextLine();

						out.println("Tamaño");
						var tamaño = in.nextLine();

						out.println("Localidad");
						var localidad = in.nextLine();

						out.println("Direccion");
						var direccion = in.nextLine();

						out.println("Nombre completo de la persona que reporta");
						var nombrePersona = in.nextLine();

						out.println("Telefono");
						var telefono = in.nextLine();

						out.println("Correo electronico");
						var email = in.nextLine();

						out.println("Comentarios");
						var comentarios = in.nextLine();

						safePrintln("----------------------------");
						safePrintln("Perdida");
						safePrintln("La info es" + "\n" + "Especie: " + especie + "\n" + "Tamaño: " + tamaño + "\n"
								+ "Localidad: " + localidad + "\n" + "Direccion: " + direccion + "\n"
								+ "Nombre de la persona: " + nombrePersona + "\n" + "Telefono: " + telefono + "\n"
								+ "Email: " + email + "\n" + "Comentarios: " + comentarios);
						safePrintln("----------------------------");

						safePrintln("El caso esta registrado");

					}
				} else if (message.equals("2")) {

					out.println("Esperando a la respuesta del agente.");
					out.flush();
					safePrintln("Un usuario se desea conectar:");
					safePrintln("Para aceptar escriba:1");
					safePrintln("Para denegar escriba:2");
					var op2 = new Scanner(System.in);
					var respuesta = op2.nextLine();
					if (respuesta.equals("1")) {
						
						
						safePrintln("cliente conectado. Pueden empezar a chatear");
						
						out.print("Agente conectado. Pueden empezar a chatear");
						
						boolean aux = true;
						in = new Scanner(socket.getInputStream());
						while (aux==true) {
							String consolaClint = in.nextLine();
							
							safePrintln(consolaClint);
							out.print("¿Desea continuar?");
							out.print("Si:1");
							out.print("No:2");
							String n = in.nextLine();
							if(n.equals("1")) {
								aux=true;
							}else {
								aux=false;
							}
						}
						
					} else if (respuesta.equals("2")) {
						out.println("El servidor rechazó su llamada");

					}

				}
			}
		} catch (Exception e) {
			safePrintln("Error:" + socket);
		} finally {
			try {
				socket.close();
			} catch (Exception e) {
			}
			safePrintln("Closed: " + socket);
		}
	}

	public void safePrintln(String s) {
		synchronized (System.out) {
			System.out.println(s);
		}
	}

}