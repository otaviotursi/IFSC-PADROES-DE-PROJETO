
public class FacebookAdapterClass extends Facebook implements SocialNetworks{
	public void Share(String message) {
		updateStatus(message);
	}
}
