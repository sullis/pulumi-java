// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServicePrincipalCertificateAuthInfoResponse {
    /**
     * The authentication type.
     * Expected value is 'servicePrincipalCertificate'.
     * 
     */
    private final String authType;
    /**
     * ServicePrincipal certificate for servicePrincipal auth.
     * 
     */
    private final String certificate;
    /**
     * Application clientId for servicePrincipal auth.
     * 
     */
    private final String clientId;
    /**
     * Principal Id for servicePrincipal auth.
     * 
     */
    private final String principalId;

    @OutputCustomType.Constructor({"authType","certificate","clientId","principalId"})
    private ServicePrincipalCertificateAuthInfoResponse(
        String authType,
        String certificate,
        String clientId,
        String principalId) {
        this.authType = Objects.requireNonNull(authType);
        this.certificate = Objects.requireNonNull(certificate);
        this.clientId = Objects.requireNonNull(clientId);
        this.principalId = Objects.requireNonNull(principalId);
    }

    /**
     * The authentication type.
     * Expected value is 'servicePrincipalCertificate'.
     * 
     */
    public String getAuthType() {
        return this.authType;
    }
    /**
     * ServicePrincipal certificate for servicePrincipal auth.
     * 
     */
    public String getCertificate() {
        return this.certificate;
    }
    /**
     * Application clientId for servicePrincipal auth.
     * 
     */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * Principal Id for servicePrincipal auth.
     * 
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalCertificateAuthInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authType;
        private String certificate;
        private String clientId;
        private String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalCertificateAuthInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
    	      this.certificate = defaults.certificate;
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder setAuthType(String authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }

        public Builder setCertificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public ServicePrincipalCertificateAuthInfoResponse build() {
            return new ServicePrincipalCertificateAuthInfoResponse(authType, certificate, clientId, principalId);
        }
    }
}
