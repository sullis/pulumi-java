// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigTag {
    private final @Nullable String key;
    private final @Nullable String value;

    @CustomType.Constructor
    private ConfigTag(
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("value") @Nullable String value) {
        this.key = key;
        this.value = value;
    }

    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public ConfigTag build() {
            return new ConfigTag(key, value);
        }
    }
}
