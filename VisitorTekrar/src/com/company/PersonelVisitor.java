package com.company;

public interface PersonelVisitor {
    void visit(ArastirmaGorevlisi arastirmaGorevlisi);
    void visit(OgretimUyesi ogretimUyesi);
    void visit(OgretimGorevlisi ogretimGorevlisi);
}
