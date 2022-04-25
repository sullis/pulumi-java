// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KeyVaultResourceSettingsResponse {
    /**
     * @return The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is &#39;Microsoft.KeyVault/vaults&#39;.
     * 
     */
    private final String resourceType;
    /**
     * @return Gets or sets the target Resource name.
     * 
     */
    private final String targetResourceName;

    @CustomType.Constructor
    private KeyVaultResourceSettingsResponse(
        @CustomType.Parameter("resourceType") String resourceType,
        @CustomType.Parameter("targetResourceName") String targetResourceName) {
        this.resourceType = resourceType;
        this.targetResourceName = targetResourceName;
    }

    /**
     * @return The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is &#39;Microsoft.KeyVault/vaults&#39;.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }
    /**
     * @return Gets or sets the target Resource name.
     * 
     */
    public String targetResourceName() {
        return this.targetResourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceType;
        private String targetResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.targetResourceName = defaults.targetResourceName;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }        public KeyVaultResourceSettingsResponse build() {
            return new KeyVaultResourceSettingsResponse(resourceType, targetResourceName);
        }
    }
}
