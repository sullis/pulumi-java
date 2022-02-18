// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The custom setup of setting environment variable.
 * 
 */
public final class EnvironmentVariableSetupArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentVariableSetupArgs Empty = new EnvironmentVariableSetupArgs();

    /**
     * The type of custom setup.
     * Expected value is 'EnvironmentVariableSetup'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The name of the environment variable.
     * 
     */
    @InputImport(name="variableName", required=true)
    private final Input<String> variableName;

    public Input<String> getVariableName() {
        return this.variableName;
    }

    /**
     * The value of the environment variable.
     * 
     */
    @InputImport(name="variableValue", required=true)
    private final Input<String> variableValue;

    public Input<String> getVariableValue() {
        return this.variableValue;
    }

    public EnvironmentVariableSetupArgs(
        Input<String> type,
        Input<String> variableName,
        Input<String> variableValue) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.variableName = Objects.requireNonNull(variableName, "expected parameter 'variableName' to be non-null");
        this.variableValue = Objects.requireNonNull(variableValue, "expected parameter 'variableValue' to be non-null");
    }

    private EnvironmentVariableSetupArgs() {
        this.type = Input.empty();
        this.variableName = Input.empty();
        this.variableValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentVariableSetupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> type;
        private Input<String> variableName;
        private Input<String> variableValue;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentVariableSetupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.variableName = defaults.variableName;
    	      this.variableValue = defaults.variableValue;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setVariableName(Input<String> variableName) {
            this.variableName = Objects.requireNonNull(variableName);
            return this;
        }

        public Builder setVariableName(String variableName) {
            this.variableName = Input.of(Objects.requireNonNull(variableName));
            return this;
        }

        public Builder setVariableValue(Input<String> variableValue) {
            this.variableValue = Objects.requireNonNull(variableValue);
            return this;
        }

        public Builder setVariableValue(String variableValue) {
            this.variableValue = Input.of(Objects.requireNonNull(variableValue));
            return this;
        }

        public EnvironmentVariableSetupArgs build() {
            return new EnvironmentVariableSetupArgs(type, variableName, variableValue);
        }
    }
}
