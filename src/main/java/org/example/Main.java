package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // Köpek havlıyor mu ve saat uygun mu kontrolü
    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false; // Geçersiz bir saat
        }
        if (isBarking && (clock < 8 || clock > 20)) {
            return true; // Köpek havlıyorsa ve saat 8'den önce ya da 20'den sonra ise uyanmak gerekli.
        }
        return false; // Diğer durumlarda uyanmaya gerek yok.
    }

    // Yaşın 13 ile 19 arasında olup olmadığını kontrol eden metot
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if ((firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    // Kedi oynuyor mu, sıcaklık ve mevsime göre kontrol
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer && (temp <= 45 && temp >= 25)) {
            return true;
        } else if (!isSummer && (temp <= 35 && temp >= 25)) {
            return true;
        } else {
            return false;
        }
    }

    // Dikdörtgen alanı hesaplayan metot
    public static double area(double width, double height) {
        if(width < 0 || height < 0){
            return -1;
        } else {
            return width * height;
        }
    }

    // Daire alanı hesaplayan metot
    public static double area(double radius) {
        if (radius < 0){
            return -1;
        } else {
            return (radius * radius * Math.PI);
        }
    }
}
