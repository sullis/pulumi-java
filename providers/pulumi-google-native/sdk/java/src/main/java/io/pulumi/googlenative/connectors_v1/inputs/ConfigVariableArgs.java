// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.connectors_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.connectors_v1.inputs.SecretArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ConfigVariable represents a configuration variable present in a Connection. or AuthConfig.
 * 
 */
public final class ConfigVariableArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigVariableArgs Empty = new ConfigVariableArgs();

    /**
     * Value is a bool.
     * 
     */
    @InputImport(name="boolValue")
      private final @Nullable Input<Boolean> boolValue;

    public Input<Boolean> getBoolValue() {
        return this.boolValue == null ? Input.empty() : this.boolValue;
    }

    /**
     * Value is an integer
     * 
     */
    @InputImport(name="intValue")
      private final @Nullable Input<String> intValue;

    public Input<String> getIntValue() {
        return this.intValue == null ? Input.empty() : this.intValue;
    }

    /**
     * Key of the config variable.
     * 
     */
    @InputImport(name="key")
      private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * Value is a secret.
     * 
     */
    @InputImport(name="secretValue")
      private final @Nullable Input<SecretArgs> secretValue;

    public Input<SecretArgs> getSecretValue() {
        return this.secretValue == null ? Input.empty() : this.secretValue;
    }

    /**
     * Value is a string.
     * 
     */
    @InputImport(name="stringValue")
      private final @Nullable Input<String> stringValue;

    public Input<String> getStringValue() {
        return this.stringValue == null ? Input.empty() : this.stringValue;
    }

    public ConfigVariableArgs(
        @Nullable Input<Boolean> boolValue,
        @Nullable Input<String> intValue,
        @Nullable Input<String> key,
        @Nullable Input<SecretArgs> secretValue,
        @Nullable Input<String> stringValue) {
        this.boolValue = boolValue;
        this.intValue = intValue;
        this.key = key;
        this.secretValue = secretValue;
        this.stringValue = stringValue;
    }

    private ConfigVariableArgs() {
        this.boolValue = Input.empty();
        this.intValue = Input.empty();
        this.key = Input.empty();
        this.secretValue = Input.empty();
        this.stringValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> boolValue;
        private @Nullable Input<String> intValue;
        private @Nullable Input<String> key;
        private @Nullable Input<SecretArgs> secretValue;
        private @Nullable Input<String> stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigVariableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boolValue = defaults.boolValue;
    	      this.intValue = defaults.intValue;
    	      this.key = defaults.key;
    	      this.secretValue = defaults.secretValue;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder setBoolValue(@Nullable Input<Boolean> boolValue) {
            this.boolValue = boolValue;
            return this;
        }

        public Builder setBoolValue(@Nullable Boolean boolValue) {
            this.boolValue = Input.ofNullable(boolValue);
            return this;
        }

        public Builder setIntValue(@Nullable Input<String> intValue) {
            this.intValue = intValue;
            return this;
        }

        public Builder setIntValue(@Nullable String intValue) {
            this.intValue = Input.ofNullable(intValue);
            return this;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setSecretValue(@Nullable Input<SecretArgs> secretValue) {
            this.secretValue = secretValue;
            return this;
        }

        public Builder setSecretValue(@Nullable SecretArgs secretValue) {
            this.secretValue = Input.ofNullable(secretValue);
            return this;
        }

        public Builder setStringValue(@Nullable Input<String> stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder setStringValue(@Nullable String stringValue) {
            this.stringValue = Input.ofNullable(stringValue);
            return this;
        }
        public ConfigVariableArgs build() {
            return new ConfigVariableArgs(boolValue, intValue, key, secretValue, stringValue);
        }
    }
}