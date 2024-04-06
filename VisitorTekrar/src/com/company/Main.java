package com.company;

public class Main {

    public static void main(String[] args) {
	    Personel arastirmaGorevlisi = new ArastirmaGorevlisi();
        Personel oUyesi = new OgretimUyesi();
        Personel oGorevlisi = new OgretimGorevlisi();

        PersonelVisitor visitor1 = new AnketIslemleri();
        PersonelVisitor visitor2 = new StajIslemleri();

        oGorevlisi.accept(visitor1);
        oGorevlisi.accept(visitor2);

        oUyesi.accept(visitor1);
        oUyesi.accept(visitor2);

        arastirmaGorevlisi.accept(visitor1);
        arastirmaGorevlisi.accept(visitor2);
    }
}
