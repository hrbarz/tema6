package tema6;

public class Usuario {

    String nombre, username, email;
    Integer dni;

    public Usuario() {
        // TODO Auto-generated constructor stub
    }

    public Usuario(String nombre, String username, String email, Integer dni) {
        this.nombre = nombre;
        this.username = username;
        this.email = email;
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", username=" + username + ", email=" + email + ", dni=" + dni + "]";
    }


}
