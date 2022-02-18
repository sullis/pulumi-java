// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the client certificate details using thumbprint.
 * 
 */
public final class ClientCertificateThumbprintArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClientCertificateThumbprintArgs Empty = new ClientCertificateThumbprintArgs();

    /**
     * The thumbprint of the client certificate.
     * 
     */
    @InputImport(name="certificateThumbprint", required=true)
    private final Input<String> certificateThumbprint;

    public Input<String> getCertificateThumbprint() {
        return this.certificateThumbprint;
    }

    /**
     * Indicates if the client certificate has admin access to the cluster. Non admin clients can perform only read only operations on the cluster.
     * 
     */
    @InputImport(name="isAdmin", required=true)
    private final Input<Boolean> isAdmin;

    public Input<Boolean> getIsAdmin() {
        return this.isAdmin;
    }

    public ClientCertificateThumbprintArgs(
        Input<String> certificateThumbprint,
        Input<Boolean> isAdmin) {
        this.certificateThumbprint = Objects.requireNonNull(certificateThumbprint, "expected parameter 'certificateThumbprint' to be non-null");
        this.isAdmin = Objects.requireNonNull(isAdmin, "expected parameter 'isAdmin' to be non-null");
    }

    private ClientCertificateThumbprintArgs() {
        this.certificateThumbprint = Input.empty();
        this.isAdmin = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCertificateThumbprintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> certificateThumbprint;
        private Input<Boolean> isAdmin;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCertificateThumbprintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateThumbprint = defaults.certificateThumbprint;
    	      this.isAdmin = defaults.isAdmin;
        }

        public Builder setCertificateThumbprint(Input<String> certificateThumbprint) {
            this.certificateThumbprint = Objects.requireNonNull(certificateThumbprint);
            return this;
        }

        public Builder setCertificateThumbprint(String certificateThumbprint) {
            this.certificateThumbprint = Input.of(Objects.requireNonNull(certificateThumbprint));
            return this;
        }

        public Builder setIsAdmin(Input<Boolean> isAdmin) {
            this.isAdmin = Objects.requireNonNull(isAdmin);
            return this;
        }

        public Builder setIsAdmin(Boolean isAdmin) {
            this.isAdmin = Input.of(Objects.requireNonNull(isAdmin));
            return this;
        }

        public ClientCertificateThumbprintArgs build() {
            return new ClientCertificateThumbprintArgs(certificateThumbprint, isAdmin);
        }
    }
}
