/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrecuperacion;

/**
 *
 * @author ALUMNOS-FP
 */
/**
 * EXAMEN DE RECUPERACIÓN - REFACTORIZACIÓN
 * 
 * Este código gestiona las ventas de entradas de un cine.
 * Funciona correctamente pero tiene problemas de diseño.
 * 
 * TAREAS A REALIZAR (10 puntos):
 * 
 * 1. Renombrar variables y métodos (2.5 puntos)
 * 2. Crear y usar constantes (1.5 puntos)
 * 3. Aplicar encapsulación (1.5 puntos)
 * 4. Extraer métodos (2.0 puntos)
 * 5. Documentación JavaDoc (1.5 puntos)
 * 6. Generación JavaDoc (1.0 punto)
 * 
 * TIEMPO: 60 minutos
 */

// Clase que representa una venta de entradas de cine
public class ExamenRecuperacion {
    
    // Nombre de la película
    private String nombrePelicula;
    // Nombre del cliente
    private String nombreCliente;
    // Número de entradas
    private int numeroEntradas;
    // Tipo de entrada: 1=Normal, 2=3D, 3=IMAX
    private int tipoEntrada;
    // Tipo de sesión: 1=Matinal, 2=Tarde, 3=Noche
    private int tipoSesion;
    // Incluye palomitas (true o false)
    private boolean palomitas;
    // Incluye bebida (true o false)
    private boolean bebida;
    
    // Constructor que inicializa una venta
    private ExamenRecuperacion(String pelicula, String cliente, int entradas, int tipoEntrada, int tipoSesion, boolean palomitas, boolean bebida) {
        this.nombrePelicula = pelicula;
        this.nombreCliente = cliente;
        this.numeroEntradas = entradas;
        this.tipoEntrada = tipoEntrada;
        this.tipoSesion = tipoSesion;
        this.palomitas = palomitas;
        this.bebida = bebida;
    }
    
    // Calcula el precio de las entradas según el tipo
    public double calcPrecioEntrada() {
        double precio = 0;
        
        // Normal cuesta 8€ por entrada
        if (tipoEntrada == 1) {
            precio = 8 * numeroEntradas;
        }
        // 3D cuesta 12€ por entrada
        else if (tipoEntrada == 2) {
            precio = 12 * numeroEntradas;
        }
        // IMAX cuesta 15€ por entrada
        else if (tipoEntrada == 3) {
            precio = 15 * numeroEntradas;
        }
        
        return precio;
    }
    
    // Calcula el suplemento por tipo de sesión
    public double calcSuplemento() {
        double suplemento = 0;
        
        // Matinal tiene descuento de 2€ por entrada
        if (tipoSesion == 1) {
            suplemento = -2 * numeroEntradas;
        }
        // Tarde no tiene suplemento
        else if (tipoSesion == 2) {
            suplemento = 0;
        }
        // Noche tiene suplemento de 1€ por entrada
        else if (tipoSesion == 3) {
            suplemento = 1 * numeroEntradas;
        }
        
        return suplemento;
    }
    
    // Calcula el precio de los extras (palomitas y bebida)
    public double calcPrecioExtras() {
        double extras = 0;
        
        // Palomitas cuestan 5€ por entrada
        if (palomitas) {
            extras = extras + (5 * numeroEntradas);
        }
        
        // Bebida cuesta 3€ por entrada
        if (bebida) {
            extras = extras + (3 * numeroEntradas);
        }
        
        return extras;
    }
    
    // Calcula el precio total de la venta
    public double total() {
        double total = calcPrecioEntrada() + calcSuplemento() + calcPrecioExtras();
        
        // Si compra 4 o más entradas, aplica 10% de descuento
        if (numeroEntradas >= 4) {
            total = total * 0.9;
        }
        
        // Si compra 8 o más entradas, aplica 20% de descuento adicional
        if (numeroEntradas >= 8) {
            total = total * 0.8;
        }
        
        return total;
    }
    
