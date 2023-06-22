package Clases;

import com.mysql.cj.protocol.Resultset;
import java.sql.*;

public class Database {
    
    Statement manipularDB;
    
    public Database(){
        String hostname = "localhost";
        String puerto = "3306";
        String database_name = "parqueadero";
        String database_user = "root";
        String database_password = "";
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;
        
        try{
            Connection conexion = DriverManager.getConnection(url, database_user, database_password);
            this.manipularDB = conexion.createStatement();
            System.out.println("Conexion Exitosa a: "+database_name);
        }catch(SQLException e){
            System.out.println("Error en conexion: "+e.getMessage());
            this.manipularDB = null;
        }
    }
    
    
    public boolean insertarVehiculo(Vehiculos vehiculo){
        String placa = vehiculo.getPlaca();
        String tipo_vehiculo = vehiculo.getTipo_vehiculo();
        String tipo_pago = vehiculo.getTipo_pago();
        String fecha = vehiculo.getFecha();
        String nombre_espacio = vehiculo.getNombre_espacio();
        String estado = "activo";
        
        String consulta = "INSERT INTO ingresos(placa, tipo_vehiculo, tipo_pago, fecha_ingreso, nombre_espacio, estado) VALUES ('"+placa+"','"+tipo_vehiculo+"','"+tipo_pago+"','"+fecha+"','"+nombre_espacio+"','"+estado+"')";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    public boolean insertarMembresia(Membresias membresia){
        String propietario = membresia.getPropietario();
        String telefono = membresia.getTelefono();
        String tipo_vehiculo = membresia.getTipo_vehiculo();
        String tipo_membresia = membresia.getTipo_membresia();
        String placa = membresia.getPlaca();
        String fecha_inicio = membresia.getFecha_inicio();
        String fecha_vencimiento = membresia.getFecha_vencimiento();
        String total = membresia.getTotal();
        
        String consulta = "INSERT INTO membresias(propietario, telefono, tipo_vehiculo, tipo_membresia, placa, fecha_inicio, fecha_vencimiento, total ) VALUES ('"+propietario+"','"+telefono+"', '"+tipo_vehiculo+"', '"+tipo_membresia+"','"+placa+"','"+fecha_inicio+"','"+fecha_vencimiento+"','"+total+"')";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    public Vehiculos[] listaVehiculos(){
        Vehiculos [] listaVehiculos = new Vehiculos [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM ingresos");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Vehiculos temp = new Vehiculos( registros.getString("placa"),registros.getString("tipo_vehiculo"),registros.getString("tipo_pago"),registros.getString("fecha_ingreso"),registros.getString("nombre_espacio"),registros.getString("estado") );
                    listaVehiculos[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaVehiculos;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaVehiculos;
        }
    }
    
    public Vehiculos buscarVehiculo(String placa){
        Vehiculos temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM ingresos WHERE placa='"+placa+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Vehiculos( registros.getString("placa"),registros.getString("tipo_vehiculo"),registros.getString("tipo_pago"),registros.getString("fecha_ingreso"),registros.getString("nombre_espacio"),registros.getString("estado") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public Membresias buscarMembresia(String placa){
        Membresias temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM membresias WHERE placa='"+placa+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Membresias( registros.getString("propietario"),registros.getString("telefono"), registros.getString("tipo_vehiculo"), registros.getString("tipo_membresia"), registros.getString("placa"), registros.getString("fecha_inicio"), registros.getString("fecha_vencimiento"),registros.getString("total"));
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public Membresias[] listaMembresias(){
        Membresias [] listaMembresias = new Membresias [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM membresias");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Membresias temp = new Membresias( registros.getString("propietario"),registros.getString("telefono"),registros.getString("tipo_vehiculo"),registros.getString("tipo_membresia"),registros.getString("placa"),registros.getString("fecha_inicio"),registros.getString("fecha_vencimiento"),registros.getString("total") );
                    listaMembresias[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaMembresias;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaMembresias;
        }
    }
    
    public FacturaVehiculo[] buscarVehiculoFactura(String placa){
        FacturaVehiculo temp [] = new FacturaVehiculo [100];
        
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM ingresos WHERE placa='"+placa+"' ");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    FacturaVehiculo temporal2 = new FacturaVehiculo(registros.getString("placa"), registros.getString("tipo_vehiculo"), registros.getString("tipo_pago"), registros.getString("fecha_ingreso") );
                    temp[indice] = temporal2;
                    indice++;
                }while(registros.next());
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public Espacios getEspacio(String nombre){
        Espacios espacio = new Espacios(nombre, "disponible");
        
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM ingresos WHERE nombre_espacio='"+nombre+"' AND estado='activo' ");
            registros.next();
            if (registros.getRow()==1) {
                espacio.setEstado("ocupado");
            }
            return espacio;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
        }
        
        return espacio;
    }
    
    
    
   /*public Persona[] listaClientes(){
        Persona [] listaClientes = new Persona [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Persona temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
                    listaClientes[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaClientes;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaClientes;
        }
    }
    
    
    
    
    
    
    
    
    
     
    public Persona buscarCliente(String cedula){
        Persona temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    
    
    
    
   
    
    
    
    public boolean editarCliente(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String nombres = persona.getNombres();
        String apellidos = persona.getApellidos();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String email = persona.getEmail();
         
        
        try {
            String consulta = "UPDATE clientes SET nombres='"+nombres+"', apellidos='"+apellidos+"', telefono='"+telefono+"', direccion='"+direccion+"', email='"+email+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    
    
   
    
    public boolean insertarCliente(String cedula, String nombres, String apellidos, String telefono, String direccion, String email){
        String consulta = "INSERT INTO clientes(cedula, nombres, apellidos, telefono, direccion, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    public boolean eliminarCliente(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String nombres = persona.getNombres();
        String apellidos = persona.getApellidos();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String email = persona.getEmail();

        try {
            String consulta = "DELETE FROM clientes WHERE cedula=' "+cedula+" ' ";
            int resp_consulta = manipularDB.executeUpdate(consulta);
            if (resp_consulta>0) {
                respuesta = true;
            }
        }catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    
    
    
         
    public boolean insertarProducto(Producto producto){
        int id = producto.getId();
        String nombre = producto.getNombre();
        int precio = producto.getPrecio();


        String consulta = "INSERT INTO productos(id, nombre, precio) VALUES (' "+id+" ', ' "+nombre+" ', ' "+precio+" ') ";    

        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("PRODUCTO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            System.out.println("consulta:" + consulta);
            return false;
        }
    }*/
         
         
}
    

