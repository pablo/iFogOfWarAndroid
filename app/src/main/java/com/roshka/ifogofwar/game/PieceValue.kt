package com.roshka.ifogofwar.game

enum class PieceValue(val value: Int, val count: Int) {
    FLAG (0x00, 1),
    SPY (0x01, 1),
    SCOUT (0x02, 8),
    MINER (0x03, 5),
    SERGEANT (0x04, 4),
    LIEUTENANT (0x05 ,4),
    CAPTAIN (0x06, 4),
    MAJOR (0x07, 3),
    COLONEL (0x08, 2),
    GENERAL (0x09, 1),
    MARSHAL (0x0A, 1),
    BOMB (0x0B, 6)
}