package Producto;

// SUBCLASE PRODUCTO FRESCO - hereda de Producto
class ProductoFresco extends Producto {
    // Atributos específicos de productos frescos
    private String fechaEnvasado;
    private String paisOrigen;

    // Constructor de ProductoFresco
    public ProductoFresco(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote); // Llama al constructor de la clase padre
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    // Métodos GET específicos
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    // Métodos SET específicos
    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    // Método para mostrar información completa del producto fresco
    public void mostrarInformacion() {
        System.out.println("=== PRODUCTO FRESCO ===");
        super.mostrarInformacion(); // Llama al método de la clase padre
        System.out.println("Fecha de envasado: " + fechaEnvasado);
        System.out.println("País de origen: " + paisOrigen);
    }
}