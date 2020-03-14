package com.visconde.survivorhero.model;

import com.visconde.survivorhero.enums.Action;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Board {

    public static final char HERO = 'H';
    public static final char VILLAIN = 'V';

    private char[][] board;
    private Integer totaLines;
    private Integer totalColumns;

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

    public void setBoard(Position heroPosition, Position villainPosition) {
        if(Objects.nonNull(this.board)){
            throw new RuntimeException("Tabuleiro do jogo já foi gerado.");
        }
        this.totaLines = defineSize(heroPosition.getLine(), villainPosition.getLine());
        this.totalColumns = defineSize(heroPosition.getColumn(), villainPosition.getColumn());
        this.board = new char[totaLines][totalColumns];
    }

    private int defineSize(int heroSize, int villainSize) {
        if(heroSize >= villainSize){
            return heroSize;
        }
        return villainSize;
    }

}
