package hms_pom;

public class login_component extends HMS_Base {
	
	login_loc login = new login_loc();
	Registration_loc r = new Registration_loc();
	
	public void login(){
	open();	
    send(login.username,"user1");
	send(login.password,"user1");
	click(login.submit);
	}
	
	public void Registration(){
		
		click(r.Registration);
		select(r.Patient,"Self");
		select(r.Title,"Mr.");
		send(r.FirstName,"Siva");
		send(r.MiddleName,"Ram");
		send(r.LastName,"Kishna");
		click(r.DOB);
		click(r.Date);
		send(r.Age,"23");
		select(r.Gender,"Male");
		select(r.MaritalStatus,"Single");
		select(r.Religion,"Hindu");
		select(r.Language,"Telugu");
		select(r.Relation,"Brother");
		send(r.MotherMadien,"Abcde");
		select(r.Identify,"Voter ID");
		send(r.PAN,"APV120457");
		select(r.nation,"Indian");
		select(r.VIP,"Yes");
		select(r.Education,"B.Tech");
		select(r.Job,"Employee");
		select(r.Bloodgroup,"A+");
		select(r.Citizen,"Indian");
		select(r.Proof,"No");
		send(r.Address,"Hyderabad");
		send(r.Mobile,"9988776655");
		send(r.Mail,"siva@siva.com");
		select(r.Country,"India");
		send(r.zip,"500016");
		send(r.upload,"C:\\Users\\Manohar\\Desktop\\Z.jpeg");
		click(r.submit);
		
		
		
	}
	
	public void quit(){
		close();
	}

}
