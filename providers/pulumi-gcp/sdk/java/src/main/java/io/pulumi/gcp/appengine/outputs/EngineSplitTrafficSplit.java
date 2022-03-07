// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EngineSplitTrafficSplit {
    /**
     * Mapping from version IDs within the service to fractional (0.000, 1] allocations of traffic for that version. Each version can be specified only once, but some versions in the service may not have any traffic allocation. Services that have traffic allocated cannot be deleted until either the service is deleted or their traffic allocation is removed. Allocations must sum to 1. Up to two decimal place precision is supported for IP-based splits and up to three decimal places is supported for cookie-based splits.
     * 
     */
    private final Map<String,String> allocations;
    /**
     * Mechanism used to determine which version a request is sent to. The traffic selection algorithm will be stable for either type until allocations are changed.
     * Possible values are `UNSPECIFIED`, `COOKIE`, `IP`, and `RANDOM`.
     * 
     */
    private final @Nullable String shardBy;

    @OutputCustomType.Constructor({"allocations","shardBy"})
    private EngineSplitTrafficSplit(
        Map<String,String> allocations,
        @Nullable String shardBy) {
        this.allocations = Objects.requireNonNull(allocations);
        this.shardBy = shardBy;
    }

    /**
     * Mapping from version IDs within the service to fractional (0.000, 1] allocations of traffic for that version. Each version can be specified only once, but some versions in the service may not have any traffic allocation. Services that have traffic allocated cannot be deleted until either the service is deleted or their traffic allocation is removed. Allocations must sum to 1. Up to two decimal place precision is supported for IP-based splits and up to three decimal places is supported for cookie-based splits.
     * 
    */
    public Map<String,String> getAllocations() {
        return this.allocations;
    }
    /**
     * Mechanism used to determine which version a request is sent to. The traffic selection algorithm will be stable for either type until allocations are changed.
     * Possible values are `UNSPECIFIED`, `COOKIE`, `IP`, and `RANDOM`.
     * 
    */
    public Optional<String> getShardBy() {
        return Optional.ofNullable(this.shardBy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EngineSplitTrafficSplit defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> allocations;
        private @Nullable String shardBy;

        public Builder() {
    	      // Empty
        }

        public Builder(EngineSplitTrafficSplit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocations = defaults.allocations;
    	      this.shardBy = defaults.shardBy;
        }

        public Builder setAllocations(Map<String,String> allocations) {
            this.allocations = Objects.requireNonNull(allocations);
            return this;
        }

        public Builder setShardBy(@Nullable String shardBy) {
            this.shardBy = shardBy;
            return this;
        }
        public EngineSplitTrafficSplit build() {
            return new EngineSplitTrafficSplit(allocations, shardBy);
        }
    }
}