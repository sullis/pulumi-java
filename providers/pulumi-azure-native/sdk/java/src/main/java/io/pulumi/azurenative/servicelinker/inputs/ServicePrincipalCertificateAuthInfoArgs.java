// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The authentication info when authType is servicePrincipal certificate
 * 
 */
public final class ServicePrincipalCertificateAuthInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePrincipalCertificateAuthInfoArgs Empty = new ServicePrincipalCertificateAuthInfoArgs();

    /**
     * The authentication type.
     * Expected value is 'servicePrincipalCertificate'.
     * 
     */
    @InputImport(name="authType", required=true)
    private final Input<String> authType;

    public Input<String> getAuthType() {
        return this.authType;
    }

    /**
     * ServicePrincipal certificate for servicePrincipal auth.
     * 
     */
    @InputImport(name="certificate", required=true)
    private final Input<String> certificate;

    public Input<String> getCertificate() {
        return this.certificate;
    }

    /**
     * Application clientId for servicePrincipal auth.
     * 
     */
    @InputImport(name="clientId", required=true)
    private final Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId;
    }

    /**
     * Principal Id for servicePrincipal auth.
     * 
     */
    @InputImport(name="principalId", required=true)
    private final Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId;
    }

    public ServicePrincipalCertificateAuthInfoArgs(
        Input<String> authType,
        Input<String> certificate,
        Input<String> clientId,
        Input<String> principalId) {
        this.authType = Objects.requireNonNull(authType, "expected parameter 'authType' to be non-null");
        this.certificate = Objects.requireNonNull(certificate, "expected parameter 'certificate' to be non-null");
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
    }

    private ServicePrincipalCertificateAuthInfoArgs() {
        this.authType = Input.empty();
        this.certificate = Input.empty();
        this.clientId = Input.empty();
        this.principalId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalCertificateAuthInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authType;
        private Input<String> certificate;
        private Input<String> clientId;
        private Input<String> principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalCertificateAuthInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
    	      this.certificate = defaults.certificate;
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder setAuthType(Input<String> authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }

        public Builder setAuthType(String authType) {
            this.authType = Input.of(Objects.requireNonNull(authType));
            return this;
        }

        public Builder setCertificate(Input<String> certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder setCertificate(String certificate) {
            this.certificate = Input.of(Objects.requireNonNull(certificate));
            return this;
        }

        public Builder setClientId(Input<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Input.of(Objects.requireNonNull(clientId));
            return this;
        }

        public Builder setPrincipalId(Input<String> principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Input.of(Objects.requireNonNull(principalId));
            return this;
        }

        public ServicePrincipalCertificateAuthInfoArgs build() {
            return new ServicePrincipalCertificateAuthInfoArgs(authType, certificate, clientId, principalId);
        }
    }
}
