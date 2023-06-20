
package Clases;

public class ListaMembresias {
    String propietario;
    String telefono;
    String tipo_vehiculo;
    String tipo_membresia;
    String placa;
    String fecha_inicio;
    String fecha_vencimiento;
    String pago;

    public ListaMembresias(String propietario, String telefono, String tipo_vehiculo, String tipo_membresia, String placa, String fecha_inicio, String fecha_vencimiento, String pago) {
        this.propietario = propietario;
        this.telefono = telefono;
        this.tipo_vehiculo = tipo_vehiculo;
        this.tipo_membresia = tipo_membresia;
        this.placa = placa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_vencimiento = fecha_vencimiento;
        this.pago = pago;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public String getTipo_membresia() {
        return tipo_membresia;
    }

    public void setTipo_membresia(String tipo_membresia) {
        this.tipo_membresia = tipo_membresia;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }
    
}
