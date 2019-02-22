package sample;



import java.net.ServerSocket;

import java.net.Socket;
import java.util.ArrayList;


public class MultiThreadedServer {

    public static ArrayList<Raton> listaRatones=new ArrayList<Raton>();

    // Un servidor de un hilo, espera a todos clientes en la misma conexion

    // en un servidor multihilo, pasa la conexion a diferentes hilos

    public static void  main(String[] args){

        listaRatones.add(new Raton(1, "Logitech Wireless Mouse M185 Gris", 12.99));
        listaRatones.add(new Raton(2, "Newskill EOS Ratón Gaming Professional RGB 16000DPI ", 49.99));
        listaRatones.add(new Raton(3, "Logitech B100 Ratón Negro", 6.99));
        listaRatones.add(new Raton(4, "Xiaomi Mi Portable Ratón Inalámbrico Plata", 17.99));
        listaRatones.add(new Raton(5, "Razer Deathadder Essential Ratón Gaming 6400 DPI", 38.99));
        listaRatones.add(new Raton(6, "Microsoft Mobile 1850 Ratón Inalámbrico", 7.99));


        try

        {

            ServerSocket serverSocket = new ServerSocket(9090);

            boolean stop = false;

            System.out.println("Esperando clientes");

            while(!stop){

                Socket clientSocket = serverSocket.accept();

                System.out.println("Cliente conectado!");

                // usamos la clase ClientThread

                ClientThread clientThread = new ClientThread(clientSocket);

                clientThread.start();

            }

        }

        catch(Exception e){



        }

    }

    public static ArrayList<Raton> getListaRatones() {
        return listaRatones;
    }
}
