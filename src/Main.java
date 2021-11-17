import controller.AccountController;
import model.CheckingAccount;
import model.SavingAccount;
import view.AccountView;

public class Main {
    public static void main(String[] args) throws Exception {
        SavingAccount saving = new SavingAccount();
        CheckingAccount checking = new CheckingAccount();
        AccountView view = new AccountView();
        AccountController controller = new AccountController(saving, checking, view);

        try {
            controller.run();
        } catch (Exception e) {
            System.out.println("Houve um erro inesperado, tente novamente mais tarde.");
        }
    }
}