    // Muestra la información de la venta
    private void mostrar() {
        double preciototal = total();
        double preciounidad = preciototal / numeroEntradas;
        
        System.out.println("================================");
        System.out.println("      TICKET DE CINE");
        System.out.println("================================");
        System.out.println("Película: " + nombrePelicula);
        System.out.println("Cliente: " + nombreCliente);
        
        // Muestra el tipo de entrada
        if (tipoEntrada == 1) {
            System.out.println("Tipo: Normal");
        } else if (tipoEntrada == 2) {
            System.out.println("Tipo: 3D");
        } else if (tipoEntrada == 3) {
            System.out.println("Tipo: IMAX");
        }
        
        // Muestra el tipo de sesión
        if (tipoSesion == 1) {
            System.out.println("Sesión: Matinal");
        } else if (tipoSesion == 2) {
            System.out.println("Sesión: Tarde");
        } else if (tipoSesion == 3) {
            System.out.println("Sesión: Noche");
        }
        
        System.out.println("Entradas: " + numeroEntradas);
        System.out.println("--------------------------------");
        System.out.println("Precio entradas: " + String.format("%.2f", calcPrecioEntrada()) + "€");
        
        // Muestra el suplemento de sesión si lo hay
        if (tipoSesion == 1) {
            System.out.println("Descuento matinal: " + String.format("%.2f", calcSuplemento()) + "€");
        } else if (tipoSesion == 3) {
            System.out.println("Suplemento noche: +" + String.format("%.2f", calcSuplemento()) + "€");
        }
        
        // Muestra extras si los tiene
        if (palomitas || bebida) {
            System.out.println("Extras:");
            if (palomitas) {
                System.out.println("  - Palomitas: " + String.format("%.2f", 5.0 * numeroEntradas) + "€");
            }
            if (bebida) {
                System.out.println("  - Bebida: " + String.format("%.2f", 3.0 * numeroEntradas) + "€");
            }
        }
        
        System.out.println("--------------------------------");
        System.out.println("Precio por entrada: " + String.format("%.2f", preciounidad) + "€");
        System.out.println("TOTAL: " + String.format("%.2f", preciototal) + "€");
        System.out.println("================================");
    }
    
    // Muestra un resumen corto de la venta
    private void resumen() {
        System.out.println("Venta: " + nombrePelicula + " - " + nombreCliente + " - " + numeroEntradas + " entradas - Total: " + String.format("%.2f", total()) + "€");
    }
    
    // Verifica si es una venta para grupo
    private boolean esGrupo() {
        // Es grupo si tiene 6 o más entradas
        if (numeroEntradas >= 6) {
            return true;
        } else {
            return false;
        }
    }
    
    // Verifica si la venta incluye experiencia completa
    public boolean esCompleta() {
        // Es completa si es IMAX con palomitas y bebida
        if (tipoEntrada == 3 && palomitas && bebida) {
            return true;
        } else {
            return false;
        }
    }
    
    // Calcula cuánto se ahorra con los descuentos
    public double desc() {
        double st = calcPrecioEntrada() + calcSuplemento() + calcPrecioExtras();
        double ft = total();
        double d = st - ft;
        return d;
    }
    
    // Método principal para probar
    public static void main(String[] args) {
        // Crea una venta para grupo de 10 entradas IMAX en sesión noche con todo
        ExamenRecuperacion v1 = new ExamenRecuperacion("Avatar 3", "Pedro Martínez", 10, 3, 3, true, true);
        v1.mostrar();
        System.out.println("¿Es venta para grupo? " + v1.esGrupo());
        System.out.println("¿Es experiencia completa? " + v1.esCompleta());
        System.out.println("Descuento aplicado: " + String.format("%.2f", v1.desc()) + "€");
        
        System.out.println("\n");
        
        // Crea una venta simple de 2 entradas normales en sesión tarde sin extras
        ExamenRecuperacion v2 = new ExamenRecuperacion("El Padrino", "Ana López", 2, 1, 2, false, false);
        v2.mostrar();
        System.out.println("¿Es venta para grupo? " + v2.esGrupo());
        System.out.println("¿Es experiencia completa? " + v2.esCompleta());
        
        System.out.println("\n");
        
        // Crea una venta de 5 entradas 3D en sesión matinal con palomitas
        ExamenRecuperacion v3 = new ExamenRecuperacion("Dune 2", "Carlos Ruiz", 5, 2, 1, true, false);
        v3.resumen();
        System.out.println("Descuento aplicado: " + String.format("%.2f", v3.desc()) + "€");
    }
}

