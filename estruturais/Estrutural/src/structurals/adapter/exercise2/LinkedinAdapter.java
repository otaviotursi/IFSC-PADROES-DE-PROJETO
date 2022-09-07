package structurals.adapter.exercise2;

public class LinkedinAdapter extends Linkedin implements SocialNetworks {
	public void Share(String string){
		submit(string);
	}
}
