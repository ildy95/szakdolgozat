package hu.sms.views.layouts.AdminView.impl;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;

import hu.sms.views.layouts.AdminView.AdminViewLayout;

public class AdminViewLayoutImpl extends AdminViewLayout {

    private static final long serialVersionUID = 222385835039518702L;
    
    private CalendarViewImpl calendarViewImpl;
    
    public AdminViewLayoutImpl() {
//        mentesButton.addClickListener(e -> Notification.show("KURVA ANYÁDAT AZTAT!", Notification.Type.WARNING_MESSAGE));
        calendarViewImpl = new CalendarViewImpl();
        contentLayout.setContent(calendarViewImpl);
        
        
        
        
    
    }
    
    public void addNewEventToCalendar(ClickListener listener) {
        calendarViewImpl.addNewEventToCalendar(listener);
    }
    
    

}
