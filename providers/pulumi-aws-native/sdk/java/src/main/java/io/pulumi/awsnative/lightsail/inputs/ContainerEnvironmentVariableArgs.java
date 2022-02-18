// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerEnvironmentVariableArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerEnvironmentVariableArgs Empty = new ContainerEnvironmentVariableArgs();

    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    @InputImport(name="variable")
    private final @Nullable Input<String> variable;

    public Input<String> getVariable() {
        return this.variable == null ? Input.empty() : this.variable;
    }

    public ContainerEnvironmentVariableArgs(
        @Nullable Input<String> value,
        @Nullable Input<String> variable) {
        this.value = value;
        this.variable = variable;
    }

    private ContainerEnvironmentVariableArgs() {
        this.value = Input.empty();
        this.variable = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerEnvironmentVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> value;
        private @Nullable Input<String> variable;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerEnvironmentVariableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
    	      this.variable = defaults.variable;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public Builder setVariable(@Nullable Input<String> variable) {
            this.variable = variable;
            return this;
        }

        public Builder setVariable(@Nullable String variable) {
            this.variable = Input.ofNullable(variable);
            return this;
        }

        public ContainerEnvironmentVariableArgs build() {
            return new ContainerEnvironmentVariableArgs(value, variable);
        }
    }
}
