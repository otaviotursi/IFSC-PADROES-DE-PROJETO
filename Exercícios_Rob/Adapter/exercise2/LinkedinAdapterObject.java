
public class linkedinAdapterObject implements SocialNetworks{
	private Linkedin linkedin;
	
	public void Share(String message) {
		linkedin.submit(message);
	}
}
