// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a overridable value that can be passed to a task template.
 * 
 */
public final class SetValueResponse extends io.pulumi.resources.InvokeArgs {

    public static final SetValueResponse Empty = new SetValueResponse();

    /**
     * Flag to indicate whether the value represents a secret or not.
     * 
     */
    @InputImport(name="isSecret")
      private final @Nullable Boolean isSecret;

    public Optional<Boolean> getIsSecret() {
        return this.isSecret == null ? Optional.empty() : Optional.ofNullable(this.isSecret);
    }

    /**
     * The name of the overridable value.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The overridable value.
     * 
     */
    @InputImport(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public SetValueResponse(
        @Nullable Boolean isSecret,
        String name,
        String value) {
        this.isSecret = isSecret == null ? false : isSecret;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private SetValueResponse() {
        this.isSecret = null;
        this.name = null;
        this.value = null;
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