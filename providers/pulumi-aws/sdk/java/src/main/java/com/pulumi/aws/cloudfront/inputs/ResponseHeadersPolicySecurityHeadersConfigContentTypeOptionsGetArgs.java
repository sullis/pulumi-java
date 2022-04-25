// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs Empty = new ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs();

    /**
     * A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    @Import(name="override", required=true)
    private Output<Boolean> override;

    /**
     * @return A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    public Output<Boolean> override() {
        return this.override;
    }

    private ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs() {}

    private ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs(ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs $) {
        this.override = $.override;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs $;

        public Builder() {
            $ = new ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs();
        }

        public Builder(ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs defaults) {
            $ = new ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param override A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
         * 
         * @return builder
         * 
         */
        public Builder override(Output<Boolean> override) {
            $.override = override;
            return this;
        }

        /**
         * @param override A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
         * 
         * @return builder
         * 
         */
        public Builder override(Boolean override) {
            return override(Output.of(override));
        }

        public ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs build() {
            $.override = Objects.requireNonNull($.override, "expected parameter 'override' to be non-null");
            return $;
        }
    }

}
