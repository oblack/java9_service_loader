package one.genchev.java9.server;

import java.util.List;
import java.util.logging.*;

public interface Server {

    String getRandomJoke();

    int getJokeCount();

    String getName();
}