package hu.sms.views.layouts.AdminView;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PopupDateField;
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
public class CalendarView extends HorizontalLayout {
    protected VerticalLayout esemenyNaptarLayout;
    protected HorizontalLayout datumLeptetesLayout;
    protected Button elozoEvButton;
    protected Button elozoHonapButton;
    protected PopupDateField naptarPopupDataSelect;
    protected Button kovetkezoHonapButton;
    protected Button kovetkezoEvButton;
    protected HorizontalLayout calendarLayout;
    protected CheckBox showWeekendCheckBox;
    protected HorizontalLayout exportButtonLayout;
    protected Button refreshNaptarButton;
    protected Button esemenyekExportButton;
    protected VerticalLayout esemenyKezelesLayout;
    protected Button esemenyekHirdeteseButton;
    protected Panel kozelgoEsemenyekPanel;

    public CalendarView() {
        Design.read(this);
    }
}
