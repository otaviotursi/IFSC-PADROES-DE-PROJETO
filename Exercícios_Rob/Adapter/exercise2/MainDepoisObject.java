package structurals.adapter.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MainDepois {
	public static void main(String[] args) {
		List<SocialNetworks> list =  new ArrayList<SocialNetworks>();
		Facebook facebook = new Facebook();
		Linkedin linkedin = new Linkedin();
		Twitter twitter = new Twitter();
		GooglePlus google = new Google();
		list.add(new FacebookAdapterObject(facebook));
		list.add(new LinkedinAdapterObject(linkedin));
		list.add(new TwitterAdapterObject(twitter));
		list.add(new GooglePlusAdapterObject(google));
				
		for (SocialNetworks socialNetworks: list) {
			socialNetworks.Share("Message");
		}
	} 
}
