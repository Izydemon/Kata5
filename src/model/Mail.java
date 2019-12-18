package model;


public class Mail {
    private String mail;
     public Mail(String mail) {
        this.mail = mail;
    }
     public String getMail() {
        return mail;
    }
    
    public String getDomain() {
        return mail.substring(mail.indexOf('@')+1);
    }
}
