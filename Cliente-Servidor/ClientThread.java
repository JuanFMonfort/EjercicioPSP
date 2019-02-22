package sample;


import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.io.*;

import java.net.Socket;
import java.util.ArrayList;


// podemos extender la clase Thread o hacer un runnable

public class ClientThread extends Thread {


    private ArrayList<Raton> ratones=new ArrayList<Raton>(MultiThreadedServer.getListaRatones());
    private Socket socket = null;
    private int id;



    public ClientThread (Socket socket){

        this.socket = socket;

    }



    public void run(){

        try {

            // OUT -> cliente

            // Necesitamos un stream para enviar datos al cliente

            // vamos a enviar un mensaje, asi que usaremos la clase PrintWriter

            // true -> autoflush , envia los datos sin esperar

            PrintWriter outprnt = null;

            FileOutputStream flOut = new FileOutputStream("Raton");

            BufferedOutputStream bfOut = new BufferedOutputStream(flOut);

            ObjectOutputStream obOut= new ObjectOutputStream(bfOut);

            // IN <- cliente

            // Ahora vamos a leer datos desde el cliente

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Leer de un fichero es similar a leer desde un socket


            outprnt.println("Diga el id del raton que solicita");
            outprnt.println("Actuales :" + ratones.size());

            id = input.read();

            System.out.println(id);

            for (Raton r:ratones){
                if (r.getId()==id){
                    obOut.writeObject(r);
                }
            }

            outprnt = new PrintWriter(socket.getOutputStream(), true);

            outprnt.println(("Comenzando Transmision."));





            flOut.close();

            bfOut.close();

            obOut.close();

            outprnt.close();

            input.close();

            socket.close();

        } catch (IOException e) {

            System.out.println(e.toString());

        }

    }



}
