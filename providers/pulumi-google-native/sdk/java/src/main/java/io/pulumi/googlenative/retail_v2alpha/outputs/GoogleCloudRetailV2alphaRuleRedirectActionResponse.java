// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRetailV2alphaRuleRedirectActionResponse {
    /**
     * URL must have length equal or less than 2000 characters.
     * 
     */
    private final String redirectUri;

    @OutputCustomType.Constructor({"redirectUri"})
    private GoogleCloudRetailV2alphaRuleRedirectActionResponse(String redirectUri) {
        this.redirectUri = Objects.requireNonNull(redirectUri);
    }

    /**
     * URL must have length equal or less than 2000 characters.
     * 
    */
    public String getRedirectUri() {
        return this.redirectUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleRedirectActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String redirectUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleRedirectActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.redirectUri = defaults.redirectUri;
        }

        public Builder setRedirectUri(String redirectUri) {
            this.redirectUri = Objects.requireNonNull(redirectUri);
            return this;
        }
        public GoogleCloudRetailV2alphaRuleRedirectActionResponse build() {
            return new GoogleCloudRetailV2alphaRuleRedirectActionResponse(redirectUri);
        }
    }
}