package myproject.model;

import java.awt.Dimension;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailService {

	// Autowired the mail sender bean here

	@Autowired
	private JavaMailSender mailSender;

	// email name which is not similar to the username
	private static String from = "Car_Rental_Zoo";

	/**
	 * approvedUserMessage method will be called using emailService that can be
	 * Autowired args - User requires the user object to fetch the email and
	 * other content of the user to send the email
	 */
	
	public void approvedUserMessage(User user) {

		// Mime message is used to send email like an HTML page
		MimeMessage mimeMessage = mailSender.createMimeMessage();

		MimeMessageHelper helper = null;

		try {

			// instantiating the helper and attaching it with mimeMessage
			helper = new MimeMessageHelper(mimeMessage, false, "utf-8");

			
			// set up your HTML message here
			StringBuilder htmlMsg = new StringBuilder();
			
			htmlMsg.append("<h1>Welcome " + user.getUserName() + "  to CarZoo!!</h1>");
			htmlMsg.append("<p>Your account has been activated!</p><br/>");
			htmlMsg.append("<p>Thanks for joining with us! VROOOM! VROOOM!</p><br/>");

			// add the HTML content to the mimeMessage
			mimeMessage.setContent(htmlMsg.toString(), "text/html");
			// set the subject and recipient of the email
			System.out.println(user.getUserEmail());
			helper.setTo(user.getUserEmail());
			helper.setSubject("WELCOME TO CarZoo");
			helper.setFrom(from);

			// send the message
			mailSender.send(mimeMessage);

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
     public void approvedOrder(User user,Shipping ship,Product pro)
     {
    	 MimeMessage mimeMessage = mailSender.createMimeMessage();
    	 MimeMessageHelper helper = null;
    	try {
    	 helper = new MimeMessageHelper(mimeMessage, false, "utf-8");
    	 StringBuilder htmlMsg = new StringBuilder();
    	 htmlMsg.append("<h2>Dear"+ user.getUserName() + "</h2>");
    	 htmlMsg.append("<p>We thought you'd like to know that we have completed your renting process. If you want to rent more or have any queries regarding the same, please visit us at <b>CarRentalZoo.com</b><br><br> </p>");
    	 htmlMsg.append("<p>Have a safe driving ,<br></p>");
    	 htmlMsg.append("<p>Team CarZoo</p>");
    	 JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
    	 separator.setPreferredSize(new Dimension(200,3));
    	// htmlMsg.append("<h2>DropDown Address</h2>");
    	 //htmlMsg.append(ship.getApartNo() );
    	 //htmlMsg.append( ship.getStreetName() );
    	 //htmlMsg.append( ship.getCity() );
    	 //htmlMsg.append( ship.getState());
    	 //htmlMsg.append( ship.getCountry() );
    	 //htmlMsg.append( ship.getZipcode());
    	 
    	
    				mimeMessage.setContent(htmlMsg.toString(), "text/html");
    				// set the subject and recipient of the email
    				System.out.println(user.getUserEmail());
    				helper.setTo(user.getUserEmail());
    				helper.setSubject("Your Car is ready for renting!!");
    				helper.setFrom(from);

    				// send the message
    				mailSender.send(mimeMessage);
    	} catch (MessagingException e) {
			e.printStackTrace();
		}
    	 
     }   
}