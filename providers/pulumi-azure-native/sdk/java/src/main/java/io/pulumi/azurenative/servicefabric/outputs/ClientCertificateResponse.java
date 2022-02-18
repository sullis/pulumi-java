// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClientCertificateResponse {
    /**
     * Certificate Common name.
     * 
     */
    private final @Nullable String commonName;
    /**
     * Whether the certificate is admin or not.
     * 
     */
    private final Boolean isAdmin;
    /**
     * Issuer thumbprint for the certificate. Only used together with CommonName.
     * 
     */
    private final @Nullable String issuerThumbprint;
    /**
     * Certificate Thumbprint.
     * 
     */
    private final @Nullable String thumbprint;

    @OutputCustomType.Constructor({"commonName","isAdmin","issuerThumbprint","thumbprint"})
    private ClientCertificateResponse(
        @Nullable String commonName,
        Boolean isAdmin,
        @Nullable String issuerThumbprint,
        @Nullable String thumbprint) {
        this.commonName = commonName;
        this.isAdmin = Objects.requireNonNull(isAdmin);
        this.issuerThumbprint = issuerThumbprint;
        this.thumbprint = thumbprint;
    }

    /**
     * Certificate Common name.
     * 
     */
    public Optional<String> getCommonName() {
        return Optional.ofNullable(this.commonName);
    }
    /**
     * Whether the certificate is admin or not.
     * 
     */
    public Boolean getIsAdmin() {
        return this.isAdmin;
    }
    /**
     * Issuer thumbprint for the certificate. Only used together with CommonName.
     * 
     */
    public Optional<String> getIssuerThumbprint() {
        return Optional.ofNullable(this.issuerThumbprint);
    }
    /**
     * Certificate Thumbprint.
     * 
     */
    public Optional<String> getThumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String commonName;
        private Boolean isAdmin;
        private @Nullable String issuerThumbprint;
        private @Nullable String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCertificateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonName = defaults.commonName;
    	      this.isAdmin = defaults.isAdmin;
    	      this.issuerThumbprint = defaults.issuerThumbprint;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder setCommonName(@Nullable String commonName) {
            this.commonName = commonName;
            return this;
        }

        public Builder setIsAdmin(Boolean isAdmin) {
            this.isAdmin = Objects.requireNonNull(isAdmin);
            return this;
        }

        public Builder setIssuerThumbprint(@Nullable String issuerThumbprint) {
            this.issuerThumbprint = issuerThumbprint;
            return this;
        }

        public Builder setThumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }

        public ClientCertificateResponse build() {
            return new ClientCertificateResponse(commonName, isAdmin, issuerThumbprint, thumbprint);
        }
    }
}
