// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketRoutingRuleCondition {
    /**
     * The HTTP error code when the redirect is applied.
     * 
     */
    private final @Nullable String httpErrorCodeReturnedEquals;
    /**
     * The object key name prefix when the redirect is applied.
     * 
     */
    private final @Nullable String keyPrefixEquals;

    @CustomType.Constructor
    private BucketRoutingRuleCondition(
        @CustomType.Parameter("httpErrorCodeReturnedEquals") @Nullable String httpErrorCodeReturnedEquals,
        @CustomType.Parameter("keyPrefixEquals") @Nullable String keyPrefixEquals) {
        this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
        this.keyPrefixEquals = keyPrefixEquals;
    }

    /**
     * The HTTP error code when the redirect is applied.
     * 
    */
    public Optional<String> httpErrorCodeReturnedEquals() {
        return Optional.ofNullable(this.httpErrorCodeReturnedEquals);
    }
    /**
     * The object key name prefix when the redirect is applied.
     * 
    */
    public Optional<String> keyPrefixEquals() {
        return Optional.ofNullable(this.keyPrefixEquals);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRoutingRuleCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String httpErrorCodeReturnedEquals;
        private @Nullable String keyPrefixEquals;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRoutingRuleCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpErrorCodeReturnedEquals = defaults.httpErrorCodeReturnedEquals;
    	      this.keyPrefixEquals = defaults.keyPrefixEquals;
        }

        public Builder httpErrorCodeReturnedEquals(@Nullable String httpErrorCodeReturnedEquals) {
            this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
            return this;
        }
        public Builder keyPrefixEquals(@Nullable String keyPrefixEquals) {
            this.keyPrefixEquals = keyPrefixEquals;
            return this;
        }        public BucketRoutingRuleCondition build() {
            return new BucketRoutingRuleCondition(httpErrorCodeReturnedEquals, keyPrefixEquals);
        }
    }
}
