// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.greengrassv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ComponentVersionComponentPlatform {
    private final @Nullable Object attributes;
    private final @Nullable String name;

    @OutputCustomType.Constructor({"attributes","name"})
    private ComponentVersionComponentPlatform(
        @Nullable Object attributes,
        @Nullable String name) {
        this.attributes = attributes;
        this.name = name;
    }

    public Optional<Object> getAttributes() {
        return Optional.ofNullable(this.attributes);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentVersionComponentPlatform defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object attributes;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentVersionComponentPlatform defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.name = defaults.name;
        }

        public Builder setAttributes(@Nullable Object attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public ComponentVersionComponentPlatform build() {
            return new ComponentVersionComponentPlatform(attributes, name);
        }
    }
}
