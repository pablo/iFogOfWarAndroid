package com.roshka.ifogofwar.game

class Game {

    enum class Status {
        BOARD_SETUP,
        READY_TO_START,
        STARTED,
        FINISHED
    }

    val status: Status = Status.BOARD_SETUP

    val board: Array<Array<Piece?>>
    init {
        // intialize board with no pieces on it
        board = Array(10) {
            Array<Piece?>(10) { null }
        }
    }





}