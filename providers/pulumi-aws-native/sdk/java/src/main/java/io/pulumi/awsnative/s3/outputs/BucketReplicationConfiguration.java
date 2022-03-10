// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.BucketReplicationRule;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class BucketReplicationConfiguration {
    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that Amazon S3 assumes when replicating objects.
     * 
     */
    private final String role;
    /**
     * A container for one or more replication rules.
     * 
     */
    private final List<BucketReplicationRule> rules;

    @OutputCustomType.Constructor
    private BucketReplicationConfiguration(
        @OutputCustomType.Parameter("role") String role,
        @OutputCustomType.Parameter("rules") List<BucketReplicationRule> rules) {
        this.role = role;
        this.rules = rules;
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that Amazon S3 assumes when replicating objects.
     * 
    */
    public String getRole() {
        return this.role;
    }
    /**
     * A container for one or more replication rules.
     * 
    */
    public List<BucketReplicationRule> getRules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String role;
        private List<BucketReplicationRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.role = defaults.role;
    	      this.rules = defaults.rules;
        }

        public Builder setRole(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRules(List<BucketReplicationRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public BucketReplicationConfiguration build() {
            return new BucketReplicationConfiguration(role, rules);
        }
    }
}
