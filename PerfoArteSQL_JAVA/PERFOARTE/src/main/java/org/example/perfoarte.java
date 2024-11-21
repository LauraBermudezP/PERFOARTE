package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class perfoarte {
    public static void main(String[] args) {
        Integer opcionMenuP;
        Boolean menuPrincipal = true;
        Scanner leerteclado = new Scanner(System.in);

        System.out.println(" ");
        System.out.println(" - - - - - BIENVENIDO A PERFOARTE PROJECT - - - - - ");
        System.out.println(" ");
        System.out.println(" Un proyecto de tatuadores y piercers que nace de la pasión por explorar y perfeccionar diversas técnicas y estilos del tatuaje.");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ¿En qué podemos ayudarte?");
        System.out.println(" ");

        do {
            System.out.println(" ");
            System.out.println(" Menú:");
            System.out.println(" 1. Mi cuenta");
            System.out.println(" 2. Agendar una asesoría gratuita");
            System.out.println(" 3. Nuestros artistas");
            System.out.println(" 4. Trabaja con nosotros");
            System.out.println(" 5. Sobre nosotros");
            System.out.println(" 6. Hablar con un asesor");
            System.out.println(" 0. Cerrar menú");
            System.out.println(" ");
            System.out.print(" Digita una opción según tu necesidad: ");
            opcionMenuP = leerteclado.nextInt();
            leerteclado.nextLine();

            switch (opcionMenuP) {
                case 1:
                    Integer miCuenta;
                    Boolean menuMiCuenta = true;

                    while (menuMiCuenta) {
                        System.out.println(" ");
                        System.out.println(" | MI CUENTA | ");
                        System.out.println(" ");
                        System.out.println(" 1. Iniciar sesión");
                        System.out.println(" 2. Recuperar contraseña");
                        System.out.println(" 3. Registrarse");
                        System.out.println(" 0. Cerrar menú");
                        miCuenta = leerteclado.nextInt();
                        leerteclado.nextLine();
                        switch (miCuenta) {
                            case 1:
                                String usuarioCorreo;
                                String usuarioContraseña;
                                System.out.println(" ");
                                System.out.print(" ¬ Correo electrónico: ");
                                usuarioCorreo = leerteclado.nextLine();
                                System.out.println(" ");
                                System.out.print(" ¬ Contraseña: ");
                                usuarioContraseña = leerteclado.nextLine();
                                System.out.println(" ");
                                System.out.println(" Acceso concedido...");
                                System.out.println(" Bienvenido :)");
                                break;
                            case 2:
                                System.out.println(" ");
                                System.out.println(" ¿Has olvidado tu contraseña?");
                                System.out.println(" ");
                                System.out.print(" Digita tu correo electrónico registrado y te enviaremos un código de recuperación:");
                                String correoRecuperacion = leerteclado.nextLine();
                                System.out.println(" ");
                                System.out.println(" Te hemos enviado un código de recuperación a tu correo " + correoRecuperacion);
                                System.out.println(" Digita aquí de * 6 dígitos * que recibiste (el código es: 123456)");
                                String codigoRecuperacion = leerteclado.nextLine();
                                System.out.println(" ");
                                System.out.println(" Código verificado correctamente.");
                                System.out.println(" ¬ Nueva contraseña: ");
                                String nuevaContraseña = leerteclado.nextLine();
                                System.out.println(" ");
                                if (codigoRecuperacion.equals("123456")) {
                                    System.out.println(" ");
                                    System.out.println(" Contraseña restablecida exitosamente :)");
                                    System.out.println(" ");
                                } else {
                                    System.out.println(" ");
                                    System.out.println(" Código de recuperación incorrecto.");
                                }
                                break;
                            case 3:
                                System.out.println(" ");
                                System.out.println(" Formulario de Registro:");
                                System.out.println(" ");
                                System.out.println(" ¬ Nombre completo:");
                                System.out.println(" ");
                                String nombreUsuario = leerteclado.nextLine();
                                System.out.println(" ¬ Número de documento:");
                                System.out.println(" ");
                                String numeroDocumento = leerteclado.nextLine();
                                System.out.println(" ¬ Número de teléfono:");
                                System.out.println(" ");
                                String numeroTelefono = leerteclado.nextLine();
                                System.out.println(" ¬ Correo electrónico (usuario):");
                                System.out.println(" ");
                                String correoElectronico = leerteclado.nextLine();
                                System.out.println(" ¬ Contraseña (máximo 10 dígitos):");
                                System.out.println(" ");
                                String contraseña = leerteclado.nextLine();
                                System.out.println(" ");
                                System.out.println(" ");
                                System.out.println(" Validando datos...");
                                System.out.println(" ");
                                System.out.println(" ");
                                System.out.println(" Registro exitoso!!");
                                System.out.println(" Tu cuenta ha sido creada. Ahora podrás disfrutar de los descuentos especiales que tenemos para nuestros usuarios.. ");
                                System.out.println(" ");
                                break;
                            case 0: {
                                menuMiCuenta = false;
                                break;
                            }
                            default:
                                System.out.println(" ");
                                System.out.println(" OPCIÓN INVÁLIDA");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println(" | AGENDAR ASESORÍA GRATUITA | ");
                    System.out.println(" ");
                    System.out.println(" Déjanos tus datos y un asesor se comunicará contigo lo antes posible:");
                    System.out.println(" ");
                    System.out.println(" ¿Cuál es tu nombre completo?");
                    String nombreCompleto = leerteclado.nextLine();
                    System.out.println(" ");
                    System.out.println(" ¿Cuál es tu número de contacto?");
                    String numeroContacto = leerteclado.nextLine();
                    System.out.println(" ");
                    System.out.println(" ¿Cuál es tu correo electrónico?");
                    String correoElectro = leerteclado.nextLine();
                    System.out.println(" ");
                    System.out.println(" ¿En qué modalidad preferirías recibir tu asesoría?");
                    System.out.println(" V = Virtual(vía Whatsapp) | P = Presencial | T = Telefónica");
                    String asesoriaModalidad = leerteclado.nextLine();
                    System.out.println(" ");
                    System.out.println(" Nuestros horarios son: ");
                    System.out.println(" ");
                    System.out.println(" Semana: 9AM - 9PM");
                    System.out.println(" Domingos y Festivos: 10AM - 8PM");
                    System.out.println(" ");
                    System.out.println(" ¿En qué fecha u horario te gustaría recibir tu asesoría?");
                    String horarioAsesoria = leerteclado.nextLine();
                    System.out.println(" ");
                    System.out.println(" Tu asesoría se ha agendado con éxito!");
                    System.out.println(" Uno de nuestros asesores se estará comunicando contigo próximamente para más información...");
                    System.out.println(" ");
                    break;
                case 3:
                    Boolean menuArtistas = true;
                    System.out.println(" ");
                    System.out.println(" | NUESTROS ARTISTAS | ");
                    System.out.println(" ");
                    System.out.println(" Nuestros artistas del tatuaje y piercers son profesionales altamente calificados.");
                    System.out.println(" ");

                    while (menuArtistas) {
                        System.out.println(" ");
                        System.out.println(" Conocer más...");
                        System.out.println(" 1. MIGUEL 'STORM' RENDÓN");
                        System.out.println(" 2. SARA ACEVEDO");
                        System.out.println(" 3. DANILO 'TINTO' VILLEGAS");
                        System.out.println(" 4. ALEJANDRO RIVAS");
                        System.out.println(" 0. Cerrar menú de artistas");
                        Integer opcionArtistas = leerteclado.nextInt();

                        switch (opcionArtistas){
                            case 1:
                                System.out.println(" ");
                                System.out.println(" 1: Miguel Ángel Rendón Restrepo");
                                System.out.println(" Especialidad: Tatuador");
                                System.out.println(" Soy Miguel Rendón, tatuador y estudiante de Diseño Industrial. Comencé mi proceso de aprendizaje alrededor de 9 años atrás. He tenido la oportunidad de trabajar en diferentes estudios como Calvo tattoo, Classic love, Mezcal tattoo y Sailors N' Mermaids. He estudiado varios estilos del tattoo que me gustan muchísimo como el tradicional, neotradicional y realismo, estoy seguro de que juntos haremos una gran obra de arte en tu piel.");
                                break;
                            case 2:
                                System.out.println(" ");
                                System.out.println(" 2: Sara Acevedo Gutierrez");
                                System.out.println(" Especialidad: Tatuadora & Piercer");
                                System.out.println(" Soy Sara, y desde joven he experimentado diversas técnicas artísticas. Siempre he sentido una gran curiosidad y pasión por el tatuaje, hasta que mi vida dio un gran giro. Soy tatuadora desde el 2019. Me encanta crear impresionantes trabajos en blackwork y piezas de colores vibrantes con un enfoque en el estilo neotradicional. Me gusta inspirarme en elementos de la naturaleza, los animales, lo esotérico y lo místico. Mi trabajo refleja una profunda conexión con el mundo que nos rodea. Me gusta desarrollar piezas únicas que logren captar la idea principal del cliente.");
                                break;
                            case 3:
                                System.out.println(" ");
                                System.out.println(" 3: Danilo Villegas Florez");
                                System.out.println(" Especialidad: Tatuador");
                                System.out.println(" Mi nombre es Danilo pero me dicen 'tinto' por mi pasión tanto por la tinta como por el café. Tatuo en la ciudad de Medellín desde hace 7 años, mi estilo principal es el realismo en blanco y negro, y a parte del tatuaje, dedico gran parte de mi trabajo a ilustrar en medios análogos, tales como la acuarela, los pigmentos y acrílicos.");
                                break;
                            case 4:
                                System.out.println(" ");
                                System.out.println(" 4: Diego Alejandro Rivas Pineda");
                                System.out.println(" Especialidad: Tatuador & Piercer");
                                System.out.println(" Soy un tatuador de la ciudad de Medellín, Colombia, que se ha dedicado a la ilustración en diferentes formatos, tomando como referencia estilos de diferentes épocas del arte, mezclándolo con las técnicas del tatuaje.");
                                break;
                            case 0:
                                menuArtistas = false;
                                break;
                            default:
                                System.out.println(" OPCIÓN INCORRECTA!");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println(" | TRABAJA CON NOSOTROS | ");
                    System.out.println(" ");
                    System.out.println(" Deja aquí tus datos personales y tu solicitud tendrá respuesta prontamente:");
                    System.out.println(" ");
                    System.out.println(" ¬ Nombre completo:");
                    System.out.println(" ");
                    String nombrePostulante = leerteclado.nextLine();
                    System.out.println(" ¬ Número de documento:");
                    System.out.println(" ");
                    String numeroDocumentoPost = leerteclado.nextLine();
                    System.out.println(" ¬ Número de teléfono:");
                    System.out.println(" ");
                    String numeroTelefonoPost = leerteclado.nextLine();
                    System.out.println(" ¬ Correo electrónico:");
                    System.out.println(" ");
                    String correoElectronicoPost = leerteclado.nextLine();
                    System.out.println(" ¬ Profesión/Dedicación:");
                    String dedicacionPostulante = leerteclado.nextLine();
                    System.out.println(" ");
                    System.out.println(" Formulario de postulación guardado con éxito!!");
                    System.out.println(" Nos pondremos en contacto contigo pronto.");
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println(" ");
                    System.out.println(" | SOBRE NOSOTROS | ");
                    System.out.println(" ");
                    System.out.println(" *** PerfoArte Project ***");
                    System.out.println(" ¿Quiénes somos?");
                    System.out.println(" ");
                    System.out.println(" PerfoArte es un proyecto de artistas tatuadores y piercers que nace de la pasión por explorar y perfeccionar diversas técnicas y estilos del tatuaje. Inspirados en el mundo de la ilustración, la pintura y el arte en general, buscamos innovar en cada trazo, integrando procedimientos artísticos de distintas disciplinas para ofrecer diseños únicos y personalizados. Te invitamos a sumergirte en este espacio creativo, donde encontrarás ilustraciones exclusivas, un enfoque artístico integral, un cálido y atento servicio y, por supuesto, mucha tinta.");
                    break;
                case 6:
                    System.out.println(" ");
                    System.out.println(" | ASESOR PERFOARTE | ");
                    System.out.println(" ");
                    System.out.println(" Hola, soy Linda, tu asistente virtual :)");
                    System.out.println(" Espero que estés teniendo un lindo día, ¿cómo te puedo ayudar hoy?");
                    System.out.println(" ");
                    System.out.println(" Déjame en un único mensaje tus datos personales como:");
                    System.out.println(" - Tu nombre completo");
                    System.out.println(" - Tu número de identificación");
                    System.out.println(" - Tu número de contacto");
                    System.out.println(" Además, déjanos un mensaje contándonos el motivo por el cual te pusiste en contacto con nosotros.");
                    String mensaje = leerteclado.nextLine();
                    System.out.println(" ");
                    System.out.println(" Gracias por confiar en nosotros.");
                    System.out.println(" Me encargaré de comunicarte con uno de nuestros asesores disponibles para que tu solicitud tenga respuesta lo más pronto posible...");
                    break;
                case 0:
                    System.out.println(" ");
                    System.out.println(" Gracias por preferir PerfoArte :)");
                    System.out.println(" Hasta pronto!!");
                    System.out.println(" ");
                    menuPrincipal = false;
                    break;
                default:
                    System.out.println(" ");
                    System.out.println(" OPCIÓN NO VÁLIDA!");
                    System.out.println(" Por favor intenta nuevamente.");
                    System.out.println(" ");
                    break;
            }
        } while (menuPrincipal == true);
    }
}