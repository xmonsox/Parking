
package Clases;

public class SalidaVehiculos {
    private String tipo_vehiculo;
    private String tipo_pago;
    private String fecha_llegada;
    private String fecha_salida;
    private String placa;
    private int total;
    private int recibe;
    private int devuelta;
    private String espacio;
    private String estado;
    private String duracion;

    public SalidaVehiculos(String tipo_vehiculo, String tipo_pago, String fecha_llegada, String fecha_salida, String placa, int total, int recibe, int devuelta, String espacio, String estado, String duracion) {
        this.tipo_vehiculo = tipo_vehiculo;
        this.tipo_pago = tipo_pago;
        this.fecha_llegada = fecha_llegada;
        this.fecha_salida = fecha_salida;
        this.placa = placa;
        this.total = total;
        this.recibe = recibe;
        this.devuelta = devuelta;
        this.espacio = espacio;
        this.estado = estado;
        this.duracion = duracion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getEspacio() {
        return espacio;
    }

    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public String getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(String fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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
