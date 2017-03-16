package hu.sms.views;

import javax.annotation.PostConstruct;

import com.vaadin.annotations.Title;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.VerticalLayout;

import hu.sms.MyVaadinUI;
import hu.sms.config.ScreenNames;
import hu.sms.domain.Esemeny;
import hu.sms.views.layouts.AdminView.impl.AdminViewLayoutImpl;
import hu.sms.views.windows.impl.UjEsemenyHirdeteseWindow;


@Title("admin_main_screen")
@SpringView(name = ScreenNames.ADMIN_MAIN_SCREEN)
public class AdminView extends VerticalLayout implements View {
    
    private static final long serialVersionUID = 6427617397226137097L;
    
    private AdminViewLayoutImpl adminViewLayoutImpl;

    private void initComponent() {
        setSizeFull();
    }

    @PostConstruct
    void init() {
        initComponent();
        adminViewLayoutImpl = new AdminViewLayoutImpl();
        addComponent(adminViewLayoutImpl);
        
        //calendar
        adminViewLayoutImpl.addNewEventToCalendar(this::addNewEventToCalendar);
    }

    private void addNewEventToCalendar(ClickEvent event) {
        UjEsemenyHirdeteseWindow ujEsemenyHirdeteseWindow = new UjEsemenyHirdeteseWindow();
        ujEsemenyHirdeteseWindow.addSaveButtonListener(e -> {
            
        });
        MyVaadinUI.getCurrent().addWindow(ujEsemenyHirdeteseWindow);
    }

    public void enter(ViewChangeEvent event) {
        // TODO Auto-generated method stub
        
    }

}
