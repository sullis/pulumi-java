// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GcpCredentialsDetailsPropertiesResponse {
    /**
     * @return Auth provider x509 certificate URL field of the API key (write only)
     * 
     */
    private final String authProviderX509CertUrl;
    /**
     * @return Auth URI field of the API key (write only)
     * 
     */
    private final String authUri;
    /**
     * @return State of the multi-cloud connector
     * 
     */
    private final String authenticationProvisioningState;
    /**
     * @return Connect to your cloud account, for AWS use either account credentials or role-based authentication. For GCP use account organization credentials.
     * Expected value is &#39;gcpCredentials&#39;.
     * 
     */
    private final String authenticationType;
    /**
     * @return Client email field of the API key (write only)
     * 
     */
    private final String clientEmail;
    /**
     * @return Client ID field of the API key (write only)
     * 
     */
    private final String clientId;
    /**
     * @return Client x509 certificate URL field of the API key (write only)
     * 
     */
    private final String clientX509CertUrl;
    /**
     * @return The permissions detected in the cloud account.
     * 
     */
    private final List<String> grantedPermissions;
    /**
     * @return The organization ID of the GCP cloud account
     * 
     */
    private final String organizationId;
    /**
     * @return Private key field of the API key (write only)
     * 
     */
    private final String privateKey;
    /**
     * @return Private key ID field of the API key (write only)
     * 
     */
    private final String privateKeyId;
    /**
     * @return Project ID field of the API key (write only)
     * 
     */
    private final String projectId;
    /**
     * @return Token URI field of the API key (write only)
     * 
     */
    private final String tokenUri;
    /**
     * @return Type field of the API key (write only)
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GcpCredentialsDetailsPropertiesResponse(
        @CustomType.Parameter("authProviderX509CertUrl") String authProviderX509CertUrl,
        @CustomType.Parameter("authUri") String authUri,
        @CustomType.Parameter("authenticationProvisioningState") String authenticationProvisioningState,
        @CustomType.Parameter("authenticationType") String authenticationType,
        @CustomType.Parameter("clientEmail") String clientEmail,
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("clientX509CertUrl") String clientX509CertUrl,
        @CustomType.Parameter("grantedPermissions") List<String> grantedPermissions,
        @CustomType.Parameter("organizationId") String organizationId,
        @CustomType.Parameter("privateKey") String privateKey,
        @CustomType.Parameter("privateKeyId") String privateKeyId,
        @CustomType.Parameter("projectId") String projectId,
        @CustomType.Parameter("tokenUri") String tokenUri,
        @CustomType.Parameter("type") String type) {
        this.authProviderX509CertUrl = authProviderX509CertUrl;
        this.authUri = authUri;
        this.authenticationProvisioningState = authenticationProvisioningState;
        this.authenticationType = authenticationType;
        this.clientEmail = clientEmail;
        this.clientId = clientId;
        this.clientX509CertUrl = clientX509CertUrl;
        this.grantedPermissions = grantedPermissions;
        this.organizationId = organizationId;
        this.privateKey = privateKey;
        this.privateKeyId = privateKeyId;
        this.projectId = projectId;
        this.tokenUri = tokenUri;
        this.type = type;
    }

    /**
     * @return Auth provider x509 certificate URL field of the API key (write only)
     * 
     */
    public String authProviderX509CertUrl() {
        return this.authProviderX509CertUrl;
    }
    /**
     * @return Auth URI field of the API key (write only)
     * 
     */
    public String authUri() {
        return this.authUri;
    }
    /**
     * @return State of the multi-cloud connector
     * 
     */
    public String authenticationProvisioningState() {
        return this.authenticationProvisioningState;
    }
    /**
     * @return Connect to your cloud account, for AWS use either account credentials or role-based authentication. For GCP use account organization credentials.
     * Expected value is &#39;gcpCredentials&#39;.
     * 
     */
    public String authenticationType() {
        return this.authenticationType;
    }
    /**
     * @return Client email field of the API key (write only)
     * 
     */
    public String clientEmail() {
        return this.clientEmail;
    }
    /**
     * @return Client ID field of the API key (write only)
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return Client x509 certificate URL field of the API key (write only)
     * 
     */
    public String clientX509CertUrl() {
        return this.clientX509CertUrl;
    }
    /**
     * @return The permissions detected in the cloud account.
     * 
     */
    public List<String> grantedPermissions() {
        return this.grantedPermissions;
    }
    /**
     * @return The organization ID of the GCP cloud account
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }
    /**
     * @return Private key field of the API key (write only)
     * 
     */
    public String privateKey() {
        return this.privateKey;
    }
    /**
     * @return Private key ID field of the API key (write only)
     * 
     */
    public String privateKeyId() {
        return this.privateKeyId;
    }
    /**
     * @return Project ID field of the API key (write only)
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Token URI field of the API key (write only)
     * 
     */
    public String tokenUri() {
        return this.tokenUri;
    }
    /**
     * @return Type field of the API key (write only)
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcpCredentialsDetailsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authProviderX509CertUrl;
        private String authUri;
        private String authenticationProvisioningState;
        private String authenticationType;
        private String clientEmail;
        private String clientId;
        private String clientX509CertUrl;
        private List<String> grantedPermissions;
        private String organizationId;
        private String privateKey;
        private String privateKeyId;
        private String projectId;
        private String tokenUri;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GcpCredentialsDetailsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authProviderX509CertUrl = defaults.authProviderX509CertUrl;
    	      this.authUri = defaults.authUri;
    	      this.authenticationProvisioningState = defaults.authenticationProvisioningState;
    	      this.authenticationType = defaults.authenticationType;
    	      this.clientEmail = defaults.clientEmail;
    	      this.clientId = defaults.clientId;
    	      this.clientX509CertUrl = defaults.clientX509CertUrl;
    	      this.grantedPermissions = defaults.grantedPermissions;
    	      this.organizationId = defaults.organizationId;
    	      this.privateKey = defaults.privateKey;
    	      this.privateKeyId = defaults.privateKeyId;
    	      this.projectId = defaults.projectId;
    	      this.tokenUri = defaults.tokenUri;
    	      this.type = defaults.type;
        }

        public Builder authProviderX509CertUrl(String authProviderX509CertUrl) {
            this.authProviderX509CertUrl = Objects.requireNonNull(authProviderX509CertUrl);
            return this;
        }
        public Builder authUri(String authUri) {
            this.authUri = Objects.requireNonNull(authUri);
            return this;
        }
        public Builder authenticationProvisioningState(String authenticationProvisioningState) {
            this.authenticationProvisioningState = Objects.requireNonNull(authenticationProvisioningState);
            return this;
        }
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        public Builder clientEmail(String clientEmail) {
            this.clientEmail = Objects.requireNonNull(clientEmail);
            return this;
        }
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientX509CertUrl(String clientX509CertUrl) {
            this.clientX509CertUrl = Objects.requireNonNull(clientX509CertUrl);
            return this;
        }
        public Builder grantedPermissions(List<String> grantedPermissions) {
            this.grantedPermissions = Objects.requireNonNull(grantedPermissions);
            return this;
        }
        public Builder grantedPermissions(String... grantedPermissions) {
            return grantedPermissions(List.of(grantedPermissions));
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder privateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }
        public Builder privateKeyId(String privateKeyId) {
            this.privateKeyId = Objects.requireNonNull(privateKeyId);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public Builder tokenUri(String tokenUri) {
            this.tokenUri = Objects.requireNonNull(tokenUri);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GcpCredentialsDetailsPropertiesResponse build() {
            return new GcpCredentialsDetailsPropertiesResponse(authProviderX509CertUrl, authUri, authenticationProvisioningState, authenticationType, clientEmail, clientId, clientX509CertUrl, grantedPermissions, organizationId, privateKey, privateKeyId, projectId, tokenUri, type);
        }
    }
}
