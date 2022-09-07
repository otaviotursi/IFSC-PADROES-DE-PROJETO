
public class TwitterAdapterObject implements SocialNetworks{
	private Twitter twitter;
	
	public void Share(String message) {
		twitter.send(message);
	}
}
