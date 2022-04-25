// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import com.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import com.pulumi.azurenative.datafactory.inputs.DataFlowReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.DataFlowStagingInfoArgs;
import com.pulumi.azurenative.datafactory.inputs.ExecuteDataFlowActivityTypePropertiesComputeArgs;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.PowerQuerySinkArgs;
import com.pulumi.azurenative.datafactory.inputs.PowerQuerySinkMappingArgs;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Execute power query activity.
 * 
 */
public final class ExecuteWranglingDataflowActivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExecuteWranglingDataflowActivityArgs Empty = new ExecuteWranglingDataflowActivityArgs();

    /**
     * Compute properties for data flow activity.
     * 
     */
    @Import(name="compute")
    private @Nullable Output<ExecuteDataFlowActivityTypePropertiesComputeArgs> compute;

    /**
     * @return Compute properties for data flow activity.
     * 
     */
    public Optional<Output<ExecuteDataFlowActivityTypePropertiesComputeArgs>> compute() {
        return Optional.ofNullable(this.compute);
    }

    /**
     * Continue on error setting used for data flow execution. Enables processing to continue if a sink fails. Type: boolean (or Expression with resultType boolean)
     * 
     */
    @Import(name="continueOnError")
    private @Nullable Output<Object> continueOnError;

    /**
     * @return Continue on error setting used for data flow execution. Enables processing to continue if a sink fails. Type: boolean (or Expression with resultType boolean)
     * 
     */
    public Optional<Output<Object>> continueOnError() {
        return Optional.ofNullable(this.continueOnError);
    }

    /**
     * Data flow reference.
     * 
     */
    @Import(name="dataFlow", required=true)
    private Output<DataFlowReferenceArgs> dataFlow;

    /**
     * @return Data flow reference.
     * 
     */
    public Output<DataFlowReferenceArgs> dataFlow() {
        return this.dataFlow;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    /**
     * @return Activity depends on condition.
     * 
     */
    public Optional<Output<List<ActivityDependencyArgs>>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Activity description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="integrationRuntime")
    private @Nullable Output<IntegrationRuntimeReferenceArgs> integrationRuntime;

    /**
     * @return The integration runtime reference.
     * 
     */
    public Optional<Output<IntegrationRuntimeReferenceArgs>> integrationRuntime() {
        return Optional.ofNullable(this.integrationRuntime);
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Activity name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<ActivityPolicyArgs> policy;

    /**
     * @return Activity policy.
     * 
     */
    public Optional<Output<ActivityPolicyArgs>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * List of mapping for Power Query mashup query to sink dataset(s).
     * 
     */
    @Import(name="queries")
    private @Nullable Output<List<PowerQuerySinkMappingArgs>> queries;

    /**
     * @return List of mapping for Power Query mashup query to sink dataset(s).
     * 
     */
    public Optional<Output<List<PowerQuerySinkMappingArgs>>> queries() {
        return Optional.ofNullable(this.queries);
    }

    /**
     * Concurrent run setting used for data flow execution. Allows sinks with the same save order to be processed concurrently. Type: boolean (or Expression with resultType boolean)
     * 
     */
    @Import(name="runConcurrently")
    private @Nullable Output<Object> runConcurrently;

    /**
     * @return Concurrent run setting used for data flow execution. Allows sinks with the same save order to be processed concurrently. Type: boolean (or Expression with resultType boolean)
     * 
     */
    public Optional<Output<Object>> runConcurrently() {
        return Optional.ofNullable(this.runConcurrently);
    }

    /**
     * (Deprecated. Please use Queries). List of Power Query activity sinks mapped to a queryName.
     * 
     */
    @Import(name="sinks")
    private @Nullable Output<Map<String,PowerQuerySinkArgs>> sinks;

    /**
     * @return (Deprecated. Please use Queries). List of Power Query activity sinks mapped to a queryName.
     * 
     */
    public Optional<Output<Map<String,PowerQuerySinkArgs>>> sinks() {
        return Optional.ofNullable(this.sinks);
    }

    /**
     * Staging info for execute data flow activity.
     * 
     */
    @Import(name="staging")
    private @Nullable Output<DataFlowStagingInfoArgs> staging;

    /**
     * @return Staging info for execute data flow activity.
     * 
     */
    public Optional<Output<DataFlowStagingInfoArgs>> staging() {
        return Optional.ofNullable(this.staging);
    }

    /**
     * Trace level setting used for data flow monitoring output. Supported values are: &#39;coarse&#39;, &#39;fine&#39;, and &#39;none&#39;. Type: string (or Expression with resultType string)
     * 
     */
    @Import(name="traceLevel")
    private @Nullable Output<Object> traceLevel;

    /**
     * @return Trace level setting used for data flow monitoring output. Supported values are: &#39;coarse&#39;, &#39;fine&#39;, and &#39;none&#39;. Type: string (or Expression with resultType string)
     * 
     */
    public Optional<Output<Object>> traceLevel() {
        return Optional.ofNullable(this.traceLevel);
    }

    /**
     * Type of activity.
     * Expected value is &#39;ExecuteWranglingDataflow&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of activity.
     * Expected value is &#39;ExecuteWranglingDataflow&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
    private @Nullable Output<List<UserPropertyArgs>> userProperties;

    /**
     * @return Activity user properties.
     * 
     */
    public Optional<Output<List<UserPropertyArgs>>> userProperties() {
        return Optional.ofNullable(this.userProperties);
    }

    private ExecuteWranglingDataflowActivityArgs() {}

    private ExecuteWranglingDataflowActivityArgs(ExecuteWranglingDataflowActivityArgs $) {
        this.compute = $.compute;
        this.continueOnError = $.continueOnError;
        this.dataFlow = $.dataFlow;
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.integrationRuntime = $.integrationRuntime;
        this.name = $.name;
        this.policy = $.policy;
        this.queries = $.queries;
        this.runConcurrently = $.runConcurrently;
        this.sinks = $.sinks;
        this.staging = $.staging;
        this.traceLevel = $.traceLevel;
        this.type = $.type;
        this.userProperties = $.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExecuteWranglingDataflowActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecuteWranglingDataflowActivityArgs $;

        public Builder() {
            $ = new ExecuteWranglingDataflowActivityArgs();
        }

        public Builder(ExecuteWranglingDataflowActivityArgs defaults) {
            $ = new ExecuteWranglingDataflowActivityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compute Compute properties for data flow activity.
         * 
         * @return builder
         * 
         */
        public Builder compute(@Nullable Output<ExecuteDataFlowActivityTypePropertiesComputeArgs> compute) {
            $.compute = compute;
            return this;
        }

        /**
         * @param compute Compute properties for data flow activity.
         * 
         * @return builder
         * 
         */
        public Builder compute(ExecuteDataFlowActivityTypePropertiesComputeArgs compute) {
            return compute(Output.of(compute));
        }

        /**
         * @param continueOnError Continue on error setting used for data flow execution. Enables processing to continue if a sink fails. Type: boolean (or Expression with resultType boolean)
         * 
         * @return builder
         * 
         */
        public Builder continueOnError(@Nullable Output<Object> continueOnError) {
            $.continueOnError = continueOnError;
            return this;
        }

        /**
         * @param continueOnError Continue on error setting used for data flow execution. Enables processing to continue if a sink fails. Type: boolean (or Expression with resultType boolean)
         * 
         * @return builder
         * 
         */
        public Builder continueOnError(Object continueOnError) {
            return continueOnError(Output.of(continueOnError));
        }

        /**
         * @param dataFlow Data flow reference.
         * 
         * @return builder
         * 
         */
        public Builder dataFlow(Output<DataFlowReferenceArgs> dataFlow) {
            $.dataFlow = dataFlow;
            return this;
        }

        /**
         * @param dataFlow Data flow reference.
         * 
         * @return builder
         * 
         */
        public Builder dataFlow(DataFlowReferenceArgs dataFlow) {
            return dataFlow(Output.of(dataFlow));
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(List<ActivityDependencyArgs> dependsOn) {
            return dependsOn(Output.of(dependsOn));
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(ActivityDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        /**
         * @param description Activity description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Activity description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param integrationRuntime The integration runtime reference.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntime(@Nullable Output<IntegrationRuntimeReferenceArgs> integrationRuntime) {
            $.integrationRuntime = integrationRuntime;
            return this;
        }

        /**
         * @param integrationRuntime The integration runtime reference.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntime(IntegrationRuntimeReferenceArgs integrationRuntime) {
            return integrationRuntime(Output.of(integrationRuntime));
        }

        /**
         * @param name Activity name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Activity name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policy Activity policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<ActivityPolicyArgs> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Activity policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(ActivityPolicyArgs policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param queries List of mapping for Power Query mashup query to sink dataset(s).
         * 
         * @return builder
         * 
         */
        public Builder queries(@Nullable Output<List<PowerQuerySinkMappingArgs>> queries) {
            $.queries = queries;
            return this;
        }

        /**
         * @param queries List of mapping for Power Query mashup query to sink dataset(s).
         * 
         * @return builder
         * 
         */
        public Builder queries(List<PowerQuerySinkMappingArgs> queries) {
            return queries(Output.of(queries));
        }

        /**
         * @param queries List of mapping for Power Query mashup query to sink dataset(s).
         * 
         * @return builder
         * 
         */
        public Builder queries(PowerQuerySinkMappingArgs... queries) {
            return queries(List.of(queries));
        }

        /**
         * @param runConcurrently Concurrent run setting used for data flow execution. Allows sinks with the same save order to be processed concurrently. Type: boolean (or Expression with resultType boolean)
         * 
         * @return builder
         * 
         */
        public Builder runConcurrently(@Nullable Output<Object> runConcurrently) {
            $.runConcurrently = runConcurrently;
            return this;
        }

        /**
         * @param runConcurrently Concurrent run setting used for data flow execution. Allows sinks with the same save order to be processed concurrently. Type: boolean (or Expression with resultType boolean)
         * 
         * @return builder
         * 
         */
        public Builder runConcurrently(Object runConcurrently) {
            return runConcurrently(Output.of(runConcurrently));
        }

        /**
         * @param sinks (Deprecated. Please use Queries). List of Power Query activity sinks mapped to a queryName.
         * 
         * @return builder
         * 
         */
        public Builder sinks(@Nullable Output<Map<String,PowerQuerySinkArgs>> sinks) {
            $.sinks = sinks;
            return this;
        }

        /**
         * @param sinks (Deprecated. Please use Queries). List of Power Query activity sinks mapped to a queryName.
         * 
         * @return builder
         * 
         */
        public Builder sinks(Map<String,PowerQuerySinkArgs> sinks) {
            return sinks(Output.of(sinks));
        }

        /**
         * @param staging Staging info for execute data flow activity.
         * 
         * @return builder
         * 
         */
        public Builder staging(@Nullable Output<DataFlowStagingInfoArgs> staging) {
            $.staging = staging;
            return this;
        }

        /**
         * @param staging Staging info for execute data flow activity.
         * 
         * @return builder
         * 
         */
        public Builder staging(DataFlowStagingInfoArgs staging) {
            return staging(Output.of(staging));
        }

        /**
         * @param traceLevel Trace level setting used for data flow monitoring output. Supported values are: &#39;coarse&#39;, &#39;fine&#39;, and &#39;none&#39;. Type: string (or Expression with resultType string)
         * 
         * @return builder
         * 
         */
        public Builder traceLevel(@Nullable Output<Object> traceLevel) {
            $.traceLevel = traceLevel;
            return this;
        }

        /**
         * @param traceLevel Trace level setting used for data flow monitoring output. Supported values are: &#39;coarse&#39;, &#39;fine&#39;, and &#39;none&#39;. Type: string (or Expression with resultType string)
         * 
         * @return builder
         * 
         */
        public Builder traceLevel(Object traceLevel) {
            return traceLevel(Output.of(traceLevel));
        }

        /**
         * @param type Type of activity.
         * Expected value is &#39;ExecuteWranglingDataflow&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of activity.
         * Expected value is &#39;ExecuteWranglingDataflow&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            $.userProperties = userProperties;
            return this;
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(List<UserPropertyArgs> userProperties) {
            return userProperties(Output.of(userProperties));
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }

        public ExecuteWranglingDataflowActivityArgs build() {
            $.dataFlow = Objects.requireNonNull($.dataFlow, "expected parameter 'dataFlow' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
