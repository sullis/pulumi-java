// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationAccountMapPropertiesResponseParametersSchema {
    /**
     * @return The reference name.
     * 
     */
    private final @Nullable String ref;

    @CustomType.Constructor
    private IntegrationAccountMapPropertiesResponseParametersSchema(@CustomType.Parameter("ref") @Nullable String ref) {
        this.ref = ref;
    }

    /**
     * @return The reference name.
     * 
     */
    public Optional<String> ref() {
        return Optional.ofNullable(this.ref);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationAccountMapPropertiesResponseParametersSchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ref;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationAccountMapPropertiesResponseParametersSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ref = defaults.ref;
        }

        public Builder ref(@Nullable String ref) {
            this.ref = ref;
            return this;
        }        public IntegrationAccountMapPropertiesResponseParametersSchema build() {
            return new IntegrationAccountMapPropertiesResponseParametersSchema(ref);
        }
    }
}
