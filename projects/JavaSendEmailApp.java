package send_email;
import javax.mail.Authenticator;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class JavaSendEmailApp {
	public static void sendMail(String recepient) {
		System.out.println("Preparing to send email....");
		Properties properties = new Properties();
		properties.put("mail.smtp.auth","true");
		properties.put("mail.smtp.starttls.enable","true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.setup.port", "587");
		
		String username = "username";
		String password  = "password";
		
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
		            protected PasswordAuthentication getPasswordAuthentication() {
		                return new PasswordAuthentication(username, password);
		            }
		    });
		Message message = preparedMessage(session,username,recepient);
		try {
			Transport.send(message);
		}
			catch(Exception e) {
				e.printStackTrace();
			
		
			}
		System.out.println("Email Sent Successfully to "+recepient);
		
		
		}
	private static Message preparedMessage(Session session, String username, String recepient) {
		Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(username));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
			message.setSubject("TEST EMAIL");
			message.setText("Hello, \n Hi there, hope ur doing good Kirthivasan");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return message;
	}
	}
