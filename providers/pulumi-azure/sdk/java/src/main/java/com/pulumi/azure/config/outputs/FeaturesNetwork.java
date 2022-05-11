// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.config.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class FeaturesNetwork {
    private final Boolean relaxedLocking;

    @CustomType.Constructor
    private FeaturesNetwork(@CustomType.Parameter("relaxedLocking") Boolean relaxedLocking) {
        this.relaxedLocking = relaxedLocking;
    }

    public Boolean relaxedLocking() {
        return this.relaxedLocking;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeaturesNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean relaxedLocking;

        public Builder() {
    	      // Empty
        }

        public Builder(FeaturesNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.relaxedLocking = defaults.relaxedLocking;
        }

        public Builder relaxedLocking(Boolean relaxedLocking) {
            this.relaxedLocking = Objects.requireNonNull(relaxedLocking);
            return this;
        }        public FeaturesNetwork build() {
            return new FeaturesNetwork(relaxedLocking);
        }
    }
}
