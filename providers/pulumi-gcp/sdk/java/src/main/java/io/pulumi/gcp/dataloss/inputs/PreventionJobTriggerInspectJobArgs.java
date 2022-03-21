// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobActionArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PreventionJobTriggerInspectJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobArgs Empty = new PreventionJobTriggerInspectJobArgs();

    /**
     * A task to execute on the completion of a job.
     * Structure is documented below.
     * 
     */
    @Import(name="actions", required=true)
      private final Output<List<PreventionJobTriggerInspectJobActionArgs>> actions;

    public Output<List<PreventionJobTriggerInspectJobActionArgs>> getActions() {
        return this.actions;
    }

    /**
     * The name of the template to run when this job is triggered.
     * 
     */
    @Import(name="inspectTemplateName", required=true)
      private final Output<String> inspectTemplateName;

    public Output<String> getInspectTemplateName() {
        return this.inspectTemplateName;
    }

    /**
     * Information on where to inspect
     * Structure is documented below.
     * 
     */
    @Import(name="storageConfig", required=true)
      private final Output<PreventionJobTriggerInspectJobStorageConfigArgs> storageConfig;

    public Output<PreventionJobTriggerInspectJobStorageConfigArgs> getStorageConfig() {
        return this.storageConfig;
    }

    public PreventionJobTriggerInspectJobArgs(
        Output<List<PreventionJobTriggerInspectJobActionArgs>> actions,
        Output<String> inspectTemplateName,
        Output<PreventionJobTriggerInspectJobStorageConfigArgs> storageConfig) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.inspectTemplateName = Objects.requireNonNull(inspectTemplateName, "expected parameter 'inspectTemplateName' to be non-null");
        this.storageConfig = Objects.requireNonNull(storageConfig, "expected parameter 'storageConfig' to be non-null");
    }

    private PreventionJobTriggerInspectJobArgs() {
        this.actions = Output.empty();
        this.inspectTemplateName = Output.empty();
        this.storageConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<PreventionJobTriggerInspectJobActionArgs>> actions;
        private Output<String> inspectTemplateName;
        private Output<PreventionJobTriggerInspectJobStorageConfigArgs> storageConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.inspectTemplateName = defaults.inspectTemplateName;
    	      this.storageConfig = defaults.storageConfig;
        }

        public Builder actions(Output<List<PreventionJobTriggerInspectJobActionArgs>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(List<PreventionJobTriggerInspectJobActionArgs> actions) {
            this.actions = Output.of(Objects.requireNonNull(actions));
            return this;
        }
        public Builder actions(PreventionJobTriggerInspectJobActionArgs... actions) {
            return actions(List.of(actions));
        }
        public Builder inspectTemplateName(Output<String> inspectTemplateName) {
            this.inspectTemplateName = Objects.requireNonNull(inspectTemplateName);
            return this;
        }
        public Builder inspectTemplateName(String inspectTemplateName) {
            this.inspectTemplateName = Output.of(Objects.requireNonNull(inspectTemplateName));
            return this;
        }
        public Builder storageConfig(Output<PreventionJobTriggerInspectJobStorageConfigArgs> storageConfig) {
            this.storageConfig = Objects.requireNonNull(storageConfig);
            return this;
        }
        public Builder storageConfig(PreventionJobTriggerInspectJobStorageConfigArgs storageConfig) {
            this.storageConfig = Output.of(Objects.requireNonNull(storageConfig));
            return this;
        }        public PreventionJobTriggerInspectJobArgs build() {
            return new PreventionJobTriggerInspectJobArgs(actions, inspectTemplateName, storageConfig);
        }
    }
}
