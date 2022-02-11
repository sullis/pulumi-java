// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccessPointPublicAccessBlockConfiguration {
    private final @Nullable Boolean blockPublicAcls;
    private final @Nullable Boolean blockPublicPolicy;
    private final @Nullable Boolean ignorePublicAcls;
    private final @Nullable Boolean restrictPublicBuckets;

    @OutputCustomType.Constructor({"blockPublicAcls","blockPublicPolicy","ignorePublicAcls","restrictPublicBuckets"})
    private AccessPointPublicAccessBlockConfiguration(
        @Nullable Boolean blockPublicAcls,
        @Nullable Boolean blockPublicPolicy,
        @Nullable Boolean ignorePublicAcls,
        @Nullable Boolean restrictPublicBuckets) {
        this.blockPublicAcls = blockPublicAcls;
        this.blockPublicPolicy = blockPublicPolicy;
        this.ignorePublicAcls = ignorePublicAcls;
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    public Optional<Boolean> getBlockPublicAcls() {
        return Optional.ofNullable(this.blockPublicAcls);
    }
    public Optional<Boolean> getBlockPublicPolicy() {
        return Optional.ofNullable(this.blockPublicPolicy);
    }
    public Optional<Boolean> getIgnorePublicAcls() {
        return Optional.ofNullable(this.ignorePublicAcls);
    }
    public Optional<Boolean> getRestrictPublicBuckets() {
        return Optional.ofNullable(this.restrictPublicBuckets);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointPublicAccessBlockConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean blockPublicAcls;
        private @Nullable Boolean blockPublicPolicy;
        private @Nullable Boolean ignorePublicAcls;
        private @Nullable Boolean restrictPublicBuckets;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointPublicAccessBlockConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockPublicAcls = defaults.blockPublicAcls;
    	      this.blockPublicPolicy = defaults.blockPublicPolicy;
    	      this.ignorePublicAcls = defaults.ignorePublicAcls;
    	      this.restrictPublicBuckets = defaults.restrictPublicBuckets;
        }

        public Builder setBlockPublicAcls(@Nullable Boolean blockPublicAcls) {
            this.blockPublicAcls = blockPublicAcls;
            return this;
        }

        public Builder setBlockPublicPolicy(@Nullable Boolean blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }

        public Builder setIgnorePublicAcls(@Nullable Boolean ignorePublicAcls) {
            this.ignorePublicAcls = ignorePublicAcls;
            return this;
        }

        public Builder setRestrictPublicBuckets(@Nullable Boolean restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }

        public AccessPointPublicAccessBlockConfiguration build() {
            return new AccessPointPublicAccessBlockConfiguration(blockPublicAcls, blockPublicPolicy, ignorePublicAcls, restrictPublicBuckets);
        }
    }
}
