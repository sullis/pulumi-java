// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AzureClusterControlPlaneProxyConfig {
    /**
     * The ARM ID the of the resource group containing proxy keyvault. Resource group ids are formatted as `/subscriptions/<subscription-id>/resourceGroups/<resource-group-name>`
     * 
     */
    private final String resourceGroupId;
    /**
     * The URL the of the proxy setting secret with its version. Secret ids are formatted as `https:<key-vault-name>.vault.azure.net/secrets/<secret-name>/<secret-version>`.
     * 
     */
    private final String secretId;

    @OutputCustomType.Constructor({"resourceGroupId","secretId"})
    private AzureClusterControlPlaneProxyConfig(
        String resourceGroupId,
        String secretId) {
        this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
        this.secretId = Objects.requireNonNull(secretId);
    }

    /**
     * The ARM ID the of the resource group containing proxy keyvault. Resource group ids are formatted as `/subscriptions/<subscription-id>/resourceGroups/<resource-group-name>`
     * 
    */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The URL the of the proxy setting secret with its version. Secret ids are formatted as `https:<key-vault-name>.vault.azure.net/secrets/<secret-name>/<secret-version>`.
     * 
    */
    public String getSecretId() {
        return this.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterControlPlaneProxyConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupId;
        private String secretId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterControlPlaneProxyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.secretId = defaults.secretId;
        }

        public Builder setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }

        public Builder setSecretId(String secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }
        public AzureClusterControlPlaneProxyConfig build() {
            return new AzureClusterControlPlaneProxyConfig(resourceGroupId, secretId);
        }
    }
}