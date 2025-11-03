package com.cmoncrieffe.dice;

public enum DiceSize {
    D2(2),
    D4(4),
    D6(6),
    D8(8),
    D10(10),
    D12(12),
    D20(20),
    D100(100);

    private final int size;

    DiceSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
