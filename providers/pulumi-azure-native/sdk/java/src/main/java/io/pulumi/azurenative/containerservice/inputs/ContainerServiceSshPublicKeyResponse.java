// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information about SSH certificate public key data.
 * 
 */
public final class ContainerServiceSshPublicKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerServiceSshPublicKeyResponse Empty = new ContainerServiceSshPublicKeyResponse();

    /**
     * Certificate public key used to authenticate with VMs through SSH. The certificate must be in PEM format with or without headers.
     * 
     */
    @InputImport(name="keyData", required=true)
    private final String keyData;

    public String getKeyData() {
        return this.keyData;
    }

    public ContainerServiceSshPublicKeyResponse(String keyData) {
        this.keyData = Objects.requireNonNull(keyData, "expected parameter 'keyData' to be non-null");
    }

    private ContainerServiceSshPublicKeyResponse() {
        this.keyData = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerServiceSshPublicKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyData;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerServiceSshPublicKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyData = defaults.keyData;
        }

        public Builder setKeyData(String keyData) {
            this.keyData = Objects.requireNonNull(keyData);
            return this;
        }

        public ContainerServiceSshPublicKeyResponse build() {
            return new ContainerServiceSshPublicKeyResponse(keyData);
        }
    }
}
