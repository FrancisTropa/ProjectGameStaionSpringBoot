package com.ProjectGameStation.GameStation;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
    public static void main(String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "GameStation";
        config.width = 640;
        config.height = 480;

        Juego juego = new Juego() {
            @Override
            public void create() {
                setScreen(new MenuScreen(this));
            }
        };

        new LwjglApplication(juego, config);
    }
}