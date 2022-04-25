// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDisasterRecoveryConfigResult {
    /**
     * @return Alternate name specified when alias and namespace names are same.
     * 
     */
    private final @Nullable String alternateName;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
     * 
     */
    private final @Nullable String partnerNamespace;
    /**
     * @return Number of entities pending to be replicated.
     * 
     */
    private final Double pendingReplicationOperationsCount;
    /**
     * @return Provisioning state of the Alias(Disaster Recovery configuration) - possible values &#39;Accepted&#39; or &#39;Succeeded&#39; or &#39;Failed&#39;
     * 
     */
    private final String provisioningState;
    /**
     * @return role of namespace in GEO DR - possible values &#39;Primary&#39; or &#39;PrimaryNotReplicating&#39; or &#39;Secondary&#39;
     * 
     */
    private final String role;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDisasterRecoveryConfigResult(
        @CustomType.Parameter("alternateName") @Nullable String alternateName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("partnerNamespace") @Nullable String partnerNamespace,
        @CustomType.Parameter("pendingReplicationOperationsCount") Double pendingReplicationOperationsCount,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("role") String role,
        @CustomType.Parameter("type") String type) {
        this.alternateName = alternateName;
        this.id = id;
        this.name = name;
        this.partnerNamespace = partnerNamespace;
        this.pendingReplicationOperationsCount = pendingReplicationOperationsCount;
        this.provisioningState = provisioningState;
        this.role = role;
        this.type = type;
    }

    /**
     * @return Alternate name specified when alias and namespace names are same.
     * 
     */
    public Optional<String> alternateName() {
        return Optional.ofNullable(this.alternateName);
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
     * 
     */
    public Optional<String> partnerNamespace() {
        return Optional.ofNullable(this.partnerNamespace);
    }
    /**
     * @return Number of entities pending to be replicated.
     * 
     */
    public Double pendingReplicationOperationsCount() {
        return this.pendingReplicationOperationsCount;
    }
    /**
     * @return Provisioning state of the Alias(Disaster Recovery configuration) - possible values &#39;Accepted&#39; or &#39;Succeeded&#39; or &#39;Failed&#39;
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return role of namespace in GEO DR - possible values &#39;Primary&#39; or &#39;PrimaryNotReplicating&#39; or &#39;Secondary&#39;
     * 
     */
    public String role() {
        return this.role;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDisasterRecoveryConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alternateName;
        private String id;
        private String name;
        private @Nullable String partnerNamespace;
        private Double pendingReplicationOperationsCount;
        private String provisioningState;
        private String role;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDisasterRecoveryConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateName = defaults.alternateName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.partnerNamespace = defaults.partnerNamespace;
    	      this.pendingReplicationOperationsCount = defaults.pendingReplicationOperationsCount;
    	      this.provisioningState = defaults.provisioningState;
    	      this.role = defaults.role;
    	      this.type = defaults.type;
        }

        public Builder alternateName(@Nullable String alternateName) {
            this.alternateName = alternateName;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder partnerNamespace(@Nullable String partnerNamespace) {
            this.partnerNamespace = partnerNamespace;
            return this;
        }
        public Builder pendingReplicationOperationsCount(Double pendingReplicationOperationsCount) {
            this.pendingReplicationOperationsCount = Objects.requireNonNull(pendingReplicationOperationsCount);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetDisasterRecoveryConfigResult build() {
            return new GetDisasterRecoveryConfigResult(alternateName, id, name, partnerNamespace, pendingReplicationOperationsCount, provisioningState, role, type);
        }
    }
}
