package structurals.adapter.exercise2;

public class FacebookAdapter extends Facebook implements SocialNetworks  {

	@Override
	public void Share(String string) {
		updateStatus(string);
	}

	
}
