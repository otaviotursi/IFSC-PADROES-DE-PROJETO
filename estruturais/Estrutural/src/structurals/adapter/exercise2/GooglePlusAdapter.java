package structurals.adapter.exercise2;

public class GooglePlusAdapter extends GooglePlus implements SocialNetworks {
	public void Share(String string){
		post(string);
	}
}
