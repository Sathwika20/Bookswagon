package com.bridgelabz.utility;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class EmailReports {
    public static void sendReportsThroughEmail(){
        //Create Object of properties class
        Properties props = new Properties();
        //this will set host of server
        props.put("mail.smtp.host", "smtp.gmail.com");
        //set the port of socket factory
        props.put("mail.smtp.socketFactory.port", "587");
        //set socket factory
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        //set the authenication to true
        props.put("mail.smtp.auth", "true");
        //set the port of smtp server
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.starttls.enable","true");
        //This will handle the complete authenication
        Session session = Session.getDefaultInstance(props,
                new  javax.mail.Authenticator() {
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("gopirajsathwika1999@gmail.com", "sathWIKA@20");

                    }

                });

        try {
            //Create object of MimeMessage class
            Message message = new MimeMessage(session);
            //Set the from address
            message.setFrom(new InternetAddress("gopirajsathwika1999@gmail.com"));
            //Set the recipient address
            message.setRecipients(javax.mail.Message.RecipientType.TO, InternetAddress.parse("gopirajsathwika1999@gmail.com"));
            //Add the subject link
            message.setSubject("Testing Subject");
            //Create object to add multimedia type contect
            BodyPart messageBodyPart1 = new MimeBodyPart();
            //Set the body of email
            messageBodyPart1.setText("email sent successful");
            //Create another object to add another content
            MimeBodyPart messageBodyPart2 = new MimeBodyPart();
            //Add the path of the file and load the file
            String filename = "C:\\Users\\gopir\\IdeaProjects\\Log4jDemo\\test-output\\Flipkart_Extent.html";
            //Create the object of the file class and pass the file
            File file = new File(String.valueOf(new File(filename)));
            //Set the file
            messageBodyPart2.attachFile(file);
            //Create object of multipart class
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart2);
            multipart.addBodyPart(messageBodyPart1);
            message.setContent(multipart);
            //Send the message
            Transport.send(message);
            System.out.println("Email Sent");
        } catch (MessagingException | IOException e) {
            throw new RuntimeException(e);

        }

    }
}
