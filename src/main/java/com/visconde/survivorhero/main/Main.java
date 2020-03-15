package com.visconde.survivorhero.main;

import com.visconde.survivorhero.enums.Action;
import com.visconde.survivorhero.model.Board;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.startGame();

        do{
            String input = getInputs();
            Action.valueOf(input).move(board);
        } while(true);

    }

    private static String getInputs() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
}
