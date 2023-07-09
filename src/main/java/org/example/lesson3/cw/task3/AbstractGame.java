package org.example.lesson3.cw.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    protected int wordLength;
    protected int tryCount;
    protected String word;
    protected GameStatus status = GameStatus.INIT;
    protected List<String> log = new ArrayList<>();
    protected int humTry;


    public AbstractGame(int wordLength, int tryCount, String word, GameStatus status) {
        this.wordLength = wordLength;
        this.tryCount = tryCount;
        this.word = word;
        this.status = status;
        this.log = new ArrayList<>();

        this.humTry = 0;
    }

    public AbstractGame(){

    }

    @Override
    public void start(int lengthWord, int countTry) {
        status = GameStatus.START;
        this.wordLength = lengthWord;
        this.tryCount = countTry;
        this.word = generateWord();
        this.log.add(String.format("Запуск игры %s; Число попыток: %d; Загаданное слово: %s",
                getNameGame(), countTry, this.word));
        System.out.println("word = " + word);
    }


    private String generateWord() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        List<String> strList = generateCharList();
        for (int i = 0; i < wordLength; i++) {
            int ind = r.nextInt(strList.size());
            sb.append(strList.get(ind));
            strList.remove(ind);
        }
        return sb.toString();
    }

    public abstract List<String> generateCharList();
    public abstract String getNameGame();

    @Override
    public Answer inputValue(String input) {
        humTry++;
        if (--tryCount == 0){
            int bulls = 0;
            int cows = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == word.charAt(i)){
                    bulls++;
                }
                if (word.contains(String.valueOf(input.charAt(i)))) {
                    cows++;
                }
            }
            log.add(String.format("Попытка № %d; введенный вариант - %s; " +
                    "быки = %d, коровы = %d", humTry, input, bulls, cows));
            if (bulls == wordLength) {
                log.add(String.format("Победил с %d попытки; быки = %d, коровы = %d", humTry, bulls, cows));
                status = GameStatus.WIN;
            } else  {
                log.add("Проигрыш");
                status = GameStatus.FINISH;
            }
            return new Answer(bulls, cows);
        }
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == word.charAt(i)){
                bulls++;
            }
            if (word.contains(String.valueOf(input.charAt(i)))) {
                cows++;
            }
        }
        log.add(String.format("Попытка № %d; введенный вариант - %s; " +
                "быки = %d, коровы = %d", humTry, input, bulls, cows));
        if (bulls == wordLength) {
            log.add(String.format("Победил с %d попытки; быки = %d, коровы = %d", humTry, bulls, cows));
            status = GameStatus.WIN;
        }
        return new Answer(bulls, cows);
    }

    @Override
    public GameStatus getGameStatus() {
        return status;
    }

    @Override
    public List<String> getLog(){
        return log;
    }
    @Override
    public void restart(){
        this.log = new ArrayList<>();
        this.humTry = 0;
    }


}