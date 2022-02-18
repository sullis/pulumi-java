// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SetVariableActivityResponse {
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
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Type of activity.
     * Expected value is 'SetVariable'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;
    /**
     * Value to be set. Could be a static value or Expression
     * 
     */
    private final @Nullable Object value;
    /**
     * Name of the variable whose value needs to be set.
     * 
     */
    private final @Nullable String variableName;

    @OutputCustomType.Constructor({"dependsOn","description","name","type","userProperties","value","variableName"})
    private SetVariableActivityResponse(
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        String name,
        String type,
        @Nullable List<UserPropertyResponse> userProperties,
        @Nullable Object value,
        @Nullable String variableName) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
        this.userProperties = userProperties;
        this.value = value;
        this.variableName = variableName;
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
     * Activity name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Type of activity.
     * Expected value is 'SetVariable'.
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
    /**
     * Value to be set. Could be a static value or Expression
     * 
     */
    public Optional<Object> getValue() {
        return Optional.ofNullable(this.value);
    }
    /**
     * Name of the variable whose value needs to be set.
     * 
     */
    public Optional<String> getVariableName() {
        return Optional.ofNullable(this.variableName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SetVariableActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private String name;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;
        private @Nullable Object value;
        private @Nullable String variableName;

        public Builder() {
    	      // Empty
        }

        public Builder(SetVariableActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.value = defaults.value;
    	      this.variableName = defaults.variableName;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
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

        public Builder setValue(@Nullable Object value) {
            this.value = value;
            return this;
        }

        public Builder setVariableName(@Nullable String variableName) {
            this.variableName = variableName;
            return this;
        }

        public SetVariableActivityResponse build() {
            return new SetVariableActivityResponse(dependsOn, description, name, type, userProperties, value, variableName);
        }
    }
}
