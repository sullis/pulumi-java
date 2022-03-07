// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VPN client root certificate of P2SVpnServerConfiguration.
 * 
 */
public final class P2SVpnServerConfigVpnClientRootCertificateResponse extends io.pulumi.resources.InvokeArgs {

    public static final P2SVpnServerConfigVpnClientRootCertificateResponse Empty = new P2SVpnServerConfigVpnClientRootCertificateResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable String etag;

    public Optional<String> getEtag() {
        return this.etag == null ? Optional.empty() : Optional.ofNullable(this.etag);
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the VPN client root certificate resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The certificate public data.
     * 
     */
    @InputImport(name="publicCertData", required=true)
      private final String publicCertData;

    public String getPublicCertData() {
        return this.publicCertData;
    }

    public P2SVpnServerConfigVpnClientRootCertificateResponse(
        @Nullable String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        String publicCertData) {
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publicCertData = Objects.requireNonNull(publicCertData, "expected parameter 'publicCertData' to be non-null");
    }

    private P2SVpnServerConfigVpnClientRootCertificateResponse() {
        this.etag = null;
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.publicCertData = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(P2SVpnServerConfigVpnClientRootCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private String publicCertData;

        public Builder() {
    	      // Empty
        }

        public Builder(P2SVpnServerConfigVpnClientRootCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicCertData = defaults.publicCertData;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicCertData(String publicCertData) {
            this.publicCertData = Objects.requireNonNull(publicCertData);
            return this;
        }
        public P2SVpnServerConfigVpnClientRootCertificateResponse build() {
            return new P2SVpnServerConfigVpnClientRootCertificateResponse(etag, id, name, provisioningState, publicCertData);
        }
    }
}