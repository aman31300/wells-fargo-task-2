package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@SuppressWarnings("unused")
@Entity
public class Portfolio
{
    @Column
    @Id
    @GeneratedValue()
    Long portfolioId;
    @Column
    @Id
    @GeneratedValue()
    Long ClientId;
    @Column
    Date creationDate;

    public Portfolio(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
