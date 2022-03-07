// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.DataFlowReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.DataFlowStagingInfoResponse;
import io.pulumi.azurenative.datafactory.outputs.ExecuteDataFlowActivityTypePropertiesResponseCompute;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.PowerQuerySinkMappingResponse;
import io.pulumi.azurenative.datafactory.outputs.PowerQuerySinkResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExecuteWranglingDataflowActivityResponse {
    /**
     * Compute properties for data flow activity.
     * 
     */
    private final @Nullable ExecuteDataFlowActivityTypePropertiesResponseCompute compute;
    /**
     * Continue on error setting used for data flow execution. Enables processing to continue if a sink fails. Type: boolean (or Expression with resultType boolean)
     * 
     */
    private final @Nullable Object continueOnError;
    /**
     * Data flow reference.
     * 
     */
    private final DataFlowReferenceResponse dataFlow;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * The integration runtime reference.
     * 
     */
    private final @Nullable IntegrationRuntimeReferenceResponse integrationRuntime;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Activity policy.
     * 
     */
    private final @Nullable ActivityPolicyResponse policy;
    /**
     * List of mapping for Power Query mashup query to sink dataset(s).
     * 
     */
    private final @Nullable List<PowerQuerySinkMappingResponse> queries;
    /**
     * Concurrent run setting used for data flow execution. Allows sinks with the same save order to be processed concurrently. Type: boolean (or Expression with resultType boolean)
     * 
     */
    private final @Nullable Object runConcurrently;
    /**
     * (Deprecated. Please use Queries). List of Power Query activity sinks mapped to a queryName.
     * 
     */
    private final @Nullable Map<String,PowerQuerySinkResponse> sinks;
    /**
     * Staging info for execute data flow activity.
     * 
     */
    private final @Nullable DataFlowStagingInfoResponse staging;
    /**
     * Trace level setting used for data flow monitoring output. Supported values are: 'coarse', 'fine', and 'none'. Type: string (or Expression with resultType string)
     * 
     */
    private final @Nullable Object traceLevel;
    /**
     * Type of activity.
     * Expected value is 'ExecuteWranglingDataflow'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @OutputCustomType.Constructor({"compute","continueOnError","dataFlow","dependsOn","description","integrationRuntime","name","policy","queries","runConcurrently","sinks","staging","traceLevel","type","userProperties"})
    private ExecuteWranglingDataflowActivityResponse(
        @Nullable ExecuteDataFlowActivityTypePropertiesResponseCompute compute,
        @Nullable Object continueOnError,
        DataFlowReferenceResponse dataFlow,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable IntegrationRuntimeReferenceResponse integrationRuntime,
        String name,
        @Nullable ActivityPolicyResponse policy,
        @Nullable List<PowerQuerySinkMappingResponse> queries,
        @Nullable Object runConcurrently,
        @Nullable Map<String,PowerQuerySinkResponse> sinks,
        @Nullable DataFlowStagingInfoResponse staging,
        @Nullable Object traceLevel,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.compute = compute;
        this.continueOnError = continueOnError;
        this.dataFlow = Objects.requireNonNull(dataFlow);
        this.dependsOn = dependsOn;
        this.description = description;
        this.integrationRuntime = integrationRuntime;
        this.name = Objects.requireNonNull(name);
        this.policy = policy;
        this.queries = queries;
        this.runConcurrently = runConcurrently;
        this.sinks = sinks;
        this.staging = staging;
        this.traceLevel = traceLevel;
        this.type = Objects.requireNonNull(type);
        this.userProperties = userProperties;
    }

    /**
     * Compute properties for data flow activity.
     * 
    */
    public Optional<ExecuteDataFlowActivityTypePropertiesResponseCompute> getCompute() {
        return Optional.ofNullable(this.compute);
    }
    /**
     * Continue on error setting used for data flow execution. Enables processing to continue if a sink fails. Type: boolean (or Expression with resultType boolean)
     * 
    */
    public Optional<Object> getContinueOnError() {
        return Optional.ofNullable(this.continueOnError);
    }
    /**
     * Data flow reference.
     * 
    */
    public DataFlowReferenceResponse getDataFlow() {
        return this.dataFlow;
    }
    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The integration runtime reference.
     * 
    */
    public Optional<IntegrationRuntimeReferenceResponse> getIntegrationRuntime() {
        return Optional.ofNullable(this.integrationRuntime);
    }
    /**
     * Activity name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Activity policy.
     * 
    */
    public Optional<ActivityPolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * List of mapping for Power Query mashup query to sink dataset(s).
     * 
    */
    public List<PowerQuerySinkMappingResponse> getQueries() {
        return this.queries == null ? List.of() : this.queries;
    }
    /**
     * Concurrent run setting used for data flow execution. Allows sinks with the same save order to be processed concurrently. Type: boolean (or Expression with resultType boolean)
     * 
    */
    public Optional<Object> getRunConcurrently() {
        return Optional.ofNullable(this.runConcurrently);
    }
    /**
     * (Deprecated. Please use Queries). List of Power Query activity sinks mapped to a queryName.
     * 
    */
    public Map<String,PowerQuerySinkResponse> getSinks() {
        return this.sinks == null ? Map.of() : this.sinks;
    }
    /**
     * Staging info for execute data flow activity.
     * 
    */
    public Optional<DataFlowStagingInfoResponse> getStaging() {
        return Optional.ofNullable(this.staging);
    }
    /**
     * Trace level setting used for data flow monitoring output. Supported values are: 'coarse', 'fine', and 'none'. Type: string (or Expression with resultType string)
     * 
    */
    public Optional<Object> getTraceLevel() {
        return Optional.ofNullable(this.traceLevel);
    }
    /**
     * Type of activity.
     * Expected value is 'ExecuteWranglingDataflow'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecuteWranglingDataflowActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExecuteDataFlowActivityTypePropertiesResponseCompute compute;
        private @Nullable Object continueOnError;
        private DataFlowReferenceResponse dataFlow;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable IntegrationRuntimeReferenceResponse integrationRuntime;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable List<PowerQuerySinkMappingResponse> queries;
        private @Nullable Object runConcurrently;
        private @Nullable Map<String,PowerQuerySinkResponse> sinks;
        private @Nullable DataFlowStagingInfoResponse staging;
        private @Nullable Object traceLevel;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecuteWranglingDataflowActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compute = defaults.compute;
    	      this.continueOnError = defaults.continueOnError;
    	      this.dataFlow = defaults.dataFlow;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.integrationRuntime = defaults.integrationRuntime;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.queries = defaults.queries;
    	      this.runConcurrently = defaults.runConcurrently;
    	      this.sinks = defaults.sinks;
    	      this.staging = defaults.staging;
    	      this.traceLevel = defaults.traceLevel;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setCompute(@Nullable ExecuteDataFlowActivityTypePropertiesResponseCompute compute) {
            this.compute = compute;
            return this;
        }

        public Builder setContinueOnError(@Nullable Object continueOnError) {
            this.continueOnError = continueOnError;
            return this;
        }

        public Builder setDataFlow(DataFlowReferenceResponse dataFlow) {
            this.dataFlow = Objects.requireNonNull(dataFlow);
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setIntegrationRuntime(@Nullable IntegrationRuntimeReferenceResponse integrationRuntime) {
            this.integrationRuntime = integrationRuntime;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder setQueries(@Nullable List<PowerQuerySinkMappingResponse> queries) {
            this.queries = queries;
            return this;
        }

        public Builder setRunConcurrently(@Nullable Object runConcurrently) {
            this.runConcurrently = runConcurrently;
            return this;
        }

        public Builder setSinks(@Nullable Map<String,PowerQuerySinkResponse> sinks) {
            this.sinks = sinks;
            return this;
        }

        public Builder setStaging(@Nullable DataFlowStagingInfoResponse staging) {
            this.staging = staging;
            return this;
        }

        public Builder setTraceLevel(@Nullable Object traceLevel) {
            this.traceLevel = traceLevel;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public ExecuteWranglingDataflowActivityResponse build() {
            return new ExecuteWranglingDataflowActivityResponse(compute, continueOnError, dataFlow, dependsOn, description, integrationRuntime, name, policy, queries, runConcurrently, sinks, staging, traceLevel, type, userProperties);
        }
    }
}