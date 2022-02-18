// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a configuration for non-DRM keys.
 * 
 */
public final class ContentKeyPolicyClearKeyConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContentKeyPolicyClearKeyConfigurationResponse Empty = new ContentKeyPolicyClearKeyConfigurationResponse();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyClearKeyConfiguration'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public ContentKeyPolicyClearKeyConfigurationResponse(String odataType) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private ContentKeyPolicyClearKeyConfigurationResponse() {
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyClearKeyConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyClearKeyConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public ContentKeyPolicyClearKeyConfigurationResponse build() {
            return new ContentKeyPolicyClearKeyConfigurationResponse(odataType);
        }
    }
}
