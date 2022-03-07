// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of a overridable value that can be passed to a task template.
 * 
 */
public final class SetValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final SetValueArgs Empty = new SetValueArgs();

    /**
     * Flag to indicate whether the value represents a secret or not.
     * 
     */
    @InputImport(name="isSecret")
      private final @Nullable Input<Boolean> isSecret;

    public Input<Boolean> getIsSecret() {
        return this.isSecret == null ? Input.empty() : this.isSecret;
    }

    /**
     * The name of the overridable value.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The overridable value.
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public SetValueArgs(
        @Nullable Input<Boolean> isSecret,
        Input<String> name,
        Input<String> value) {
        this.isSecret = isSecret == null ? Input.ofNullable(false) : isSecret;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private SetValueArgs() {
        this.isSecret = Input.empty();
        this.name = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SetValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isSecret;
        private Input<String> name;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SetValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isSecret = defaults.isSecret;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setIsSecret(@Nullable Input<Boolean> isSecret) {
            this.isSecret = isSecret;
            return this;
        }

        public Builder setIsSecret(@Nullable Boolean isSecret) {
            this.isSecret = Input.ofNullable(isSecret);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public SetValueArgs build() {
            return new SetValueArgs(isSecret, name, value);
        }
    }
}