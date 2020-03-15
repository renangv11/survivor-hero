package com.visconde.survivorhero.model;

import java.util.Objects;
import java.util.Random;

import static java.lang.Math.abs;

public class Board {

    public static final char HERO = 'H';
    public static final char VILLAIN = 'V';
    public static final int MAX_SIZE = 10000;

    private char[][] board;
    private Integer totaLines;
    private Integer totalColumns;

    public void startGame() {
        Random random = new Random();
        Position heroPosition = new Position(abs(random.nextInt(MAX_SIZE)), abs(random.nextInt(MAX_SIZE)));
        Position villainPosition = new Position(abs(random.nextInt(MAX_SIZE)), abs(random.nextInt(MAX_SIZE)));
        this.setBoard(heroPosition, villainPosition);
    }

    public Position getPosition(char character){
        //TODO método a ser otimizado
        int columnPosition = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == character){
                    return new Position(i, j);
                }
            }
        }
        throw new RuntimeException("Personagem não encontrado.");
    }

    public void changePosition(char character, Position oldPosition, Position newPosition){
        if(newPosition.getLine() > totaLines || newPosition.getLine() < 0){
            throw new RuntimeException("O personagem não pode ir nessa direção");
        }
        if(newPosition.getColumn() > totalColumns || newPosition.getColumn() < 0){
            throw new RuntimeException("O personagem não pode ir nessa direção");
        }
        board[oldPosition.getLine()][oldPosition.getColumn()] = '0';
        board[newPosition.getLine()][newPosition.getColumn()] = character;
    }

    private void setBoard(Position heroPosition, Position villainPosition) {
        if(Objects.nonNull(this.board)){
            throw new RuntimeException("Tabuleiro do jogo já foi gerado.");
        }
        this.totaLines = defineSize(heroPosition.getLine(), villainPosition.getLine());
        this.totalColumns = defineSize(heroPosition.getColumn(), villainPosition.getColumn());
        this.board = new char[totaLines][totalColumns];
        board[heroPosition.getLine() - 1][heroPosition.getColumn() - 1] = HERO;
        board[villainPosition.getLine() -1 ][villainPosition.getColumn() - 1] = VILLAIN;
    }

    private int defineSize(int heroSize, int villainSize) {
        if(heroSize >= villainSize){
            return heroSize;
        }
        return villainSize;
    }

}
