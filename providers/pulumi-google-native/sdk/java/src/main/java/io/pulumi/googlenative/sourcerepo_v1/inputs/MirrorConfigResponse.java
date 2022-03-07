// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sourcerepo_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration to automatically mirror a repository from another hosting service, for example GitHub or Bitbucket.
 * 
 */
public final class MirrorConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final MirrorConfigResponse Empty = new MirrorConfigResponse();

    /**
     * ID of the SSH deploy key at the other hosting service. Removing this key from the other service would deauthorize Google Cloud Source Repositories from mirroring.
     * 
     */
    @InputImport(name="deployKeyId", required=true)
      private final String deployKeyId;

    public String getDeployKeyId() {
        return this.deployKeyId;
    }

    /**
     * URL of the main repository at the other hosting service.
     * 
     */
    @InputImport(name="url", required=true)
      private final String url;

    public String getUrl() {
        return this.url;
    }

    /**
     * ID of the webhook listening to updates to trigger mirroring. Removing this webhook from the other hosting service will stop Google Cloud Source Repositories from receiving notifications, and thereby disabling mirroring.
     * 
     */
    @InputImport(name="webhookId", required=true)
      private final String webhookId;

    public String getWebhookId() {
        return this.webhookId;
    }

    public MirrorConfigResponse(
        String deployKeyId,
        String url,
        String webhookId) {
        this.deployKeyId = Objects.requireNonNull(deployKeyId, "expected parameter 'deployKeyId' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.webhookId = Objects.requireNonNull(webhookId, "expected parameter 'webhookId' to be non-null");
    }

    private MirrorConfigResponse() {
        this.deployKeyId = null;
        this.url = null;
        this.webhookId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MirrorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deployKeyId;
        private String url;
        private String webhookId;

        public Builder() {
    	      // Empty
        }

        public Builder(MirrorConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployKeyId = defaults.deployKeyId;
    	      this.url = defaults.url;
    	      this.webhookId = defaults.webhookId;
        }

        public Builder setDeployKeyId(String deployKeyId) {
            this.deployKeyId = Objects.requireNonNull(deployKeyId);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setWebhookId(String webhookId) {
            this.webhookId = Objects.requireNonNull(webhookId);
            return this;
        }
        public MirrorConfigResponse build() {
            return new MirrorConfigResponse(deployKeyId, url, webhookId);
        }
    }
}