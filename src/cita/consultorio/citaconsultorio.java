package cita.consultorio;
import java.util.Scanner;
public class citaconsultorio {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //Login del doctor
      System.out.println("Bienvenido al sistema de citas del consultorio medico: ");
      System.out.println("Ingrese su usuario: ");
      String usuario = input.nextLine();
      System.out.println("Ingrese su contraseña: ");
      String contrasena = input.nextLine();

      if (usuario.equals("Doctor 1") && contrasena.equals("1234")) {
          System.out.println("Login correcto. Dr.David Ortiz");
      } else if (usuario.equals("Doctor 2") && contrasena.equals("4321")) {
              System.out.println("Login correcto. Dra.Laura Zurita");
          }else {
          System.out.println("Login incorrecto. Saliendo del programa");
          return;
          
      }
  }
}