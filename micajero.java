import java.util.Scanner;

public class micajero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuario, contraseña, respuesta;

        System.out.println("Ingrese su usuario: ");
        usuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña: ");
        contraseña = scanner.nextLine();

        if (usuario.equals("trueno") && contraseña.equals("222")) {
            System.out.println("--------------------");
            System.out.println("¡Bienvenido al cajero automático!");
            System.out.println("--------------------");

            int opcion;
            double saldo = 1000.0; // Ejemplo de saldo inicial

            do {
                System.out.println("1- Datos del Usuario");
                System.out.println("2- Saldo");
                System.out.println("3- Transferencia");
                System.out.println("4- Pago Online");
                System.out.println("5- Salir");
                System.out.print("Ingrese el número de opción que desea: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("--------------------");
                        System.out.println("Datos del Usuario:");
                        System.out.println("Nombre: Trueno");
                        System.out.println("Número de cuenta: 123456789");
                        System.out.println("--------------------");
                        break;
                    case 2:
                        System.out.println("--------------------");
                        System.out.println("Saldo actual: $" + saldo);
                        System.out.println("--------------------");
                        break;
                    case 3:
                        // Aca puedo implementar la lógica de la transferencia
                        System.out.println("--------------------");
                        System.out.println("Opción de Transferencia seleccionada");
                        System.out.println("--------------------");
                        break;
                    case 4:
                        // Aca puedo implementar la lógica del pago online
                        System.out.println("--------------------");
                        System.out.println("Opción de Pago Online seleccionada");
                        System.out.println("--------------------");
                        break;
                    case 5:
                        System.out.println("¡Gracias por utilizar el cajero automático!");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } while (opcion != 5);
        } else {
            System.out.println("Usuario o contraseña incorrecta");
        }
    }
}

