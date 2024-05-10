//------------------------------------ OBJETO TICKET --------------------------------------
import java.io.Serializable;

public class Ticket implements Serializable{

    private String fecha;
    private String hora;
    int precio, idCompra, idCliente;
    private String matriculaBus;
    String cliente;

    public Ticket(int idViaje, String origen, String destino, String fecha, String hora, String matriculaBus, int precio, int idCliente, int idCompra, String cliente) {
        this.fecha=fecha;
        this.hora=hora;
        this.precio=precio;
        this.matriculaBus=matriculaBus;
        this.cliente = cliente;
        this.idCliente = idCliente;
        this.idCompra = idCompra;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMatriculaBus() {
        return matriculaBus;
    }

    public void setMatriculaBus(String matriculaBus) {
        this.matriculaBus = matriculaBus;
    }

    public String getCliente() {
        return cliente;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


    public String getDestino() {
        return getDestino();
    }

    public String getOrigen() {
        return getOrigen();
    }

    public int getIdViaje() {
        return getIdViaje();
    }

}