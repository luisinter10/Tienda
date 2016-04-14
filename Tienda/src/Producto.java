
public class Producto{
	
	private String nombre;
    private	double precio;
    public static int dimensionArreglo;
    
    public Producto() { }
    public Producto(String nombre, double precio) {
      this.nombre   = nombre;
      this.precio = precio;
      
      dimensionArreglo++;//Se obtiene con esta variable la dimensión del array. Según número de instancias del constructor
    }
	
    public String toString() {
        return  "Nombre: "      +this.getNombre()+    "\n"+
            "Precio unidad: " +this.getPrecio()+  " \n";
      }
    
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public static int getDimensionArreglo() {
		return dimensionArreglo;
	}
	public static void setDimensionArreglo(int dimensionArreglo) {
		Producto.dimensionArreglo = dimensionArreglo;
	}
	
        
        
     }
