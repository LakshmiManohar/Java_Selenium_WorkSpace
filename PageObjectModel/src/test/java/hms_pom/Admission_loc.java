package hms_pom;

import org.openqa.selenium.By;

public class Admission_loc {
	
	By Admission = By.linkText("ADT");
	By Pid  = By.name("PNT_ID");
	By Pname = By.name("BOOKING_ID");
	By MRNO    = By.name("MR_NO");
	By Request = By.name("REQ_ID");
	By Admissiontype =By.name("ADM_TPYE");
	By Admissiondate = By.name("EXP_DATE");
	By Date = By.xpath("//td[@onclick='f_tcalUpdate(1477809000000)']");
	By Patientclass = By.name("PNT_CLASS");
	By Expecteddays = By.name("EXP_STAY_DATE");
	By StayFormat          = By.name("EXP_STAY_FORMAT");
	By Insurance  = By.name("INSU_PLAN");
	By Discharge = By.name("EXP_DISCHARGE_DATE");
	By Dischargedate = By.xpath("//table[@id='tcalGrid']/tbody/tr[3]/td[5]");
	By Adsource = By.name("ADM_SOURSE");
	By Hospitalservice = By.name("HOSPITAL_SERVICES");
	By Doctorname = By.name("DOC_NAME");
	By subservice = By.name("HOSPITAL_SUB_SERVICES");
	By Speciality = By.name("DOC_SPL");
	By Diagonsis = By.name("PROVI_DIAGNOS");
	By primaryconsultant = By.name("PRMRY_CONSULT");
	By chief  = By.name("CHIEF_COMPLAINT");
	By Speciality2 = By.name("ADD_DOC_SPL");
	By Notes = By.name("NOTES");
	By DocName = By.name("ADD_DOC_NAME");
	By SnrProof = By.name("SC_PROOF");
	By EpisodeNo = By.name("EPISODE_NO");
	By EncounterNo = By.name("ENCOUNTER_NO");
	By Episodedes =  By.name("EPISODE_DEC");
	By billingBedclass  = By.name("BED_CLASS");
	By admittedBed = By.name("ADM_BED_CLASS");
	By Bedno = By.name("BED_NUM");
	By Nurse = By.name("NURSING_STATION");
	By Ward = By.name("WARD_NUM");
	By Aumblance = By.name("AMBULATORY_STATUS");
	By Arrival  = By.name("MODE_ARRIVAL");
	By PatientValuables = By.name("PNT_VALUBLES");
	By capture = By.name("CAPTURED_BY");
	By Date2 = By.name("CAPTURED_DATE");
	By Date3 =By.xpath("//table[2]/tbody/tr[4]/td[2]");
	By Submit = By.name("submit");
	

}
