package be.gfi.liferay.hook.resourcebundle;

import com.liferay.portal.kernel.language.UTF8Control;
import org.osgi.service.component.annotations.Component;

import java.util.Enumeration;
import java.util.ResourceBundle;

@Component(
        property = {"language.id=en"},
        service = ResourceBundle.class
)
public class ResourceBundleComponent extends ResourceBundle {

    private static final String CONTENT_LANGUAGE = "content.Language";

    private final ResourceBundle resourceBundle = ResourceBundle.getBundle(CONTENT_LANGUAGE, UTF8Control.INSTANCE);

    @Override
    protected Object handleGetObject(final String key) {
        return resourceBundle.getObject(key);
    }

    @Override
    public Enumeration<String> getKeys() {
        return resourceBundle.getKeys();
    }
}