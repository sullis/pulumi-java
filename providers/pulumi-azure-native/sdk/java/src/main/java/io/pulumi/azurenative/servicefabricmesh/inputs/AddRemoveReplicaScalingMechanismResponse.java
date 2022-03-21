// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the horizontal auto scaling mechanism that adds or removes replicas (containers or container groups).
 * 
 */
public final class AddRemoveReplicaScalingMechanismResponse extends io.pulumi.resources.InvokeArgs {

    public static final AddRemoveReplicaScalingMechanismResponse Empty = new AddRemoveReplicaScalingMechanismResponse();

    /**
     * Enumerates the mechanisms for auto scaling.
     * Expected value is 'AddRemoveReplica'.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Maximum number of containers (scale up won't be performed above this number).
     * 
     */
    @Import(name="maxCount", required=true)
      private final Integer maxCount;

    public Integer getMaxCount() {
        return this.maxCount;
    }

    /**
     * Minimum number of containers (scale down won't be performed below this number).
     * 
     */
    @Import(name="minCount", required=true)
      private final Integer minCount;

    public Integer getMinCount() {
        return this.minCount;
    }

    /**
     * Each time auto scaling is performed, this number of containers will be added or removed.
     * 
     */
    @Import(name="scaleIncrement", required=true)
      private final Integer scaleIncrement;

    public Integer getScaleIncrement() {
        return this.scaleIncrement;
    }

    public AddRemoveReplicaScalingMechanismResponse(
        String kind,
        Integer maxCount,
        Integer minCount,
        Integer scaleIncrement) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.maxCount = Objects.requireNonNull(maxCount, "expected parameter 'maxCount' to be non-null");
        this.minCount = Objects.requireNonNull(minCount, "expected parameter 'minCount' to be non-null");
        this.scaleIncrement = Objects.requireNonNull(scaleIncrement, "expected parameter 'scaleIncrement' to be non-null");
    }

    private AddRemoveReplicaScalingMechanismResponse() {
        this.kind = null;
        this.maxCount = null;
        this.minCount = null;
        this.scaleIncrement = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddRemoveReplicaScalingMechanismResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private Integer maxCount;
        private Integer minCount;
        private Integer scaleIncrement;

        public Builder() {
    	      // Empty
        }

        public Builder(AddRemoveReplicaScalingMechanismResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.maxCount = defaults.maxCount;
    	      this.minCount = defaults.minCount;
    	      this.scaleIncrement = defaults.scaleIncrement;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder maxCount(Integer maxCount) {
            this.maxCount = Objects.requireNonNull(maxCount);
            return this;
        }
        public Builder minCount(Integer minCount) {
            this.minCount = Objects.requireNonNull(minCount);
            return this;
        }
        public Builder scaleIncrement(Integer scaleIncrement) {
            this.scaleIncrement = Objects.requireNonNull(scaleIncrement);
            return this;
        }        public AddRemoveReplicaScalingMechanismResponse build() {
            return new AddRemoveReplicaScalingMechanismResponse(kind, maxCount, minCount, scaleIncrement);
        }
    }
}
