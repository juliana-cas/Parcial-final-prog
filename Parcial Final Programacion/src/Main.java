import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String num = "1";
        IPeluqueria loc = new Abstacto();
        while (num != "6"){
            Scanner s = new Scanner(System.in);
            System.out.println("\"Menu \n 1. Add  \n 2. Get all \n 3. Edit" +
                    "                    \n 4. Delete  \n 5. Get by id \n 6. Leave");
            num = s.next();
            switch (num){
                case "1":{
                    System.out.println("Peluqueria id: ");
                    Integer id = s.nextInt();
                    System.out.println("Peluqueria name: ");
                    String nombrePeluqueria = s.next();
                    System.out.println(" Peluqueria email: ");
                    String Correo = s.next();
                    System.out.println(" adress schedule: ");
                    String direccion = s.next();
                    System.out.println("Phone number:");
                    String telefono = s.next();
                    loc.guardar(new Peluqueria(id, nombrePeluqueria, Correo, direccion, telefono));
                    break;
                }
                case "2":{
                    List<Peluqueria> PeluqueriaList = loc.ListarTodos();
                    PeluqueriaList.forEach(System.out::println);
                    break;
                }
                case "3":{
                    System.out.println("EDIT");
                    System.out.println("New Peluqueria id: ");
                    Integer id = s.nextInt();
                    System.out.println("New Peluqueria name: ");
                    String nombrePeluqueria = s.next();
                    System.out.println("New Peluqueria email ");
                    String Correo = s.next();
                    System.out.println("New Peluqueria adress: ");
                    String direccion = s.next();
                    System.out.println("New phone number");
                    String telefono = s.next();
                    loc.actualizar(new Peluqueria(id,nombrePeluqueria,Correo, direccion, telefono));
                    break;
                }
                case "4":{
                    System.out.println("DELETE");
                    System.out.println("Write the id you want to delete: ");
                    Integer id = s.nextInt();
                    loc.borrar(loc.encontrarId(id));
                    break;
                }

                case "5":{
                    System.out.println("FIND BY ID");
                    System.out.println("Write the id you want to find");
                    Integer id = s.nextInt();
                    System.out.println(loc.encontrarId(id));
                    break;
                }

                case "6":{
                    num = "6";
                    break;
                }
            }
        }
    }

}