// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A container for describing a condition that must be met for the specified redirect to apply.You must specify at least one of HttpErrorCodeReturnedEquals and KeyPrefixEquals
 * 
 */
public final class BucketRoutingRuleConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketRoutingRuleConditionArgs Empty = new BucketRoutingRuleConditionArgs();

    /**
     * The HTTP error code when the redirect is applied.
     * 
     */
    @InputImport(name="httpErrorCodeReturnedEquals")
      private final @Nullable Input<String> httpErrorCodeReturnedEquals;

    public Input<String> getHttpErrorCodeReturnedEquals() {
        return this.httpErrorCodeReturnedEquals == null ? Input.empty() : this.httpErrorCodeReturnedEquals;
    }

    /**
     * The object key name prefix when the redirect is applied.
     * 
     */
    @InputImport(name="keyPrefixEquals")
      private final @Nullable Input<String> keyPrefixEquals;

    public Input<String> getKeyPrefixEquals() {
        return this.keyPrefixEquals == null ? Input.empty() : this.keyPrefixEquals;
    }

    public BucketRoutingRuleConditionArgs(
        @Nullable Input<String> httpErrorCodeReturnedEquals,
        @Nullable Input<String> keyPrefixEquals) {
        this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
        this.keyPrefixEquals = keyPrefixEquals;
    }

    private BucketRoutingRuleConditionArgs() {
        this.httpErrorCodeReturnedEquals = Input.empty();
        this.keyPrefixEquals = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRoutingRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> httpErrorCodeReturnedEquals;
        private @Nullable Input<String> keyPrefixEquals;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRoutingRuleConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpErrorCodeReturnedEquals = defaults.httpErrorCodeReturnedEquals;
    	      this.keyPrefixEquals = defaults.keyPrefixEquals;
        }

        public Builder setHttpErrorCodeReturnedEquals(@Nullable Input<String> httpErrorCodeReturnedEquals) {
            this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
            return this;
        }

        public Builder setHttpErrorCodeReturnedEquals(@Nullable String httpErrorCodeReturnedEquals) {
            this.httpErrorCodeReturnedEquals = Input.ofNullable(httpErrorCodeReturnedEquals);
            return this;
        }

        public Builder setKeyPrefixEquals(@Nullable Input<String> keyPrefixEquals) {
            this.keyPrefixEquals = keyPrefixEquals;
            return this;
        }

        public Builder setKeyPrefixEquals(@Nullable String keyPrefixEquals) {
            this.keyPrefixEquals = Input.ofNullable(keyPrefixEquals);
            return this;
        }
        public BucketRoutingRuleConditionArgs build() {
            return new BucketRoutingRuleConditionArgs(httpErrorCodeReturnedEquals, keyPrefixEquals);
        }
    }
}