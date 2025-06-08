package com.skypro.account.v4;

class TransverAction {

    String fromName;
    String toName;
    int amount;

    public TransverAction(String fromName, String toName, int amount) {
        this.fromName = fromName;
        this.toName = toName;
        this.amount = amount;
    }

    public String toString() {
        return fromName + " передает " + toName + " " + amount;
    }
}
