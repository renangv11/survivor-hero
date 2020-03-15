package com.visconde.survivorhero.enums;

import com.visconde.survivorhero.model.Board;
import com.visconde.survivorhero.model.Position;

public enum Action implements Moveable{
    UP{
        @Override
        public void move(Board board) {
            Position heroOldPosition = board.getPosition(Board.HERO);
            Position position = new Position(heroOldPosition.getLine() - 1, heroOldPosition.getColumn());
            board.changePosition(Board.HERO, heroOldPosition, position);
            //TODO - Lógica de mover o vilão
            //TODO - Lógica da colisão
        }
    },
    DOWN {
        @Override
        public void move(Board board) {
            Position heroOldPosition = board.getPosition(Board.HERO);
            Position position = new Position(heroOldPosition.getLine() + 1, heroOldPosition.getColumn());
            board.changePosition(Board.HERO, heroOldPosition, position);
            //TODO - Lógica de mover o vilão
            //TODO - Lógica da colisão
        }
    },
    RIGHT {
        @Override
        public void move(Board board) {
            Position heroOldPosition = board.getPosition(Board.HERO);
            Position position = new Position(heroOldPosition.getLine(), heroOldPosition.getColumn() + 1);
            board.changePosition(Board.HERO, heroOldPosition, position);
            //TODO - Lógica de mover o vilão
            //TODO - Lógica da colisão
        }
    },
    LEFT {
        @Override
        public void move(Board board) {
            Position heroOldPosition = board.getPosition(Board.HERO);
            Position position = new Position(heroOldPosition.getLine(), heroOldPosition.getColumn() - 1);
            board.changePosition(Board.HERO, heroOldPosition, position);
            //TODO - Lógica de mover o vilão
            //TODO - Lógica da colisão
        }
    };
}
