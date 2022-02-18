// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyContentSecurityPolicy;
import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyContentTypeOptions;
import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyFrameOptions;
import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyReferrerPolicy;
import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyStrictTransportSecurity;
import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyXSSProtection;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicySecurityHeadersConfig extends io.pulumi.resources.InvokeArgs {

    public static final ResponseHeadersPolicySecurityHeadersConfig Empty = new ResponseHeadersPolicySecurityHeadersConfig();

    @InputImport(name="contentSecurityPolicy")
    private final @Nullable ResponseHeadersPolicyContentSecurityPolicy contentSecurityPolicy;

    public Optional<ResponseHeadersPolicyContentSecurityPolicy> getContentSecurityPolicy() {
        return this.contentSecurityPolicy == null ? Optional.empty() : Optional.ofNullable(this.contentSecurityPolicy);
    }

    @InputImport(name="contentTypeOptions")
    private final @Nullable ResponseHeadersPolicyContentTypeOptions contentTypeOptions;

    public Optional<ResponseHeadersPolicyContentTypeOptions> getContentTypeOptions() {
        return this.contentTypeOptions == null ? Optional.empty() : Optional.ofNullable(this.contentTypeOptions);
    }

    @InputImport(name="frameOptions")
    private final @Nullable ResponseHeadersPolicyFrameOptions frameOptions;

    public Optional<ResponseHeadersPolicyFrameOptions> getFrameOptions() {
        return this.frameOptions == null ? Optional.empty() : Optional.ofNullable(this.frameOptions);
    }

    @InputImport(name="referrerPolicy")
    private final @Nullable ResponseHeadersPolicyReferrerPolicy referrerPolicy;

    public Optional<ResponseHeadersPolicyReferrerPolicy> getReferrerPolicy() {
        return this.referrerPolicy == null ? Optional.empty() : Optional.ofNullable(this.referrerPolicy);
    }

    @InputImport(name="strictTransportSecurity")
    private final @Nullable ResponseHeadersPolicyStrictTransportSecurity strictTransportSecurity;

    public Optional<ResponseHeadersPolicyStrictTransportSecurity> getStrictTransportSecurity() {
        return this.strictTransportSecurity == null ? Optional.empty() : Optional.ofNullable(this.strictTransportSecurity);
    }

    @InputImport(name="xSSProtection")
    private final @Nullable ResponseHeadersPolicyXSSProtection xSSProtection;

    public Optional<ResponseHeadersPolicyXSSProtection> getXSSProtection() {
        return this.xSSProtection == null ? Optional.empty() : Optional.ofNullable(this.xSSProtection);
    }

    public ResponseHeadersPolicySecurityHeadersConfig(
        @Nullable ResponseHeadersPolicyContentSecurityPolicy contentSecurityPolicy,
        @Nullable ResponseHeadersPolicyContentTypeOptions contentTypeOptions,
        @Nullable ResponseHeadersPolicyFrameOptions frameOptions,
        @Nullable ResponseHeadersPolicyReferrerPolicy referrerPolicy,
        @Nullable ResponseHeadersPolicyStrictTransportSecurity strictTransportSecurity,
        @Nullable ResponseHeadersPolicyXSSProtection xSSProtection) {
        this.contentSecurityPolicy = contentSecurityPolicy;
        this.contentTypeOptions = contentTypeOptions;
        this.frameOptions = frameOptions;
        this.referrerPolicy = referrerPolicy;
        this.strictTransportSecurity = strictTransportSecurity;
        this.xSSProtection = xSSProtection;
    }

    private ResponseHeadersPolicySecurityHeadersConfig() {
        this.contentSecurityPolicy = null;
        this.contentTypeOptions = null;
        this.frameOptions = null;
        this.referrerPolicy = null;
        this.strictTransportSecurity = null;
        this.xSSProtection = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ResponseHeadersPolicyContentSecurityPolicy contentSecurityPolicy;
        private @Nullable ResponseHeadersPolicyContentTypeOptions contentTypeOptions;
        private @Nullable ResponseHeadersPolicyFrameOptions frameOptions;
        private @Nullable ResponseHeadersPolicyReferrerPolicy referrerPolicy;
        private @Nullable ResponseHeadersPolicyStrictTransportSecurity strictTransportSecurity;
        private @Nullable ResponseHeadersPolicyXSSProtection xSSProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicySecurityHeadersConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentSecurityPolicy = defaults.contentSecurityPolicy;
    	      this.contentTypeOptions = defaults.contentTypeOptions;
    	      this.frameOptions = defaults.frameOptions;
    	      this.referrerPolicy = defaults.referrerPolicy;
    	      this.strictTransportSecurity = defaults.strictTransportSecurity;
    	      this.xSSProtection = defaults.xSSProtection;
        }

        public Builder setContentSecurityPolicy(@Nullable ResponseHeadersPolicyContentSecurityPolicy contentSecurityPolicy) {
            this.contentSecurityPolicy = contentSecurityPolicy;
            return this;
        }

        public Builder setContentTypeOptions(@Nullable ResponseHeadersPolicyContentTypeOptions contentTypeOptions) {
            this.contentTypeOptions = contentTypeOptions;
            return this;
        }

        public Builder setFrameOptions(@Nullable ResponseHeadersPolicyFrameOptions frameOptions) {
            this.frameOptions = frameOptions;
            return this;
        }

        public Builder setReferrerPolicy(@Nullable ResponseHeadersPolicyReferrerPolicy referrerPolicy) {
            this.referrerPolicy = referrerPolicy;
            return this;
        }

        public Builder setStrictTransportSecurity(@Nullable ResponseHeadersPolicyStrictTransportSecurity strictTransportSecurity) {
            this.strictTransportSecurity = strictTransportSecurity;
            return this;
        }

        public Builder setXSSProtection(@Nullable ResponseHeadersPolicyXSSProtection xSSProtection) {
            this.xSSProtection = xSSProtection;
            return this;
        }

        public ResponseHeadersPolicySecurityHeadersConfig build() {
            return new ResponseHeadersPolicySecurityHeadersConfig(contentSecurityPolicy, contentTypeOptions, frameOptions, referrerPolicy, strictTransportSecurity, xSSProtection);
        }
    }
}
