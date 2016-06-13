package com.company;

import java.util.Random;

public class Game {
    private  Board board;
    private Random random;
    public Game(){
        initializeGame();
        displayBoard();
        makeFirstMove();
        playGame();
        checkStatus();
    }

    private void playGame() {
        while (this.board.isRunning()){
            System.out.println("User Move : ");
            Cell userCell= new Cell(board.getScanner().nextInt(), board.getScanner().nextInt());
            this.board.move(userCell, Player.USER);
            displayBoard();
            if (!this.board.isRunning()){
                break;
            }
            this.board.callMinimax(0, Player.COMPUTER);
            for (Cell cell : this.board.getRootValues()){
                System.out.println("Cell Value : "+cell+" Minimax Value : "+ cell.getMinimaxValue());
            }
            this.board.move(board.getBestMove(),Player.COMPUTER);
            displayBoard();
        }
    }

    private void makeFirstMove() {
        System.out.println("Who Starts ? 1- Computer ; 2- User");
        int choice =board.getScanner().nextInt();
        if (choice==1){
            Cell cell= new Cell(random.nextInt(Constants.BOARD_SIZE), random.nextInt(Constants.BOARD_SIZE));
            this.board.move(cell, Player.COMPUTER);
            displayBoard();
        }
    }
    

    private void displayBoard() {
        this.board.displayBoard();
    }

    private void checkStatus() {
        if (board.isWinning(Player.COMPUTER)){
            System.out.println("Computer Has Won!");
        }else if (board.isWinning(Player.USER)){
            System.out.println("User Have Won!");
        }else {
            System.out.println("It's a Draw!");
        }
    }

    private void initializeGame() {
        this.board = new Board();
        this.board.setupBoard();
        this.random= new Random();
        
    }
}
