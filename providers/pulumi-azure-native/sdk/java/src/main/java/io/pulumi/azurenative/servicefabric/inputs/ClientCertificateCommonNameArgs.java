// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the client certificate details using common name.
 * 
 */
public final class ClientCertificateCommonNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClientCertificateCommonNameArgs Empty = new ClientCertificateCommonNameArgs();

    /**
     * The common name of the client certificate.
     * 
     */
    @Import(name="certificateCommonName", required=true)
      private final Output<String> certificateCommonName;

    public Output<String> getCertificateCommonName() {
        return this.certificateCommonName;
    }

    /**
     * The issuer thumbprint of the client certificate.
     * 
     */
    @Import(name="certificateIssuerThumbprint", required=true)
      private final Output<String> certificateIssuerThumbprint;

    public Output<String> getCertificateIssuerThumbprint() {
        return this.certificateIssuerThumbprint;
    }

    /**
     * Indicates if the client certificate has admin access to the cluster. Non admin clients can perform only read only operations on the cluster.
     * 
     */
    @Import(name="isAdmin", required=true)
      private final Output<Boolean> isAdmin;

    public Output<Boolean> getIsAdmin() {
        return this.isAdmin;
    }

    public ClientCertificateCommonNameArgs(
        Output<String> certificateCommonName,
        Output<String> certificateIssuerThumbprint,
        Output<Boolean> isAdmin) {
        this.certificateCommonName = Objects.requireNonNull(certificateCommonName, "expected parameter 'certificateCommonName' to be non-null");
        this.certificateIssuerThumbprint = Objects.requireNonNull(certificateIssuerThumbprint, "expected parameter 'certificateIssuerThumbprint' to be non-null");
        this.isAdmin = Objects.requireNonNull(isAdmin, "expected parameter 'isAdmin' to be non-null");
    }

    private ClientCertificateCommonNameArgs() {
        this.certificateCommonName = Output.empty();
        this.certificateIssuerThumbprint = Output.empty();
        this.isAdmin = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCertificateCommonNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificateCommonName;
        private Output<String> certificateIssuerThumbprint;
        private Output<Boolean> isAdmin;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCertificateCommonNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateCommonName = defaults.certificateCommonName;
    	      this.certificateIssuerThumbprint = defaults.certificateIssuerThumbprint;
    	      this.isAdmin = defaults.isAdmin;
        }

        public Builder certificateCommonName(Output<String> certificateCommonName) {
            this.certificateCommonName = Objects.requireNonNull(certificateCommonName);
            return this;
        }
        public Builder certificateCommonName(String certificateCommonName) {
            this.certificateCommonName = Output.of(Objects.requireNonNull(certificateCommonName));
            return this;
        }
        public Builder certificateIssuerThumbprint(Output<String> certificateIssuerThumbprint) {
            this.certificateIssuerThumbprint = Objects.requireNonNull(certificateIssuerThumbprint);
            return this;
        }
        public Builder certificateIssuerThumbprint(String certificateIssuerThumbprint) {
            this.certificateIssuerThumbprint = Output.of(Objects.requireNonNull(certificateIssuerThumbprint));
            return this;
        }
        public Builder isAdmin(Output<Boolean> isAdmin) {
            this.isAdmin = Objects.requireNonNull(isAdmin);
            return this;
        }
        public Builder isAdmin(Boolean isAdmin) {
            this.isAdmin = Output.of(Objects.requireNonNull(isAdmin));
            return this;
        }        public ClientCertificateCommonNameArgs build() {
            return new ClientCertificateCommonNameArgs(certificateCommonName, certificateIssuerThumbprint, isAdmin);
        }
    }
}
