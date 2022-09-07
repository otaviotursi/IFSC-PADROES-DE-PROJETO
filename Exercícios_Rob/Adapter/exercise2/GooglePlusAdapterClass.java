
public class GooglePlusAdapterClass  extends Facebook implements SocialNetworks{
	public void Share(String message) {
		post(message);
	}
}
