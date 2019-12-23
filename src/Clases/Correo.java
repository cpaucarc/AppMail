package Clases;

import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Correo {

    public String correoRemitente = "";
    public String passwordRemitente = "";
    
    public void Conectar(String correoReceptor, String asunto, String mensaje) throws MessagingException{
        try {
            
            Properties props = new Properties();
            props.setProperty("mail.smtp.host","smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable","true");
            props.setProperty("mail.smtp.port","587");
            props.setProperty("mail.smtp.auth","true");
            
            Session session = Session.getDefaultInstance(props);
            MimeMessage msg=new MimeMessage(session);
            msg.setFrom(new InternetAddress(correoRemitente));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            msg.setSubject(asunto);
            msg.setText(mensaje);

            Transport t = session.getTransport();
            t.connect(correoRemitente, passwordRemitente);
            t.sendMessage(msg, msg.getRecipients(Message.RecipientType.TO));
            t.close();
            
            JOptionPane.showMessageDialog(null, "Correo enviado");
            
            
        } catch (AddressException ex) {
            Logger.getLogger(Correo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } catch (MessagingException ex ){
            Logger.getLogger(Correo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }

}
