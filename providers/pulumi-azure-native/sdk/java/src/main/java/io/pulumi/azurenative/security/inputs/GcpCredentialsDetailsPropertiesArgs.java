// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * GCP cloud account connector based service to service credentials, the credentials are composed of the organization ID and a JSON API key (write only)
 * 
 */
public final class GcpCredentialsDetailsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final GcpCredentialsDetailsPropertiesArgs Empty = new GcpCredentialsDetailsPropertiesArgs();

    /**
     * Auth provider x509 certificate URL field of the API key (write only)
     * 
     */
    @InputImport(name="authProviderX509CertUrl", required=true)
    private final Input<String> authProviderX509CertUrl;

    public Input<String> getAuthProviderX509CertUrl() {
        return this.authProviderX509CertUrl;
    }

    /**
     * Auth URI field of the API key (write only)
     * 
     */
    @InputImport(name="authUri", required=true)
    private final Input<String> authUri;

    public Input<String> getAuthUri() {
        return this.authUri;
    }

    /**
     * Connect to your cloud account, for AWS use either account credentials or role-based authentication. For GCP use account organization credentials.
     * Expected value is 'gcpCredentials'.
     * 
     */
    @InputImport(name="authenticationType", required=true)
    private final Input<String> authenticationType;

    public Input<String> getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Client email field of the API key (write only)
     * 
     */
    @InputImport(name="clientEmail", required=true)
    private final Input<String> clientEmail;

    public Input<String> getClientEmail() {
        return this.clientEmail;
    }

    /**
     * Client ID field of the API key (write only)
     * 
     */
    @InputImport(name="clientId", required=true)
    private final Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId;
    }

    /**
     * Client x509 certificate URL field of the API key (write only)
     * 
     */
    @InputImport(name="clientX509CertUrl", required=true)
    private final Input<String> clientX509CertUrl;

    public Input<String> getClientX509CertUrl() {
        return this.clientX509CertUrl;
    }

    /**
     * The organization ID of the GCP cloud account
     * 
     */
    @InputImport(name="organizationId", required=true)
    private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * Private key field of the API key (write only)
     * 
     */
    @InputImport(name="privateKey", required=true)
    private final Input<String> privateKey;

    public Input<String> getPrivateKey() {
        return this.privateKey;
    }

    /**
     * Private key ID field of the API key (write only)
     * 
     */
    @InputImport(name="privateKeyId", required=true)
    private final Input<String> privateKeyId;

    public Input<String> getPrivateKeyId() {
        return this.privateKeyId;
    }

    /**
     * Project ID field of the API key (write only)
     * 
     */
    @InputImport(name="projectId", required=true)
    private final Input<String> projectId;

    public Input<String> getProjectId() {
        return this.projectId;
    }

    /**
     * Token URI field of the API key (write only)
     * 
     */
    @InputImport(name="tokenUri", required=true)
    private final Input<String> tokenUri;

    public Input<String> getTokenUri() {
        return this.tokenUri;
    }

    /**
     * Type field of the API key (write only)
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public GcpCredentialsDetailsPropertiesArgs(
        Input<String> authProviderX509CertUrl,
        Input<String> authUri,
        Input<String> authenticationType,
        Input<String> clientEmail,
        Input<String> clientId,
        Input<String> clientX509CertUrl,
        Input<String> organizationId,
        Input<String> privateKey,
        Input<String> privateKeyId,
        Input<String> projectId,
        Input<String> tokenUri,
        Input<String> type) {
        this.authProviderX509CertUrl = Objects.requireNonNull(authProviderX509CertUrl, "expected parameter 'authProviderX509CertUrl' to be non-null");
        this.authUri = Objects.requireNonNull(authUri, "expected parameter 'authUri' to be non-null");
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.clientEmail = Objects.requireNonNull(clientEmail, "expected parameter 'clientEmail' to be non-null");
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.clientX509CertUrl = Objects.requireNonNull(clientX509CertUrl, "expected parameter 'clientX509CertUrl' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.privateKey = Objects.requireNonNull(privateKey, "expected parameter 'privateKey' to be non-null");
        this.privateKeyId = Objects.requireNonNull(privateKeyId, "expected parameter 'privateKeyId' to be non-null");
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
        this.tokenUri = Objects.requireNonNull(tokenUri, "expected parameter 'tokenUri' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GcpCredentialsDetailsPropertiesArgs() {
        this.authProviderX509CertUrl = Input.empty();
        this.authUri = Input.empty();
        this.authenticationType = Input.empty();
        this.clientEmail = Input.empty();
        this.clientId = Input.empty();
        this.clientX509CertUrl = Input.empty();
        this.organizationId = Input.empty();
        this.privateKey = Input.empty();
        this.privateKeyId = Input.empty();
        this.projectId = Input.empty();
        this.tokenUri = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcpCredentialsDetailsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authProviderX509CertUrl;
        private Input<String> authUri;
        private Input<String> authenticationType;
        private Input<String> clientEmail;
        private Input<String> clientId;
        private Input<String> clientX509CertUrl;
        private Input<String> organizationId;
        private Input<String> privateKey;
        private Input<String> privateKeyId;
        private Input<String> projectId;
        private Input<String> tokenUri;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GcpCredentialsDetailsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authProviderX509CertUrl = defaults.authProviderX509CertUrl;
    	      this.authUri = defaults.authUri;
    	      this.authenticationType = defaults.authenticationType;
    	      this.clientEmail = defaults.clientEmail;
    	      this.clientId = defaults.clientId;
    	      this.clientX509CertUrl = defaults.clientX509CertUrl;
    	      this.organizationId = defaults.organizationId;
    	      this.privateKey = defaults.privateKey;
    	      this.privateKeyId = defaults.privateKeyId;
    	      this.projectId = defaults.projectId;
    	      this.tokenUri = defaults.tokenUri;
    	      this.type = defaults.type;
        }

        public Builder setAuthProviderX509CertUrl(Input<String> authProviderX509CertUrl) {
            this.authProviderX509CertUrl = Objects.requireNonNull(authProviderX509CertUrl);
            return this;
        }

        public Builder setAuthProviderX509CertUrl(String authProviderX509CertUrl) {
            this.authProviderX509CertUrl = Input.of(Objects.requireNonNull(authProviderX509CertUrl));
            return this;
        }

        public Builder setAuthUri(Input<String> authUri) {
            this.authUri = Objects.requireNonNull(authUri);
            return this;
        }

        public Builder setAuthUri(String authUri) {
            this.authUri = Input.of(Objects.requireNonNull(authUri));
            return this;
        }

        public Builder setAuthenticationType(Input<String> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setAuthenticationType(String authenticationType) {
            this.authenticationType = Input.of(Objects.requireNonNull(authenticationType));
            return this;
        }

        public Builder setClientEmail(Input<String> clientEmail) {
            this.clientEmail = Objects.requireNonNull(clientEmail);
            return this;
        }

        public Builder setClientEmail(String clientEmail) {
            this.clientEmail = Input.of(Objects.requireNonNull(clientEmail));
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

        public Builder setClientX509CertUrl(Input<String> clientX509CertUrl) {
            this.clientX509CertUrl = Objects.requireNonNull(clientX509CertUrl);
            return this;
        }

        public Builder setClientX509CertUrl(String clientX509CertUrl) {
            this.clientX509CertUrl = Input.of(Objects.requireNonNull(clientX509CertUrl));
            return this;
        }

        public Builder setOrganizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public Builder setPrivateKey(Input<String> privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }

        public Builder setPrivateKey(String privateKey) {
            this.privateKey = Input.of(Objects.requireNonNull(privateKey));
            return this;
        }

        public Builder setPrivateKeyId(Input<String> privateKeyId) {
            this.privateKeyId = Objects.requireNonNull(privateKeyId);
            return this;
        }

        public Builder setPrivateKeyId(String privateKeyId) {
            this.privateKeyId = Input.of(Objects.requireNonNull(privateKeyId));
            return this;
        }

        public Builder setProjectId(Input<String> projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = Input.of(Objects.requireNonNull(projectId));
            return this;
        }

        public Builder setTokenUri(Input<String> tokenUri) {
            this.tokenUri = Objects.requireNonNull(tokenUri);
            return this;
        }

        public Builder setTokenUri(String tokenUri) {
            this.tokenUri = Input.of(Objects.requireNonNull(tokenUri));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public GcpCredentialsDetailsPropertiesArgs build() {
            return new GcpCredentialsDetailsPropertiesArgs(authProviderX509CertUrl, authUri, authenticationType, clientEmail, clientId, clientX509CertUrl, organizationId, privateKey, privateKeyId, projectId, tokenUri, type);
        }
    }
}
