package mapper;

public class CreateUser_Map {
	  private String Username,Password,Firstname,Lastname,Phone,Middle_Initial, Mobile,E_mail_Address,Other_Contact,Enable_Overtime_Tracking,Access_Rights ;


	  public String Username () 
	  {
	    return Username;
	  }

	  public String Password () 
	  {
	    return Password;
	  }
	  
	  
	  public String Firstname ()
	  {
	    return Firstname;
	  }
	  
	  public String Lastname ()
	  {
		    return  Lastname;
      }

	  public String Phone ()
	  {
		    return Phone;
      }
	  
	  public String Middle_Initial()
	  {
		    return Middle_Initial;
      }
	  
	  public String Mobile()
	  {
		    return Mobile;
      }
	  
	  public String E_mail_Address()
	  {
		    return E_mail_Address;
      }

	  public String Other_Contact()
	  {
		    return Other_Contact;
      }
	  
	  public String Enable_Overtime_Tracking()
	  {
		    return Enable_Overtime_Tracking;
      }

	  public String Access_Rights()
	  {
		    return Access_Rights;
      }
	  
	  public String toString () {
	    final StringBuilder sb = new StringBuilder("CreateUser{");
	    sb.append(Username+Firstname+Lastname+Phone+Middle_Initial+Mobile+E_mail_Address+Other_Contact+Enable_Overtime_Tracking+Access_Rights +'}');
	    return sb.toString();
	  }}
	