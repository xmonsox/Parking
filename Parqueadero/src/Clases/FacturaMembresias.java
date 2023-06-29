package Clases;

public class FacturaMembresias {
    
    private String propietario;
    private String telefono;
    private String tipo_vehiculo;
    private String tipo_membresia;
    private String placa;
    private String fecha_inicio;
    private String fecha_vencimiento;
    private int total;
    private int recibe;
    private int devuelta;

    public FacturaMembresias(String propietario, String telefono, String tipo_vehiculo, String tipo_membresia, String placa, String fecha_inicio, String fecha_vencimiento, int total, int recibe, int devuelta) {
        this.propietario = propietario;
        this.telefono = telefono;
        this.tipo_vehiculo = tipo_vehiculo;
        this.tipo_membresia = tipo_membresia;
        this.placa = placa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_vencimiento = fecha_vencimiento;
        this.total = total;
        this.recibe = recibe;
        this.devuelta = devuelta;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getRecibe() {
        return recibe;
    }

    public void setRecibe(int recibe) {
        this.recibe = recibe;
    }

    public int getDevuelta() {
        return devuelta;
    }

    public void setDevuelta(int devuelta) {
        this.devuelta = devuelta;
    }
    
    
}
