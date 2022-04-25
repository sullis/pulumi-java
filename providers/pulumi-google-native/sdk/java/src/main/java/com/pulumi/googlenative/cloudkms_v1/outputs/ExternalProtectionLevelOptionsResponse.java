// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ExternalProtectionLevelOptionsResponse {
    /**
     * @return The path to the external key material on the EKM when using EkmConnection e.g., &#34;v0/my/key&#34;. Set this field instead of external_key_uri when using an EkmConnection.
     * 
     */
    private final String ekmConnectionKeyPath;
    /**
     * @return The URI for an external resource that this CryptoKeyVersion represents.
     * 
     */
    private final String externalKeyUri;

    @CustomType.Constructor
    private ExternalProtectionLevelOptionsResponse(
        @CustomType.Parameter("ekmConnectionKeyPath") String ekmConnectionKeyPath,
        @CustomType.Parameter("externalKeyUri") String externalKeyUri) {
        this.ekmConnectionKeyPath = ekmConnectionKeyPath;
        this.externalKeyUri = externalKeyUri;
    }

    /**
     * @return The path to the external key material on the EKM when using EkmConnection e.g., &#34;v0/my/key&#34;. Set this field instead of external_key_uri when using an EkmConnection.
     * 
     */
    public String ekmConnectionKeyPath() {
        return this.ekmConnectionKeyPath;
    }
    /**
     * @return The URI for an external resource that this CryptoKeyVersion represents.
     * 
     */
    public String externalKeyUri() {
        return this.externalKeyUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalProtectionLevelOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ekmConnectionKeyPath;
        private String externalKeyUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalProtectionLevelOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ekmConnectionKeyPath = defaults.ekmConnectionKeyPath;
    	      this.externalKeyUri = defaults.externalKeyUri;
        }

        public Builder ekmConnectionKeyPath(String ekmConnectionKeyPath) {
            this.ekmConnectionKeyPath = Objects.requireNonNull(ekmConnectionKeyPath);
            return this;
        }
        public Builder externalKeyUri(String externalKeyUri) {
            this.externalKeyUri = Objects.requireNonNull(externalKeyUri);
            return this;
        }        public ExternalProtectionLevelOptionsResponse build() {
            return new ExternalProtectionLevelOptionsResponse(ekmConnectionKeyPath, externalKeyUri);
        }
    }
}
