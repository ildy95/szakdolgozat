package hu.sms.views.windows.impl;

import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import hu.sms.views.windows.UjEsemenyHirdeteseLayout;

public class UjEsemenyHirdeteseLayoutImpl extends UjEsemenyHirdeteseLayout {
    
    private static final long serialVersionUID = -8226985667843902879L;

    /**
     * @return the titleLabel
     */
    public Label getTitleLabel() {
        return titleLabel;
    }

    /**
     * @param titleLabel the titleLabel to set
     */
    public void setTitleLabel(Label titleLabel) {
        this.titleLabel = titleLabel;
    }

    /**
     * @return the dataLayout
     */
    public VerticalLayout getDataLayout() {
        return dataLayout;
    }

    /**
     * @param dataLayout the dataLayout to set
     */
    public void setDataLayout(VerticalLayout dataLayout) {
        this.dataLayout = dataLayout;
    }

    /**
     * @return the esemenyKezdoDatum
     */
    public PopupDateField getEsemenyKezdoDatum() {
        return esemenyKezdoDatum;
    }

    /**
     * @param esemenyKezdoDatum the esemenyKezdoDatum to set
     */
    public void setEsemenyKezdoDatum(PopupDateField esemenyKezdoDatum) {
        this.esemenyKezdoDatum = esemenyKezdoDatum;
    }

    /**
     * @return the esemenyVegDatum
     */
    public PopupDateField getEsemenyVegDatum() {
        return esemenyVegDatum;
    }

    /**
     * @param esemenyVegDatum the esemenyVegDatum to set
     */
    public void setEsemenyVegDatum(PopupDateField esemenyVegDatum) {
        this.esemenyVegDatum = esemenyVegDatum;
    }

    /**
     * @return the nev
     */
    public TextField getNev() {
        return nev;
    }

    /**
     * @param nev the caption to set
     */
    public void setNev(TextField nev) {
        this.nev = nev;
    }

    /**
     * @return the megjegyzes
     */
    public TextArea getMegjegyzes() {
        return megjegyzes;
    }

    /**
     * @param megjegyzes the description to set
     */
    public void setMegjegyzes(TextArea megjegyzes) {
        this.megjegyzes = megjegyzes;
    }

    /**
     * @return the cancelButton
     */
    public Button getCancelButton() {
        return cancelButton;
    }

    /**
     * @param cancelButton the cancelButton to set
     */
    public void setCancelButton(Button cancelButton) {
        this.cancelButton = cancelButton;
    }

    /**
     * @return the saveButton
     */
    public Button getSaveButton() {
        return saveButton;
    }

    /**
     * @param saveButton the saveButton to set
     */
    public void setSaveButton(Button saveButton) {
        this.saveButton = saveButton;
    }

}
