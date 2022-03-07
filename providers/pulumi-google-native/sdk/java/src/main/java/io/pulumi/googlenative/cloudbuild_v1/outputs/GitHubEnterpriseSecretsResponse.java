// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GitHubEnterpriseSecretsResponse {
    /**
     * The resource name for the OAuth client ID secret in Secret Manager.
     * 
     */
    private final String oauthClientIdName;
    /**
     * The resource name for the OAuth client ID secret version in Secret Manager.
     * 
     */
    private final String oauthClientIdVersionName;
    /**
     * The resource name for the OAuth secret in Secret Manager.
     * 
     */
    private final String oauthSecretName;
    /**
     * The resource name for the OAuth secret secret version in Secret Manager.
     * 
     */
    private final String oauthSecretVersionName;
    /**
     * The resource name for the private key secret.
     * 
     */
    private final String privateKeyName;
    /**
     * The resource name for the private key secret version.
     * 
     */
    private final String privateKeyVersionName;
    /**
     * The resource name for the webhook secret in Secret Manager.
     * 
     */
    private final String webhookSecretName;
    /**
     * The resource name for the webhook secret secret version in Secret Manager.
     * 
     */
    private final String webhookSecretVersionName;

    @OutputCustomType.Constructor({"oauthClientIdName","oauthClientIdVersionName","oauthSecretName","oauthSecretVersionName","privateKeyName","privateKeyVersionName","webhookSecretName","webhookSecretVersionName"})
    private GitHubEnterpriseSecretsResponse(
        String oauthClientIdName,
        String oauthClientIdVersionName,
        String oauthSecretName,
        String oauthSecretVersionName,
        String privateKeyName,
        String privateKeyVersionName,
        String webhookSecretName,
        String webhookSecretVersionName) {
        this.oauthClientIdName = Objects.requireNonNull(oauthClientIdName);
        this.oauthClientIdVersionName = Objects.requireNonNull(oauthClientIdVersionName);
        this.oauthSecretName = Objects.requireNonNull(oauthSecretName);
        this.oauthSecretVersionName = Objects.requireNonNull(oauthSecretVersionName);
        this.privateKeyName = Objects.requireNonNull(privateKeyName);
        this.privateKeyVersionName = Objects.requireNonNull(privateKeyVersionName);
        this.webhookSecretName = Objects.requireNonNull(webhookSecretName);
        this.webhookSecretVersionName = Objects.requireNonNull(webhookSecretVersionName);
    }

    /**
     * The resource name for the OAuth client ID secret in Secret Manager.
     * 
    */
    public String getOauthClientIdName() {
        return this.oauthClientIdName;
    }
    /**
     * The resource name for the OAuth client ID secret version in Secret Manager.
     * 
    */
    public String getOauthClientIdVersionName() {
        return this.oauthClientIdVersionName;
    }
    /**
     * The resource name for the OAuth secret in Secret Manager.
     * 
    */
    public String getOauthSecretName() {
        return this.oauthSecretName;
    }
    /**
     * The resource name for the OAuth secret secret version in Secret Manager.
     * 
    */
    public String getOauthSecretVersionName() {
        return this.oauthSecretVersionName;
    }
    /**
     * The resource name for the private key secret.
     * 
    */
    public String getPrivateKeyName() {
        return this.privateKeyName;
    }
    /**
     * The resource name for the private key secret version.
     * 
    */
    public String getPrivateKeyVersionName() {
        return this.privateKeyVersionName;
    }
    /**
     * The resource name for the webhook secret in Secret Manager.
     * 
    */
    public String getWebhookSecretName() {
        return this.webhookSecretName;
    }
    /**
     * The resource name for the webhook secret secret version in Secret Manager.
     * 
    */
    public String getWebhookSecretVersionName() {
        return this.webhookSecretVersionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitHubEnterpriseSecretsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String oauthClientIdName;
        private String oauthClientIdVersionName;
        private String oauthSecretName;
        private String oauthSecretVersionName;
        private String privateKeyName;
        private String privateKeyVersionName;
        private String webhookSecretName;
        private String webhookSecretVersionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GitHubEnterpriseSecretsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oauthClientIdName = defaults.oauthClientIdName;
    	      this.oauthClientIdVersionName = defaults.oauthClientIdVersionName;
    	      this.oauthSecretName = defaults.oauthSecretName;
    	      this.oauthSecretVersionName = defaults.oauthSecretVersionName;
    	      this.privateKeyName = defaults.privateKeyName;
    	      this.privateKeyVersionName = defaults.privateKeyVersionName;
    	      this.webhookSecretName = defaults.webhookSecretName;
    	      this.webhookSecretVersionName = defaults.webhookSecretVersionName;
        }

        public Builder setOauthClientIdName(String oauthClientIdName) {
            this.oauthClientIdName = Objects.requireNonNull(oauthClientIdName);
            return this;
        }

        public Builder setOauthClientIdVersionName(String oauthClientIdVersionName) {
            this.oauthClientIdVersionName = Objects.requireNonNull(oauthClientIdVersionName);
            return this;
        }

        public Builder setOauthSecretName(String oauthSecretName) {
            this.oauthSecretName = Objects.requireNonNull(oauthSecretName);
            return this;
        }

        public Builder setOauthSecretVersionName(String oauthSecretVersionName) {
            this.oauthSecretVersionName = Objects.requireNonNull(oauthSecretVersionName);
            return this;
        }

        public Builder setPrivateKeyName(String privateKeyName) {
            this.privateKeyName = Objects.requireNonNull(privateKeyName);
            return this;
        }

        public Builder setPrivateKeyVersionName(String privateKeyVersionName) {
            this.privateKeyVersionName = Objects.requireNonNull(privateKeyVersionName);
            return this;
        }

        public Builder setWebhookSecretName(String webhookSecretName) {
            this.webhookSecretName = Objects.requireNonNull(webhookSecretName);
            return this;
        }

        public Builder setWebhookSecretVersionName(String webhookSecretVersionName) {
            this.webhookSecretVersionName = Objects.requireNonNull(webhookSecretVersionName);
            return this;
        }
        public GitHubEnterpriseSecretsResponse build() {
            return new GitHubEnterpriseSecretsResponse(oauthClientIdName, oauthClientIdVersionName, oauthSecretName, oauthSecretVersionName, privateKeyName, privateKeyVersionName, webhookSecretName, webhookSecretVersionName);
        }
    }
}