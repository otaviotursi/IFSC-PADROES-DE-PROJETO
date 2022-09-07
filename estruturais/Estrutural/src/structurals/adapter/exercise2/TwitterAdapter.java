package structurals.adapter.exercise2;

public class TwitterAdapter extends Twitter implements SocialNetworks {
	public void Share(String string){
		send(string);
	}
}
