// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContentKeyPolicySymmetricTokenKeyResponse {
    /**
     * The key value of the key
     * 
     */
    private final String keyValue;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicySymmetricTokenKey'.
     * 
     */
    private final String odataType;

    @OutputCustomType.Constructor({"keyValue","odataType"})
    private ContentKeyPolicySymmetricTokenKeyResponse(
        String keyValue,
        String odataType) {
        this.keyValue = Objects.requireNonNull(keyValue);
        this.odataType = Objects.requireNonNull(odataType);
    }

    /**
     * The key value of the key
     * 
    */
    public String getKeyValue() {
        return this.keyValue;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicySymmetricTokenKey'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicySymmetricTokenKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyValue;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicySymmetricTokenKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyValue = defaults.keyValue;
    	      this.odataType = defaults.odataType;
        }

        public Builder setKeyValue(String keyValue) {
            this.keyValue = Objects.requireNonNull(keyValue);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public ContentKeyPolicySymmetricTokenKeyResponse build() {
            return new ContentKeyPolicySymmetricTokenKeyResponse(keyValue, odataType);
        }
    }
}