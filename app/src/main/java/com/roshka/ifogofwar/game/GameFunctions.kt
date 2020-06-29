package com.roshka.ifogofwar.game

/**
 * Returns:
 *  -1 if p0 defeats p1
 *  0 if there is a tie
 *  1 if p1 defeats p0
 */
fun defeats(p0: PieceValue, p1: PieceValue) : Int {

    if (p0.value == p1.value)
        return 0

    // special case #1: BOMB
    if (p0 == PieceValue.BOMB || p1 == PieceValue.BOMB) {
        // special case if the other piece is a MINER
        if (p0 == PieceValue.MINER)
            return -1
        else if (p1 == PieceValue.MINER)
            return 1
    }

    // special case #2: SPY
    if (p0 == PieceValue.SPY || p1 == PieceValue.SPY) {
        return if (p0 == PieceValue.GENERAL) -1 else 1
    }

    // genereal case
    return if (p0.value > p1.value) -1 else 0

}