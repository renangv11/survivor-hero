package com.visconde.survivorhero.main;

import com.visconde.survivorhero.enums.Action;
import com.visconde.survivorhero.model.Board;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        board.startGame();

        do{
            String input = getInputs();
            Action.valueOf(input).move(board);
        } while (!board.isCrashed());

        out.println("Game Over");
    }

    private static String getInputs() {
        Scanner scan = new Scanner(in);
        return scan.next();
    }
}
