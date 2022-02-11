// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.outputs;

import io.pulumi.awsnative.cloudformation.enums.StackSetCapability;
import io.pulumi.awsnative.cloudformation.outputs.ManagedExecutionProperties;
import io.pulumi.awsnative.cloudformation.outputs.StackSetAutoDeployment;
import io.pulumi.awsnative.cloudformation.outputs.StackSetParameter;
import io.pulumi.awsnative.cloudformation.outputs.StackSetStackInstances;
import io.pulumi.awsnative.cloudformation.outputs.StackSetTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStackSetResult {
    private final @Nullable String administrationRoleARN;
    private final @Nullable StackSetAutoDeployment autoDeployment;
    private final @Nullable List<StackSetCapability> capabilities;
    private final @Nullable String description;
    private final @Nullable String executionRoleName;
    private final @Nullable ManagedExecutionProperties managedExecution;
    private final @Nullable List<StackSetParameter> parameters;
    private final @Nullable List<StackSetStackInstances> stackInstancesGroup;
    private final @Nullable String stackSetId;
    private final @Nullable List<StackSetTag> tags;
    private final @Nullable String templateBody;

    @OutputCustomType.Constructor({"administrationRoleARN","autoDeployment","capabilities","description","executionRoleName","managedExecution","parameters","stackInstancesGroup","stackSetId","tags","templateBody"})
    private GetStackSetResult(
        @Nullable String administrationRoleARN,
        @Nullable StackSetAutoDeployment autoDeployment,
        @Nullable List<StackSetCapability> capabilities,
        @Nullable String description,
        @Nullable String executionRoleName,
        @Nullable ManagedExecutionProperties managedExecution,
        @Nullable List<StackSetParameter> parameters,
        @Nullable List<StackSetStackInstances> stackInstancesGroup,
        @Nullable String stackSetId,
        @Nullable List<StackSetTag> tags,
        @Nullable String templateBody) {
        this.administrationRoleARN = administrationRoleARN;
        this.autoDeployment = autoDeployment;
        this.capabilities = capabilities;
        this.description = description;
        this.executionRoleName = executionRoleName;
        this.managedExecution = managedExecution;
        this.parameters = parameters;
        this.stackInstancesGroup = stackInstancesGroup;
        this.stackSetId = stackSetId;
        this.tags = tags;
        this.templateBody = templateBody;
    }

    public Optional<String> getAdministrationRoleARN() {
        return Optional.ofNullable(this.administrationRoleARN);
    }
    public Optional<StackSetAutoDeployment> getAutoDeployment() {
        return Optional.ofNullable(this.autoDeployment);
    }
    public List<StackSetCapability> getCapabilities() {
        return this.capabilities == null ? List.of() : this.capabilities;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getExecutionRoleName() {
        return Optional.ofNullable(this.executionRoleName);
    }
    public Optional<ManagedExecutionProperties> getManagedExecution() {
        return Optional.ofNullable(this.managedExecution);
    }
    public List<StackSetParameter> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    public List<StackSetStackInstances> getStackInstancesGroup() {
        return this.stackInstancesGroup == null ? List.of() : this.stackInstancesGroup;
    }
    public Optional<String> getStackSetId() {
        return Optional.ofNullable(this.stackSetId);
    }
    public List<StackSetTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<String> getTemplateBody() {
        return Optional.ofNullable(this.templateBody);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStackSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String administrationRoleARN;
        private @Nullable StackSetAutoDeployment autoDeployment;
        private @Nullable List<StackSetCapability> capabilities;
        private @Nullable String description;
        private @Nullable String executionRoleName;
        private @Nullable ManagedExecutionProperties managedExecution;
        private @Nullable List<StackSetParameter> parameters;
        private @Nullable List<StackSetStackInstances> stackInstancesGroup;
        private @Nullable String stackSetId;
        private @Nullable List<StackSetTag> tags;
        private @Nullable String templateBody;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStackSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administrationRoleARN = defaults.administrationRoleARN;
    	      this.autoDeployment = defaults.autoDeployment;
    	      this.capabilities = defaults.capabilities;
    	      this.description = defaults.description;
    	      this.executionRoleName = defaults.executionRoleName;
    	      this.managedExecution = defaults.managedExecution;
    	      this.parameters = defaults.parameters;
    	      this.stackInstancesGroup = defaults.stackInstancesGroup;
    	      this.stackSetId = defaults.stackSetId;
    	      this.tags = defaults.tags;
    	      this.templateBody = defaults.templateBody;
        }

        public Builder setAdministrationRoleARN(@Nullable String administrationRoleARN) {
            this.administrationRoleARN = administrationRoleARN;
            return this;
        }

        public Builder setAutoDeployment(@Nullable StackSetAutoDeployment autoDeployment) {
            this.autoDeployment = autoDeployment;
            return this;
        }

        public Builder setCapabilities(@Nullable List<StackSetCapability> capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setExecutionRoleName(@Nullable String executionRoleName) {
            this.executionRoleName = executionRoleName;
            return this;
        }

        public Builder setManagedExecution(@Nullable ManagedExecutionProperties managedExecution) {
            this.managedExecution = managedExecution;
            return this;
        }

        public Builder setParameters(@Nullable List<StackSetParameter> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setStackInstancesGroup(@Nullable List<StackSetStackInstances> stackInstancesGroup) {
            this.stackInstancesGroup = stackInstancesGroup;
            return this;
        }

        public Builder setStackSetId(@Nullable String stackSetId) {
            this.stackSetId = stackSetId;
            return this;
        }

        public Builder setTags(@Nullable List<StackSetTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTemplateBody(@Nullable String templateBody) {
            this.templateBody = templateBody;
            return this;
        }

        public GetStackSetResult build() {
            return new GetStackSetResult(administrationRoleARN, autoDeployment, capabilities, description, executionRoleName, managedExecution, parameters, stackInstancesGroup, stackSetId, tags, templateBody);
        }
    }
}
