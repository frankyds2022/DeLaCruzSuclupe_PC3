
package modelo;


public class rol {
    
    String id_rol;
    String nombre;
    String id_area;

    public rol() {
    }

    public rol(String nombre, String id_area) {
        this.nombre = nombre;
        this.id_area = id_area;
    }

    public String getId_rol() {
        return id_rol;
    }

    public void setId_rol(String id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getid_area() {
        return id_area;
    }

    public void setid_area(String id_area) {
        this.id_area= id_area;
    }
      public rol(String id_rol, String nombre, String id_area) {
        this.id_rol = id_rol;
        this.nombre = nombre;
        this.id_area = id_area;
    }

    
}
