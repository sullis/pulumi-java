// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Data Lake Analytics U-SQL activity.
 * 
 */
public final class DataLakeAnalyticsUSQLActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataLakeAnalyticsUSQLActivityResponse Empty = new DataLakeAnalyticsUSQLActivityResponse();

    /**
     * Compilation mode of U-SQL. Must be one of these values : Semantic, Full and SingleBox. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="compilationMode")
    private final @Nullable Object compilationMode;

    public Optional<Object> getCompilationMode() {
        return this.compilationMode == null ? Optional.empty() : Optional.ofNullable(this.compilationMode);
    }

    /**
     * The maximum number of nodes simultaneously used to run the job. Default value is 1. Type: integer (or Expression with resultType integer), minimum: 1.
     * 
     */
    @InputImport(name="degreeOfParallelism")
    private final @Nullable Object degreeOfParallelism;

    public Optional<Object> getDegreeOfParallelism() {
        return this.degreeOfParallelism == null ? Optional.empty() : Optional.ofNullable(this.degreeOfParallelism);
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
    private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName")
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;

    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return this.linkedServiceName == null ? Optional.empty() : Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Parameters for U-SQL job request.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Map<String,Object> parameters;

    public Map<String,Object> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * Activity policy.
     * 
     */
    @InputImport(name="policy")
    private final @Nullable ActivityPolicyResponse policy;

    public Optional<ActivityPolicyResponse> getPolicy() {
        return this.policy == null ? Optional.empty() : Optional.ofNullable(this.policy);
    }

    /**
     * Determines which jobs out of all that are queued should be selected to run first. The lower the number, the higher the priority. Default value is 1000. Type: integer (or Expression with resultType integer), minimum: 1.
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Object priority;

    public Optional<Object> getPriority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    /**
     * Runtime version of the U-SQL engine to use. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="runtimeVersion")
    private final @Nullable Object runtimeVersion;

    public Optional<Object> getRuntimeVersion() {
        return this.runtimeVersion == null ? Optional.empty() : Optional.ofNullable(this.runtimeVersion);
    }

    /**
     * Script linked service reference.
     * 
     */
    @InputImport(name="scriptLinkedService", required=true)
    private final LinkedServiceReferenceResponse scriptLinkedService;

    public LinkedServiceReferenceResponse getScriptLinkedService() {
        return this.scriptLinkedService;
    }

    /**
     * Case-sensitive path to folder that contains the U-SQL script. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="scriptPath", required=true)
    private final Object scriptPath;

    public Object getScriptPath() {
        return this.scriptPath;
    }

    /**
     * Type of activity.
     * Expected value is 'DataLakeAnalyticsU-SQL'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
    private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public DataLakeAnalyticsUSQLActivityResponse(
        @Nullable Object compilationMode,
        @Nullable Object degreeOfParallelism,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        String name,
        @Nullable Map<String,Object> parameters,
        @Nullable ActivityPolicyResponse policy,
        @Nullable Object priority,
        @Nullable Object runtimeVersion,
        LinkedServiceReferenceResponse scriptLinkedService,
        Object scriptPath,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.compilationMode = compilationMode;
        this.degreeOfParallelism = degreeOfParallelism;
        this.dependsOn = dependsOn;
        this.description = description;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = parameters;
        this.policy = policy;
        this.priority = priority;
        this.runtimeVersion = runtimeVersion;
        this.scriptLinkedService = Objects.requireNonNull(scriptLinkedService, "expected parameter 'scriptLinkedService' to be non-null");
        this.scriptPath = Objects.requireNonNull(scriptPath, "expected parameter 'scriptPath' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private DataLakeAnalyticsUSQLActivityResponse() {
        this.compilationMode = null;
        this.degreeOfParallelism = null;
        this.dependsOn = List.of();
        this.description = null;
        this.linkedServiceName = null;
        this.name = null;
        this.parameters = Map.of();
        this.policy = null;
        this.priority = null;
        this.runtimeVersion = null;
        this.scriptLinkedService = null;
        this.scriptPath = null;
        this.type = null;
        this.userProperties = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeAnalyticsUSQLActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object compilationMode;
        private @Nullable Object degreeOfParallelism;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private @Nullable Map<String,Object> parameters;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable Object priority;
        private @Nullable Object runtimeVersion;
        private LinkedServiceReferenceResponse scriptLinkedService;
        private Object scriptPath;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(DataLakeAnalyticsUSQLActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compilationMode = defaults.compilationMode;
    	      this.degreeOfParallelism = defaults.degreeOfParallelism;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.policy = defaults.policy;
    	      this.priority = defaults.priority;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.scriptLinkedService = defaults.scriptLinkedService;
    	      this.scriptPath = defaults.scriptPath;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setCompilationMode(@Nullable Object compilationMode) {
            this.compilationMode = compilationMode;
            return this;
        }

        public Builder setDegreeOfParallelism(@Nullable Object degreeOfParallelism) {
            this.degreeOfParallelism = degreeOfParallelism;
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

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(@Nullable Map<String,Object> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPriority(@Nullable Object priority) {
            this.priority = priority;
            return this;
        }

        public Builder setRuntimeVersion(@Nullable Object runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }

        public Builder setScriptLinkedService(LinkedServiceReferenceResponse scriptLinkedService) {
            this.scriptLinkedService = Objects.requireNonNull(scriptLinkedService);
            return this;
        }

        public Builder setScriptPath(Object scriptPath) {
            this.scriptPath = Objects.requireNonNull(scriptPath);
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

        public DataLakeAnalyticsUSQLActivityResponse build() {
            return new DataLakeAnalyticsUSQLActivityResponse(compilationMode, degreeOfParallelism, dependsOn, description, linkedServiceName, name, parameters, policy, priority, runtimeVersion, scriptLinkedService, scriptPath, type, userProperties);
        }
    }
}
