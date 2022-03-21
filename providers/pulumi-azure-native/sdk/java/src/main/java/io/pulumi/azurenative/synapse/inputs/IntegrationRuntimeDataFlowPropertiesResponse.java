// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Data flow properties for managed integration runtime.
 * 
 */
public final class IntegrationRuntimeDataFlowPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final IntegrationRuntimeDataFlowPropertiesResponse Empty = new IntegrationRuntimeDataFlowPropertiesResponse();

    /**
     * Compute type of the cluster which will execute data flow job.
     * 
     */
    @Import(name="computeType")
      private final @Nullable String computeType;

    public Optional<String> getComputeType() {
        return this.computeType == null ? Optional.empty() : Optional.ofNullable(this.computeType);
    }

    /**
     * Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272.
     * 
     */
    @Import(name="coreCount")
      private final @Nullable Integer coreCount;

    public Optional<Integer> getCoreCount() {
        return this.coreCount == null ? Optional.empty() : Optional.ofNullable(this.coreCount);
    }

    /**
     * Time to live (in minutes) setting of the cluster which will execute data flow job.
     * 
     */
    @Import(name="timeToLive")
      private final @Nullable Integer timeToLive;

    public Optional<Integer> getTimeToLive() {
        return this.timeToLive == null ? Optional.empty() : Optional.ofNullable(this.timeToLive);
    }

    public IntegrationRuntimeDataFlowPropertiesResponse(
        @Nullable String computeType,
        @Nullable Integer coreCount,
        @Nullable Integer timeToLive) {
        this.computeType = computeType;
        this.coreCount = coreCount;
        this.timeToLive = timeToLive;
    }

    private IntegrationRuntimeDataFlowPropertiesResponse() {
        this.computeType = null;
        this.coreCount = null;
        this.timeToLive = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeDataFlowPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String computeType;
        private @Nullable Integer coreCount;
        private @Nullable Integer timeToLive;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeDataFlowPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeType = defaults.computeType;
    	      this.coreCount = defaults.coreCount;
    	      this.timeToLive = defaults.timeToLive;
        }

        public Builder computeType(@Nullable String computeType) {
            this.computeType = computeType;
            return this;
        }
        public Builder coreCount(@Nullable Integer coreCount) {
            this.coreCount = coreCount;
            return this;
        }
        public Builder timeToLive(@Nullable Integer timeToLive) {
            this.timeToLive = timeToLive;
            return this;
        }        public IntegrationRuntimeDataFlowPropertiesResponse build() {
            return new IntegrationRuntimeDataFlowPropertiesResponse(computeType, coreCount, timeToLive);
        }
    }
}
