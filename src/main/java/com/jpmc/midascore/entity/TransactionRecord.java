package com.jpmc.midascore.entity;

import jakarta.persistence.*;

@Entity
public class TransactionRecord {

    @Id
    @GeneratedValue
    private Long id;

    private long senderId;
    private long recipientId;
    private float amount;

    protected TransactionRecord(){}

    public TransactionRecord(long senderId, long recipientId, float amount){
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.amount = amount;
    }

    public long getSenderId(){
        return senderId;
    }

    public long getRecipientId(){
        return recipientId;
    }

    public float getAmount(){
        return amount;
    }
}