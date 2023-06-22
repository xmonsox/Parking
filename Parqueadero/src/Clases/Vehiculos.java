package Clases;

public class Vehiculos {
    
    String placa;
    String tipo_vehiculo;
    String tipo_pago;
    String fecha;
    String nombre_espacio;
    String estado;
    

    public Vehiculos(String placa, String tipo_vehiculo, String tipo_pago, String fecha, String nombre_espacio, String estado) {
        this.placa = placa;
        this.tipo_vehiculo = tipo_vehiculo;
        this.tipo_pago = tipo_pago;
        this.fecha = fecha;
        this.nombre_espacio=nombre_espacio;
        this.estado=estado;
    }

    public String getNombre_espacio() {
        return nombre_espacio;
    }

    public void setNombre_espacio(String nombre_espacio) {
        this.nombre_espacio = nombre_espacio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
