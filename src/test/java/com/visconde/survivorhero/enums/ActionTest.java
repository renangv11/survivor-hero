package com.visconde.survivorhero.enums;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActionTest {

    private Action action;

    @Test
    public void should_move_up(){
        char[][] board = {{'V', '0', '0'}, {'0', '0', '0'}, {'0', '0', 'H'}};

        Action.UP.move(board);

        Assertions.assertEquals(board[1][2], 'H');
        Assertions.assertEquals(board[0][1], 'V');
        Assertions.assertEquals(board[0][0], '0');
        Assertions.assertEquals(board[2][2], '0');
    }

    @Test
    public void should_move_down(){
        char[][] board = {{'V', '0', '0'}, {'0', '0', '0'}, {'0', '0', 'H'}};

        Action.DOWN.move(board);

        Assertions.assertEquals(board[1][2], 'H');
        Assertions.assertEquals(board[0][1], 'V');
        Assertions.assertEquals(board[0][0], '0');
        Assertions.assertEquals(board[2][2], '0');
    }

    @Test
    public void should_move_right(){
        char[][] board = {{'V', '0', '0'}, {'0', '0', '0'}, {'0', '0', 'H'}};

        Action.RIGHT.move(board);

        Assertions.assertEquals(board[1][2], 'H');
        Assertions.assertEquals(board[0][1], 'V');
        Assertions.assertEquals(board[0][0], '0');
        Assertions.assertEquals(board[2][2], '0');
    }

    @Test
    public void should_move_left(){
        char[][] board = {{'V', '0', '0'}, {'0', '0', '0'}, {'0', '0', 'H'}};

        Action.LEFT.move(board);

        Assertions.assertEquals(board[1][2], 'H');
        Assertions.assertEquals(board[0][1], 'V');
        Assertions.assertEquals(board[0][0], '0');
        Assertions.assertEquals(board[2][2], '0');
    }



}
