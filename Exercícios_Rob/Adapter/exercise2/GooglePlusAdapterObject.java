
public class GooglePlusAdapterObject implements SocialNetworks{
	private GooglePlus google;
	
	public void Share(String message) {
		google.post(message);
	}
}
