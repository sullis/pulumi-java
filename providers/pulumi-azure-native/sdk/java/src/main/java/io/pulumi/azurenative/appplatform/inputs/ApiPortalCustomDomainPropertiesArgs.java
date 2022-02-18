// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of custom domain for API portal
 * 
 */
public final class ApiPortalCustomDomainPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiPortalCustomDomainPropertiesArgs Empty = new ApiPortalCustomDomainPropertiesArgs();

    /**
     * The thumbprint of bound certificate.
     * 
     */
    @InputImport(name="thumbprint")
    private final @Nullable Input<String> thumbprint;

    public Input<String> getThumbprint() {
        return this.thumbprint == null ? Input.empty() : this.thumbprint;
    }

    public ApiPortalCustomDomainPropertiesArgs(@Nullable Input<String> thumbprint) {
        this.thumbprint = thumbprint;
    }

    private ApiPortalCustomDomainPropertiesArgs() {
        this.thumbprint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiPortalCustomDomainPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiPortalCustomDomainPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder setThumbprint(@Nullable Input<String> thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }

        public Builder setThumbprint(@Nullable String thumbprint) {
            this.thumbprint = Input.ofNullable(thumbprint);
            return this;
        }

        public ApiPortalCustomDomainPropertiesArgs build() {
            return new ApiPortalCustomDomainPropertiesArgs(thumbprint);
        }
    }
}
