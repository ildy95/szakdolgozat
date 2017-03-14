package hu.sms.views;

import javax.annotation.PostConstruct;

import com.vaadin.annotations.Title;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.VerticalLayout;

import hu.sms.config.ScreenNames;
import hu.sms.views.layouts.impl.AdminViewLayoutImpl;


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
    }

    public void enter(ViewChangeEvent event) {
        // TODO Auto-generated method stub
        
    }

}
