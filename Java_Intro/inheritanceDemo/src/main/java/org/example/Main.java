package org.example;

public class Main {
    public static void main(String[] args) {
        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        teacherCreditManager.Calculate();

        CreditUI creditUI = new CreditUI();
        creditUI.CreditCalculate(new TeacherCreditManager());
        creditUI.CreditCalculate(new AgriculturalCreditManager());
        creditUI.CreditCalculate(new SoldierCreditManager());
    }
}