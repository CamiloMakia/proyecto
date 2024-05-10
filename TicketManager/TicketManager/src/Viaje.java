public class Viaje extends Ticket {
    String origen = "";
    String destino = "";
    String horaViaje = "";
    int idViaje = 0;

    public Viaje(int idViaje, String origen, String destino, String fecha, String hora, String matriculaBus, int precio, int idCliente, int idCompra, String cliente) {
        super(idViaje, origen, destino, fecha, hora, matriculaBus, precio, idCliente, idCompra, cliente);

        this.idViaje = idViaje;
        this.origen = origen;
        this.destino = destino;
        this.horaViaje = hora;
    }


    public String getOrigen() {
        this.origen = origen;
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        this.destino=destino;
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHoraViaje() {
        return horaViaje;
    }

    public void setHoraViaje(String horaViaje) {
        this.horaViaje = horaViaje;
    }

    public int getIdViaje() { return idViaje; }

    public void setIdViaje(String idViaje) { this.idViaje = Integer.parseInt(idViaje); }
}
