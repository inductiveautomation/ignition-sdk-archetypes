package ${package}.designer.beaninfos;

import java.beans.IntrospectionException;

import ${package}.client.HelloWorldComponent;
import com.inductiveautomation.factorypmi.designer.property.customizers.DynamicPropertyProviderCustomizer;
import com.inductiveautomation.factorypmi.designer.property.customizers.StyleCustomizer;
import com.inductiveautomation.vision.api.designer.beans.CommonBeanInfo;
import com.inductiveautomation.vision.api.designer.beans.VisionBeanDescriptor;

public class HelloWorldComponentBeanInfo extends CommonBeanInfo {

    public HelloWorldComponentBeanInfo() {
        super(HelloWorldComponent.class,
                DynamicPropertyProviderCustomizer.VALUE_DESCRIPTOR,
                StyleCustomizer.VALUE_DESCRIPTOR);
    }

    @Override
    protected void initProperties() throws IntrospectionException {
        super.initProperties();

        addProp("text", "Text", "The text to display in the component", CAT_DATA, PREFERRED_MASK | BOUND_MASK);
    }

    @Override
    protected void initDesc() {
        VisionBeanDescriptor bean = getBeanDescriptor();
        bean.setName("Hello World");
        bean.setDisplayName("Hello World");
        bean.setShortDescription("A component that displays the text 'Hello World'.");
    }

}
