// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder.outputs;

import io.pulumi.awsnative.amplifyuibuilder.outputs.ComponentProperties;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ComponentChild {
    private final @Nullable List<ComponentChild> children;
    private final String componentType;
    private final String name;
    private final ComponentProperties properties;

    @OutputCustomType.Constructor({"children","componentType","name","properties"})
    private ComponentChild(
        @Nullable List<ComponentChild> children,
        String componentType,
        String name,
        ComponentProperties properties) {
        this.children = children;
        this.componentType = Objects.requireNonNull(componentType);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
    }

    public List<ComponentChild> getChildren() {
        return this.children == null ? List.of() : this.children;
    }
    public String getComponentType() {
        return this.componentType;
    }
    public String getName() {
        return this.name;
    }
    public ComponentProperties getProperties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentChild defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ComponentChild> children;
        private String componentType;
        private String name;
        private ComponentProperties properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentChild defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.children = defaults.children;
    	      this.componentType = defaults.componentType;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
        }

        public Builder setChildren(@Nullable List<ComponentChild> children) {
            this.children = children;
            return this;
        }

        public Builder setComponentType(String componentType) {
            this.componentType = Objects.requireNonNull(componentType);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(ComponentProperties properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public ComponentChild build() {
            return new ComponentChild(children, componentType, name, properties);
        }
    }
}
