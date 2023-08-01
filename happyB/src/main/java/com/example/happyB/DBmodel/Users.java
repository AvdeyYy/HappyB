package com.example.happyB.DBmodel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity(name = "usersmain")
public class Users {
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id_user;

    @Getter
    @Setter
    private String mail_user;

    @Getter
    @Setter
    private String pass_user;

    @Getter
    @Setter
    private String smp_id_unit;

    @Getter
    @Setter
    private String smp_id_division;

    @Getter
    @Setter
    private String SHORT_NAME;

    @Getter
    @Setter
    private String DATE_BORN_DM;

    @Getter
    @Setter
    private String DISION_NAME;


    public Users() {
    }

    public Users(String smp_id_unit, String smp_id_division, String SHORT_NAME, String DATE_BORN_DM) {
        this.smp_id_unit = smp_id_unit;
        this.smp_id_division = smp_id_division;
        this.SHORT_NAME = SHORT_NAME;
        this.DATE_BORN_DM = DATE_BORN_DM;
    }
}
