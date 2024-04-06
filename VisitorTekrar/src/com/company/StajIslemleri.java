package com.company;

public class StajIslemleri implements PersonelVisitor {
    @Override
    public void visit(ArastirmaGorevlisi arastirmaGorevlisi) {
        System.out.println("Araştırma görevlisi staj defteri okuyor.");
    }

    @Override
    public void visit(OgretimUyesi ogretimUyesi) {
        System.out.println("Öğretim üyesi staj ayarlıyor.");
    }

    @Override
    public void visit(OgretimGorevlisi ogretimGorevlisi) {
        System.out.println("Öğretim görevlisi staj notu veriyor.");
    }
}
