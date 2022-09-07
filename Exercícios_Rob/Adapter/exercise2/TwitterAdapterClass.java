
public class TwitterAdapterClass  extends Facebook implements SocialNetworks{
	public void Share(String message) {
		send(message);
	}
}
