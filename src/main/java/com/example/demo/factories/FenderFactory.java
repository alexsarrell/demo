package com.example.demo.factories;

import com.example.demo.Guitar;
import com.example.demo.GuitarFactory;
import com.example.demo.GuitarType;

public class FenderFactory implements GuitarFactory {
    @Override
    public Guitar createRhythm() {
        return new Guitar(6, GuitarType.RHYTHM, "American Vintage II");
    }

    @Override
    public Guitar createSolo() {
        return new Guitar(6, GuitarType.SOLO, "Aerodyne Telecaster");
    }

    @Override
    public Guitar createBas() {
        return new Guitar(4, GuitarType.BAS, "Fender Squier Affinity");
    }
}
