// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder.inputs;

import java.util.Objects;


public final class ComponentBindingPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComponentBindingPropertiesArgs Empty = new ComponentBindingPropertiesArgs();

    public ComponentBindingPropertiesArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentBindingPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentBindingPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public ComponentBindingPropertiesArgs build() {
            return new ComponentBindingPropertiesArgs();
        }
    }
}
