import java.util.Scanner;

import java.util.Date;

public class AgendaLucia {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int numContacto = 0;
        String[] nombres = new String[10];
        String[] telefono = new String[10];
        String[] email = new String[10];

        nombres[0] = "Lucía";
        nombres[1] = "Daniel";
        nombres[2] = "Lucía 3";
        nombres[3] = "Lucía 4";

        telefono[0] = "6343471987";
        telefono[1] = "1234";
        telefono[2] = "4321";
        telefono[3] = "1212";

        email[0] = "Hola@gmail.com";
        email[1] = "Hola2@gmail.com";
        email[2] = "Hola3@gmail.com";
        email[3] = "Hola4@gmail.com";



        String[] enero = new String[10];
        String[] febrero = new String[10];
        String[] marzo = new String[10];
        String[] abril = new String[10];
        String[] mayo = new String[10];
        String[] junio = new String[10];
        String[] julio = new String[10];
        String[] agosto = new String[10];
        String[] septiembre = new String[10];
        String[] octubre = new String[10];
        String[] noviembre = new String[10];
        String[] diciembre = new String[10];

        int opc = 0;
        boolean agrego = false;

        Date fecha1 = new Date();
        int opcionesDePresentacion;
        char reiniciar = 'N';

        do {
            System.out.println(presentacionAgenda());
            opcionesDePresentacion = teclado.nextInt();
            switch (opcionesDePresentacion) {
                case 1: // Eventos
                    int eventos;
                    do {
                        System.out.println(eventosOpciones());
                        eventos = teclado.nextInt();
                        switch (eventos) {
                            case 1: // Agregar evento
                                System.out.println("En que mes desea agregar el evento?");
                                int mesesito = teclado.nextInt();
                                teclado.nextLine();
                                if (mesesito == 1) {
                                    agregarEvento(enero);
                                }
                                if (mesesito == 2) {
                                    agregarEvento(febrero);
                                }
                                if (mesesito == 3) {
                                    agregarEvento(marzo);
                                }
                                if (mesesito == 4) {
                                    agregarEvento(abril);
                                }
                                if (mesesito == 5) {
                                    agregarEvento(mayo);
                                }
                                if (mesesito == 6) {
                                    agregarEvento(junio);
                                }
                                if (mesesito == 7) {
                                    agregarEvento(julio);
                                }
                                if (mesesito == 8) {
                                    agregarEvento(agosto);
                                }
                                if (mesesito == 9) {
                                    agregarEvento(septiembre);
                                }
                                if (mesesito == 10) {
                                    agregarEvento(octubre);
                                }
                                if (mesesito == 11) {
                                    agregarEvento(noviembre);
                                }
                                if (mesesito == 12) {
                                    agregarEvento(diciembre);
                                }
                                break;// Fin del case 1 - "Agregar evento" en eventos

                            case 2: // Eliminar evento
                                System.out.println("En que mes desea eliminar los eventos?");
                                int mesesito2 = teclado.nextInt();
                                teclado.nextLine();
                                if (mesesito2 == 1) {
                                    eliminarEventos(enero);
                                }
                                if (mesesito2 == 2) {
                                    eliminarEventos(febrero);
                                }
                                if (mesesito2 == 3) {
                                    eliminarEventos(marzo);
                                }
                                if (mesesito2 == 4) {
                                    eliminarEventos(abril);
                                }
                                if (mesesito2 == 5) {
                                    eliminarEventos(mayo);
                                }
                                if (mesesito2 == 6) {
                                    eliminarEventos(junio);
                                }
                                if (mesesito2 == 7) {
                                    eliminarEventos(julio);
                                }
                                if (mesesito2 == 8) {
                                    eliminarEventos(agosto);
                                }
                                if (mesesito2 == 9) {
                                    eliminarEventos(septiembre);
                                }
                                if (mesesito2 == 10) {
                                    eliminarEventos(octubre);
                                }
                                if (mesesito2 == 11) {
                                    eliminarEventos(noviembre);
                                }
                                if (mesesito2 == 12) {
                                    eliminarEventos(diciembre);
                                }
                                break; // Fin del case 2 - "Eliminar evento" en eventos
                            case 3: // Ver evento
                                do {
                                    int mes;
                                    System.out.println("Ver eventos");
                                    System.out.println("Selecciona el mes del año:");
                                    mes = teclado.nextInt();
                                    if (mes <= 12) {
                                        switch (mes) {
                                            case 1:
                                                System.out.println("Eventos de Enero");
                                                    verEventos(enero);
                                                break;
                                            case 2:
                                                System.out.println("Eventos de Febrero");
                                                verEventos(febrero);
                                                break;

                                            case 3:
                                                System.out.println("Eventos de Marzo");
                                                verEventos(marzo);
                                                break;

                                            case 4:
                                                System.out.println("Eventos de Abril");
                                                verEventos(abril);
                                                break;

                                            case 5:
                                                System.out.println("Eventos de Mayo");
                                                verEventos(mayo);
                                                break;

                                            case 6:
                                                System.out.println("Eventos de Junio");
                                                verEventos(junio);
                                                break;

                                            case 7:
                                                System.out.println("Eventos de Julio");
                                                verEventos(julio);
                                                break;

                                            case 8:
                                                System.out.println("Eventos de Agosto");
                                                verEventos(agosto);
                                                break;

                                            case 9:
                                                System.out.println("Eventos de Septiembre");
                                                verEventos(septiembre);
                                                break;

                                            case 10:
                                                System.out.println("Eventos de Octubre");
                                                verEventos(octubre);
                                                break;

                                            case 11:
                                                System.out.println("Eventos de Noviembre");
                                                verEventos(noviembre);
                                                break;

                                            case 12:
                                                System.out.println("Eventos de Diciembre");
                                                verEventos(diciembre);
                                                break;
                                        }// Fin del switch de los meses
                                    } // Fin del if de los meses
                                } while (reiniciar != 'N');
                                System.out.println("Regresando al menu anterior...");
                                break; // Fin del case 3 - "Ver evento" en eventos
                        }
                    } while (eventos != 4);
                    break; // Fin del case 1-"Eventos" en opcionesDePresentacion

                case 2: // Contactos
                    int opc_contacto;
                    do {
                        System.out.println(contactosOpciones());
                        opc_contacto = teclado.nextInt();

                        if (opc_contacto == 1) {
                            boolean respuesta = agregarContacto(nombres,telefono,email,numContacto);

                            if (respuesta) {
                                numContacto++;
                                System.out.println(numContacto);
                            }
                        }
                        if (opc_contacto == 2) {
                            System.out.println("Ingrese num. de contacto a borrar: ");
                            int num_borrar = teclado.nextInt();

                            limpiarContacto(nombres,telefono,email,num_borrar);

                            System.out.println("Numero borrado.");
                        }
                        if (opc_contacto == 3) {
                            verContactos(nombres,telefono,email,numContacto);
                        }
                    } while (opc_contacto != 4);
                    System.out.println("Regresando al menu anterior...");
                    break; // Fin del case 2 - "Contactos" en opcionesDePresentacion

                case 3: // Buscador
                    int buscador;
                    do {
                        System.out.println(buscadorOpciones());
                        buscador = teclado.nextInt();
                        teclado.nextLine();

                        if (buscador == 1) {
                            System.out.println("Nombre de quién busca: ");
                            String nombre = teclado.nextLine();
                            buscarContactoNombre(nombre, nombres, telefono, email);
                        }

                    } while (buscador != 3);
                    System.out.println("Regresando al menu anterior...");
                    break; // Fin del case 3 - "Buscador" en opcionesDePresentacion
            }
        } while (opcionesDePresentacion != 4);

