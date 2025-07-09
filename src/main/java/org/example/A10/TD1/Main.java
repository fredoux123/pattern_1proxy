package org.example.A10.TD1;

import org.example.A10.TD1.model.User;
import org.example.A10.TD1.service.DocumentProxy;
import org.example.A10.TD1.service.DocumentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User("alice", false);
        User admin = new User("bob", true);

        DocumentService userProxy = new DocumentProxy(user);
        DocumentService adminProxy = new DocumentProxy(admin);

        userProxy.displayDocument("public123");    //  accès OK
        userProxy.displayDocument("secret456");    //  accès refusé
        adminProxy.displayDocument("secret456");   //  accès OK
    }
}