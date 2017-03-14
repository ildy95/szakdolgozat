package hu.sms;

import javax.servlet.annotation.WebServlet;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
//import com.vaadin.terminal.gwt.client.ComponentState;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

import hu.sms.config.ScreenNames;
import hu.sms.domain.Felhasznalo;

@SpringUI
@Theme("mytheme")
@PreserveOnRefresh
public class MyVaadinUI extends UI {
	
	private Felhasznalo felhasznalo;
	

	@Autowired
	private SpringViewProvider viewProvider;
	
	Navigator navigator;

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		navigator = new Navigator(this, this);
		navigator.addProvider(viewProvider);
		navigator.navigateTo(ScreenNames.ADMIN_MAIN_SCREEN);
//		navigator.addViewChangeListener(getViewChangeListener());
	}

//	private ViewChangeListener getViewChangeListener() {
//		return new ViewChangeListener() {
//			
//			@Override
//			public boolean beforeViewChange(ViewChangeEvent event) {
//				if(((MyVaadinUI)getUI().getCurrent()).getFelhasznalo()  == null){
//					Notification.show("Login needed.");
//					return false;
//				}
//				return true;
//			}
//			
//			@Override
//			public void afterViewChange(ViewChangeEvent event) {
//			}
//		};
//	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = MyVaadinUI.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
	}

	public Felhasznalo getFelhasznalo() {
		return felhasznalo;
	}

	public void setFelhasznalo(Felhasznalo felhasznalo) {
		this.felhasznalo = felhasznalo;
	}
	
	
}
