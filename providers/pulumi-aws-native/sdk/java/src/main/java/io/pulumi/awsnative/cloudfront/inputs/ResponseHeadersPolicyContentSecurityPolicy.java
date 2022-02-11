// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ResponseHeadersPolicyContentSecurityPolicy extends io.pulumi.resources.InvokeArgs {

    public static final ResponseHeadersPolicyContentSecurityPolicy Empty = new ResponseHeadersPolicyContentSecurityPolicy();

    @InputImport(name="contentSecurityPolicy", required=true)
    private final String contentSecurityPolicy;

    public String getContentSecurityPolicy() {
        return this.contentSecurityPolicy;
    }

    @InputImport(name="override", required=true)
    private final Boolean override;

    public Boolean getOverride() {
        return this.override;
    }

    public ResponseHeadersPolicyContentSecurityPolicy(
        String contentSecurityPolicy,
        Boolean override) {
        this.contentSecurityPolicy = Objects.requireNonNull(contentSecurityPolicy, "expected parameter 'contentSecurityPolicy' to be non-null");
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
    }

    private ResponseHeadersPolicyContentSecurityPolicy() {
        this.contentSecurityPolicy = null;
        this.override = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyContentSecurityPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentSecurityPolicy;
        private Boolean override;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyContentSecurityPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentSecurityPolicy = defaults.contentSecurityPolicy;
    	      this.override = defaults.override;
        }

        public Builder setContentSecurityPolicy(String contentSecurityPolicy) {
            this.contentSecurityPolicy = Objects.requireNonNull(contentSecurityPolicy);
            return this;
        }

        public Builder setOverride(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }

        public ResponseHeadersPolicyContentSecurityPolicy build() {
            return new ResponseHeadersPolicyContentSecurityPolicy(contentSecurityPolicy, override);
        }
    }
}
