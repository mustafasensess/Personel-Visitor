package com.company;

public class OgretimGorevlisi implements Personel {
    @Override
    public void accept(PersonelVisitor personelVisitor) {
        personelVisitor.visit(this);
    }
}
