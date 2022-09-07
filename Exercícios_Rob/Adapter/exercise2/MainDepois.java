package structurals.adapter.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MainDepois {
	public static void main(String[] args) {
		List<SocialNetworks> list =  new ArrayList<SocialNetworks>();
		list.add(new FacebookAdapterClass());
		list.add(new LinkedinAdapterClass());
		list.add(new TwitterAdapterClass());
		list.add(new GooglePlusAdapterClass());
				
		for (SocialNetworks socialNetworks: list) {
			socialNetworks.Share("Message");
		}
	} 
}
