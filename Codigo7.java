import java.util.Scanner;

public class Código7 {

public static void main(String[] args) {  //faltaba el public



    Scanner s = new Scanner(System.in);

    HashMap<String, String> capitales = new HashMap<>();  //hashMap<string> 

    capitales.put("Canadá", "Ottawa");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa Rica", "San José");
    capitales.put("El Salvador", "San Salvador"); //san salvador
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");

    String c = "";  //estaba mal escrito string

    do {
        System.out.print("Escribe el nombre de un país y te diré su capital: "); //syso
        c = s.nextLine();  //nextLine
        
        if (!c.equals("salir")) {  //equals
            if (capitales.containsKey(c)) {  //containsKey
                System.out.print("La capital de " + c); //syso
                System.out.println(" es " + capitales.get(c));  //get en lugar de put
            } else {
                System.out.print("No conozco la respuesta ");
                System.out.print("¿cuál es la capital de " + c + "?: ");
                String ca = s.nextLine();
                ca.put(c, ca);
                System.out.println("Gracias por enseñarme nuevas capitales");
            }
        }
    } while (!c.equals("salir")); //estaba mal escrito while
  }

}