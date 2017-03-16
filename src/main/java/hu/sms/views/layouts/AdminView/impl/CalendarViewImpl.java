package hu.sms.views.layouts.AdminView.impl;


import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Calendar;

import hu.sms.views.layouts.AdminView.CalendarView;

public class CalendarViewImpl extends CalendarView {

    private static final long serialVersionUID = 5195018102974221746L;
    private Calendar calendar;
    
    public CalendarViewImpl() {
        calendar = new Calendar();
        calendar.setSizeFull();
        calendar.setLocale(new Locale("hu", "HU"));
        calendar.setFirstVisibleDayOfWeek(1);
        calendar.setLastVisibleDayOfWeek(5);
        
        // Popup - aznapi időpontra állítás
        naptarPopupDataSelect.setLocale(new Locale("hu", "HU"));
        final GregorianCalendar gregorianCalendarNow = new GregorianCalendar(naptarPopupDataSelect.getLocale());
        naptarPopupDataSelect.setValue(gregorianCalendarNow.getTime());
        naptarPopupDataSelect.addValueChangeListener(e -> jumpToSelectedDateByPopupDataField());
        
        jumpToMonth(gregorianCalendarNow);
        
        buttonsInit();
        calendarLayout.addComponent(calendar);
    }
    
    private void buttonsInit() {
        elozoEvButton.addClickListener(e -> jumpBySelectedMode(java.util.Calendar.YEAR, -1));
        kovetkezoEvButton.addClickListener(e -> jumpBySelectedMode(java.util.Calendar.YEAR, 1));
        elozoHonapButton.addClickListener(e -> jumpBySelectedMode(java.util.Calendar.MONTH, -1));
        kovetkezoHonapButton.addClickListener(e -> jumpBySelectedMode(java.util.Calendar.MONTH, 1));
        showWeekendCheckBox.addValueChangeListener(e -> setWeekendVisibility());
        refreshNaptarButton.addClickListener(e -> jumpToCurrentDate());
    }
    
    private void jumpBySelectedMode(int mode, int amount) {
        final Date startDate = calendar.getStartDate();
        final GregorianCalendar gregorianCalendar = new GregorianCalendar(calendar.getLocale());
        gregorianCalendar.setTime(startDate);
        gregorianCalendar.add(mode, amount);
        naptarPopupDataSelect.setValue(gregorianCalendar.getTime());
    }
    
    private void jumpToSelectedDateByPopupDataField() {
        final GregorianCalendar gregorianCalendar = new GregorianCalendar(calendar.getLocale());
        gregorianCalendar.setTime(naptarPopupDataSelect.getValue());
        jumpToMonth(gregorianCalendar);
    }
    
    private void jumpToMonth(final GregorianCalendar gregorianCalendar) {
        final int jumpTo = gregorianCalendar.get(java.util.Calendar.DAY_OF_MONTH) - 1;
        gregorianCalendar.add(java.util.Calendar.DAY_OF_MONTH, -jumpTo);
        calendar.setStartDate(gregorianCalendar.getTime());
        gregorianCalendar.add(java.util.Calendar.MONTH, 1);
        gregorianCalendar.add(java.util.Calendar.DATE, -1);
        calendar.setEndDate(gregorianCalendar.getTime());
    }
    
    private void setWeekendVisibility() {
        if (showWeekendCheckBox.getValue()) {
            calendar.setLastVisibleDayOfWeek(7);
        } else {
            calendar.setLastVisibleDayOfWeek(5);
        }
    }
    
    private void jumpToCurrentDate() {
        final GregorianCalendar gregorianCalendar = new GregorianCalendar(calendar.getLocale());
        naptarPopupDataSelect.setValue(gregorianCalendar.getTime());
    }
    
    public void addNewEventToCalendar(final ClickListener listener) {
        esemenyekHirdeteseButton.addClickListener(listener);
    }

}
