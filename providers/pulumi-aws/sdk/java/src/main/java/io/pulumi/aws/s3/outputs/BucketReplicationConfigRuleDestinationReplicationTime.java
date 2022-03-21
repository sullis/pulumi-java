// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.aws.s3.outputs.BucketReplicationConfigRuleDestinationReplicationTimeTime;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketReplicationConfigRuleDestinationReplicationTime {
    /**
     * The status of the Replication Time Control. Either `"Enabled"` or `"Disabled"`.
     * 
     */
    private final String status;
    /**
     * A configuration block specifying the time by which replication should be complete for all objects and operations on objects documented below.
     * 
     */
    private final BucketReplicationConfigRuleDestinationReplicationTimeTime time;

    @CustomType.Constructor
    private BucketReplicationConfigRuleDestinationReplicationTime(
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("time") BucketReplicationConfigRuleDestinationReplicationTimeTime time) {
        this.status = status;
        this.time = time;
    }

    /**
     * The status of the Replication Time Control. Either `"Enabled"` or `"Disabled"`.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * A configuration block specifying the time by which replication should be complete for all objects and operations on objects documented below.
     * 
    */
    public BucketReplicationConfigRuleDestinationReplicationTimeTime getTime() {
        return this.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationReplicationTime defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String status;
        private BucketReplicationConfigRuleDestinationReplicationTimeTime time;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationReplicationTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.time = defaults.time;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder time(BucketReplicationConfigRuleDestinationReplicationTimeTime time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }        public BucketReplicationConfigRuleDestinationReplicationTime build() {
            return new BucketReplicationConfigRuleDestinationReplicationTime(status, time);
        }
    }
}
