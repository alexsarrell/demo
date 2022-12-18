package com.example.demo.factories;

import com.example.demo.Guitar;
import com.example.demo.GuitarFactory;
import com.example.demo.GuitarType;

public class IbanezFactory implements GuitarFactory {
    @Override
    public Guitar createRhythm() {
        return new Guitar(6, GuitarType.RHYTHM, "AZ2204NW");
    }

    @Override
    public Guitar createSolo() {
        return new Guitar(7, GuitarType.SOLO, "Q52");
    }

    @Override
    public Guitar createBas() {
        return new Guitar(5, GuitarType.BAS, "SR IronLabel");
    }
}
