// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RunCommandInputParameterResponse {
    /**
     * The run command parameter name.
     * 
     */
    private final String name;
    /**
     * The run command parameter value.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"name","value"})
    private RunCommandInputParameterResponse(
        String name,
        String value) {
        this.name = Objects.requireNonNull(name);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The run command parameter name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The run command parameter value.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunCommandInputParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(RunCommandInputParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public RunCommandInputParameterResponse build() {
            return new RunCommandInputParameterResponse(name, value);
        }
    }
}