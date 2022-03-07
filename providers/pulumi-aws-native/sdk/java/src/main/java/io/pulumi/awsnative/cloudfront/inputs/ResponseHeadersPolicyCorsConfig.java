// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyAccessControlAllowHeaders;
import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyAccessControlAllowMethods;
import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyAccessControlAllowOrigins;
import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyAccessControlExposeHeaders;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicyCorsConfig extends io.pulumi.resources.InvokeArgs {

    public static final ResponseHeadersPolicyCorsConfig Empty = new ResponseHeadersPolicyCorsConfig();

    @InputImport(name="accessControlAllowCredentials", required=true)
      private final Boolean accessControlAllowCredentials;

    public Boolean getAccessControlAllowCredentials() {
        return this.accessControlAllowCredentials;
    }

    @InputImport(name="accessControlAllowHeaders", required=true)
      private final ResponseHeadersPolicyAccessControlAllowHeaders accessControlAllowHeaders;

    public ResponseHeadersPolicyAccessControlAllowHeaders getAccessControlAllowHeaders() {
        return this.accessControlAllowHeaders;
    }

    @InputImport(name="accessControlAllowMethods", required=true)
      private final ResponseHeadersPolicyAccessControlAllowMethods accessControlAllowMethods;

    public ResponseHeadersPolicyAccessControlAllowMethods getAccessControlAllowMethods() {
        return this.accessControlAllowMethods;
    }

    @InputImport(name="accessControlAllowOrigins", required=true)
      private final ResponseHeadersPolicyAccessControlAllowOrigins accessControlAllowOrigins;

    public ResponseHeadersPolicyAccessControlAllowOrigins getAccessControlAllowOrigins() {
        return this.accessControlAllowOrigins;
    }

    @InputImport(name="accessControlExposeHeaders")
      private final @Nullable ResponseHeadersPolicyAccessControlExposeHeaders accessControlExposeHeaders;

    public Optional<ResponseHeadersPolicyAccessControlExposeHeaders> getAccessControlExposeHeaders() {
        return this.accessControlExposeHeaders == null ? Optional.empty() : Optional.ofNullable(this.accessControlExposeHeaders);
    }

    @InputImport(name="accessControlMaxAgeSec")
      private final @Nullable Integer accessControlMaxAgeSec;

    public Optional<Integer> getAccessControlMaxAgeSec() {
        return this.accessControlMaxAgeSec == null ? Optional.empty() : Optional.ofNullable(this.accessControlMaxAgeSec);
    }

    @InputImport(name="originOverride", required=true)
      private final Boolean originOverride;

    public Boolean getOriginOverride() {
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

        public Builder setAccessControlAllowCredentials(Boolean accessControlAllowCredentials) {
            this.accessControlAllowCredentials = Objects.requireNonNull(accessControlAllowCredentials);
            return this;
        }

        public Builder setAccessControlAllowHeaders(ResponseHeadersPolicyAccessControlAllowHeaders accessControlAllowHeaders) {
            this.accessControlAllowHeaders = Objects.requireNonNull(accessControlAllowHeaders);
            return this;
        }

        public Builder setAccessControlAllowMethods(ResponseHeadersPolicyAccessControlAllowMethods accessControlAllowMethods) {
            this.accessControlAllowMethods = Objects.requireNonNull(accessControlAllowMethods);
            return this;
        }

        public Builder setAccessControlAllowOrigins(ResponseHeadersPolicyAccessControlAllowOrigins accessControlAllowOrigins) {
            this.accessControlAllowOrigins = Objects.requireNonNull(accessControlAllowOrigins);
            return this;
        }

        public Builder setAccessControlExposeHeaders(@Nullable ResponseHeadersPolicyAccessControlExposeHeaders accessControlExposeHeaders) {
            this.accessControlExposeHeaders = accessControlExposeHeaders;
            return this;
        }

        public Builder setAccessControlMaxAgeSec(@Nullable Integer accessControlMaxAgeSec) {
            this.accessControlMaxAgeSec = accessControlMaxAgeSec;
            return this;
        }

        public Builder setOriginOverride(Boolean originOverride) {
            this.originOverride = Objects.requireNonNull(originOverride);
            return this;
        }
        public ResponseHeadersPolicyCorsConfig build() {
            return new ResponseHeadersPolicyCorsConfig(accessControlAllowCredentials, accessControlAllowHeaders, accessControlAllowMethods, accessControlAllowOrigins, accessControlExposeHeaders, accessControlMaxAgeSec, originOverride);
        }
    }
}