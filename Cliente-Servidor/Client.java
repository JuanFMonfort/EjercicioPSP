package sample;

import java.net.*;

import java.io.*;
import java.util.ArrayList;


public class Client {



    public static void main(String [] args)

    {

        try

        {

            InetAddress serverAddress = InetAddress.getByName("localhost") ;

            System.out.println("server ip address: " + serverAddress.getHostAddress());

            Socket socket = new Socket(serverAddress, 9090);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            FileInputStream flIn = new FileInputStream("Raton");

            BufferedInputStream bfIn = new BufferedInputStream(flIn);

            ObjectInputStream objIn = new ObjectInputStream(bfIn);

            System.out.println(input.readLine());

            System.out.println(objIn);



            flIn.close();

            bfIn.close();

            objIn.close();

            input.close();

            out.close();

            socket.close();

            out.println("Datos Transferidos.");

        }

        catch(UnknownHostException e1)

        {

            System.out.println("Unknown host exception " + e1.toString());

        }

        catch(IOException e2)

        {

            System.out.println("IOException " + e2.toString());

        }

        catch(IllegalArgumentException e3)

        {

            System.out.println("Illegal Argument Exception " + e3.toString());

        }

        catch(Exception e4)

        {

            System.out.println("Other exceptions " + e4.toString());

        }

    }

}
