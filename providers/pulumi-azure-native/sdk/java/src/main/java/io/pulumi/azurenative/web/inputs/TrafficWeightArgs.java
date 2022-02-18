// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Traffic weight assigned to a revision
 * 
 */
public final class TrafficWeightArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrafficWeightArgs Empty = new TrafficWeightArgs();

    /**
     * Indicates that the traffic weight belongs to a latest stable revision
     * 
     */
    @InputImport(name="latestRevision")
    private final @Nullable Input<Boolean> latestRevision;

    public Input<Boolean> getLatestRevision() {
        return this.latestRevision == null ? Input.empty() : this.latestRevision;
    }

    /**
     * Name of a revision
     * 
     */
    @InputImport(name="revisionName")
    private final @Nullable Input<String> revisionName;

    public Input<String> getRevisionName() {
        return this.revisionName == null ? Input.empty() : this.revisionName;
    }

    /**
     * Traffic weight assigned to a revision
     * 
     */
    @InputImport(name="weight")
    private final @Nullable Input<Integer> weight;

    public Input<Integer> getWeight() {
        return this.weight == null ? Input.empty() : this.weight;
    }

    public TrafficWeightArgs(
        @Nullable Input<Boolean> latestRevision,
        @Nullable Input<String> revisionName,
        @Nullable Input<Integer> weight) {
        this.latestRevision = latestRevision == null ? Input.ofNullable(false) : latestRevision;
        this.revisionName = revisionName;
        this.weight = weight;
    }

    private TrafficWeightArgs() {
        this.latestRevision = Input.empty();
        this.revisionName = Input.empty();
        this.weight = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficWeightArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> latestRevision;
        private @Nullable Input<String> revisionName;
        private @Nullable Input<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficWeightArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latestRevision = defaults.latestRevision;
    	      this.revisionName = defaults.revisionName;
    	      this.weight = defaults.weight;
        }

        public Builder setLatestRevision(@Nullable Input<Boolean> latestRevision) {
            this.latestRevision = latestRevision;
            return this;
        }

        public Builder setLatestRevision(@Nullable Boolean latestRevision) {
            this.latestRevision = Input.ofNullable(latestRevision);
            return this;
        }

        public Builder setRevisionName(@Nullable Input<String> revisionName) {
            this.revisionName = revisionName;
            return this;
        }

        public Builder setRevisionName(@Nullable String revisionName) {
            this.revisionName = Input.ofNullable(revisionName);
            return this;
        }

        public Builder setWeight(@Nullable Input<Integer> weight) {
            this.weight = weight;
            return this;
        }

        public Builder setWeight(@Nullable Integer weight) {
            this.weight = Input.ofNullable(weight);
            return this;
        }

        public TrafficWeightArgs build() {
            return new TrafficWeightArgs(latestRevision, revisionName, weight);
        }
    }
}
