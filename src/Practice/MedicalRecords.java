package Practice;

public class MedicalRecords {

	public static void main(String[] args) {
		int pid=16;
		String pFname="deepa";
		String pLname="dwarpalak";
		int pinsur=300;
		long pphone_num= 4567892345L;
		int pcharges=1000;
		int pbill_to_be_paid=pcharges-pinsur;
		char ward='A';
		byte room_num= 80;
		
		System.out.println("Pateient ID:                  "+pid);
		System.out.println("Pateint First Name:           "+pFname);
		System.out.println("Pateint Last Name:            "+pLname);
		System.out.println("Pateint Phone Number:         "+pphone_num );
		System.out.println("Bill to be paid by patient:   "+pbill_to_be_paid);
		System.out.println("Pateint Ward :                "+ward);
		System.out.println("Pateint room number:          "+room_num);

	}

}
