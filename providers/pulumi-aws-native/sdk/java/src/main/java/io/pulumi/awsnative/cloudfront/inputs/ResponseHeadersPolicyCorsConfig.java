// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyAccessControlAllowHeaders;
import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyAccessControlAllowMethods;
import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyAccessControlAllowOrigins;
import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyAccessControlExposeHeaders;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicyCorsConfig extends io.pulumi.resources.InvokeArgs {

    public static final ResponseHeadersPolicyCorsConfig Empty = new ResponseHeadersPolicyCorsConfig();

    @Import(name="accessControlAllowCredentials", required=true)
      private final Boolean accessControlAllowCredentials;

    public Boolean accessControlAllowCredentials() {
        return this.accessControlAllowCredentials;
    }

    @Import(name="accessControlAllowHeaders", required=true)
      private final ResponseHeadersPolicyAccessControlAllowHeaders accessControlAllowHeaders;

    public ResponseHeadersPolicyAccessControlAllowHeaders accessControlAllowHeaders() {
        return this.accessControlAllowHeaders;
    }

    @Import(name="accessControlAllowMethods", required=true)
      private final ResponseHeadersPolicyAccessControlAllowMethods accessControlAllowMethods;

    public ResponseHeadersPolicyAccessControlAllowMethods accessControlAllowMethods() {
        return this.accessControlAllowMethods;
    }

    @Import(name="accessControlAllowOrigins", required=true)
      private final ResponseHeadersPolicyAccessControlAllowOrigins accessControlAllowOrigins;

    public ResponseHeadersPolicyAccessControlAllowOrigins accessControlAllowOrigins() {
        return this.accessControlAllowOrigins;
    }

    @Import(name="accessControlExposeHeaders")
      private final @Nullable ResponseHeadersPolicyAccessControlExposeHeaders accessControlExposeHeaders;

    public Optional<ResponseHeadersPolicyAccessControlExposeHeaders> accessControlExposeHeaders() {
        return this.accessControlExposeHeaders == null ? Optional.empty() : Optional.ofNullable(this.accessControlExposeHeaders);
    }

    @Import(name="accessControlMaxAgeSec")
      private final @Nullable Integer accessControlMaxAgeSec;

    public Optional<Integer> accessControlMaxAgeSec() {
        return this.accessControlMaxAgeSec == null ? Optional.empty() : Optional.ofNullable(this.accessControlMaxAgeSec);
    }

    @Import(name="originOverride", required=true)
      private final Boolean originOverride;

    public Boolean originOverride() {
        return this.originOverride;
    }

    public ResponseHeadersPolicyCorsConfig(
        Boolean accessControlAllowCredentials,
        ResponseHeadersPolicyAccessControlAllowHeaders accessControlAllowHeaders,
        ResponseHeadersPolicyAccessControlAllowMethods accessControlAllowMethods,
        ResponseHeadersPolicyAccessControlAllowOrigins accessControlAllowOrigins,
        @Nullable ResponseHeadersPolicyAccessControlExposeHeaders accessControlExposeHeaders,
        @Nullable Integer accessControlMaxAgeSec,
        Boolean originOverride) {
        this.accessControlAllowCredentials = Objects.requireNonNull(accessControlAllowCredentials, "expected parameter 'accessControlAllowCredentials' to be non-null");
        this.accessControlAllowHeaders = Objects.requireNonNull(accessControlAllowHeaders, "expected parameter 'accessControlAllowHeaders' to be non-null");
        this.accessControlAllowMethods = Objects.requireNonNull(accessControlAllowMethods, "expected parameter 'accessControlAllowMethods' to be non-null");
        this.accessControlAllowOrigins = Objects.requireNonNull(accessControlAllowOrigins, "expected parameter 'accessControlAllowOrigins' to be non-null");
        this.accessControlExposeHeaders = accessControlExposeHeaders;
        this.accessControlMaxAgeSec = accessControlMaxAgeSec;
        this.originOverride = Objects.requireNonNull(originOverride, "expected parameter 'originOverride' to be non-null");
    }

    private ResponseHeadersPolicyCorsConfig() {
        this.accessControlAllowCredentials = null;
        this.accessControlAllowHeaders = null;
        this.accessControlAllowMethods = null;
        this.accessControlAllowOrigins = null;
        this.accessControlExposeHeaders = null;
        this.accessControlMaxAgeSec = null;
        this.originOverride = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyCorsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean accessControlAllowCredentials;
        private ResponseHeadersPolicyAccessControlAllowHeaders accessControlAllowHeaders;
        private ResponseHeadersPolicyAccessControlAllowMethods accessControlAllowMethods;
        private ResponseHeadersPolicyAccessControlAllowOrigins accessControlAllowOrigins;
        private @Nullable ResponseHeadersPolicyAccessControlExposeHeaders accessControlExposeHeaders;
        private @Nullable Integer accessControlMaxAgeSec;
        private Boolean originOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyCorsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlAllowCredentials = defaults.accessControlAllowCredentials;
    	      this.accessControlAllowHeaders = defaults.accessControlAllowHeaders;
    	      this.accessControlAllowMethods = defaults.accessControlAllowMethods;
    	      this.accessControlAllowOrigins = defaults.accessControlAllowOrigins;
    	      this.accessControlExposeHeaders = defaults.accessControlExposeHeaders;
    	      this.accessControlMaxAgeSec = defaults.accessControlMaxAgeSec;
    	      this.originOverride = defaults.originOverride;
        }

        public Builder accessControlAllowCredentials(Boolean accessControlAllowCredentials) {
            this.accessControlAllowCredentials = Objects.requireNonNull(accessControlAllowCredentials);
            return this;
        }
        public Builder accessControlAllowHeaders(ResponseHeadersPolicyAccessControlAllowHeaders accessControlAllowHeaders) {
            this.accessControlAllowHeaders = Objects.requireNonNull(accessControlAllowHeaders);
            return this;
        }
        public Builder accessControlAllowMethods(ResponseHeadersPolicyAccessControlAllowMethods accessControlAllowMethods) {
            this.accessControlAllowMethods = Objects.requireNonNull(accessControlAllowMethods);
            return this;
        }
        public Builder accessControlAllowOrigins(ResponseHeadersPolicyAccessControlAllowOrigins accessControlAllowOrigins) {
            this.accessControlAllowOrigins = Objects.requireNonNull(accessControlAllowOrigins);
            return this;
        }
        public Builder accessControlExposeHeaders(@Nullable ResponseHeadersPolicyAccessControlExposeHeaders accessControlExposeHeaders) {
            this.accessControlExposeHeaders = accessControlExposeHeaders;
            return this;
        }
        public Builder accessControlMaxAgeSec(@Nullable Integer accessControlMaxAgeSec) {
            this.accessControlMaxAgeSec = accessControlMaxAgeSec;
            return this;
        }
        public Builder originOverride(Boolean originOverride) {
            this.originOverride = Objects.requireNonNull(originOverride);
            return this;
        }        public ResponseHeadersPolicyCorsConfig build() {
            return new ResponseHeadersPolicyCorsConfig(accessControlAllowCredentials, accessControlAllowHeaders, accessControlAllowMethods, accessControlAllowOrigins, accessControlExposeHeaders, accessControlMaxAgeSec, originOverride);
        }
    }
}
