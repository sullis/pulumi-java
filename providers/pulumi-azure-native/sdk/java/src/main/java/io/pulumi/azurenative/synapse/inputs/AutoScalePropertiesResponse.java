// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Auto-scaling properties of a Big Data pool powered by Apache Spark
 * 
 */
public final class AutoScalePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoScalePropertiesResponse Empty = new AutoScalePropertiesResponse();

    /**
     * Whether automatic scaling is enabled for the Big Data pool.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * The maximum number of nodes the Big Data pool can support.
     * 
     */
    @InputImport(name="maxNodeCount")
    private final @Nullable Integer maxNodeCount;

    public Optional<Integer> getMaxNodeCount() {
        return this.maxNodeCount == null ? Optional.empty() : Optional.ofNullable(this.maxNodeCount);
    }

    /**
     * The minimum number of nodes the Big Data pool can support.
     * 
     */
    @InputImport(name="minNodeCount")
    private final @Nullable Integer minNodeCount;

    public Optional<Integer> getMinNodeCount() {
        return this.minNodeCount == null ? Optional.empty() : Optional.ofNullable(this.minNodeCount);
    }

    public AutoScalePropertiesResponse(
        @Nullable Boolean enabled,
        @Nullable Integer maxNodeCount,
        @Nullable Integer minNodeCount) {
        this.enabled = enabled;
        this.maxNodeCount = maxNodeCount;
        this.minNodeCount = minNodeCount;
    }

    private AutoScalePropertiesResponse() {
        this.enabled = null;
        this.maxNodeCount = null;
        this.minNodeCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScalePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer maxNodeCount;
        private @Nullable Integer minNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScalePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setMaxNodeCount(@Nullable Integer maxNodeCount) {
            this.maxNodeCount = maxNodeCount;
            return this;
        }

        public Builder setMinNodeCount(@Nullable Integer minNodeCount) {
            this.minNodeCount = minNodeCount;
            return this;
        }

        public AutoScalePropertiesResponse build() {
            return new AutoScalePropertiesResponse(enabled, maxNodeCount, minNodeCount);
        }
    }
}
