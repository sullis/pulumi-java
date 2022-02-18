// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The environment variable to pass to the script in the container instance.
 * 
 */
public final class EnvironmentVariableResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnvironmentVariableResponse Empty = new EnvironmentVariableResponse();

    /**
     * The name of the environment variable.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The value of the secure environment variable.
     * 
     */
    @InputImport(name="secureValue")
    private final @Nullable String secureValue;

    public Optional<String> getSecureValue() {
        return this.secureValue == null ? Optional.empty() : Optional.ofNullable(this.secureValue);
    }

    /**
     * The value of the environment variable.
     * 
     */
    @InputImport(name="value")
    private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public EnvironmentVariableResponse(
        String name,
        @Nullable String secureValue,
        @Nullable String value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.secureValue = secureValue;
        this.value = value;
    }

    private EnvironmentVariableResponse() {
        this.name = null;
        this.secureValue = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentVariableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String secureValue;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentVariableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secureValue = defaults.secureValue;
    	      this.value = defaults.value;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSecureValue(@Nullable String secureValue) {
            this.secureValue = secureValue;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public EnvironmentVariableResponse build() {
            return new EnvironmentVariableResponse(name, secureValue, value);
        }
    }
}
