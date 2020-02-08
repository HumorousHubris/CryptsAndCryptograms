package com.squidstudios.cryptsandcryptogramsproject;

public class Game {
    boolean[] doorsUnlocked;
    Room[] rooms;
    //Player player;
    Room playerLocation; //maybe add to player class?

    public Game(){ //define all of the rooms here!
        /*
        example:
        rooms = new room[x]; <- where x is the total number of rooms in the game.
        rooms[0] = new Room(...) //each room instantiated manually.
         */
        //TODO player = new Player()
        playerLocation = rooms[0]; //start the player in the first room
        //Todo any more game start protocols
    }
}
