// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.ResourceRangeResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties describe the recommended machine configuration for this Image Definition. These properties are updatable.
 * 
 */
public final class RecommendedMachineConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final RecommendedMachineConfigurationResponse Empty = new RecommendedMachineConfigurationResponse();

    /**
     * Describes the resource range.
     * 
     */
    @Import(name="memory")
      private final @Nullable ResourceRangeResponse memory;

    public Optional<ResourceRangeResponse> getMemory() {
        return this.memory == null ? Optional.empty() : Optional.ofNullable(this.memory);
    }

    /**
     * Describes the resource range.
     * 
     */
    @Import(name="vCPUs")
      private final @Nullable ResourceRangeResponse vCPUs;

    public Optional<ResourceRangeResponse> getVCPUs() {
        return this.vCPUs == null ? Optional.empty() : Optional.ofNullable(this.vCPUs);
    }

    public RecommendedMachineConfigurationResponse(
        @Nullable ResourceRangeResponse memory,
        @Nullable ResourceRangeResponse vCPUs) {
        this.memory = memory;
        this.vCPUs = vCPUs;
    }

    private RecommendedMachineConfigurationResponse() {
        this.memory = null;
        this.vCPUs = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecommendedMachineConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResourceRangeResponse memory;
        private @Nullable ResourceRangeResponse vCPUs;

        public Builder() {
    	      // Empty
        }

        public Builder(RecommendedMachineConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memory = defaults.memory;
    	      this.vCPUs = defaults.vCPUs;
        }

        public Builder memory(@Nullable ResourceRangeResponse memory) {
            this.memory = memory;
            return this;
        }
        public Builder vCPUs(@Nullable ResourceRangeResponse vCPUs) {
            this.vCPUs = vCPUs;
            return this;
        }        public RecommendedMachineConfigurationResponse build() {
            return new RecommendedMachineConfigurationResponse(memory, vCPUs);
        }
    }
}
