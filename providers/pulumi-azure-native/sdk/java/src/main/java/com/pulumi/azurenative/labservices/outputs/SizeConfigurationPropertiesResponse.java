// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.outputs;

import com.pulumi.azurenative.labservices.outputs.EnvironmentSizeResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SizeConfigurationPropertiesResponse {
    /**
     * @return Represents a list of size categories supported by this Lab Account (Small, Medium, Large)
     * 
     */
    private final @Nullable List<EnvironmentSizeResponse> environmentSizes;

    @CustomType.Constructor
    private SizeConfigurationPropertiesResponse(@CustomType.Parameter("environmentSizes") @Nullable List<EnvironmentSizeResponse> environmentSizes) {
        this.environmentSizes = environmentSizes;
    }

    /**
     * @return Represents a list of size categories supported by this Lab Account (Small, Medium, Large)
     * 
     */
    public List<EnvironmentSizeResponse> environmentSizes() {
        return this.environmentSizes == null ? List.of() : this.environmentSizes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SizeConfigurationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EnvironmentSizeResponse> environmentSizes;

        public Builder() {
    	      // Empty
        }

        public Builder(SizeConfigurationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentSizes = defaults.environmentSizes;
        }

        public Builder environmentSizes(@Nullable List<EnvironmentSizeResponse> environmentSizes) {
            this.environmentSizes = environmentSizes;
            return this;
        }
        public Builder environmentSizes(EnvironmentSizeResponse... environmentSizes) {
            return environmentSizes(List.of(environmentSizes));
        }        public SizeConfigurationPropertiesResponse build() {
            return new SizeConfigurationPropertiesResponse(environmentSizes);
        }
    }
}
