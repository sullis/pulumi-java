// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AppendVariableActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureDataExplorerCommandActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureFunctionActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMLBatchExecutionActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMLExecutePipelineActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.AzureMLUpdateResourceActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ControlActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.CopyActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.CustomActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DataLakeAnalyticsUSQLActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DatabricksNotebookActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DatabricksSparkJarActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DatabricksSparkPythonActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.DeleteActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecuteDataFlowActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecutePipelineActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecuteSSISPackageActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecuteWranglingDataflowActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ExecutionActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.FailActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.FilterActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ForEachActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.GetMetadataActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightHiveActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightMapReduceActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightPigActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightSparkActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.HDInsightStreamingActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.IfConditionActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.LookupActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.SetVariableActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.SqlServerStoredProcedureActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.SwitchActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.UntilActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.ValidationActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.WaitActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.WebActivityArgs;
import io.pulumi.azurenative.datafactory.inputs.WebHookActivityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Switch cases with have a value and corresponding activities.
 * 
 */
public final class SwitchCaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final SwitchCaseArgs Empty = new SwitchCaseArgs();

    /**
     * List of activities to execute for satisfied case condition.
     * 
     */
    @InputImport(name="activities")
      private final @Nullable Input<List<Object>> activities;

    public Input<List<Object>> getActivities() {
        return this.activities == null ? Input.empty() : this.activities;
    }

    /**
     * Expected value that satisfies the expression result of the 'on' property.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public SwitchCaseArgs(
        @Nullable Input<List<Object>> activities,
        @Nullable Input<String> value) {
        this.activities = activities;
        this.value = value;
    }

    private SwitchCaseArgs() {
        this.activities = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchCaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> activities;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SwitchCaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activities = defaults.activities;
    	      this.value = defaults.value;
        }

        public Builder setActivities(@Nullable Input<List<Object>> activities) {
            this.activities = activities;
            return this;
        }

        public Builder setActivities(@Nullable List<Object> activities) {
            this.activities = Input.ofNullable(activities);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public SwitchCaseArgs build() {
            return new SwitchCaseArgs(activities, value);
        }
    }
}