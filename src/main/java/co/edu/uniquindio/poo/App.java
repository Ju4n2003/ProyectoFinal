package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.Scanner;


// Clase principal
public class App {
    private static LinkedList<Cliente> clientes = new LinkedList<>();
    private static LinkedList<Vehiculo> vehiculos = new LinkedList<>();
    private static LinkedList<Transaccion> transacciones = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú del Concesionario ===");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Registrar Vehículo");
            System.out.println("3. Registrar Transacción");
            System.out.println("4. Mostrar Clientes");
            System.out.println("5. Mostrar Vehículos");
            System.out.println("6. Mostrar Transacciones");
            System.out.println("7. Opciones Administrativas");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); // Ignorar entrada inválida
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea
        
            switch (opcion) {
                case 1 -> registrarCliente(scanner);
                case 2 -> registrarVehiculo(scanner);
                case 3 -> registrarTransaccion(scanner);
                case 4 -> mostrarClientes();
                case 5 -> mostrarVehiculos();
                case 6 -> mostrarTransacciones();
                case 7 -> opcionesAdministrativas(scanner);
                case 8 -> System.out.println("Gracias por usar el sistema del concesionario.");
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 8);
        

        scanner.close();
    }

    private static void registrarCliente(Scanner scanner) {
        System.out.println("\n=== Registrar Cliente ===");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, cedula, telefono, email);
        clientes.add(cliente);
        System.out.println("Cliente registrado con éxito.");
    }
    private static void opcionesAdministrativas(Scanner scanner) {
        try {
            System.out.println("\n=== Opciones Administrativas ===");
            System.out.println("1. Recuperar Clave");
            System.out.println("2. Gestionar Empleados");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea
    
            Administrador admin = new Administrador("Juan Esteban", "1015392219", "3163726736", "Administrador", "0611", 1600000);
    
            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese las credenciales actuales: ");
                    String credenciales = scanner.nextLine();
                    admin.recuperarClave(credenciales);
                }
                case 2 -> {
                    System.out.print("Acción (Agregar/Modificar/Bloquear): ");
                    String accion = scanner.nextLine();
                    System.out.print("Nombre del empleado: ");
                    String empleadoNombre = scanner.nextLine();
                    admin.gestionarEmpleados(accion, empleadoNombre);
                }
                default -> System.out.println("Opción inválida.");
            }
        } catch (CredencialesInvalidas | ErrorAdministrativo e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    private static void registrarVehiculo(Scanner scanner) {
        System.out.println("\n=== Registrar Vehículo ===");
        System.out.println("Seleccione el tipo de vehículo:");
        System.out.println("1. Sedan");
        System.out.println("2. Deportivo");
        System.out.println("3. Camioneta");
        System.out.println("4. PickUp");
        System.out.println("5. Van");
        System.out.println("6. Bus");
        System.out.println("7. Camión");
        System.out.print("Opción: ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        switch (tipo) {
            case 1 -> registrarSedan(scanner);
            case 2 -> registrarDeportivo(scanner);
            case 3 -> registrarCamioneta(scanner);
            case 4 -> registrarPickUp(scanner);
            case 5 -> registrarVan(scanner);
            case 6 -> registrarBus(scanner);
            case 7 -> registrarCamion(scanner);
            default -> System.out.println("Tipo de vehículo inválido.");
        }
    }

    private static void registrarSedan(Scanner scanner) {
        System.out.println("\n=== Registrar Sedan ===");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("¿Es nuevo? (true/false): ");
        boolean esNuevo = scanner.nextBoolean();
        System.out.print("Número de cambios: ");
        int cambio = scanner.nextInt();
        System.out.print("Velocidad máxima: ");
        double velMax = scanner.nextDouble();
        System.out.print("Cilindraje: ");
        double cilindraje = scanner.nextDouble();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir nueva línea
        System.out.println("Tipo de combustible diesel, gasolina, electrico, hibrido");
        String tipoCombustible = scanner.nextLine();
        System.out.print("¿Disponible? (true/false): ");
        boolean disponible = scanner.nextBoolean();
        System.out.print("Número de pasajeros: ");
        int numPasajeros = scanner.nextInt();
        System.out.print("Número de puertas: ");
        int numPuertas = scanner.nextInt();
        System.out.print("Capacidad del maletero: ");
        int capacidadMaletero = scanner.nextInt();
        System.out.print("¿Tiene aire acondicionado? (true/false): ");
        boolean aireAcondicionado = scanner.nextBoolean();
        System.out.print("¿Camara de reversa? (true/false): ");
        boolean camaraReversa = scanner.nextBoolean();
        System.out.print("¿Velocidad crucero? (true/false): ");
        boolean velocidadCrucero = scanner.nextBoolean();
        System.out.print("Número de bolsas de aire: ");
        int numBolsasAire = scanner.nextInt();
        System.out.print("¿Freno ABS? (true/false): ");
        boolean frenoABS = scanner.nextBoolean();
        scanner.nextLine(); 
        
       
        Sedan sedan = new Sedan(marca, modelo, esNuevo, cambio, velMax, cilindraje, precio, tipoCombustible, disponible, numPasajeros, numPuertas, capacidadMaletero, aireAcondicionado, camaraReversa, velocidadCrucero, numBolsasAire, frenoABS);
        vehiculos.add(sedan);
        System.out.println("Sedan registrado con éxito.");
    }
    

    private static void registrarDeportivo(Scanner scanner) {
        System.out.println("\n=== Registrar Deportivo ===");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("¿Es nuevo? (true/false): ");
        boolean esNuevo = scanner.nextBoolean();
        System.out.print("Número de cambios: ");
        int cambio = scanner.nextInt();
        System.out.print("Velocidad máxima: ");
        double velMax = scanner.nextDouble();
        System.out.print("Cilindraje: ");
        double cilindraje = scanner.nextDouble();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.println("Tipo de combustible diesel, gasolina, electrico, hibrido");
        String tipoCombustible = scanner.nextLine();
        System.out.print("¿Disponible? (true/false): ");
        boolean disponible = scanner.nextBoolean();
        System.out.print("Número de pasajeros: ");
        int numPasajeros = scanner.nextInt();
        System.out.print("Número de puertas: ");
        int numPuertas = scanner.nextInt();
        System.out.print("Número de bolsas de aire: ");
        int numBolsasAire = scanner.nextInt();
        System.out.print("Caballos de fuerza: ");
        double caballosDeFuerza = scanner.nextDouble();
        System.out.print("Tiempo para alcanzar 100 km/h (en segundos): ");
        double tiempoCienKm = scanner.nextDouble();
        scanner.nextLine(); // Consumir nueva línea
        
        Deportivo deportivo = new Deportivo(marca, modelo, esNuevo, cambio, velMax, cilindraje, precio, tipoCombustible, disponible, numPasajeros, numPuertas, numBolsasAire, caballosDeFuerza, tiempoCienKm);
        vehiculos.add(deportivo);
        System.out.println("Deportivo registrado con éxito.");
    }

    private static void registrarCamioneta(Scanner scanner) {
        System.out.println("\n=== Registrar Camioneta ===");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("¿Es nuevo? (true/false): ");
        boolean esNuevo = scanner.nextBoolean();
        System.out.print("Número de cambios: ");
        int cambio = scanner.nextInt();
        System.out.print("Velocidad máxima: ");
        double velMax = scanner.nextDouble();
        System.out.print("Cilindraje: ");
        double cilindraje = scanner.nextDouble();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.println("Tipo de combustible diesel, gasolina, electrico, hibrido");
        String tipoCombustible = scanner.nextLine();
        System.out.print("¿Disponible? (true/false): ");
        boolean disponible = scanner.nextBoolean();
        System.out.print("Número de pasajeros: ");
        int numPasajeros = scanner.nextInt();
        System.out.print("Número de puertas: ");
        int numPuertas = scanner.nextInt();
        System.out.print("Capacidad del maletero: ");
        int capacidadMaletero = scanner.nextInt();
        System.out.print("¿Tiene aire acondicionado? (true/false): ");
        boolean aireAcondicionado = scanner.nextBoolean();
        System.out.print("¿Camara de reversa? (true/false): ");
        boolean camaraReversa = scanner.nextBoolean();
        System.out.print("¿Velocidad crucero? (true/false): ");
        boolean velocidadCrucero = scanner.nextBoolean();
        System.out.print("Número de bolsas de aire: ");
        int numBolsasAire = scanner.nextInt();
        System.out.print("¿Freno ABS? (true/false): ");
        boolean frenoABS = scanner.nextBoolean();
        System.out.print("¿Sensor de colisión? (true/false): ");
        boolean sensorColision = scanner.nextBoolean();
        System.out.println("¿Sensor de trafico cruzado? (true/false): ");
        boolean sensorTraficoCruzado = scanner.nextBoolean();
        System.out.print("¿Asistente de carril? (true/false): ");
        boolean asistenteCarril = scanner.nextBoolean();
        System.out.print("¿Es 4x4? (true/false): ");
        boolean esCuatroPorCuatro = scanner.nextBoolean();
        scanner.nextLine(); // Consumir nueva línea

        Camioneta camioneta = new Camioneta(marca, modelo, esNuevo, cambio, velMax, cilindraje, precio, tipoCombustible, disponible,numPasajeros, numPuertas, capacidadMaletero, aireAcondicionado, camaraReversa, velocidadCrucero, numBolsasAire, frenoABS, sensorColision, sensorTraficoCruzado, asistenteCarril, esCuatroPorCuatro);
        vehiculos.add(camioneta);
        System.out.println("Camioneta registrada con éxito.");
    }
private static void registrarPickUp(Scanner scanner) {
    System.out.println("\n=== Registrar PickUp ===");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("¿Es nuevo? (true/false): ");
        boolean esNuevo = scanner.nextBoolean();
        System.out.print("Número de cambios: ");
        int cambio = scanner.nextInt();
        System.out.print("Velocidad máxima: ");
        double velMax = scanner.nextDouble();
        System.out.print("Cilindraje: ");
        double cilindraje = scanner.nextDouble();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir nueva línea
        System.out.println("Tipo de combustible diesel, gasolina, electrico, hibrido");
        String tipoCombustible = scanner.nextLine();
        System.out.print("¿Disponible? (true/false): ");
        boolean disponible = scanner.nextBoolean();
        System.out.print("Número de pasajeros: ");
        int numPasajeros = scanner.nextInt();
        System.out.print("Número de puertas: ");
        int numPuertas = scanner.nextInt();
        System.out.print("¿Tiene aire acondicionado? (true/false): ");
        boolean aireAcondicionado = scanner.nextBoolean();
        System.out.print("¿Camara de reversa? (true/false): ");
        boolean camaraReversa = scanner.nextBoolean();
        System.out.print("Número de bolsas de aire: ");
        int numBolsasAire = scanner.nextInt();
        System.out.print("¿Freno ABS? (true/false): ");
        boolean frenoABS = scanner.nextBoolean();
        System.out.print("¿Es 4x4? (true/false): ");
        boolean esCuatroPorCuatro = scanner.nextBoolean();
        System.out.print("Capacidad de carga (kg): ");
        double capacidadCarga = scanner.nextDouble();
        scanner.nextLine();
        


    PickUp pickUp = new PickUp(marca, modelo, esNuevo, cambio, velMax, cilindraje, precio, tipoCombustible, disponible, numPasajeros, numPuertas, aireAcondicionado, camaraReversa, numBolsasAire, frenoABS, esCuatroPorCuatro, capacidadCarga);
    vehiculos.add(pickUp);
    System.out.println("PickUp registrada con éxito.");
}

private static void registrarVan(Scanner scanner) {
    System.out.println("\n=== Registrar Van ===");
    System.out.print("Marca: ");
    String marca = scanner.nextLine();
    System.out.print("Modelo: ");
    String modelo = scanner.nextLine();
    System.out.print("¿Es nuevo? (true/false): ");
    boolean esNuevo = scanner.nextBoolean();
    System.out.print("Número de cambios: ");
    int cambio = scanner.nextInt();
    System.out.print("Velocidad máxima: ");
    double velMax = scanner.nextDouble();
    System.out.print("Cilindraje: ");
    double cilindraje = scanner.nextDouble();
    System.out.print("Precio: ");
    double precio = scanner.nextDouble();
    scanner.nextLine(); // Consumir nueva línea
    System.out.println("Tipo de combustible diesel, gasolina, electrico, hibrido");
    String tipoCombustible = scanner.nextLine();
    System.out.print("¿Disponible? (true/false): ");
    boolean disponible = scanner.nextBoolean();
    System.out.print("Número de pasajeros: ");
    int numPasajeros = scanner.nextInt();
    System.out.print("Número de puertas: ");
    int numPuertas = scanner.nextInt();
    System.out.print("Capacidad del maletero: ");
    int capacidadMaletero = scanner.nextInt();
    System.out.print("¿Tiene aire acondicionado? (true/false): ");
    boolean aireAcondicionado = scanner.nextBoolean();
    System.out.print("¿Camara de reversa? (true/false): ");
    boolean camaraReversa = scanner.nextBoolean();
    System.out.print("Número de bolsas de aire: ");
    int numBolsasAire = scanner.nextInt();
    System.out.print("¿Freno ABS? (true/false): ");
    boolean frenoABS = scanner.nextBoolean();
    scanner.nextLine();;

    Van van = new Van( marca, modelo, esNuevo, cambio, velMax, cilindraje, precio, tipoCombustible, disponible, numPasajeros, numPuertas, capacidadMaletero, aireAcondicionado, camaraReversa, numBolsasAire, frenoABS);
    vehiculos.add(van);
    System.out.println("Van registrada con éxito.");
}

private static void registrarBus(Scanner scanner) {
    System.out.println("\n=== Registrar Bus ===");
    System.out.print("Marca: ");
    String marca = scanner.nextLine();
    System.out.print("Modelo: ");
    String modelo = scanner.nextLine();
    System.out.print("¿Es nuevo? (true/false): ");
    boolean esNuevo = scanner.nextBoolean();
    System.out.print("Número de cambios: ");
    int cambio = scanner.nextInt();
    System.out.print("Velocidad máxima: ");
    double velMax = scanner.nextDouble();
    System.out.print("Cilindraje: ");
    double cilindraje = scanner.nextDouble();
    System.out.print("Precio: ");
    double precio = scanner.nextDouble();
    scanner.nextLine(); // Consumir nueva línea
    System.out.println("Tipo de combustible diesel, gasolina, electrico, hibrido");
    String tipoCombustible = scanner.nextLine();
    System.out.print("¿Disponible? (true/false): ");
    boolean disponible = scanner.nextBoolean();
    System.out.print("Número de pasajeros: ");
    int numPasajeros = scanner.nextInt();
    System.out.print("Número de puertas: ");
    int numPuertas = scanner.nextInt();
    System.out.print("Capacidad del maletero: ");
    int capacidadMaletero = scanner.nextInt();
    System.out.print("¿Tiene aire acondicionado? (true/false): ");
    boolean aireAcondicionado = scanner.nextBoolean();
    System.out.print("¿Camara de reversa? (true/false): ");
    boolean camaraReversa = scanner.nextBoolean();
    System.out.print("Número de bolsas de aire: ");
    int numBolsasAire = scanner.nextInt();
    System.out.print("¿Freno ABS? (true/false): ");
    boolean frenoABS = scanner.nextBoolean();
    scanner.nextLine(); 
    System.out.println("Numero de ejes: ");
    int numEjes = scanner.nextInt();
    System.out.print("Número de salidas de emergencia: ");
    int numSalidasEmergencia = scanner.nextInt();

    Bus bus = new Bus(marca, modelo, esNuevo, cambio, velMax, cilindraje, precio, tipoCombustible, disponible, numPasajeros, numPuertas, capacidadMaletero, aireAcondicionado,  camaraReversa,  numBolsasAire,  frenoABS,  numEjes,  numSalidasEmergencia);
    vehiculos.add(bus);
    System.out.println("Bus registrado con éxito.");
}

private static void registrarCamion(Scanner scanner) {
    System.out.println("\n=== Registrar Camion ===");
    System.out.print("Marca: ");
    String marca = scanner.nextLine();
    System.out.print("Modelo: ");
    String modelo = scanner.nextLine();
    System.out.print("¿Es nuevo? (true/false): ");
    boolean esNuevo = scanner.nextBoolean();
    System.out.print("Número de cambios: ");
    int cambio = scanner.nextInt();
    System.out.print("Velocidad máxima: ");
    double velMax = scanner.nextDouble();
    System.out.print("Cilindraje: ");
    double cilindraje = scanner.nextDouble();
    System.out.print("Precio: ");
    double precio = scanner.nextDouble();
    scanner.nextLine(); // Consumir nueva línea
    System.out.println("Tipo de combustible diesel, gasolina, electrico, hibrido");
    String tipoCombustible = scanner.nextLine();
    System.out.print("¿Disponible? (true/false): ");
    boolean disponible = scanner.nextBoolean();
    System.out.print("¿Freno ABS? (true/false): ");
    boolean frenoABS = scanner.nextBoolean();
    scanner.nextLine(); 
    System.out.println("Numero de ejes: ");
    int numEjes = scanner.nextInt();
    System.out.print("Capacidad de carga (toneladas): ");
    double capacidadCarga = scanner.nextDouble();
    System.out.print("¿Tiene aire acondicionado? (true/false): ");
    boolean aireAcondicionado = scanner.nextBoolean();
    System.out.println("Tipo de camión (FURGON,\r\n" + //
                "    PLATAFORMA,\r\n" +
                "    TANQUE,\r\n" +
                "    VOLQUETA): ");
    String tipoCamion = scanner.nextLine();

    Camion camion = new Camion(marca,  modelo, esNuevo,  cambio,  velMax,  cilindraje,  precio,  tipoCombustible,  disponible,  capacidadCarga,  aireAcondicionado,  frenoABS,  numEjes,  tipoCamion);
    vehiculos.add(camion);
    System.out.println("Camión registrado con éxito.");
}

    private static void registrarTransaccion(Scanner scanner) {
    if (clientes.isEmpty() || vehiculos.isEmpty()) {
        System.out.println("\nNo hay clientes o vehículos registrados para realizar una transacción.");
        return;
    }

    System.out.println("\n=== Registrar Transacción ===");
    System.out.print("Fecha (YYYY-MM-DD): ");
    String fecha = scanner.nextLine();
    System.out.print("Tipo de transacción (Compra/Venta/Alquiler): ");
    String tipo = scanner.nextLine();

    System.out.println("Seleccione un cliente por índice:");
    for (int i = 0; i < clientes.size(); i++) {
        System.out.println(i + ": " + clientes.get(i).getNombre());
    }
    int clienteIndex = scanner.nextInt();
    scanner.nextLine(); // Consumir nueva línea

    System.out.println("Seleccione un vehículo por índice:");
    for (int i = 0; i < vehiculos.size(); i++) {
        Vehiculo v = vehiculos.get(i);
        System.out.println(i + ": " + v.getMarca() + " " + v.getModelo() + " (Disponible: " + v.isDisponible() + ")");
    }
    int vehiculoIndex = scanner.nextInt();
    scanner.nextLine(); // Consumir nueva línea

    if (!vehiculos.get(vehiculoIndex).isDisponible()) {
        System.out.println("El vehículo seleccionado no está disponible.");
        return;
    }

    System.out.print("Nombre del empleado responsable: ");
    String empleadoNombre = scanner.nextLine();
    System.out.print("Cédula del empleado: ");
    String empleadoCedula = scanner.nextLine();
    Empleado empleado = new Empleado(empleadoNombre, empleadoCedula, "N/A", "Vendedor", "N/A", 1400000);

    Vehiculo vehiculo = vehiculos.get(vehiculoIndex);
    Cliente cliente = clientes.get(clienteIndex);

    empleado.realizarTransaccion(vehiculo, cliente, tipo, fecha);
    transacciones.add(new Transaccion(fecha, tipo, empleado, vehiculo, cliente));
}

    private static void mostrarClientes() {
        System.out.println("\n=== Lista de Clientes ===");
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println("- Nombre: " + cliente.getNombre()
                        + ", Cédula: " + cliente.getCedula()
                        + ", Teléfono: " + cliente.getTelefono());
            }
        }
    }

    private static void mostrarVehiculos() {
        System.out.println("\n=== Lista de Vehículos ===");
        if (vehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
        } else {
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println("- Marca: " + vehiculo.getMarca()
                        + ", Modelo: " + vehiculo.getModelo()
                        + ", Tipo: " + vehiculo.getClass().getSimpleName()
                        + ", Precio: $" + vehiculo.getPrecio());
            }
        }
    }

    private static void mostrarTransacciones() {
        System.out.println("\n=== Lista de Transacciones ===");
        if (transacciones.isEmpty()) {
            System.out.println("No hay transacciones registradas.");
        } else {
            for (Transaccion transaccion : transacciones) {
                System.out.println("- Fecha: " + transaccion.getFecha()
                        + ", Tipo: " + transaccion.getTipo()
                        + ", Cliente: " + transaccion.getCliente().getNombre()
                        + ", Vehículo: " + transaccion.getVehiculo().getMarca()
                        + " " + transaccion.getVehiculo().getModelo());
            }
        }
    }
}

