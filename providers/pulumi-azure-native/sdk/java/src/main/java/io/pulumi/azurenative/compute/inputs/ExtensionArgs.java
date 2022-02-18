// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.CloudServiceExtensionPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a cloud service Extension.
 * 
 */
public final class ExtensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExtensionArgs Empty = new ExtensionArgs();

    /**
     * The name of the extension.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Extension Properties.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<CloudServiceExtensionPropertiesArgs> properties;

    public Input<CloudServiceExtensionPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    public ExtensionArgs(
        @Nullable Input<String> name,
        @Nullable Input<CloudServiceExtensionPropertiesArgs> properties) {
        this.name = name;
        this.properties = properties;
    }

    private ExtensionArgs() {
        this.name = Input.empty();
        this.properties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<CloudServiceExtensionPropertiesArgs> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProperties(@Nullable Input<CloudServiceExtensionPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable CloudServiceExtensionPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public ExtensionArgs build() {
            return new ExtensionArgs(name, properties);
        }
    }
}
