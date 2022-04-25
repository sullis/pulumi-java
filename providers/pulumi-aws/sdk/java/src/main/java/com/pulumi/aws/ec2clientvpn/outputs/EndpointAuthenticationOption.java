// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2clientvpn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointAuthenticationOption {
    /**
     * @return The ID of the Active Directory to be used for authentication if type is `directory-service-authentication`.
     * 
     */
    private final @Nullable String activeDirectoryId;
    /**
     * @return The ARN of the client certificate. The certificate must be signed by a certificate authority (CA) and it must be provisioned in AWS Certificate Manager (ACM). Only necessary when type is set to `certificate-authentication`.
     * 
     */
    private final @Nullable String rootCertificateChainArn;
    /**
     * @return The ARN of the IAM SAML identity provider if type is `federated-authentication`.
     * 
     */
    private final @Nullable String samlProviderArn;
    /**
     * @return The ARN of the IAM SAML identity provider for the self service portal if type is `federated-authentication`.
     * 
     */
    private final @Nullable String selfServiceSamlProviderArn;
    /**
     * @return The type of client authentication to be used. Specify `certificate-authentication` to use certificate-based authentication, `directory-service-authentication` to use Active Directory authentication, or `federated-authentication` to use Federated Authentication via SAML 2.0.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private EndpointAuthenticationOption(
        @CustomType.Parameter("activeDirectoryId") @Nullable String activeDirectoryId,
        @CustomType.Parameter("rootCertificateChainArn") @Nullable String rootCertificateChainArn,
        @CustomType.Parameter("samlProviderArn") @Nullable String samlProviderArn,
        @CustomType.Parameter("selfServiceSamlProviderArn") @Nullable String selfServiceSamlProviderArn,
        @CustomType.Parameter("type") String type) {
        this.activeDirectoryId = activeDirectoryId;
        this.rootCertificateChainArn = rootCertificateChainArn;
        this.samlProviderArn = samlProviderArn;
        this.selfServiceSamlProviderArn = selfServiceSamlProviderArn;
        this.type = type;
    }

    /**
     * @return The ID of the Active Directory to be used for authentication if type is `directory-service-authentication`.
     * 
     */
    public Optional<String> activeDirectoryId() {
        return Optional.ofNullable(this.activeDirectoryId);
    }
    /**
     * @return The ARN of the client certificate. The certificate must be signed by a certificate authority (CA) and it must be provisioned in AWS Certificate Manager (ACM). Only necessary when type is set to `certificate-authentication`.
     * 
     */
    public Optional<String> rootCertificateChainArn() {
        return Optional.ofNullable(this.rootCertificateChainArn);
    }
    /**
     * @return The ARN of the IAM SAML identity provider if type is `federated-authentication`.
     * 
     */
    public Optional<String> samlProviderArn() {
        return Optional.ofNullable(this.samlProviderArn);
    }
    /**
     * @return The ARN of the IAM SAML identity provider for the self service portal if type is `federated-authentication`.
     * 
     */
    public Optional<String> selfServiceSamlProviderArn() {
        return Optional.ofNullable(this.selfServiceSamlProviderArn);
    }
    /**
     * @return The type of client authentication to be used. Specify `certificate-authentication` to use certificate-based authentication, `directory-service-authentication` to use Active Directory authentication, or `federated-authentication` to use Federated Authentication via SAML 2.0.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointAuthenticationOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String activeDirectoryId;
        private @Nullable String rootCertificateChainArn;
        private @Nullable String samlProviderArn;
        private @Nullable String selfServiceSamlProviderArn;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointAuthenticationOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryId = defaults.activeDirectoryId;
    	      this.rootCertificateChainArn = defaults.rootCertificateChainArn;
    	      this.samlProviderArn = defaults.samlProviderArn;
    	      this.selfServiceSamlProviderArn = defaults.selfServiceSamlProviderArn;
    	      this.type = defaults.type;
        }

        public Builder activeDirectoryId(@Nullable String activeDirectoryId) {
            this.activeDirectoryId = activeDirectoryId;
            return this;
        }
        public Builder rootCertificateChainArn(@Nullable String rootCertificateChainArn) {
            this.rootCertificateChainArn = rootCertificateChainArn;
            return this;
        }
        public Builder samlProviderArn(@Nullable String samlProviderArn) {
            this.samlProviderArn = samlProviderArn;
            return this;
        }
        public Builder selfServiceSamlProviderArn(@Nullable String selfServiceSamlProviderArn) {
            this.selfServiceSamlProviderArn = selfServiceSamlProviderArn;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public EndpointAuthenticationOption build() {
            return new EndpointAuthenticationOption(activeDirectoryId, rootCertificateChainArn, samlProviderArn, selfServiceSamlProviderArn, type);
        }
    }
}
