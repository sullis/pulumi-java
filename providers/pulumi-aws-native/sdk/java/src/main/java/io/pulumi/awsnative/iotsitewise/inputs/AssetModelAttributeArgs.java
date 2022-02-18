// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssetModelAttributeArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssetModelAttributeArgs Empty = new AssetModelAttributeArgs();

    @InputImport(name="defaultValue")
    private final @Nullable Input<String> defaultValue;

    public Input<String> getDefaultValue() {
        return this.defaultValue == null ? Input.empty() : this.defaultValue;
    }

    public AssetModelAttributeArgs(@Nullable Input<String> defaultValue) {
        this.defaultValue = defaultValue;
    }

    private AssetModelAttributeArgs() {
        this.defaultValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelAttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> defaultValue;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelAttributeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
        }

        public Builder setDefaultValue(@Nullable Input<String> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder setDefaultValue(@Nullable String defaultValue) {
            this.defaultValue = Input.ofNullable(defaultValue);
            return this;
        }

        public AssetModelAttributeArgs build() {
            return new AssetModelAttributeArgs(defaultValue);
        }
    }
}
