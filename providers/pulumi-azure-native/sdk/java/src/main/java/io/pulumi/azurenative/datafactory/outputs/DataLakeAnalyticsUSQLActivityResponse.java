// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
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
public final class DataLakeAnalyticsUSQLActivityResponse {
    /**
     * Compilation mode of U-SQL. Must be one of these values : Semantic, Full and SingleBox. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object compilationMode;
    /**
     * The maximum number of nodes simultaneously used to run the job. Default value is 1. Type: integer (or Expression with resultType integer), minimum: 1.
     * 
     */
    private final @Nullable Object degreeOfParallelism;
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
     * Linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Parameters for U-SQL job request.
     * 
     */
    private final @Nullable Map<String,Object> parameters;
    /**
     * Activity policy.
     * 
     */
    private final @Nullable ActivityPolicyResponse policy;
    /**
     * Determines which jobs out of all that are queued should be selected to run first. The lower the number, the higher the priority. Default value is 1000. Type: integer (or Expression with resultType integer), minimum: 1.
     * 
     */
    private final @Nullable Object priority;
    /**
     * Runtime version of the U-SQL engine to use. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object runtimeVersion;
    /**
     * Script linked service reference.
     * 
     */
    private final LinkedServiceReferenceResponse scriptLinkedService;
    /**
     * Case-sensitive path to folder that contains the U-SQL script. Type: string (or Expression with resultType string).
     * 
     */
    private final Object scriptPath;
    /**
     * Type of activity.
     * Expected value is 'DataLakeAnalyticsU-SQL'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @OutputCustomType.Constructor({"compilationMode","degreeOfParallelism","dependsOn","description","linkedServiceName","name","parameters","policy","priority","runtimeVersion","scriptLinkedService","scriptPath","type","userProperties"})
    private DataLakeAnalyticsUSQLActivityResponse(
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
        this.name = Objects.requireNonNull(name);
        this.parameters = parameters;
        this.policy = policy;
        this.priority = priority;
        this.runtimeVersion = runtimeVersion;
        this.scriptLinkedService = Objects.requireNonNull(scriptLinkedService);
        this.scriptPath = Objects.requireNonNull(scriptPath);
        this.type = Objects.requireNonNull(type);
        this.userProperties = userProperties;
    }

    /**
     * Compilation mode of U-SQL. Must be one of these values : Semantic, Full and SingleBox. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getCompilationMode() {
        return Optional.ofNullable(this.compilationMode);
    }
    /**
     * The maximum number of nodes simultaneously used to run the job. Default value is 1. Type: integer (or Expression with resultType integer), minimum: 1.
     * 
    */
    public Optional<Object> getDegreeOfParallelism() {
        return Optional.ofNullable(this.degreeOfParallelism);
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
     * Linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    /**
     * Activity name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Parameters for U-SQL job request.
     * 
    */
    public Map<String,Object> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Activity policy.
     * 
    */
    public Optional<ActivityPolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * Determines which jobs out of all that are queued should be selected to run first. The lower the number, the higher the priority. Default value is 1000. Type: integer (or Expression with resultType integer), minimum: 1.
     * 
    */
    public Optional<Object> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * Runtime version of the U-SQL engine to use. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getRuntimeVersion() {
        return Optional.ofNullable(this.runtimeVersion);
    }
    /**
     * Script linked service reference.
     * 
    */
    public LinkedServiceReferenceResponse getScriptLinkedService() {
        return this.scriptLinkedService;
    }
    /**
     * Case-sensitive path to folder that contains the U-SQL script. Type: string (or Expression with resultType string).
     * 
    */
    public Object getScriptPath() {
        return this.scriptPath;
    }
    /**
     * Type of activity.
     * Expected value is 'DataLakeAnalyticsU-SQL'.
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