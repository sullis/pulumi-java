// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.machinelearning.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SynapseSparkIdentity {
    /**
     * @return Specifies a list of User Assigned Managed Identity IDs to be assigned to this Machine Learning Synapse Spark.
     * 
     */
    private final @Nullable List<String> identityIds;
    /**
     * @return The Principal ID for the Service Principal associated with the Managed Service Identity of this Machine Learning Synapse Spark.
     * 
     */
    private final @Nullable String principalId;
    /**
     * @return The Tenant ID for the Service Principal associated with the Managed Service Identity of this Machine Learning Synapse Spark.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * @return Specifies the type of Managed Service Identity that should be configured on this Machine Learning Synapse Spark. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
     * 
     */
    private final String type;

    @CustomType.Constructor
    private SynapseSparkIdentity(
        @CustomType.Parameter("identityIds") @Nullable List<String> identityIds,
        @CustomType.Parameter("principalId") @Nullable String principalId,
        @CustomType.Parameter("tenantId") @Nullable String tenantId,
        @CustomType.Parameter("type") String type) {
        this.identityIds = identityIds;
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * @return Specifies a list of User Assigned Managed Identity IDs to be assigned to this Machine Learning Synapse Spark.
     * 
     */
    public List<String> identityIds() {
        return this.identityIds == null ? List.of() : this.identityIds;
    }
    /**
     * @return The Principal ID for the Service Principal associated with the Managed Service Identity of this Machine Learning Synapse Spark.
     * 
     */
    public Optional<String> principalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * @return The Tenant ID for the Service Principal associated with the Managed Service Identity of this Machine Learning Synapse Spark.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * @return Specifies the type of Managed Service Identity that should be configured on this Machine Learning Synapse Spark. Possible values are `SystemAssigned`, `UserAssigned`, `SystemAssigned, UserAssigned` (to enable both).
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SynapseSparkIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> identityIds;
        private @Nullable String principalId;
        private @Nullable String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SynapseSparkIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityIds = defaults.identityIds;
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder identityIds(@Nullable List<String> identityIds) {
            this.identityIds = identityIds;
            return this;
        }
        public Builder identityIds(String... identityIds) {
            return identityIds(List.of(identityIds));
        }
        public Builder principalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SynapseSparkIdentity build() {
            return new SynapseSparkIdentity(identityIds, principalId, tenantId, type);
        }
    }
}
