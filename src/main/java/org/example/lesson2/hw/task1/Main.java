package org.example.lesson2.hw.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Actions[] players = {
                new Cat("Barsik", 500, 2),
                new Human("Oleg", 1000, 1),
                new Robot("R2D2", 200, 3)
        };
        Stage[] stages = {
            new Runningtrack("road1", 200),
                new Wall("stena1", 1),
                new Runningtrack("road2",500)
        };
        for (Actions player : players) {
            System.out.println(player.getName());
            for (Stage stage : stages) {
                if (stage instanceof Wall) {
                    if (stage.stageRun(player.getJumpHeight())){
                        stage.stageRun(player.getJumpHeight());
                    } else {
                        System.out.println("Закончил соревнование");
                        break;
                    };
                } else {
                    if(stage.stageRun(player.getRunDistance())) {
                        stage.stageRun(player.getRunDistance());
                    }else{
                        System.out.println("Закончил соревнование");
                        break;
                    }
                }
            }
        }
    }
}
