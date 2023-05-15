package com.devstack.pos.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CustomerFormController {
    public AnchorPane context;
    public JFXTextField txtEmail;
    public JFXTextField txtName;
    public JFXTextField txtContact;
    public JFXTextField txtSalary;
    public TextField txtSearch;
    public TableColumn colId;
    public TableColumn colEmail;
    public TableColumn colName;
    public TableColumn colContact;
    public TableColumn colSalary;
    public TableColumn colOperate;

    public void btnBackToHomeOnAction(ActionEvent actionEvent) {
    }

    public void btnMngLoyaltyCardsOnAction(ActionEvent actionEvent) {
    }

    public void btnAddNewCustomerOnAction(ActionEvent actionEvent) {
    }
}
