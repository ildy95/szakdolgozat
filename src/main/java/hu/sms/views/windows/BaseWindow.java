package hu.sms.views.windows;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;

import com.vaadin.data.util.converter.StringToBigDecimalConverter;
import com.vaadin.ui.AbstractField;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Field;
import com.vaadin.ui.Layout;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;


public abstract class BaseWindow<T extends Layout> extends Window {


    protected static final Logger LOGGER = LoggerFactory.getLogger(BaseWindow.class);
    private static final long serialVersionUID = 4757090540082041174L;
//    protected MessageSource messageSource;

    protected T mainLayout;
    protected final List<Component> ignoreReadOnlyComponents = new ArrayList<>();

    protected BaseWindow(final Class<T> clazz) {
        super();
//        this.messageSource = messageSource;
        try {
            final VerticalLayout wrapperLayout = new VerticalLayout();
            mainLayout = clazz.newInstance();
            setNullRepresentation(mainLayout);
            wrapperLayout.addComponent(mainLayout);
            setContent(wrapperLayout);
        } catch (InstantiationException | IllegalAccessException e) {
            LOGGER.error("Couldn't create mainLayout, got an InstantiationException or an IllegalAccessException : ", e);
        }
        initWindow();
    }

    private void setNullRepresentation(final Layout layout) {
        final Iterator<Component> iterator = layout.iterator();
        while (iterator.hasNext()) {
            final Component c = iterator.next();
            if (c instanceof TextField) {
                ((TextField)c).setNullRepresentation("");
            }
            if (c instanceof TextArea) {
                ((TextArea)c).setNullRepresentation("");
            }
            if (c instanceof Layout) {
                setNullRepresentation((Layout)c);
            }
        }
    }

    private void initWindow() {
        center();
        setModal(true);
        setResizable(false);
        initComponent();
    }


//    protected String getMessage(final String bundleKey) {
//        try {
//            return messageSource.getMessage(bundleKey, null, getLocale());
//        } catch (final Exception e) {
//            LOGGER.warn("Can't find message for key: {}", bundleKey);
//            return bundleKey;
//        }
//    }

//    protected String resolveBool(final Boolean bool) {
//        if (bool) {
//            return getMessage("default.translate.to.true");
//        } else {
//            return getMessage("default.translate.to.false");
//        }
//    }

    public T getMainLayout() {
        return mainLayout;
    }

    protected void addCloseToCancel(final Button button) {
        button.addClickListener(event -> close());
    }

//    protected void makeRequiredField(AbstractField<?> field) {
//        field.setRequired(true);
//        field.setRequiredError(getMessage("base.window.required.field.default.error.message"));
//        field.setValidationVisible(false);
//    }

    protected void makeNumericalStyle(TextField tf) {
        tf.setImmediate(true);
        tf.setConverter(new StringToBigDecimalConverter());
//        tf.addStyleName(SzindikaltTheme.TEXT_FIELD_NUMERICAL);
    }

    protected abstract void initComponent();

    protected abstract Button getCancelButton();

    protected void ignoreReadOnlyComponents(Component... comps) {
        for (Component c : comps) {
            ignoreReadOnlyComponents.add(c);
        }
    }

    public void doReadOnlyForm() {
        setReadOnly(true);
        mainLayout.setReadOnly(true);
        makeFieldReadOnly(mainLayout);
        Button defaultCloseButton = getCancelButton();
        if (defaultCloseButton != null) {
            defaultCloseButton.setReadOnly(false);
            defaultCloseButton.setEnabled(true);
        }
    }

    private void makeFieldReadOnly(final Layout layout) {
        final Iterator<Component> iterator = layout.iterator();
        while (iterator.hasNext()) {
            final Component c = iterator.next();
            if (!this.ignoreReadOnlyComponents.contains(c)) {
                if (c instanceof Field) {
                    ((Field<?>)c).setReadOnly(true);
                }
                if (c instanceof Button) {
                    ((Button)c).setEnabled(false);
                }
                if (c instanceof Layout) {
                    makeFieldReadOnly((Layout)c);
                }
            }
        }
    }

}
