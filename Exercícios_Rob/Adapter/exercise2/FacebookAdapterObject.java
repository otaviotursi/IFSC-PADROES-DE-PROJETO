
public class FacebookAdapterObject implements SocialNetworks{
	private Facebook facebook;
	
	public void Share(String message) {
		facebook.updateStatus(message);
	}
}
