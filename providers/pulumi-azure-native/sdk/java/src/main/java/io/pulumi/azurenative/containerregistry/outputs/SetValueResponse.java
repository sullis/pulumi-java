// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SetValueResponse {
    /**
     * Flag to indicate whether the value represents a secret or not.
     * 
     */
    private final @Nullable Boolean isSecret;
    /**
     * The name of the overridable value.
     * 
     */
    private final String name;
    /**
     * The overridable value.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"isSecret","name","value"})
    private SetValueResponse(
        @Nullable Boolean isSecret,
        String name,
        String value) {
        this.isSecret = isSecret;
        this.name = Objects.requireNonNull(name);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Flag to indicate whether the value represents a secret or not.
     * 
     */
    public Optional<Boolean> getIsSecret() {
        return Optional.ofNullable(this.isSecret);
    }
    /**
     * The name of the overridable value.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The overridable value.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SetValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isSecret;
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SetValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isSecret = defaults.isSecret;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setIsSecret(@Nullable Boolean isSecret) {
            this.isSecret = isSecret;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public SetValueResponse build() {
            return new SetValueResponse(isSecret, name, value);
        }
    }
}
