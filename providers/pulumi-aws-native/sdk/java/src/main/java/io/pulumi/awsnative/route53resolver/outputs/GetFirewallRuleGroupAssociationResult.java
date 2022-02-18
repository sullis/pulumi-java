// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.outputs;

import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupAssociationMutationProtection;
import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupAssociationStatus;
import io.pulumi.awsnative.route53resolver.outputs.FirewallRuleGroupAssociationTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFirewallRuleGroupAssociationResult {
    /**
     * Arn
     * 
     */
    private final @Nullable String arn;
    /**
     * Rfc3339TimeString
     * 
     */
    private final @Nullable String creationTime;
    /**
     * The id of the creator request.
     * 
     */
    private final @Nullable String creatorRequestId;
    /**
     * Id
     * 
     */
    private final @Nullable String id;
    /**
     * ServicePrincipal
     * 
     */
    private final @Nullable String managedOwnerName;
    /**
     * Rfc3339TimeString
     * 
     */
    private final @Nullable String modificationTime;
    /**
     * MutationProtectionStatus
     * 
     */
    private final @Nullable FirewallRuleGroupAssociationMutationProtection mutationProtection;
    /**
     * FirewallRuleGroupAssociationName
     * 
     */
    private final @Nullable String name;
    /**
     * Priority
     * 
     */
    private final @Nullable Integer priority;
    /**
     * ResolverFirewallRuleGroupAssociation, possible values are COMPLETE, DELETING, UPDATING, and INACTIVE_OWNER_ACCOUNT_CLOSED.
     * 
     */
    private final @Nullable FirewallRuleGroupAssociationStatus status;
    /**
     * FirewallDomainListAssociationStatus
     * 
     */
    private final @Nullable String statusMessage;
    /**
     * Tags
     * 
     */
    private final @Nullable List<FirewallRuleGroupAssociationTag> tags;

    @OutputCustomType.Constructor({"arn","creationTime","creatorRequestId","id","managedOwnerName","modificationTime","mutationProtection","name","priority","status","statusMessage","tags"})
    private GetFirewallRuleGroupAssociationResult(
        @Nullable String arn,
        @Nullable String creationTime,
        @Nullable String creatorRequestId,
        @Nullable String id,
        @Nullable String managedOwnerName,
        @Nullable String modificationTime,
        @Nullable FirewallRuleGroupAssociationMutationProtection mutationProtection,
        @Nullable String name,
        @Nullable Integer priority,
        @Nullable FirewallRuleGroupAssociationStatus status,
        @Nullable String statusMessage,
        @Nullable List<FirewallRuleGroupAssociationTag> tags) {
        this.arn = arn;
        this.creationTime = creationTime;
        this.creatorRequestId = creatorRequestId;
        this.id = id;
        this.managedOwnerName = managedOwnerName;
        this.modificationTime = modificationTime;
        this.mutationProtection = mutationProtection;
        this.name = name;
        this.priority = priority;
        this.status = status;
        this.statusMessage = statusMessage;
        this.tags = tags;
    }

    /**
     * Arn
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Rfc3339TimeString
     * 
     */
    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    /**
     * The id of the creator request.
     * 
     */
    public Optional<String> getCreatorRequestId() {
        return Optional.ofNullable(this.creatorRequestId);
    }
    /**
     * Id
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * ServicePrincipal
     * 
     */
    public Optional<String> getManagedOwnerName() {
        return Optional.ofNullable(this.managedOwnerName);
    }
    /**
     * Rfc3339TimeString
     * 
     */
    public Optional<String> getModificationTime() {
        return Optional.ofNullable(this.modificationTime);
    }
    /**
     * MutationProtectionStatus
     * 
     */
    public Optional<FirewallRuleGroupAssociationMutationProtection> getMutationProtection() {
        return Optional.ofNullable(this.mutationProtection);
    }
    /**
     * FirewallRuleGroupAssociationName
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Priority
     * 
     */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * ResolverFirewallRuleGroupAssociation, possible values are COMPLETE, DELETING, UPDATING, and INACTIVE_OWNER_ACCOUNT_CLOSED.
     * 
     */
    public Optional<FirewallRuleGroupAssociationStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * FirewallDomainListAssociationStatus
     * 
     */
    public Optional<String> getStatusMessage() {
        return Optional.ofNullable(this.statusMessage);
    }
    /**
     * Tags
     * 
     */
    public List<FirewallRuleGroupAssociationTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallRuleGroupAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String creationTime;
        private @Nullable String creatorRequestId;
        private @Nullable String id;
        private @Nullable String managedOwnerName;
        private @Nullable String modificationTime;
        private @Nullable FirewallRuleGroupAssociationMutationProtection mutationProtection;
        private @Nullable String name;
        private @Nullable Integer priority;
        private @Nullable FirewallRuleGroupAssociationStatus status;
        private @Nullable String statusMessage;
        private @Nullable List<FirewallRuleGroupAssociationTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallRuleGroupAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.creationTime = defaults.creationTime;
    	      this.creatorRequestId = defaults.creatorRequestId;
    	      this.id = defaults.id;
    	      this.managedOwnerName = defaults.managedOwnerName;
    	      this.modificationTime = defaults.modificationTime;
    	      this.mutationProtection = defaults.mutationProtection;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCreationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setCreatorRequestId(@Nullable String creatorRequestId) {
            this.creatorRequestId = creatorRequestId;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setManagedOwnerName(@Nullable String managedOwnerName) {
            this.managedOwnerName = managedOwnerName;
            return this;
        }

        public Builder setModificationTime(@Nullable String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }

        public Builder setMutationProtection(@Nullable FirewallRuleGroupAssociationMutationProtection mutationProtection) {
            this.mutationProtection = mutationProtection;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setStatus(@Nullable FirewallRuleGroupAssociationStatus status) {
            this.status = status;
            return this;
        }

        public Builder setStatusMessage(@Nullable String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }

        public Builder setTags(@Nullable List<FirewallRuleGroupAssociationTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetFirewallRuleGroupAssociationResult build() {
            return new GetFirewallRuleGroupAssociationResult(arn, creationTime, creatorRequestId, id, managedOwnerName, modificationTime, mutationProtection, name, priority, status, statusMessage, tags);
        }
    }
}
