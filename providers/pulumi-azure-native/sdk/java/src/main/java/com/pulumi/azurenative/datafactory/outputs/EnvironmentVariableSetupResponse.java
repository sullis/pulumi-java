// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EnvironmentVariableSetupResponse {
    /**
     * @return The type of custom setup.
     * Expected value is &#39;EnvironmentVariableSetup&#39;.
     * 
     */
    private final String type;
    /**
     * @return The name of the environment variable.
     * 
     */
    private final String variableName;
    /**
     * @return The value of the environment variable.
     * 
     */
    private final String variableValue;

    @CustomType.Constructor
    private EnvironmentVariableSetupResponse(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("variableName") String variableName,
        @CustomType.Parameter("variableValue") String variableValue) {
        this.type = type;
        this.variableName = variableName;
        this.variableValue = variableValue;
    }

    /**
     * @return The type of custom setup.
     * Expected value is &#39;EnvironmentVariableSetup&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The name of the environment variable.
     * 
     */
    public String variableName() {
        return this.variableName;
    }
    /**
     * @return The value of the environment variable.
     * 
     */
    public String variableValue() {
        return this.variableValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentVariableSetupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String variableName;
        private String variableValue;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentVariableSetupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.variableName = defaults.variableName;
    	      this.variableValue = defaults.variableValue;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder variableName(String variableName) {
            this.variableName = Objects.requireNonNull(variableName);
            return this;
        }
        public Builder variableValue(String variableValue) {
            this.variableValue = Objects.requireNonNull(variableValue);
            return this;
        }        public EnvironmentVariableSetupResponse build() {
            return new EnvironmentVariableSetupResponse(type, variableName, variableValue);
        }
    }
}
