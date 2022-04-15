// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.aws.s3.outputs.BucketObjectLockConfigurationRule;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketObjectLockConfiguration {
    /**
     * Indicates whether this bucket has an Object Lock configuration enabled. Valid value is `Enabled`.
     * 
     */
    private final String objectLockEnabled;
    /**
     * The Object Lock rule in place for this bucket.
     * 
     */
    private final @Nullable BucketObjectLockConfigurationRule rule;

    @CustomType.Constructor
    private BucketObjectLockConfiguration(
        @CustomType.Parameter("objectLockEnabled") String objectLockEnabled,
        @CustomType.Parameter("rule") @Nullable BucketObjectLockConfigurationRule rule) {
        this.objectLockEnabled = objectLockEnabled;
        this.rule = rule;
    }

    /**
     * Indicates whether this bucket has an Object Lock configuration enabled. Valid value is `Enabled`.
     * 
    */
    public String objectLockEnabled() {
        return this.objectLockEnabled;
    }
    /**
     * The Object Lock rule in place for this bucket.
     * 
    */
    public Optional<BucketObjectLockConfigurationRule> rule() {
        return Optional.ofNullable(this.rule);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectLockConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectLockEnabled;
        private @Nullable BucketObjectLockConfigurationRule rule;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectLockConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectLockEnabled = defaults.objectLockEnabled;
    	      this.rule = defaults.rule;
        }

        public Builder objectLockEnabled(String objectLockEnabled) {
            this.objectLockEnabled = Objects.requireNonNull(objectLockEnabled);
            return this;
        }
        public Builder rule(@Nullable BucketObjectLockConfigurationRule rule) {
            this.rule = rule;
            return this;
        }        public BucketObjectLockConfiguration build() {
            return new BucketObjectLockConfiguration(objectLockEnabled, rule);
        }
    }
}
