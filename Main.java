package com.metanit;

import java.util.Scanner;

interface Tovar{
    void NameTov();
    void CenaTov();
    void ReitTov();
    void TovInfo();
}
interface User{
    void Login();
    void Password();
    void UserInfo();
}
public class Main {
    static class Tov1 implements Tovar{
        String name;
        int cena;
        int reit;
        Tov1(String name, int cena, int reit){
            this.name = name;
            this.cena = cena;
            this.reit = reit;
        }
        public void NameTov(){
            System.out.printf("Название товара: %s \n", name);
        }
        public void CenaTov(){
            System.out.printf("Цена товара: %s руб \n", cena);
        }
        public void ReitTov(){
            System.out.printf("Рейтинг товара: %s\n", reit);
        }

        public void TovInfo() {
            NameTov();
            CenaTov();
            ReitTov();
        }
    }
    static class Tov2 implements Tovar{
        String name;
        int cena;
        int reit;
        Tov2(String name, int cena, int reit){
            this.name = name;
            this.cena = cena;
            this.reit = reit;
        }
        public void NameTov(){
            System.out.printf("Название товара: %s\n", name);
        }
        public void CenaTov(){
            System.out.printf("Цена товар: %s руб\n", cena);
        }
        public void ReitTov(){
            System.out.printf("Рейтинг товара: %s\n", reit);
        }
        public void TovInfo() {
            NameTov();
            CenaTov();
            ReitTov();
        }
    }
    static class Tov3 implements Tovar{
        String name;
        int cena;
        int reit;
        Tov3(String name, int cena, int reit){
            this.name = name;
            this.cena = cena;
            this.reit = reit;
        }
        public void NameTov(){
            System.out.printf("Название товара: %s\n", name);
        }
        public void CenaTov(){
            System.out.printf("Цена товара: %s руб\n", cena);
        }
        public void ReitTov(){
            System.out.printf("Рейтинг товара: %s\n", reit);
        }
        public void TovInfo() {
            NameTov();
            CenaTov();
            ReitTov();
        }
    }
    static class User1 implements User{
        String login;
        String password;
        User1(String login, String password){
            this.login = login;
            this.password = password;
        }
        public void Login(){
            System.out.printf("Логин пользователя: %s\n", login);
        }
        public void Password(){
            System.out.printf("Пароль пользователя: %s\n", password);
        }
        public void UserInfo() {
            Login();
            Password();
        }
    }
    static class User2 implements User{
        String login;
        String password;
        User2(String login, String password){
            this.login = login;
            this.password = password;
        }
        public void Login(){
            System.out.printf("Логин пользователя: %s\n", login);
        }
        public void Password(){
            System.out.printf("Пароль пользователя: %s\n", password);
        }
        public void UserInfo() {
            Login();
            Password();
        }
    }
    static class User3 implements User{
        String login;
        String password;
        User3(String login, String password){
            this.login = login;
            this.password = password;
        }
        public void Login(){
            System.out.printf("Логин пользователя: %s\n", login);
        }
        public void Password(){
            System.out.printf("Пароль пользователя: %s\n", password);
        }
        public void UserInfo() {
            Login();
            Password();
        }
    }
    static class Purchase implements User, Tovar{
        String login;
        String password;
        String name;
        int cena;
        int reit;
        Purchase(String login, String password,String name, int cena, int reit){
            this.login = login;
            this.password = password;
            this.name = name;
            this.cena = cena;
            this.reit = reit;
        }
        public void Login(){
            System.out.printf("Логин пользователя: %s\n", login);
        }
        public void Password(){
            System.out.printf("Пароль пользователя: %s\n", password);
        }
        public void UserInfo() {
            Login();
            Password();
        }
        public void NameTov(){
            System.out.printf("Название товара: %s\n", name);
        }

        public void CenaTov(){
            System.out.printf("Цена товара: %s руб\n", cena);
        }
        public void ReitTov(){
            System.out.printf("Рейтинг товара: %s\n", reit);

        }
        public void TovInfo() {
            NameTov();
            CenaTov();
            ReitTov();
        }
        public void PrintPur(){
            System.out.printf("Пользователя: %s Купил товар: %s", login, name);
        }
    }
    public static void main(String[] args) {
        Tovar cream = new Tov1("сливки",98, 9);
        cream.TovInfo();
        Tovar cheese = new Tov2("сыр", 450,10);
        cheese.TovInfo();
        Tovar milk = new Tov3("молоко", 80, 6);
        milk.TovInfo();
        User person1 = new User1("Maksim", "JDH434");
        person1.UserInfo();
        User person2 = new User2("Alina","MJsu4857");
        person2.UserInfo();
        User person3 = new User3("Dima","3895GHyb8");
        person3.UserInfo();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин:");
        String log = in.nextLine();
        System.out.println("Введите пароль:");
        String pas = in.nextLine();
        System.out.println("Введите товар, который хотите купить:");
        String tov = in.nextLine();
        Purchase purchase = new Purchase(log,pas,tov,450, 10);
        purchase.PrintPur();
    }
}
