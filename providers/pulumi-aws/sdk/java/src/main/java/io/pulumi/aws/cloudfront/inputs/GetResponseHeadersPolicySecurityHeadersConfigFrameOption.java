// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetResponseHeadersPolicySecurityHeadersConfigFrameOption extends io.pulumi.resources.InvokeArgs {

    public static final GetResponseHeadersPolicySecurityHeadersConfigFrameOption Empty = new GetResponseHeadersPolicySecurityHeadersConfigFrameOption();

    /**
     * The value of the X-Frame-Options HTTP response header. Valid values: `DENY` | `SAMEORIGIN`
     * 
     */
    @Import(name="frameOption", required=true)
      private final String frameOption;

    public String frameOption() {
        return this.frameOption;
    }

    /**
     * A Boolean value that determines whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    @Import(name="override", required=true)
      private final Boolean override;

    public Boolean override() {
        return this.override;
    }

    public GetResponseHeadersPolicySecurityHeadersConfigFrameOption(
        String frameOption,
        Boolean override) {
        this.frameOption = Objects.requireNonNull(frameOption, "expected parameter 'frameOption' to be non-null");
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
    }

    private GetResponseHeadersPolicySecurityHeadersConfigFrameOption() {
        this.frameOption = null;
        this.override = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicySecurityHeadersConfigFrameOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String frameOption;
        private Boolean override;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponseHeadersPolicySecurityHeadersConfigFrameOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frameOption = defaults.frameOption;
    	      this.override = defaults.override;
        }

        public Builder frameOption(String frameOption) {
            this.frameOption = Objects.requireNonNull(frameOption);
            return this;
        }
        public Builder override(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }        public GetResponseHeadersPolicySecurityHeadersConfigFrameOption build() {
            return new GetResponseHeadersPolicySecurityHeadersConfigFrameOption(frameOption, override);
        }
    }
}
