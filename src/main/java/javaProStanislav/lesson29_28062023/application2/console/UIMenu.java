package javaProStanislav.lesson29_28062023.application2.console;

import java.util.List;
import java.util.Scanner;

public class UIMenu {
    private final List<UIAction> uiActions;

    public UIMenu(List<UIAction> uiActions) {
        this.uiActions = uiActions;
    }

    public void startUI(){
        while (true) {
            try {
                System.out.println("Please enter your choice: ");
                for (int i = 0; i < uiActions.size(); i++) {
                    System.out.println(i + ". " + uiActions.get(i).getActionName());
                }
                Scanner scanner = new Scanner(System.in);
                int userInput = scanner.nextInt();
                uiActions.get(userInput).execute();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
