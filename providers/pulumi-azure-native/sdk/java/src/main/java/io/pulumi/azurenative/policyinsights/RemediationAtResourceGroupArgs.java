// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights;

import io.pulumi.azurenative.policyinsights.enums.ResourceDiscoveryMode;
import io.pulumi.azurenative.policyinsights.inputs.RemediationFiltersArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RemediationAtResourceGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final RemediationAtResourceGroupArgs Empty = new RemediationAtResourceGroupArgs();

    /**
     * The filters that will be applied to determine which resources to remediate.
     * 
     */
    @InputImport(name="filters")
    private final @Nullable Input<RemediationFiltersArgs> filters;

    public Input<RemediationFiltersArgs> getFilters() {
        return this.filters == null ? Input.empty() : this.filters;
    }

    /**
     * The resource ID of the policy assignment that should be remediated.
     * 
     */
    @InputImport(name="policyAssignmentId")
    private final @Nullable Input<String> policyAssignmentId;

    public Input<String> getPolicyAssignmentId() {
        return this.policyAssignmentId == null ? Input.empty() : this.policyAssignmentId;
    }

    /**
     * The policy definition reference ID of the individual definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     * 
     */
    @InputImport(name="policyDefinitionReferenceId")
    private final @Nullable Input<String> policyDefinitionReferenceId;

    public Input<String> getPolicyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId == null ? Input.empty() : this.policyDefinitionReferenceId;
    }

    /**
     * The name of the remediation.
     * 
     */
    @InputImport(name="remediationName")
    private final @Nullable Input<String> remediationName;

    public Input<String> getRemediationName() {
        return this.remediationName == null ? Input.empty() : this.remediationName;
    }

    /**
     * The way resources to remediate are discovered. Defaults to ExistingNonCompliant if not specified.
     * 
     */
    @InputImport(name="resourceDiscoveryMode")
    private final @Nullable Input<Either<String,ResourceDiscoveryMode>> resourceDiscoveryMode;

    public Input<Either<String,ResourceDiscoveryMode>> getResourceDiscoveryMode() {
        return this.resourceDiscoveryMode == null ? Input.empty() : this.resourceDiscoveryMode;
    }

    /**
     * Resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public RemediationAtResourceGroupArgs(
        @Nullable Input<RemediationFiltersArgs> filters,
        @Nullable Input<String> policyAssignmentId,
        @Nullable Input<String> policyDefinitionReferenceId,
        @Nullable Input<String> remediationName,
        @Nullable Input<Either<String,ResourceDiscoveryMode>> resourceDiscoveryMode,
        Input<String> resourceGroupName) {
        this.filters = filters;
        this.policyAssignmentId = policyAssignmentId;
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        this.remediationName = remediationName;
        this.resourceDiscoveryMode = resourceDiscoveryMode;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private RemediationAtResourceGroupArgs() {
        this.filters = Input.empty();
        this.policyAssignmentId = Input.empty();
        this.policyDefinitionReferenceId = Input.empty();
        this.remediationName = Input.empty();
        this.resourceDiscoveryMode = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemediationAtResourceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RemediationFiltersArgs> filters;
        private @Nullable Input<String> policyAssignmentId;
        private @Nullable Input<String> policyDefinitionReferenceId;
        private @Nullable Input<String> remediationName;
        private @Nullable Input<Either<String,ResourceDiscoveryMode>> resourceDiscoveryMode;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(RemediationAtResourceGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.policyAssignmentId = defaults.policyAssignmentId;
    	      this.policyDefinitionReferenceId = defaults.policyDefinitionReferenceId;
    	      this.remediationName = defaults.remediationName;
    	      this.resourceDiscoveryMode = defaults.resourceDiscoveryMode;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setFilters(@Nullable Input<RemediationFiltersArgs> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setFilters(@Nullable RemediationFiltersArgs filters) {
            this.filters = Input.ofNullable(filters);
            return this;
        }

        public Builder setPolicyAssignmentId(@Nullable Input<String> policyAssignmentId) {
            this.policyAssignmentId = policyAssignmentId;
            return this;
        }

        public Builder setPolicyAssignmentId(@Nullable String policyAssignmentId) {
            this.policyAssignmentId = Input.ofNullable(policyAssignmentId);
            return this;
        }

        public Builder setPolicyDefinitionReferenceId(@Nullable Input<String> policyDefinitionReferenceId) {
            this.policyDefinitionReferenceId = policyDefinitionReferenceId;
            return this;
        }

        public Builder setPolicyDefinitionReferenceId(@Nullable String policyDefinitionReferenceId) {
            this.policyDefinitionReferenceId = Input.ofNullable(policyDefinitionReferenceId);
            return this;
        }

        public Builder setRemediationName(@Nullable Input<String> remediationName) {
            this.remediationName = remediationName;
            return this;
        }

        public Builder setRemediationName(@Nullable String remediationName) {
            this.remediationName = Input.ofNullable(remediationName);
            return this;
        }

        public Builder setResourceDiscoveryMode(@Nullable Input<Either<String,ResourceDiscoveryMode>> resourceDiscoveryMode) {
            this.resourceDiscoveryMode = resourceDiscoveryMode;
            return this;
        }

        public Builder setResourceDiscoveryMode(@Nullable Either<String,ResourceDiscoveryMode> resourceDiscoveryMode) {
            this.resourceDiscoveryMode = Input.ofNullable(resourceDiscoveryMode);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public RemediationAtResourceGroupArgs build() {
            return new RemediationAtResourceGroupArgs(filters, policyAssignmentId, policyDefinitionReferenceId, remediationName, resourceDiscoveryMode, resourceGroupName);
        }
    }
}
