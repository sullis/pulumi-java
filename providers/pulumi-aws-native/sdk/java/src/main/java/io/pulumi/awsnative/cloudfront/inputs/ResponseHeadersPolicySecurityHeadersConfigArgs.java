// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyContentSecurityPolicyArgs;
import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyContentTypeOptionsArgs;
import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyFrameOptionsArgs;
import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyReferrerPolicyArgs;
import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyStrictTransportSecurityArgs;
import io.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyXSSProtectionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicySecurityHeadersConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicySecurityHeadersConfigArgs Empty = new ResponseHeadersPolicySecurityHeadersConfigArgs();

    @InputImport(name="contentSecurityPolicy")
    private final @Nullable Input<ResponseHeadersPolicyContentSecurityPolicyArgs> contentSecurityPolicy;

    public Input<ResponseHeadersPolicyContentSecurityPolicyArgs> getContentSecurityPolicy() {
        return this.contentSecurityPolicy == null ? Input.empty() : this.contentSecurityPolicy;
    }

    @InputImport(name="contentTypeOptions")
    private final @Nullable Input<ResponseHeadersPolicyContentTypeOptionsArgs> contentTypeOptions;

    public Input<ResponseHeadersPolicyContentTypeOptionsArgs> getContentTypeOptions() {
        return this.contentTypeOptions == null ? Input.empty() : this.contentTypeOptions;
    }

    @InputImport(name="frameOptions")
    private final @Nullable Input<ResponseHeadersPolicyFrameOptionsArgs> frameOptions;

    public Input<ResponseHeadersPolicyFrameOptionsArgs> getFrameOptions() {
        return this.frameOptions == null ? Input.empty() : this.frameOptions;
    }

    @InputImport(name="referrerPolicy")
    private final @Nullable Input<ResponseHeadersPolicyReferrerPolicyArgs> referrerPolicy;

    public Input<ResponseHeadersPolicyReferrerPolicyArgs> getReferrerPolicy() {
        return this.referrerPolicy == null ? Input.empty() : this.referrerPolicy;
    }

    @InputImport(name="strictTransportSecurity")
    private final @Nullable Input<ResponseHeadersPolicyStrictTransportSecurityArgs> strictTransportSecurity;

    public Input<ResponseHeadersPolicyStrictTransportSecurityArgs> getStrictTransportSecurity() {
        return this.strictTransportSecurity == null ? Input.empty() : this.strictTransportSecurity;
    }

    @InputImport(name="xSSProtection")
    private final @Nullable Input<ResponseHeadersPolicyXSSProtectionArgs> xSSProtection;

    public Input<ResponseHeadersPolicyXSSProtectionArgs> getXSSProtection() {
        return this.xSSProtection == null ? Input.empty() : this.xSSProtection;
    }

    public ResponseHeadersPolicySecurityHeadersConfigArgs(
        @Nullable Input<ResponseHeadersPolicyContentSecurityPolicyArgs> contentSecurityPolicy,
        @Nullable Input<ResponseHeadersPolicyContentTypeOptionsArgs> contentTypeOptions,
        @Nullable Input<ResponseHeadersPolicyFrameOptionsArgs> frameOptions,
        @Nullable Input<ResponseHeadersPolicyReferrerPolicyArgs> referrerPolicy,
        @Nullable Input<ResponseHeadersPolicyStrictTransportSecurityArgs> strictTransportSecurity,
        @Nullable Input<ResponseHeadersPolicyXSSProtectionArgs> xSSProtection) {
        this.contentSecurityPolicy = contentSecurityPolicy;
        this.contentTypeOptions = contentTypeOptions;
        this.frameOptions = frameOptions;
        this.referrerPolicy = referrerPolicy;
        this.strictTransportSecurity = strictTransportSecurity;
        this.xSSProtection = xSSProtection;
    }

    private ResponseHeadersPolicySecurityHeadersConfigArgs() {
        this.contentSecurityPolicy = Input.empty();
        this.contentTypeOptions = Input.empty();
        this.frameOptions = Input.empty();
        this.referrerPolicy = Input.empty();
        this.strictTransportSecurity = Input.empty();
        this.xSSProtection = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResponseHeadersPolicyContentSecurityPolicyArgs> contentSecurityPolicy;
        private @Nullable Input<ResponseHeadersPolicyContentTypeOptionsArgs> contentTypeOptions;
        private @Nullable Input<ResponseHeadersPolicyFrameOptionsArgs> frameOptions;
        private @Nullable Input<ResponseHeadersPolicyReferrerPolicyArgs> referrerPolicy;
        private @Nullable Input<ResponseHeadersPolicyStrictTransportSecurityArgs> strictTransportSecurity;
        private @Nullable Input<ResponseHeadersPolicyXSSProtectionArgs> xSSProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicySecurityHeadersConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentSecurityPolicy = defaults.contentSecurityPolicy;
    	      this.contentTypeOptions = defaults.contentTypeOptions;
    	      this.frameOptions = defaults.frameOptions;
    	      this.referrerPolicy = defaults.referrerPolicy;
    	      this.strictTransportSecurity = defaults.strictTransportSecurity;
    	      this.xSSProtection = defaults.xSSProtection;
        }

        public Builder setContentSecurityPolicy(@Nullable Input<ResponseHeadersPolicyContentSecurityPolicyArgs> contentSecurityPolicy) {
            this.contentSecurityPolicy = contentSecurityPolicy;
            return this;
        }

        public Builder setContentSecurityPolicy(@Nullable ResponseHeadersPolicyContentSecurityPolicyArgs contentSecurityPolicy) {
            this.contentSecurityPolicy = Input.ofNullable(contentSecurityPolicy);
            return this;
        }

        public Builder setContentTypeOptions(@Nullable Input<ResponseHeadersPolicyContentTypeOptionsArgs> contentTypeOptions) {
            this.contentTypeOptions = contentTypeOptions;
            return this;
        }

        public Builder setContentTypeOptions(@Nullable ResponseHeadersPolicyContentTypeOptionsArgs contentTypeOptions) {
            this.contentTypeOptions = Input.ofNullable(contentTypeOptions);
            return this;
        }

        public Builder setFrameOptions(@Nullable Input<ResponseHeadersPolicyFrameOptionsArgs> frameOptions) {
            this.frameOptions = frameOptions;
            return this;
        }

        public Builder setFrameOptions(@Nullable ResponseHeadersPolicyFrameOptionsArgs frameOptions) {
            this.frameOptions = Input.ofNullable(frameOptions);
            return this;
        }

        public Builder setReferrerPolicy(@Nullable Input<ResponseHeadersPolicyReferrerPolicyArgs> referrerPolicy) {
            this.referrerPolicy = referrerPolicy;
            return this;
        }

        public Builder setReferrerPolicy(@Nullable ResponseHeadersPolicyReferrerPolicyArgs referrerPolicy) {
            this.referrerPolicy = Input.ofNullable(referrerPolicy);
            return this;
        }

        public Builder setStrictTransportSecurity(@Nullable Input<ResponseHeadersPolicyStrictTransportSecurityArgs> strictTransportSecurity) {
            this.strictTransportSecurity = strictTransportSecurity;
            return this;
        }

        public Builder setStrictTransportSecurity(@Nullable ResponseHeadersPolicyStrictTransportSecurityArgs strictTransportSecurity) {
            this.strictTransportSecurity = Input.ofNullable(strictTransportSecurity);
            return this;
        }

        public Builder setXSSProtection(@Nullable Input<ResponseHeadersPolicyXSSProtectionArgs> xSSProtection) {
            this.xSSProtection = xSSProtection;
            return this;
        }

        public Builder setXSSProtection(@Nullable ResponseHeadersPolicyXSSProtectionArgs xSSProtection) {
            this.xSSProtection = Input.ofNullable(xSSProtection);
            return this;
        }

        public ResponseHeadersPolicySecurityHeadersConfigArgs build() {
            return new ResponseHeadersPolicySecurityHeadersConfigArgs(contentSecurityPolicy, contentTypeOptions, frameOptions, referrerPolicy, strictTransportSecurity, xSSProtection);
        }
    }
}
