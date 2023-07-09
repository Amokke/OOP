package org.example.lesson3.cw.task3;

import java.util.List;

public interface Game
{
    void start (int wordLength, int attempts);

    Answer inputValue (String input);

    GameStatus getGameStatus ();
    List<String> getLog();
    void restart();
}
