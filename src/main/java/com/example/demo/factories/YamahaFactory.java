package com.example.demo.factories;

import com.example.demo.Guitar;
import com.example.demo.GuitarFactory;
import com.example.demo.GuitarType;

public class YamahaFactory implements GuitarFactory {
    @Override
    public Guitar createRhythm() {
        return new Guitar(6, GuitarType.RHYTHM, "Revstar");
    }

    @Override
    public Guitar createSolo() {
        return new Guitar(8, GuitarType.SOLO, "Pacifica");
    }

    @Override
    public Guitar createBas() {
        return new Guitar(5, GuitarType.BAS, "BB434");
    }
}
