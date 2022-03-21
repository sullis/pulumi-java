// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketObjectLockRule;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketObjectLockConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final BucketObjectLockConfiguration Empty = new BucketObjectLockConfiguration();

    @Import(name="objectLockEnabled")
      private final @Nullable String objectLockEnabled;

    public Optional<String> getObjectLockEnabled() {
        return this.objectLockEnabled == null ? Optional.empty() : Optional.ofNullable(this.objectLockEnabled);
    }

    @Import(name="rule")
      private final @Nullable BucketObjectLockRule rule;

    public Optional<BucketObjectLockRule> getRule() {
        return this.rule == null ? Optional.empty() : Optional.ofNullable(this.rule);
    }

    public BucketObjectLockConfiguration(
        @Nullable String objectLockEnabled,
        @Nullable BucketObjectLockRule rule) {
        this.objectLockEnabled = objectLockEnabled;
        this.rule = rule;
    }

    private BucketObjectLockConfiguration() {
        this.objectLockEnabled = null;
        this.rule = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectLockConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String objectLockEnabled;
        private @Nullable BucketObjectLockRule rule;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectLockConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectLockEnabled = defaults.objectLockEnabled;
    	      this.rule = defaults.rule;
        }

        public Builder objectLockEnabled(@Nullable String objectLockEnabled) {
            this.objectLockEnabled = objectLockEnabled;
            return this;
        }
        public Builder rule(@Nullable BucketObjectLockRule rule) {
            this.rule = rule;
            return this;
        }        public BucketObjectLockConfiguration build() {
            return new BucketObjectLockConfiguration(objectLockEnabled, rule);
        }
    }
}
