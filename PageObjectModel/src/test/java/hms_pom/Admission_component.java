package hms_pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Admission_component extends HMS_Base{
	login_loc login = new login_loc();
	Admission_loc a = new Admission_loc();
	
	public void login(){
		open();	
	    send(login.username,"user1");
		send(login.password,"user1");
		click(login.submit);
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	
	public void Admission()throws Exception{
		
		click(a.Admission);
		send(a.Pid,"123456");
		send(a.Pname,"Kiran");
		send(a.MRNO,"PR");
		Thread.sleep(1000);
		PR();
		send(a.Request,"7799036");
		send(a.Admissiontype,"Others");
		click(a.Admissiondate);
		Thread.sleep(1000);
		click(a.Date);
		select(a.Patientclass,"1st Class");
		send(a.Expecteddays,"3");
		select(a.StayFormat,"Weeks");
		select(a.Insurance,"Yes");
		click(a.Discharge);
		click(a.Dischargedate);
		send(a.Adsource,"1st Class");
		select(a.Hospitalservice,"Consultation");
		select(a.Doctorname,"Sai");
		select(a.subservice,"Consultation");
		select(a.Speciality,"Cordialagist");
		send(a.Diagonsis,"Heyyy");
		send(a.primaryconsultant,"hello");
		send(a.chief,"worries");
		select(a.Speciality2,"cordialagist");
		send(a.Notes,"Test on SE");
		select(a.DocName,"sharath");
		select(a.SnrProof,"No");
		send(a.EpisodeNo,"123456");
		send(a.EncounterNo,"7895461");
		send(a.Episodedes,"Test SE");
		select(a.billingBedclass,"1ST");
		select(a.admittedBed,"1ST");
		select(a.Bedno,"BED-2");
		select(a.Nurse,"Rani");
		select(a.Ward,"9");
		select(a.Aumblance,"Walking");
		select(a.Arrival,"With Family Members");
		send(a.PatientValuables,"Gold Ring & Chain");
		select(a.capture,"Admin");
		click(a.Date2);
		click(a.Date3);
		click(a.Submit);
		d.switchTo().alert().accept();
		
		
		
	}
	public void quit(){
		close();
	}
	
	public void PR(){
		 String s = d.findElement(By.xpath(".//*[@id='results']")).getText();
		  String [] str = s.split("\n");
		  for(int i=0;i<str.length;i++){
			  if(str[i].equalsIgnoreCase("PR1656632077")){
				  d.findElement(By.name("MR_NO")).clear();
				  //d.findElement(By.name("MR_NO")).sendKeys(str[i]);
				  send(a.MRNO,str[i]);
			  }
	}
	

	}
}
