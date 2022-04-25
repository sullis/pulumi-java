// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.outputs;

import com.pulumi.awsnative.s3.enums.BucketReplicationRuleStatus;
import com.pulumi.awsnative.s3.outputs.BucketDeleteMarkerReplication;
import com.pulumi.awsnative.s3.outputs.BucketReplicationDestination;
import com.pulumi.awsnative.s3.outputs.BucketReplicationRuleFilter;
import com.pulumi.awsnative.s3.outputs.BucketSourceSelectionCriteria;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketReplicationRule {
    private final @Nullable BucketDeleteMarkerReplication deleteMarkerReplication;
    private final BucketReplicationDestination destination;
    private final @Nullable BucketReplicationRuleFilter filter;
    /**
     * @return A unique identifier for the rule.
     * 
     */
    private final @Nullable String id;
    /**
     * @return An object key name prefix that identifies the object or objects to which the rule applies.
     * 
     */
    private final @Nullable String prefix;
    private final @Nullable Integer priority;
    private final @Nullable BucketSourceSelectionCriteria sourceSelectionCriteria;
    /**
     * @return Specifies whether the rule is enabled.
     * 
     */
    private final BucketReplicationRuleStatus status;

    @CustomType.Constructor
    private BucketReplicationRule(
        @CustomType.Parameter("deleteMarkerReplication") @Nullable BucketDeleteMarkerReplication deleteMarkerReplication,
        @CustomType.Parameter("destination") BucketReplicationDestination destination,
        @CustomType.Parameter("filter") @Nullable BucketReplicationRuleFilter filter,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("prefix") @Nullable String prefix,
        @CustomType.Parameter("priority") @Nullable Integer priority,
        @CustomType.Parameter("sourceSelectionCriteria") @Nullable BucketSourceSelectionCriteria sourceSelectionCriteria,
        @CustomType.Parameter("status") BucketReplicationRuleStatus status) {
        this.deleteMarkerReplication = deleteMarkerReplication;
        this.destination = destination;
        this.filter = filter;
        this.id = id;
        this.prefix = prefix;
        this.priority = priority;
        this.sourceSelectionCriteria = sourceSelectionCriteria;
        this.status = status;
    }

    public Optional<BucketDeleteMarkerReplication> deleteMarkerReplication() {
        return Optional.ofNullable(this.deleteMarkerReplication);
    }
    public BucketReplicationDestination destination() {
        return this.destination;
    }
    public Optional<BucketReplicationRuleFilter> filter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * @return A unique identifier for the rule.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return An object key name prefix that identifies the object or objects to which the rule applies.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    public Optional<BucketSourceSelectionCriteria> sourceSelectionCriteria() {
        return Optional.ofNullable(this.sourceSelectionCriteria);
    }
    /**
     * @return Specifies whether the rule is enabled.
     * 
     */
    public BucketReplicationRuleStatus status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketDeleteMarkerReplication deleteMarkerReplication;
        private BucketReplicationDestination destination;
        private @Nullable BucketReplicationRuleFilter filter;
        private @Nullable String id;
        private @Nullable String prefix;
        private @Nullable Integer priority;
        private @Nullable BucketSourceSelectionCriteria sourceSelectionCriteria;
        private BucketReplicationRuleStatus status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteMarkerReplication = defaults.deleteMarkerReplication;
    	      this.destination = defaults.destination;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
    	      this.priority = defaults.priority;
    	      this.sourceSelectionCriteria = defaults.sourceSelectionCriteria;
    	      this.status = defaults.status;
        }

        public Builder deleteMarkerReplication(@Nullable BucketDeleteMarkerReplication deleteMarkerReplication) {
            this.deleteMarkerReplication = deleteMarkerReplication;
            return this;
        }
        public Builder destination(BucketReplicationDestination destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder filter(@Nullable BucketReplicationRuleFilter filter) {
            this.filter = filter;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public Builder sourceSelectionCriteria(@Nullable BucketSourceSelectionCriteria sourceSelectionCriteria) {
            this.sourceSelectionCriteria = sourceSelectionCriteria;
            return this;
        }
        public Builder status(BucketReplicationRuleStatus status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public BucketReplicationRule build() {
            return new BucketReplicationRule(deleteMarkerReplication, destination, filter, id, prefix, priority, sourceSelectionCriteria, status);
        }
    }
}
