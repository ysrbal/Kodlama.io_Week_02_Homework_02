package Video_37_InheritenceDemo;

public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.CalculateCredit(new TeacherCreditManager());
        creditUI.CalculateCredit(new AgriculturalCreditManager());
        creditUI.CalculateCredit(new MilitaryCreditManager());
    }
}
