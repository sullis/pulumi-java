// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ComponentCollectionProperties {
    @OutputCustomType.Constructor({})
    private ComponentCollectionProperties() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentCollectionProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentCollectionProperties defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public ComponentCollectionProperties build() {
            return new ComponentCollectionProperties();
        }
    }
}
