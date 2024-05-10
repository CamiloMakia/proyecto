//---------------------------------------- METODO MAIN --------------------------------------
import java.util.*;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // Usuarios
        String usuario1 = "Administrador", usuario2 = "Operador", password1 = "admin123", password2 = "operador123", validUsuario = "", validPassword = "";
        // Variables
        int valid1 = 0, valid2 = 0, valid3 = 0, valid4 = 0, valid5 = 0, valid6 = 0, valid7 = 0, valid8 = 0, valid9 = 0, valid10=0, valid11=0, valid12=0,valid13=0, valid14=0, valid15=0, valid16=0, valid17=0, valid18=0;
        boolean valid0 = true;
        int idCliente=0, idCompra=0, totalVentas = 0;
        String cliente="";
        // LLamado a la clase de funciones
        Funciones object = new Funciones();
        // Lista de tickets (VIAJES)
        List<Ticket> listaViajes = Funciones.cargarListaViajes();// Cargar la lista de tickets al iniciar el programa
        // Lista de venta de tickets
        List<Ticket> listaRegistrosVentas = new ArrayList<>();
        Funciones.cargarRegistroVentas(listaRegistrosVentas);
        // ---------------------------------------------
        String clear = "\u001b[2J"; // clear
        // --------------------------- INICIO ----------------------------------------------------
        do {
            // LOGIN
            System.out.println(clear);
            System.out.println("╔==========TICKET MANAGER==========╗");
            System.out.println("║          INICIAR SESION          ║");
            System.out.println("║ Usuario:                         ║");
            validUsuario = scanner.nextLine();
            System.out.println("║ Contraseña:                      ║");
            validPassword = scanner.nextLine();
            System.out.println("╚==================================╝");

            if (validUsuario.equals(usuario1) && validPassword.equals(password1)) {
                try{
                    do {
                        // Perfil usuario administrador
                        System.out.println(clear);
                        System.out.println("╔==========MENÚ ADMINISTRADOR==========╗");
                        System.out.println("║1) APARTADO DE VIAJES                 ║");
                        System.out.println("║2) APARTADO DE VENTAS                 ║");
                        System.out.println("║3) SALIR                              ║");
                        System.out.println("╚======================================╝");
                        valid1 = scanner.nextInt();
                        switch (valid1) {

                            case 1: //APARTADO DE VIAJES
                                try{
                                    do {
                                        System.out.println(clear);
                                        Funciones objeto = new Funciones();
                                        Funciones.menuApartadoViajes();
                                        valid3 = scanner.nextInt();
                                        scanner.nextLine();
                                        switch (valid3) {

                                            case 1:
                                                do {
                                                    System.out.println(clear);
                                                    System.out.println("╔===============AGREGAR VIAJE===============╗");
                                                    System.out.println("║ Introduce el ID asignado para el viaje:   ║");
                                                    String idViaje = scanner.next();
                                                    scanner.nextLine();
                                                    System.out.println("║ Introduce el origen:                      ║");
                                                    String origen = scanner.nextLine();
                                                    System.out.println("║ Introduce el destino:                     ║");
                                                    String destino = scanner.nextLine();
                                                    System.out.println("║ Introduce la fecha:                       ║");
                                                    String fecha = scanner.nextLine();
                                                    System.out.println("║ Introduce la hora:                        ║");
                                                    String hora = scanner.nextLine();
                                                    System.out.println("║ Introduce el precio del ticket:           ║");
                                                    int precio = scanner.nextInt();
                                                    scanner.nextLine();
                                                    System.out.println("║ Introduce la matricula del bus:           ║");
                                                    String matriculaBus = scanner.nextLine();
                                                    System.out.println("╚===========================================╝");
                                                    Object ticket = 0;
                                                    Viaje ticketSubGet = (Viaje) ticket;
                                                    Viaje viajes = new Viaje(ticketSubGet.idViaje, origen, destino, fecha, hora, matriculaBus, precio, idCliente, idCompra, cliente);
                                                    listaViajes.add(viajes);
                                                    System.out.println("╔=============================╗");
                                                    System.out.println("║ Viaje añadido correctamente ║");
                                                    System.out.println("║ 1) Añadir otro viaje        ║");
                                                    System.out.println("║ 2) salir                    ║");
                                                    System.out.println("╚=============================╝");
                                                    valid5 = scanner.nextInt();
                                                    switch (valid5) {
                                                        case 1:
                                                            continue;
                                                        case 2:
                                                            break;
                                                    }
                                                } while (valid5 != 2);
                                                Funciones.guardarListaViajes(listaViajes);
                                                break;

                                            case 2:
                                                try{
                                                    do {
                                                        System.out.println(clear);
                                                        System.out.println("╔========ELIMINAR=========╗");
                                                        System.out.println("║1) Eliminar todo         ║\n║2) Eliminar uno          ║\n║3) Salir                 ║");
                                                        System.out.println("╚=========================╝");
                                                        valid6 = scanner.nextInt();
                                                        switch (valid6) {
                                                            case 1:
                                                                try{
                                                                    do {
                                                                        System.out.println("Seguro que desea eliminar todos los viajes?\n1) SI\n2) NO");
                                                                        valid7 = scanner.nextInt();
                                                                        switch (valid7) {
                                                                            case 1:
                                                                                listaViajes.clear();
                                                                                System.out.println("Todos los viajes han sido eliminados correctamente.");
                                                                                Funciones.guardarListaViajes(listaViajes);
                                                                            case 2:
                                                                                valid7=1;
                                                                                break;

                                                                        }
                                                                    }while(valid7!=1);
                                                                    break;
                                                                }catch (InputMismatchException e) {
                                                                    System.out.println("Error: Debes ingresar un número valido.");
                                                                }

                                                            case 2:
                                                                try{
                                                                    scanner.nextLine();
                                                                    System.out.println(clear);
                                                                    System.out.println("╔==============ELIMINAR UN VIAJE================╗");
                                                                    System.out.println("║Ingrese el ID del viaje que desea eliminar:    ║");
                                                                    String idViajeEliminar = scanner.nextLine();
                                                                    System.out.println("╚===============================================╝");
                                                                    Iterator<Ticket> iterator = listaViajes.iterator();
                                                                    while (iterator.hasNext()) {
                                                                        Ticket ticket = iterator.next();
                                                                        if (ticket.getIdViaje() == Integer.parseInt(idViajeEliminar)) {
                                                                            iterator.remove();
                                                                            System.out.println("Eliminado correctamente");
                                                                            scanner.nextLine();
                                                                            break;
                                                                        } else {
                                                                            System.out.println("El viaje indicado no se ha encontrado");
                                                                            continue;
                                                                        }}
                                                                }catch (InputMismatchException e) {
                                                                    System.out.println("Error: Debes ingresar un id valido.");
                                                                }
                                                        }
                                                    } while (valid6 != 3);
                                                    break;
                                                }catch (InputMismatchException e) {
                                                    System.out.println("Error: Debes ingresar un número entero.");
                                                    break;
                                                }

                                            case 3:
                                                try{
                                                    do {
                                                        System.out.println(clear);
                                                        System.out.println("╔==============VIAJES DISPONIBLES================╗");
                                                        System.out.println(clear);
                                                        for (Ticket viaje : listaViajes) {
                                                            System.out.println("------------------------------------------");
                                                            System.out.println("ID: #" + viaje.getIdViaje());
                                                            System.out.println("Origen: " + viaje.getOrigen());
                                                            System.out.println("Destino: " + viaje.getDestino());
                                                            System.out.println("Fecha: " + viaje.getFecha());
                                                            System.out.println("Hora: " + viaje.getHora());
                                                            System.out.println("Bus: " + viaje.getMatriculaBus());
                                                            System.out.println("Precio de viaje: " + viaje.getPrecio() + "$");
                                                            System.out.println("------------------------------------------");
                                                            System.out.println(clear);
                                                        }
                                                        System.out.println("╚================================================╝");
                                                        System.out.println("1) SALIR");
                                                        valid13 = scanner.nextInt();
                                                    } while (valid13 != 1);
                                                    break;
                                                }catch (InputMismatchException e) {
                                                    System.out.println("Error: Debes ingresar un número valido.");
                                                }
                                        }

                                    } while (valid3 != 4);
                                    break;
                                }catch (InputMismatchException e) {
                                    System.out.println("Error: Debes ingresar un número valido.");
                                }

                            case 2:// APARTADO VENTAS
                                try{
                                    do {
                                        System.out.println(clear);
                                        Funciones.menuApartadoVentasAdmin();
                                        valid4 = scanner.nextInt();
                                        switch(valid4){
                                            case 1:
                                                try{
                                                    do {
                                                        System.out.println(clear);
                                                        System.out.println("╔==============VIAJES DISPONIBLES================╗");
                                                        System.out.println(clear);
                                                        for (Ticket tickets : listaViajes) {
                                                            System.out.println("------------------------------------------");
                                                            System.out.println("ID: #" + tickets.getIdViaje());
                                                            System.out.println("Origen: " + tickets.getOrigen());
                                                            System.out.println("Destino: " + tickets.getDestino());
                                                            System.out.println("Fecha: " + tickets.getFecha());
                                                            System.out.println("Hora: " + tickets.getHora());
                                                            System.out.println("Bus: " + tickets.getMatriculaBus());
                                                            System.out.println("Precio de viaje: " + tickets.getPrecio() + "$");
                                                            System.out.println("------------------------------------------");
                                                            System.out.println(clear);
                                                        }
                                                        System.out.println("╚================================================╝");
                                                        System.out.println("1) SALIR");
                                                        valid13 = scanner.nextInt();
                                                    } while (valid13 != 1);
                                                    break;
                                                }catch (InputMismatchException e) {
                                                    System.out.println("Error: Debes ingresar un número valido.");
                                                }
                                            case 2:
                                                try{
                                                    do {
                                                        System.out.println("╔===========REGISTO DE VENTA DE TICKETS=============╗");
                                                        for (Ticket venta : listaRegistrosVentas) {
                                                            System.out.println("---------------- TICKET -----------------");
                                                            System.out.println("Origen: " + venta.getOrigen());
                                                            System.out.println("Destino: " + venta.getDestino());
                                                            System.out.println("Fecha: " + venta.getFecha());
                                                            System.out.println("Hora: " + venta.getHora());
                                                            System.out.println("Bus: " + venta.getMatriculaBus());
                                                            System.out.println("Valor ticket: " + venta.getPrecio() + "$");
                                                            System.out.println("Cliente: " + venta.getCliente());
                                                            System.out.println("ID Cliente: " + venta.getIdCliente());
                                                            System.out.println("ID Compra: " + venta.getIdCompra());
                                                            System.out.println("-----------------------------------------\n");
                                                        }
                                                        System.out.println("╚====================================================╝");
                                                        System.out.println("1) Salir");
                                                        valid14=scanner.nextInt();
                                                    }while(valid14!=1);
                                                    break;
                                                }catch (InputMismatchException e) {
                                                    System.out.println("Error: Debes ingresar un número valido.");
                                                }
                                            case 3:
                                                try{
                                                    do {
                                                        System.out.println(clear);
                                                        System.out.println("╔===========ELIMINAR VENTA DEL REGISTRO=============╗");
                                                        System.out.println("║Ingrese el ID de la venta que desea eliminar:      ║");
                                                        int idVentaEliminar = scanner.nextInt();
                                                        System.out.println("╚===================================================╝");
                                                        boolean ventaEncontrada = false;
                                                        for (Ticket venta : listaRegistrosVentas) {
                                                            if (venta.getIdCompra() == idVentaEliminar) {
                                                                ventaEncontrada = true;
                                                                System.out.println("╔============VENTA ENCONTRADA============╗");
                                                                System.out.println("------------------------------------------");
                                                                System.out.println("Origen: " + venta.getOrigen());
                                                                System.out.println("Destino: " + venta.getDestino());
                                                                System.out.println("Fecha: " + venta.getFecha());
                                                                System.out.println("Hora: " + venta.getHora());
                                                                System.out.println("Bus: " + venta.getMatriculaBus());
                                                                System.out.println("Valor ticket: " + venta.getPrecio() + "$");
                                                                System.out.println("Cliente: " + venta.getCliente());
                                                                System.out.println("ID Cliente: " + venta.getIdCliente());
                                                                System.out.println("ID Compra: " + venta.getIdCompra());
                                                                System.out.println("-----------------------------------------");
                                                                System.out.println("Para confirmar la eliminación, ingrese la contraseña del administrador:");
                                                                String adminPassword = scanner.next();
                                                                if (adminPassword.equals(password1)) {
                                                                    listaRegistrosVentas.remove(venta);
                                                                    System.out.println("Venta eliminada correctamente.");
                                                                } else {
                                                                    System.out.println("Contraseña incorrecta. No se ha eliminado la venta.");
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        if (!ventaEncontrada) {
                                                            System.out.println("No se encontró ninguna venta con el ID proporcionado.");
                                                        }
                                                        System.out.println("¿Desea eliminar otra venta del registro? (1: Sí / 2: No)");
                                                        valid15 = scanner.nextInt();
                                                    } while (valid15 == 1);
                                                    break;
                                                }catch (InputMismatchException e) {
                                                    System.out.println("Error: Debes ingresar un id valido.");
                                                }
                                            case 4:
                                                do {
                                                    System.out.println("╔=======ELIMINAR REGISTROS=========╗");
                                                    System.out.println("            ¡ATENCION!\n¿Esta seguro que desea eliminar todos \nlos regitros?\nPara continuarcon la eliminacion debe\nintroducir su contraseña de administrador:");
                                                    String validElim = scanner.next();
                                                    scanner.nextLine();
                                                    if (validElim.equals(password1)) {
                                                        listaRegistrosVentas.clear();
                                                        System.out.println("Los registros se han eliminado correctamente");
                                                        Funciones.guardarRegistroVentas(listaRegistrosVentas);
                                                        valid16 = 0;
                                                    } else {
                                                        System.out.println("Contraseña incorrecta");
                                                        valid16 = 0;
                                                    }
                                                } while (valid16 == 1);
                                                break;
                                            case 5:
                                                try{
                                                    do {
                                                        System.out.println("------------ Utilidades ------------");
                                                        for (Ticket venta : listaRegistrosVentas) {
                                                            totalVentas += venta.getPrecio();}
                                                        for (Ticket utilidades : listaRegistrosVentas){
                                                            System.out.println("--------------------------------------------------");
                                                            System.out.println("Cliente: "+utilidades.getCliente()+", Venta: "+utilidades.getPrecio());
                                                        }
                                                        System.out.println("--------------------------------------------------");
                                                        System.out.println("El total de las utilidades por ventas es: " + totalVentas + "$");
                                                        System.out.println("--------------------------------------------------");
                                                        System.out.println("1) Salir");
                                                        totalVentas=0;
                                                        valid17 = scanner.nextInt();
                                                    } while(valid17!=1);
                                                    break;
                                                }catch (InputMismatchException e) {
                                                    System.out.println("Error: Debes ingresar un número valido.");
                                                }

                                        }
                                    } while (valid4 != 6);
                                    break;
                                }catch (InputMismatchException e) {
                                    System.out.println("Error: Debes ingresar un número valido.");
                                }

                        }

                    } while (valid1 != 3);
                }catch (InputMismatchException e) {
                    System.out.println("Error: Debes ingresar un número valido");
                }


            } else if (validUsuario.equals(usuario2) && validPassword.equals(password2)) {

                try{
                    do {
                        // Perfil usuario operador
                        System.out.println(clear);
                        Funciones.menuApartadoVentas();
                        valid2 = scanner.nextInt();
                        switch (valid2) {
                            case 1: // Vender ticket
                                try {
                                    do {
                                        System.out.println(clear);
                                        System.out.println("╔==============VENTA DE TICKETS==============╗");
                                        System.out.println("║Ingrese el ID del ticket que desea comprar: ║");
                                        System.out.println("╚============================================╝");
                                        String idTicketCompra = scanner.next();
                                        for (Ticket ticket : listaViajes) {
                                            if (ticket.getIdViaje() == Integer.parseInt(idTicketCompra)) {
                                                System.out.println(" El ticket que desea comprar tiene un valor de: " + ticket.getPrecio() + "$\n Si desea confirmar la compra introduzca su contraseña operador");
                                                String validPwd = scanner.next();
                                                scanner.nextLine();
                                                if (validPwd.equals(password2)) {
                                                    System.out.println("Introduzca el nombre del cliente:");
                                                    cliente = scanner.nextLine();
                                                    System.out.println("Introduzca el ID del cliente");
                                                    idCliente = scanner.nextInt();
                                                    scanner.nextLine();
                                                    idCompra = random.nextInt(999999);
                                                    ticket.setCliente(cliente);
                                                    ticket.setIdCliente(idCliente);
                                                    ticket.setIdCompra(idCompra);
                                                    System.out.println("Compra exitosa!");
                                                    System.out.println(clear);
                                                    System.out.println("--------------- TICKET ----------------");
                                                    System.out.println("Origen: " + ticket.getOrigen());
                                                    System.out.println("Destino: " + ticket.getDestino());
                                                    System.out.println("Fecha: " + ticket.getFecha());
                                                    System.out.println("Hora: " + ticket.getHora());
                                                    System.out.println("Bus: " + ticket.getMatriculaBus());
                                                    System.out.println("Valor ticket: " + ticket.getPrecio() + "$");
                                                    System.out.println("Cliente: " + ticket.getCliente());
                                                    System.out.println("ID Cliente: " + ticket.getIdCliente());
                                                    System.out.println("ID Compra: " + ticket.getIdCompra());
                                                    System.out.println("-----------------------------------------");
                                                    Viaje ticketSubGet = (Viaje) ticket;
                                                    Ticket ticketVendido = new Ticket(ticketSubGet.getIdViaje(), ticket.getOrigen(), ticket.getDestino(),
                                                            ticket.getFecha(), ticket.getHora(), ticket.getMatriculaBus(), ticket.getPrecio(),
                                                            idCliente, idCompra, cliente);
                                                    listaRegistrosVentas.add(ticketVendido);
                                                    Funciones.guardarRegistroVentas(listaRegistrosVentas);
                                                    valid2 = 1;

                                                } else {
                                                    System.out.println("Contraseña incorrecta");
                                                    continue;
                                                }
                                            }
                                        }

                                    } while (valid2 != 1);
                                    break;
                                }catch (InputMismatchException e) {
                                    System.out.println("Error: Debes ingresar un número valido.");
                                }

                            case 2:
                                try {
                                    do {
                                        System.out.println(clear);
                                        System.out.println("╔==============VIAJES DISPONIBLES================╗");
                                        System.out.println(clear);
                                        for (Ticket tickets : listaViajes) {
                                            System.out.println("------------------------------------------");
                                            System.out.println("ID: #" + tickets.getIdViaje());
                                            System.out.println("Origen: " + tickets.getOrigen());
                                            System.out.println("Destino: " + tickets.getDestino());
                                            System.out.println("Fecha: " + tickets.getFecha());
                                            System.out.println("Hora: " + tickets.getHora());
                                            System.out.println("Bus: " + tickets.getMatriculaBus());
                                            System.out.println("Precio de viaje: " + tickets.getPrecio() + "$");
                                            System.out.println("------------------------------------------");
                                            System.out.println(clear);
                                        }
                                        System.out.println("╚================================================╝");
                                        System.out.println("1) SALIR");
                                        valid9 = scanner.nextInt();
                                    } while (valid9 != 1);
                                    break;
                                }catch (InputMismatchException e) {
                                    System.out.println("Error: Debes ingresar un número valido.");
                                }

                            case 3:
                                try {
                                    do {
                                        System.out.println("------------ REGISTO DE VENTA DE TICKETS --------------");
                                        for (Ticket venta : listaRegistrosVentas) {
                                            System.out.println("---------------- TICKET -----------------");
                                            System.out.println("Origen: " + venta.getOrigen());
                                            System.out.println("Destino: " + venta.getDestino());
                                            System.out.println("Fecha: " + venta.getFecha());
                                            System.out.println("Hora: " + venta.getHora());
                                            System.out.println("Bus: " + venta.getMatriculaBus());
                                            System.out.println("Valor ticket: " + venta.getPrecio() + "$");
                                            System.out.println("Cliente: " + venta.getCliente());
                                            System.out.println("ID Cliente: " + venta.getIdCliente());
                                            System.out.println("ID Compra: " + venta.getIdCompra());
                                            System.out.println("-----------------------------------------\n");
                                        }
                                        System.out.println("1) Salir");
                                        valid11=scanner.nextInt();
                                    }while(valid11!=1);
                                    break;
                                }catch (InputMismatchException e) {
                                    System.out.println("Error: Debes ingresar un número valido.");
                                }

                            case 4:
                                try {
                                    do {
                                        System.out.println(clear);
                                        System.out.println("╔============ELIMINAR VENTA DEL REGISTRO============╗");
                                        System.out.println("║ Ingrese el ID de la venta que desea eliminar:     ║");
                                        int idVentaEliminar = scanner.nextInt();
                                        System.out.println("╚===================================================╝");
                                        boolean ventaEncontrada = false;
                                        for (Ticket venta : listaRegistrosVentas) {
                                            if (venta.getIdCompra() == idVentaEliminar) {
                                                ventaEncontrada = true;
                                                System.out.println("╔============VENTA ENCONTRADA============╗");
                                                System.out.println("------------------------------------------");
                                                System.out.println("Origen: " + venta.getOrigen());
                                                System.out.println("Destino: " + venta.getDestino());
                                                System.out.println("Fecha: " + venta.getFecha());
                                                System.out.println("Hora: " + venta.getHora());
                                                System.out.println("Bus: " + venta.getMatriculaBus());
                                                System.out.println("Valor ticket: " + venta.getPrecio() + "$");
                                                System.out.println("Cliente: " + venta.getCliente());
                                                System.out.println("ID Cliente: " + venta.getIdCliente());
                                                System.out.println("ID Compra: " + venta.getIdCompra());
                                                System.out.println("-----------------------------------------");
                                                System.out.println("Para confirmar la eliminación, ingrese la contraseña del administrador:");
                                                String adminPassword = scanner.next();
                                                if (adminPassword.equals(password1)) {
                                                    listaRegistrosVentas.remove(venta);
                                                    System.out.println("Venta eliminada correctamente.");
                                                } else {
                                                    System.out.println("Contraseña incorrecta. No se ha eliminado la venta.");
                                                }
                                                break;
                                            }
                                        }
                                        if (!ventaEncontrada) {
                                            System.out.println("No se encontró ninguna venta con el ID proporcionado.");
                                        }
                                        System.out.println("¿Desea eliminar otra venta del registro? (1: Sí / 2: No)");
                                        valid10 = scanner.nextInt();
                                    } while (valid10 == 1);
                                    break;
                                }catch (InputMismatchException e) {
                                    System.out.println("Error: Debes ingresar un número valido.");
                                }

                            case 5:
                                do {
                                    System.out.println("╔===========ELIMINAR REGISTROS=============╗");
                                    System.out.println("                ¡ATENCION!\n¿Esta seguro que desea eliminar todos \nlos regitros?\nPara continuarcon la eliminacion debe\nintroducir su contraseña de administrador:");
                                    String validElim = scanner.next();
                                    scanner.nextLine();
                                    if (validElim.equals(password1)) {
                                        listaRegistrosVentas.clear();
                                        System.out.println("Los registros se han eliminado correctamente");
                                        Funciones.guardarRegistroVentas(listaRegistrosVentas);
                                        valid8 = 0;
                                    } else {
                                        System.out.println("Contraseña incorrecta");
                                        valid8 = 0;
                                    }
                                } while (valid8 == 1);
                                break;

                            case 6:
                                try {
                                    do {
                                        System.out.println("------------ Utilidades ------------");
                                        for (Ticket venta : listaRegistrosVentas) {
                                            totalVentas += venta.getPrecio();}
                                        for (Ticket utilidades : listaRegistrosVentas){
                                            System.out.println("--------------------------------------------------");
                                            System.out.println("Cliente: "+utilidades.getCliente()+", Venta: "+utilidades.getPrecio());
                                        }
                                        System.out.println("--------------------------------------------------");
                                        System.out.println("El total de las utilidades por ventas es: " + totalVentas + "$");
                                        System.out.println("--------------------------------------------------");
                                        System.out.println("1) Salir");
                                        valid12 = scanner.nextInt();
                                    } while(valid12!=1);
                                    totalVentas=0;
                                    break;
                                }catch (InputMismatchException e) {
                                    System.out.println("Error: Debes ingresar un número valido.");
                                }

                        }
                    }while (valid2 != 7) ;
                }catch (InputMismatchException e) {
                    System.out.println("Error: Debes ingresar un número valido.");
                }

            }else if (validUsuario.equals("salir")) {
                break;
            }else {
                System.out.println(clear);
                System.out.println("          ATENCION");
                System.out.println("Usuario o contraseña incorrectos");
                System.out.println("Por favor intente nuevamente");
            }

        } while (valid0);
    }
}