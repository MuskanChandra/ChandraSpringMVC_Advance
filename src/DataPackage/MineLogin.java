package DataPackage;

public class MineLogin 
{
	String username;
	String password;
	String cm_password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCm_password() {
		return cm_password;
	}
	public void setCm_password(String cm_password) {
		this.cm_password = cm_password;
	}
	
	public boolean validate()
	{
		if(username.compareTo("Chandra")==0)
		{
			if(password.compareTo("muskan")==0)
			{
				if(cm_password.compareTo("muskan")==0)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		
		return false;
	}
}
