package com.company;

public class OgretimUyesi implements Personel {
    @Override
    public void accept(PersonelVisitor personelVisitor) {
        personelVisitor.visit(this);
    }
}
