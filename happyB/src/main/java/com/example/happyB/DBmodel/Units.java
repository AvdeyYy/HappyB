package com.example.happyB.DBmodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity(name = "units")
public class Units {

    @Getter
    @Setter
    @Id
    private String ID;

    @Getter
    @Setter
    private String Day_BORN;

    @Getter
    @Setter
    private String Month_BORN;

    @Getter
    @Setter
    private String DIVISION_ID;

    @Getter
    @Setter
    private String AD_NAME;

    @Getter
    @Setter
    private String DATE_BORN_DM;

    @Getter
    @Setter
    private String SHORT_NAME;

    @Getter
    @Setter
    private String DISION_NAME;

    public Units() {
    }
}
