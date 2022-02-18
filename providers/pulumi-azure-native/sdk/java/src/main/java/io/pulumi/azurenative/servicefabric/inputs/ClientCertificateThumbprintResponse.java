// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the client certificate details using thumbprint.
 * 
 */
public final class ClientCertificateThumbprintResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClientCertificateThumbprintResponse Empty = new ClientCertificateThumbprintResponse();

    /**
     * The thumbprint of the client certificate.
     * 
     */
    @InputImport(name="certificateThumbprint", required=true)
    private final String certificateThumbprint;

    public String getCertificateThumbprint() {
        return this.certificateThumbprint;
    }

    /**
     * Indicates if the client certificate has admin access to the cluster. Non admin clients can perform only read only operations on the cluster.
     * 
     */
    @InputImport(name="isAdmin", required=true)
    private final Boolean isAdmin;

    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public ClientCertificateThumbprintResponse(
        String certificateThumbprint,
        Boolean isAdmin) {
        this.certificateThumbprint = Objects.requireNonNull(certificateThumbprint, "expected parameter 'certificateThumbprint' to be non-null");
        this.isAdmin = Objects.requireNonNull(isAdmin, "expected parameter 'isAdmin' to be non-null");
    }

    private ClientCertificateThumbprintResponse() {
        this.certificateThumbprint = null;
        this.isAdmin = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCertificateThumbprintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateThumbprint;
        private Boolean isAdmin;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCertificateThumbprintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateThumbprint = defaults.certificateThumbprint;
    	      this.isAdmin = defaults.isAdmin;
        }

        public Builder setCertificateThumbprint(String certificateThumbprint) {
            this.certificateThumbprint = Objects.requireNonNull(certificateThumbprint);
            return this;
        }

        public Builder setIsAdmin(Boolean isAdmin) {
            this.isAdmin = Objects.requireNonNull(isAdmin);
            return this;
        }

        public ClientCertificateThumbprintResponse build() {
            return new ClientCertificateThumbprintResponse(certificateThumbprint, isAdmin);
        }
    }
}
