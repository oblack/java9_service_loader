package one.genchev.java9.app;

import one.genchev.java9.server.*;
import one.genchev.java9.server.programming.Programming;
import one.genchev.java9.server.kid.Kid;

import java.util.LinkedHashMap;

public class Main {
	public static void main(String [] args) {
		final int JOKE_COUNT = 5;

		LinkedHashMap<String, Server> servers = new LinkedHashMap<>();
		servers.put("1", new Programming());
		servers.put("2", new Kid());

//		System.out.println(JOKE_COUNT + " random jokes from " + servers.getName());
		for(int i=0; i<JOKE_COUNT; i++) {
			System.out.println(servers.get("1").getRandomJoke() + "\n");
            System.out.println(servers.get("2").getRandomJoke() + "\n");
		}
	}
}