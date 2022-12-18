package com.example.demo.factories;

import com.example.demo.Guitar;
import com.example.demo.GuitarFactory;
import com.example.demo.GuitarType;

public class GibsonFactory implements GuitarFactory {
    @Override
    public Guitar createRhythm() {
        return new Guitar(6, GuitarType.RHYTHM, "Firebird");
    }

    @Override
    public Guitar createSolo() {
        return new Guitar(6, GuitarType.SOLO, "Flying V");
    }

    @Override
    public Guitar createBas() {
        return new Guitar(4, GuitarType.BAS, "Heritage Cherry");
    }
}
