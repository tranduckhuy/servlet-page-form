package me.duchuy.servletpageform.util;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ADMIN
 */
public class Email {

    // Pw: bxku gcnk ndqp qdka
    
    public static boolean sendEmail(String subject, String to, String content) {
        final String from = "duchuy81.1610@gmail.com";
        final String password = "bxkugcnkndqpqdka";
        
        //Properties: Declare properties
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP HOST
        props.put("mail.smtp.port", "587"); // TLS 587, SSL 465
        props.put("mail.smtp.auth", "true"); 
        props.put("mail.smtp.starttls.enable", "true"); 
        
        // create Authenticator
        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        };
        
        // Create working session
        Session session = Session.getInstance(props, auth);
        
        MimeMessage message = new MimeMessage(session);
        
        try {
            // Content type
            message.addHeader("Content-type", "text/HTML; charset=UTF-8");
            
            // Sender
            message.setFrom(from);
            
            // Receiver
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));
            
            // Title
            message.setSubject(subject + " " + System.currentTimeMillis());
            
            // Sending date regulations 
            message.setSentDate(new Date());
            
            // Receiving response date regulations (Mean: after receiving email, reply to another email. Default -> reply to sender)
//            message.setReplyTo(message.getFrom());
            
            // Content
            message.setText(content, "UTF-8");
            
            // Send email
            Transport.send(message);
            
            return true;
        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }
    }
}
