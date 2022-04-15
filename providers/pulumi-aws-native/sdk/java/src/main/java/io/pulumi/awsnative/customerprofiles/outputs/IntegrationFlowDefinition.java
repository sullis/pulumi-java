// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.outputs;

import io.pulumi.awsnative.customerprofiles.outputs.IntegrationSourceFlowConfig;
import io.pulumi.awsnative.customerprofiles.outputs.IntegrationTask;
import io.pulumi.awsnative.customerprofiles.outputs.IntegrationTriggerConfig;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationFlowDefinition {
    private final @Nullable String description;
    private final String flowName;
    private final String kmsArn;
    private final IntegrationSourceFlowConfig sourceFlowConfig;
    private final List<IntegrationTask> tasks;
    private final IntegrationTriggerConfig triggerConfig;

    @CustomType.Constructor
    private IntegrationFlowDefinition(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("flowName") String flowName,
        @CustomType.Parameter("kmsArn") String kmsArn,
        @CustomType.Parameter("sourceFlowConfig") IntegrationSourceFlowConfig sourceFlowConfig,
        @CustomType.Parameter("tasks") List<IntegrationTask> tasks,
        @CustomType.Parameter("triggerConfig") IntegrationTriggerConfig triggerConfig) {
        this.description = description;
        this.flowName = flowName;
        this.kmsArn = kmsArn;
        this.sourceFlowConfig = sourceFlowConfig;
        this.tasks = tasks;
        this.triggerConfig = triggerConfig;
    }

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public String flowName() {
        return this.flowName;
    }
    public String kmsArn() {
        return this.kmsArn;
    }
    public IntegrationSourceFlowConfig sourceFlowConfig() {
        return this.sourceFlowConfig;
    }
    public List<IntegrationTask> tasks() {
        return this.tasks;
    }
    public IntegrationTriggerConfig triggerConfig() {
        return this.triggerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationFlowDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String flowName;
        private String kmsArn;
        private IntegrationSourceFlowConfig sourceFlowConfig;
        private List<IntegrationTask> tasks;
        private IntegrationTriggerConfig triggerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationFlowDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.flowName = defaults.flowName;
    	      this.kmsArn = defaults.kmsArn;
    	      this.sourceFlowConfig = defaults.sourceFlowConfig;
    	      this.tasks = defaults.tasks;
    	      this.triggerConfig = defaults.triggerConfig;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder flowName(String flowName) {
            this.flowName = Objects.requireNonNull(flowName);
            return this;
        }
        public Builder kmsArn(String kmsArn) {
            this.kmsArn = Objects.requireNonNull(kmsArn);
            return this;
        }
        public Builder sourceFlowConfig(IntegrationSourceFlowConfig sourceFlowConfig) {
            this.sourceFlowConfig = Objects.requireNonNull(sourceFlowConfig);
            return this;
        }
        public Builder tasks(List<IntegrationTask> tasks) {
            this.tasks = Objects.requireNonNull(tasks);
            return this;
        }
        public Builder tasks(IntegrationTask... tasks) {
            return tasks(List.of(tasks));
        }
        public Builder triggerConfig(IntegrationTriggerConfig triggerConfig) {
            this.triggerConfig = Objects.requireNonNull(triggerConfig);
            return this;
        }        public IntegrationFlowDefinition build() {
            return new IntegrationFlowDefinition(description, flowName, kmsArn, sourceFlowConfig, tasks, triggerConfig);
        }
    }
}
