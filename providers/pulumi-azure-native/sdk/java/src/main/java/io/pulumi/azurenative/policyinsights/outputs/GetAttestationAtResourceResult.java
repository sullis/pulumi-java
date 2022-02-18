// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.outputs;

import io.pulumi.azurenative.policyinsights.outputs.AttestationEvidenceResponse;
import io.pulumi.azurenative.policyinsights.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAttestationAtResourceResult {
    /**
     * Comments describing why this attestation was created.
     * 
     */
    private final @Nullable String comments;
    /**
     * The compliance state that should be set on the resource.
     * 
     */
    private final @Nullable String complianceState;
    /**
     * The evidence supporting the compliance state set in this attestation.
     * 
     */
    private final @Nullable List<AttestationEvidenceResponse> evidence;
    /**
     * The time the compliance state should expire.
     * 
     */
    private final @Nullable String expiresOn;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The time the compliance state was last changed in this attestation.
     * 
     */
    private final String lastComplianceStateChangeAt;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The person responsible for setting the state of the resource. This value is typically an Azure Active Directory object ID.
     * 
     */
    private final @Nullable String owner;
    /**
     * The resource ID of the policy assignment that the attestation is setting the state for.
     * 
     */
    private final String policyAssignmentId;
    /**
     * The policy definition reference ID from a policy set definition that the attestation is setting the state for. If the policy assignment assigns a policy set definition the attestation can choose a definition within the set definition with this property or omit this and set the state for the entire set definition.
     * 
     */
    private final @Nullable String policyDefinitionReferenceId;
    /**
     * The status of the attestation.
     * 
     */
    private final String provisioningState;
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"comments","complianceState","evidence","expiresOn","id","lastComplianceStateChangeAt","name","owner","policyAssignmentId","policyDefinitionReferenceId","provisioningState","systemData","type"})
    private GetAttestationAtResourceResult(
        @Nullable String comments,
        @Nullable String complianceState,
        @Nullable List<AttestationEvidenceResponse> evidence,
        @Nullable String expiresOn,
        String id,
        String lastComplianceStateChangeAt,
        String name,
        @Nullable String owner,
        String policyAssignmentId,
        @Nullable String policyDefinitionReferenceId,
        String provisioningState,
        SystemDataResponse systemData,
        String type) {
        this.comments = comments;
        this.complianceState = complianceState;
        this.evidence = evidence;
        this.expiresOn = expiresOn;
        this.id = Objects.requireNonNull(id);
        this.lastComplianceStateChangeAt = Objects.requireNonNull(lastComplianceStateChangeAt);
        this.name = Objects.requireNonNull(name);
        this.owner = owner;
        this.policyAssignmentId = Objects.requireNonNull(policyAssignmentId);
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Comments describing why this attestation was created.
     * 
     */
    public Optional<String> getComments() {
        return Optional.ofNullable(this.comments);
    }
    /**
     * The compliance state that should be set on the resource.
     * 
     */
    public Optional<String> getComplianceState() {
        return Optional.ofNullable(this.complianceState);
    }
    /**
     * The evidence supporting the compliance state set in this attestation.
     * 
     */
    public List<AttestationEvidenceResponse> getEvidence() {
        return this.evidence == null ? List.of() : this.evidence;
    }
    /**
     * The time the compliance state should expire.
     * 
     */
    public Optional<String> getExpiresOn() {
        return Optional.ofNullable(this.expiresOn);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The time the compliance state was last changed in this attestation.
     * 
     */
    public String getLastComplianceStateChangeAt() {
        return this.lastComplianceStateChangeAt;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The person responsible for setting the state of the resource. This value is typically an Azure Active Directory object ID.
     * 
     */
    public Optional<String> getOwner() {
        return Optional.ofNullable(this.owner);
    }
    /**
     * The resource ID of the policy assignment that the attestation is setting the state for.
     * 
     */
    public String getPolicyAssignmentId() {
        return this.policyAssignmentId;
    }
    /**
     * The policy definition reference ID from a policy set definition that the attestation is setting the state for. If the policy assignment assigns a policy set definition the attestation can choose a definition within the set definition with this property or omit this and set the state for the entire set definition.
     * 
     */
    public Optional<String> getPolicyDefinitionReferenceId() {
        return Optional.ofNullable(this.policyDefinitionReferenceId);
    }
    /**
     * The status of the attestation.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttestationAtResourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comments;
        private @Nullable String complianceState;
        private @Nullable List<AttestationEvidenceResponse> evidence;
        private @Nullable String expiresOn;
        private String id;
        private String lastComplianceStateChangeAt;
        private String name;
        private @Nullable String owner;
        private String policyAssignmentId;
        private @Nullable String policyDefinitionReferenceId;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAttestationAtResourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comments = defaults.comments;
    	      this.complianceState = defaults.complianceState;
    	      this.evidence = defaults.evidence;
    	      this.expiresOn = defaults.expiresOn;
    	      this.id = defaults.id;
    	      this.lastComplianceStateChangeAt = defaults.lastComplianceStateChangeAt;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.policyAssignmentId = defaults.policyAssignmentId;
    	      this.policyDefinitionReferenceId = defaults.policyDefinitionReferenceId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setComments(@Nullable String comments) {
            this.comments = comments;
            return this;
        }

        public Builder setComplianceState(@Nullable String complianceState) {
            this.complianceState = complianceState;
            return this;
        }

        public Builder setEvidence(@Nullable List<AttestationEvidenceResponse> evidence) {
            this.evidence = evidence;
            return this;
        }

        public Builder setExpiresOn(@Nullable String expiresOn) {
            this.expiresOn = expiresOn;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastComplianceStateChangeAt(String lastComplianceStateChangeAt) {
            this.lastComplianceStateChangeAt = Objects.requireNonNull(lastComplianceStateChangeAt);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOwner(@Nullable String owner) {
            this.owner = owner;
            return this;
        }

        public Builder setPolicyAssignmentId(String policyAssignmentId) {
            this.policyAssignmentId = Objects.requireNonNull(policyAssignmentId);
            return this;
        }

        public Builder setPolicyDefinitionReferenceId(@Nullable String policyDefinitionReferenceId) {
            this.policyDefinitionReferenceId = policyDefinitionReferenceId;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetAttestationAtResourceResult build() {
            return new GetAttestationAtResourceResult(comments, complianceState, evidence, expiresOn, id, lastComplianceStateChangeAt, name, owner, policyAssignmentId, policyDefinitionReferenceId, provisioningState, systemData, type);
        }
    }
}
