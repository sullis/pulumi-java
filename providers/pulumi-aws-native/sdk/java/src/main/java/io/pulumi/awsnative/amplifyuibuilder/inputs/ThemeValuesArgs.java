// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder.inputs;

import io.pulumi.awsnative.amplifyuibuilder.inputs.ThemeValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThemeValuesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThemeValuesArgs Empty = new ThemeValuesArgs();

    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    @InputImport(name="value")
    private final @Nullable Input<ThemeValueArgs> value;

    public Input<ThemeValueArgs> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public ThemeValuesArgs(
        @Nullable Input<String> key,
        @Nullable Input<ThemeValueArgs> value) {
        this.key = key;
        this.value = value;
    }

    private ThemeValuesArgs() {
        this.key = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeValuesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> key;
        private @Nullable Input<ThemeValueArgs> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeValuesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setValue(@Nullable Input<ThemeValueArgs> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable ThemeValueArgs value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public ThemeValuesArgs build() {
            return new ThemeValuesArgs(key, value);
        }
    }
}
