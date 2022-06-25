package MVC;

import MVC.controller.Controller;
import MVC.model.MainModel;
import MVC.model.Model;
import MVC.view.EditUserView;
import MVC.view.UsersView;


public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        usersView.setController(controller);
        editUserView.setController(controller);

        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        editUserView.fireEventUserDeleted(124L);

        editUserView.fireEventUserChanged("Tom", 126L, 84);
        usersView.fireEventShowDeletedUsers();
    }
}