        Date fecha2 = new Date();
        System.out.println(
                "El programa se ejecuto durante " + (fecha2.getTime() - fecha1.getTime()) / 1000 + " segundos.");


        // nombres[0] = "Karla";
        // telefono[0] = "6331122959";
        // email[0] = "karlaelias@gmail.com";

        // nombres[1] = "Gabriel";
        // telefono[1] = "6341126569";
        // email[1] = "gabrielfig_@gmail.com";

        // nombres[2] = "Ubaldo";
        // telefono[2] = "6331072477";
        // email[2] = "bayonenas_ib@gmail.com";

        // nombres[3] = "Ubaldo";
        // telefono[3] = "6331072477";
        // email[3] = "bayonenas_ib@gmail.com";

        // nombres[4] = "noecito";
        // telefono[4] = "6456321317";
        // email[4] = "ñoe_ñuñez@gmail.com";

        // nombres[5] = "Kevin";
        // telefono[5] = "6331056679";
        // email[5] = "kevinsito_uwu@gmail.com";

        // nombres[6] = "fran";
        // telefono[6] = "6875454666";
        // email[6] = "fran_minito@gmail.com";


    }

    private static void buscarContactoNombre(String nombre, String[] nombres, String[] telefono, String[] email) {
        System.out.println("  ──── Ver Contacto: ──── ");
        for (int i = 0; i <= nombres.length; i++)
        {
            if (nombres[i] == null) {
                break;
            } else if (nombres[i].equals(nombre)) {
                System.out.println("Nombre: " + nombres[i]);
                System.out.println("Telefono: " + telefono[i]);
                System.out.println("Email: " + email[i]);
            } else {

            }
        }
    }

    public static void verEventos (String[] mes) {
        for (int i = 0; i < mes.length; i++) {
            if (mes[i] != null) {
                System.out.println(mes[i]);
            } else {
                break;
            }
        }
    }

    private static void eliminarEventos(String[] mes) {
        for (int i = 0; i <= mes.length; i++) {
            if (mes[i] == null) {
                break;
            } else {
                mes[i] = null;
            }
        }
    }

    private static void agregarEvento(String [] mes) {
            for (int i = 0; i <= mes.length; i++) {
                if (mes[i] == null) {
                    System.out.println("Ingrese el evento: ");
                    String eventojj = teclado.nextLine();
                    mes[i] = eventojj;
                    break;
                } else {

                }
            }
    }



    static void limpiarContacto(String nombres[], String telefonos[], String emails[], int limpiarContacto) {
        System.out.println("Limpia contacto " + limpiarContacto);
        nombres[limpiarContacto] = null;
        telefonos[limpiarContacto] = null;
        emails[limpiarContacto] = null;

    }

    static void modificarContacto(String nombres[], String telefonos[], String emails[], int numeroContacto) {
        System.out.println("Dame nombre: ");
        nombres[numeroContacto] = teclado.nextLine();
        System.out.println("Dame telefono: ");
        telefonos[numeroContacto] = teclado.nextLine();
        System.out.println("Dame el correo: ");
        emails[numeroContacto] = teclado.nextLine();
    } // modificar contacto

    static boolean agregarContacto(String[] nombres, String[] telefonos, String[] emails, int numContacto) {
        String nombre, email, telefono;
        boolean respuesta = false;
        teclado.nextLine();
        System.out.println("ingrese el nombre");
        nombre = teclado.nextLine();
        System.out.println("Ingrese el telefono");
        telefono = teclado.nextLine();
        System.out.println("Ingrese el email");
        email = teclado.nextLine();

        if (nombres.length > numContacto) {
            nombres[numContacto] = nombre;
            telefonos[numContacto] = telefono;
            emails[numContacto] = email;
            respuesta = true;
        }

        return respuesta;
    }

    static String presentacionAgenda() {
        String textoDePresentacion = " ";
        textoDePresentacion += "Bienvenido a la Agenda \n";
        textoDePresentacion += "Programador: Losi Who \n";
        textoDePresentacion += "├──────────── * Menú * ────────────┤ \n";
        textoDePresentacion += "├────────── 1. Eventos ──────────┤\n";
        textoDePresentacion += "├────────── 2. Contactos ─────────┤\n";
        textoDePresentacion += "├────────── 3. Buscador ──────────┤ \n";
        textoDePresentacion += "├────────── 4. Cerrar ──────────┤ \n";
        textoDePresentacion += " ** SELECCIONA UNA OPCION **";
        return textoDePresentacion;
    }

    static String eventosOpciones() {
        String textoDeEventos = " ";
        textoDeEventos += " *** Evento *** \n";
        textoDeEventos += "├──────────── 1. Agregar Evento ──────────┤\n";
        textoDeEventos += "├──────────── 2. Borrar Evento ──────────┤ \n";
        textoDeEventos += "├──────────── 3. Ver Evento ──────────┤ \n";
        textoDeEventos += "├──────────── 4. Regresar al Menu ──────────┤ \n";
        textoDeEventos += "SELECCIONA UNA OPCION";
        return textoDeEventos;
    }

    static String contactosOpciones() {
        String textoDeContactos = " ";
        textoDeContactos += " *** Contacto *** \n";
        textoDeContactos += "├──────────── 1. Agregar Contacto ──────────┤\n";
        textoDeContactos += "├──────────── 2. Borrar Contacto ───────────┤ \n";
        textoDeContactos += "├──────────── 3. Ver Contacto ──────────────┤ \n";
        textoDeContactos += "├──────────── 4. Regresar al Menu ──────────┤ \n";
        textoDeContactos += "SELECCIONA UNA OPCION";
        return textoDeContactos;
    }

    static String buscadorOpciones() {
        String textoDeBuscador = " ";
        textoDeBuscador += " *** Buscador *** \n";
        textoDeBuscador += "├──────────── 1. Buscar contacto por nombre ──────────┤\n";
        textoDeBuscador += "├──────────── 2. Buscar Evento Fecha ──────────┤\n";
        textoDeBuscador += " SELECCIONA UNA OPCION";
        return textoDeBuscador;
    }

    static void verContactos(String[] nombres, String[] telefonos, String[] email, int numContacto) {
        System.out.println("  ──── Ver Contacto: ──── ");
        for (int i = 0; i <= nombres.length; i++)
        {
            if (nombres[i] == null) {
                break;
            } else {
                System.out.println("-NumContacto: " + i);
                System.out.println("-Nombre: " + nombres[i]);
                System.out.println("-Telefono: " + telefonos[i]);
                System.out.println("-Email: " + email[i]);
                System.out.println("");
            }
        }
    }
}
