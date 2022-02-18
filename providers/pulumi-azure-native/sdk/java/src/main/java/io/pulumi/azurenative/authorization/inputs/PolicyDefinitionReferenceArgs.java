// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.azurenative.authorization.inputs.ParameterValuesValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The policy definition reference.
 * 
 */
public final class PolicyDefinitionReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyDefinitionReferenceArgs Empty = new PolicyDefinitionReferenceArgs();

    /**
     * The name of the groups that this policy definition reference belongs to.
     * 
     */
    @InputImport(name="groupNames")
    private final @Nullable Input<List<String>> groupNames;

    public Input<List<String>> getGroupNames() {
        return this.groupNames == null ? Input.empty() : this.groupNames;
    }

    /**
     * The parameter values for the referenced policy rule. The keys are the parameter names.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<Map<String,ParameterValuesValueArgs>> parameters;

    public Input<Map<String,ParameterValuesValueArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * The ID of the policy definition or policy set definition.
     * 
     */
    @InputImport(name="policyDefinitionId", required=true)
    private final Input<String> policyDefinitionId;

    public Input<String> getPolicyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * A unique id (within the policy set definition) for this policy definition reference.
     * 
     */
    @InputImport(name="policyDefinitionReferenceId")
    private final @Nullable Input<String> policyDefinitionReferenceId;

    public Input<String> getPolicyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId == null ? Input.empty() : this.policyDefinitionReferenceId;
    }

    public PolicyDefinitionReferenceArgs(
        @Nullable Input<List<String>> groupNames,
        @Nullable Input<Map<String,ParameterValuesValueArgs>> parameters,
        Input<String> policyDefinitionId,
        @Nullable Input<String> policyDefinitionReferenceId) {
        this.groupNames = groupNames;
        this.parameters = parameters;
        this.policyDefinitionId = Objects.requireNonNull(policyDefinitionId, "expected parameter 'policyDefinitionId' to be non-null");
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
    }

    private PolicyDefinitionReferenceArgs() {
        this.groupNames = Input.empty();
        this.parameters = Input.empty();
        this.policyDefinitionId = Input.empty();
        this.policyDefinitionReferenceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyDefinitionReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> groupNames;
        private @Nullable Input<Map<String,ParameterValuesValueArgs>> parameters;
        private Input<String> policyDefinitionId;
        private @Nullable Input<String> policyDefinitionReferenceId;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyDefinitionReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupNames = defaults.groupNames;
    	      this.parameters = defaults.parameters;
    	      this.policyDefinitionId = defaults.policyDefinitionId;
    	      this.policyDefinitionReferenceId = defaults.policyDefinitionReferenceId;
        }

        public Builder setGroupNames(@Nullable Input<List<String>> groupNames) {
            this.groupNames = groupNames;
            return this;
        }

        public Builder setGroupNames(@Nullable List<String> groupNames) {
            this.groupNames = Input.ofNullable(groupNames);
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,ParameterValuesValueArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterValuesValueArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPolicyDefinitionId(Input<String> policyDefinitionId) {
            this.policyDefinitionId = Objects.requireNonNull(policyDefinitionId);
            return this;
        }

        public Builder setPolicyDefinitionId(String policyDefinitionId) {
            this.policyDefinitionId = Input.of(Objects.requireNonNull(policyDefinitionId));
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

        public PolicyDefinitionReferenceArgs build() {
            return new PolicyDefinitionReferenceArgs(groupNames, parameters, policyDefinitionId, policyDefinitionReferenceId);
        }
    }
}
