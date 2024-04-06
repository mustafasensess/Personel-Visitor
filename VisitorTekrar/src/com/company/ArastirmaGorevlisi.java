package com.company;

public class ArastirmaGorevlisi implements Personel {
    @Override
    public void accept(PersonelVisitor personelVisitor) {
        personelVisitor.visit(this);
    }
}
