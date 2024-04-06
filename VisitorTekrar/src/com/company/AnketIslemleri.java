package com.company;

public class AnketIslemleri implements PersonelVisitor {
    @Override
    public void visit(ArastirmaGorevlisi arastirmaGorevlisi) {
        System.out.println("Araştırma görevlisi anket defteri okuyor.");
    }

    @Override
    public void visit(OgretimUyesi ogretimUyesi) {
        System.out.println("Öğretim üyesi anket ayarlıyor.");
    }

    @Override
    public void visit(OgretimGorevlisi ogretimGorevlisi) {
        System.out.println("Öğretim görevlisi anket notu veriyor.");
    }
}
