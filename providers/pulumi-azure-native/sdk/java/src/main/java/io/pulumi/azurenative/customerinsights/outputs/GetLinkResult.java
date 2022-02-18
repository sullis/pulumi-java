// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.azurenative.customerinsights.outputs.ParticipantPropertyReferenceResponse;
import io.pulumi.azurenative.customerinsights.outputs.TypePropertiesMappingResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLinkResult {
    /**
     * Localized descriptions for the Link.
     * 
     */
    private final @Nullable Map<String,String> description;
    /**
     * Localized display name for the Link.
     * 
     */
    private final @Nullable Map<String,String> displayName;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * The link name.
     * 
     */
    private final String linkName;
    /**
     * The set of properties mappings between the source and target Types.
     * 
     */
    private final @Nullable List<TypePropertiesMappingResponse> mappings;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Determines whether this link is supposed to create or delete instances if Link is NOT Reference Only.
     * 
     */
    private final @Nullable String operationType;
    /**
     * The properties that represent the participating profile.
     * 
     */
    private final List<ParticipantPropertyReferenceResponse> participantPropertyReferences;
    /**
     * Provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * Indicating whether the link is reference only link. This flag is ignored if the Mappings are defined. If the mappings are not defined and it is set to true, links processing will not create or update profiles.
     * 
     */
    private final @Nullable Boolean referenceOnly;
    /**
     * Type of source entity.
     * 
     */
    private final String sourceEntityType;
    /**
     * Name of the source Entity Type.
     * 
     */
    private final String sourceEntityTypeName;
    /**
     * Type of target entity.
     * 
     */
    private final String targetEntityType;
    /**
     * Name of the target Entity Type.
     * 
     */
    private final String targetEntityTypeName;
    /**
     * The hub name.
     * 
     */
    private final String tenantId;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"description","displayName","id","linkName","mappings","name","operationType","participantPropertyReferences","provisioningState","referenceOnly","sourceEntityType","sourceEntityTypeName","targetEntityType","targetEntityTypeName","tenantId","type"})
    private GetLinkResult(
        @Nullable Map<String,String> description,
        @Nullable Map<String,String> displayName,
        String id,
        String linkName,
        @Nullable List<TypePropertiesMappingResponse> mappings,
        String name,
        @Nullable String operationType,
        List<ParticipantPropertyReferenceResponse> participantPropertyReferences,
        String provisioningState,
        @Nullable Boolean referenceOnly,
        String sourceEntityType,
        String sourceEntityTypeName,
        String targetEntityType,
        String targetEntityTypeName,
        String tenantId,
        String type) {
        this.description = description;
        this.displayName = displayName;
        this.id = Objects.requireNonNull(id);
        this.linkName = Objects.requireNonNull(linkName);
        this.mappings = mappings;
        this.name = Objects.requireNonNull(name);
        this.operationType = operationType;
        this.participantPropertyReferences = Objects.requireNonNull(participantPropertyReferences);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.referenceOnly = referenceOnly;
        this.sourceEntityType = Objects.requireNonNull(sourceEntityType);
        this.sourceEntityTypeName = Objects.requireNonNull(sourceEntityTypeName);
        this.targetEntityType = Objects.requireNonNull(targetEntityType);
        this.targetEntityTypeName = Objects.requireNonNull(targetEntityTypeName);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Localized descriptions for the Link.
     * 
     */
    public Map<String,String> getDescription() {
        return this.description == null ? Map.of() : this.description;
    }
    /**
     * Localized display name for the Link.
     * 
     */
    public Map<String,String> getDisplayName() {
        return this.displayName == null ? Map.of() : this.displayName;
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The link name.
     * 
     */
    public String getLinkName() {
        return this.linkName;
    }
    /**
     * The set of properties mappings between the source and target Types.
     * 
     */
    public List<TypePropertiesMappingResponse> getMappings() {
        return this.mappings == null ? List.of() : this.mappings;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Determines whether this link is supposed to create or delete instances if Link is NOT Reference Only.
     * 
     */
    public Optional<String> getOperationType() {
        return Optional.ofNullable(this.operationType);
    }
    /**
     * The properties that represent the participating profile.
     * 
     */
    public List<ParticipantPropertyReferenceResponse> getParticipantPropertyReferences() {
        return this.participantPropertyReferences;
    }
    /**
     * Provisioning state.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Indicating whether the link is reference only link. This flag is ignored if the Mappings are defined. If the mappings are not defined and it is set to true, links processing will not create or update profiles.
     * 
     */
    public Optional<Boolean> getReferenceOnly() {
        return Optional.ofNullable(this.referenceOnly);
    }
    /**
     * Type of source entity.
     * 
     */
    public String getSourceEntityType() {
        return this.sourceEntityType;
    }
    /**
     * Name of the source Entity Type.
     * 
     */
    public String getSourceEntityTypeName() {
        return this.sourceEntityTypeName;
    }
    /**
     * Type of target entity.
     * 
     */
    public String getTargetEntityType() {
        return this.targetEntityType;
    }
    /**
     * Name of the target Entity Type.
     * 
     */
    public String getTargetEntityTypeName() {
        return this.targetEntityTypeName;
    }
    /**
     * The hub name.
     * 
     */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> description;
        private @Nullable Map<String,String> displayName;
        private String id;
        private String linkName;
        private @Nullable List<TypePropertiesMappingResponse> mappings;
        private String name;
        private @Nullable String operationType;
        private List<ParticipantPropertyReferenceResponse> participantPropertyReferences;
        private String provisioningState;
        private @Nullable Boolean referenceOnly;
        private String sourceEntityType;
        private String sourceEntityTypeName;
        private String targetEntityType;
        private String targetEntityTypeName;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.linkName = defaults.linkName;
    	      this.mappings = defaults.mappings;
    	      this.name = defaults.name;
    	      this.operationType = defaults.operationType;
    	      this.participantPropertyReferences = defaults.participantPropertyReferences;
    	      this.provisioningState = defaults.provisioningState;
    	      this.referenceOnly = defaults.referenceOnly;
    	      this.sourceEntityType = defaults.sourceEntityType;
    	      this.sourceEntityTypeName = defaults.sourceEntityTypeName;
    	      this.targetEntityType = defaults.targetEntityType;
    	      this.targetEntityTypeName = defaults.targetEntityTypeName;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable Map<String,String> description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable Map<String,String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLinkName(String linkName) {
            this.linkName = Objects.requireNonNull(linkName);
            return this;
        }

        public Builder setMappings(@Nullable List<TypePropertiesMappingResponse> mappings) {
            this.mappings = mappings;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperationType(@Nullable String operationType) {
            this.operationType = operationType;
            return this;
        }

        public Builder setParticipantPropertyReferences(List<ParticipantPropertyReferenceResponse> participantPropertyReferences) {
            this.participantPropertyReferences = Objects.requireNonNull(participantPropertyReferences);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setReferenceOnly(@Nullable Boolean referenceOnly) {
            this.referenceOnly = referenceOnly;
            return this;
        }

        public Builder setSourceEntityType(String sourceEntityType) {
            this.sourceEntityType = Objects.requireNonNull(sourceEntityType);
            return this;
        }

        public Builder setSourceEntityTypeName(String sourceEntityTypeName) {
            this.sourceEntityTypeName = Objects.requireNonNull(sourceEntityTypeName);
            return this;
        }

        public Builder setTargetEntityType(String targetEntityType) {
            this.targetEntityType = Objects.requireNonNull(targetEntityType);
            return this;
        }

        public Builder setTargetEntityTypeName(String targetEntityTypeName) {
            this.targetEntityTypeName = Objects.requireNonNull(targetEntityTypeName);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetLinkResult build() {
            return new GetLinkResult(description, displayName, id, linkName, mappings, name, operationType, participantPropertyReferences, provisioningState, referenceOnly, sourceEntityType, sourceEntityTypeName, targetEntityType, targetEntityTypeName, tenantId, type);
        }
    }
}
