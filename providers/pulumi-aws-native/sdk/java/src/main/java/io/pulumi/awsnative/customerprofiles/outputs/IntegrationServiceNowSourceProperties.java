// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IntegrationServiceNowSourceProperties {
    private final String object;

    @OutputCustomType.Constructor({"object"})
    private IntegrationServiceNowSourceProperties(String object) {
        this.object = Objects.requireNonNull(object);
    }

    public String getObject() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationServiceNowSourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationServiceNowSourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
        }

        public Builder setObject(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public IntegrationServiceNowSourceProperties build() {
            return new IntegrationServiceNowSourceProperties(object);
        }
    }
}
