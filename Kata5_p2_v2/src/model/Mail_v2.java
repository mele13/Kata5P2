package model;

public class Mail_v2 {
    
    private final String mail;
    
    /**
     * Constructor que recibe una String como parámetro llamado mail.
     * 
     * @param mail mail
     */   
    public Mail_v2(String mail) {
        this.mail = mail;
    }
    
    /**
     * Método que separa de una cadena con una dirección email la correspondiente 
     * subcadena con el dominio.
     * 
     * @return subcadena
     */
    public String getDomain() {
        return this.mail.substring(this.mail.indexOf("@") + 1);
    }
    
    public static boolean isMail(String line) {
        return line.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+"
                + "(?:\\.[a-zA-Z0-9-]+)*$");
    }    
}