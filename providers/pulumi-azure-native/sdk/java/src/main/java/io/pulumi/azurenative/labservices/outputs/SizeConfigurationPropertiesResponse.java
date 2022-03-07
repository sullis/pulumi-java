// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.azurenative.labservices.outputs.EnvironmentSizeResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class SizeConfigurationPropertiesResponse {
    /**
     * Represents a list of size categories supported by this Lab Account (Small, Medium, Large)
     * 
     */
    private final @Nullable List<EnvironmentSizeResponse> environmentSizes;

    @OutputCustomType.Constructor({"environmentSizes"})
    private SizeConfigurationPropertiesResponse(@Nullable List<EnvironmentSizeResponse> environmentSizes) {
        this.environmentSizes = environmentSizes;
    }

    /**
     * Represents a list of size categories supported by this Lab Account (Small, Medium, Large)
     * 
    */
    public List<EnvironmentSizeResponse> getEnvironmentSizes() {
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

        public Builder setEnvironmentSizes(@Nullable List<EnvironmentSizeResponse> environmentSizes) {
            this.environmentSizes = environmentSizes;
            return this;
        }
        public SizeConfigurationPropertiesResponse build() {
            return new SizeConfigurationPropertiesResponse(environmentSizes);
        }
    }
}