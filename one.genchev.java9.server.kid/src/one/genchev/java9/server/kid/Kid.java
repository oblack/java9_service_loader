package one.genchev.java9.server.kid;

import java.util.List;
import one.genchev.java9.server.Server;

public class Kid implements Server {

	private List<String> jokes = List.of(
            "What do you call an old Snowman?\nWater",
            "Which dinosaur knew the most words?\nThe Thesaurus",
            "What is orange and sounds like a parrot?\nA carrot",
            "Why did the cow cross the road?\nIt wanted to go to the mooovies",
            "What did one wall say to the other wall?\nI'll meet you at the corner",
            "What has four wheels and flies?\nA garbage truck"
    );

    private static int getRandomInteger(int maximum, int minimum){
    	return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }

    public String getRandomJoke() {
    	int index = getRandomInteger(getJokeCount(), 0);
		return jokes.get(index);    	
    }

    public int getJokeCount() {
    	return jokes.size();
    }

    public String getName() {
    	return "Kid server for jokes";
    }
}