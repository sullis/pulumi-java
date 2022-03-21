// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScriptSecureStringExecutionParameterResponse {
    /**
     * The parameter name
     * 
     */
    private final String name;
    /**
     * A secure value for the passed parameter, not to be stored in logs
     * 
     */
    private final @Nullable String secureValue;
    /**
     * The type of execution parameter
     * Expected value is 'SecureValue'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ScriptSecureStringExecutionParameterResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("secureValue") @Nullable String secureValue,
        @CustomType.Parameter("type") String type) {
        this.name = name;
        this.secureValue = secureValue;
        this.type = type;
    }

    /**
     * The parameter name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A secure value for the passed parameter, not to be stored in logs
     * 
    */
    public Optional<String> getSecureValue() {
        return Optional.ofNullable(this.secureValue);
    }
    /**
     * The type of execution parameter
     * Expected value is 'SecureValue'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptSecureStringExecutionParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable String secureValue;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptSecureStringExecutionParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secureValue = defaults.secureValue;
    	      this.type = defaults.type;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder secureValue(@Nullable String secureValue) {
            this.secureValue = secureValue;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ScriptSecureStringExecutionParameterResponse build() {
            return new ScriptSecureStringExecutionParameterResponse(name, secureValue, type);
        }
    }
}
