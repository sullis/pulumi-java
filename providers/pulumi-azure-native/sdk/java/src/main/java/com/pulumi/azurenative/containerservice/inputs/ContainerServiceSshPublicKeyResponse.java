// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information about SSH certificate public key data.
 * 
 */
public final class ContainerServiceSshPublicKeyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContainerServiceSshPublicKeyResponse Empty = new ContainerServiceSshPublicKeyResponse();

    /**
     * Certificate public key used to authenticate with VMs through SSH. The certificate must be in PEM format with or without headers.
     * 
     */
    @Import(name="keyData", required=true)
    private String keyData;

    /**
     * @return Certificate public key used to authenticate with VMs through SSH. The certificate must be in PEM format with or without headers.
     * 
     */
    public String keyData() {
        return this.keyData;
    }

    private ContainerServiceSshPublicKeyResponse() {}

    private ContainerServiceSshPublicKeyResponse(ContainerServiceSshPublicKeyResponse $) {
        this.keyData = $.keyData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerServiceSshPublicKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerServiceSshPublicKeyResponse $;

        public Builder() {
            $ = new ContainerServiceSshPublicKeyResponse();
        }

        public Builder(ContainerServiceSshPublicKeyResponse defaults) {
            $ = new ContainerServiceSshPublicKeyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyData Certificate public key used to authenticate with VMs through SSH. The certificate must be in PEM format with or without headers.
         * 
         * @return builder
         * 
         */
        public Builder keyData(String keyData) {
            $.keyData = keyData;
            return this;
        }

        public ContainerServiceSshPublicKeyResponse build() {
            $.keyData = Objects.requireNonNull($.keyData, "expected parameter 'keyData' to be non-null");
            return $;
        }
    }

}
