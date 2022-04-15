// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResponseHeadersPolicyReferrerPolicy {
    private final Boolean override;
    private final String referrerPolicy;

    @CustomType.Constructor
    private ResponseHeadersPolicyReferrerPolicy(
        @CustomType.Parameter("override") Boolean override,
        @CustomType.Parameter("referrerPolicy") String referrerPolicy) {
        this.override = override;
        this.referrerPolicy = referrerPolicy;
    }

    public Boolean override() {
        return this.override;
    }
    public String referrerPolicy() {
        return this.referrerPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyReferrerPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean override;
        private String referrerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyReferrerPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.override = defaults.override;
    	      this.referrerPolicy = defaults.referrerPolicy;
        }

        public Builder override(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }
        public Builder referrerPolicy(String referrerPolicy) {
            this.referrerPolicy = Objects.requireNonNull(referrerPolicy);
            return this;
        }        public ResponseHeadersPolicyReferrerPolicy build() {
            return new ResponseHeadersPolicyReferrerPolicy(override, referrerPolicy);
        }
    }
}
