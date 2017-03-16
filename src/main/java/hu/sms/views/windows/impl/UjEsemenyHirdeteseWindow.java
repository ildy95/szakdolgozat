package hu.sms.views.windows.impl;

import org.springframework.context.MessageSource;

import com.vaadin.server.Sizeable.Unit;
import com.vaadin.ui.Button;

import hu.sms.domain.Esemeny;
import hu.sms.views.windows.BaseWindow;

public class UjEsemenyHirdeteseWindow extends BaseWindow<UjEsemenyHirdeteseLayoutImpl> {
    
    private static final long serialVersionUID = -1992113566153684005L;

    public UjEsemenyHirdeteseWindow() {
        super(UjEsemenyHirdeteseLayoutImpl.class);
    }

    public void addSaveButtonListener(final Button.ClickListener listener) {
        mainLayout.getSaveButton().addClickListener(listener);
    }
    
    @Override
    protected void initComponent() {
        setWidth(400, Unit.PIXELS);
        addCloseToCancel(mainLayout.getCancelButton());
    }

    @Override
    protected Button getCancelButton() {
        return mainLayout.getCancelButton();
    }

}
