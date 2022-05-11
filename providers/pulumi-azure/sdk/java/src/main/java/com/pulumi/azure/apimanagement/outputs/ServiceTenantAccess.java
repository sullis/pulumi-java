// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTenantAccess {
    /**
     * @return Should the access to the management API be enabled?
     * 
     */
    private final Boolean enabled;
    /**
     * @return Primary access key for the tenant access information contract.
     * 
     */
    private final @Nullable String primaryKey;
    /**
     * @return Secondary access key for the tenant access information contract.
     * 
     */
    private final @Nullable String secondaryKey;
    /**
     * @return The identifier for the tenant access information contract.
     * 
     */
    private final @Nullable String tenantId;

    @CustomType.Constructor
    private ServiceTenantAccess(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("primaryKey") @Nullable String primaryKey,
        @CustomType.Parameter("secondaryKey") @Nullable String secondaryKey,
        @CustomType.Parameter("tenantId") @Nullable String tenantId) {
        this.enabled = enabled;
        this.primaryKey = primaryKey;
        this.secondaryKey = secondaryKey;
        this.tenantId = tenantId;
    }

    /**
     * @return Should the access to the management API be enabled?
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Primary access key for the tenant access information contract.
     * 
     */
    public Optional<String> primaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }
    /**
     * @return Secondary access key for the tenant access information contract.
     * 
     */
    public Optional<String> secondaryKey() {
        return Optional.ofNullable(this.secondaryKey);
    }
    /**
     * @return The identifier for the tenant access information contract.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTenantAccess defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private @Nullable String primaryKey;
        private @Nullable String secondaryKey;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTenantAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.primaryKey = defaults.primaryKey;
    	      this.secondaryKey = defaults.secondaryKey;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder primaryKey(@Nullable String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Builder secondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }        public ServiceTenantAccess build() {
            return new ServiceTenantAccess(enabled, primaryKey, secondaryKey, tenantId);
        }
    }
}
