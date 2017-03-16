package hu.sms.views.windows;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class UjEsemenyHirdeteseLayout extends VerticalLayout {
    protected Label titleLabel;
    protected VerticalLayout dataLayout;
    protected PopupDateField esemenyKezdoDatum;
    protected PopupDateField esemenyVegDatum;
    protected TextField nev;
    protected TextArea megjegyzes;
    protected Button cancelButton;
    protected Button saveButton;

    public UjEsemenyHirdeteseLayout() {
        Design.read(this);
    }
}