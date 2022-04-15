// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagOptionState extends io.pulumi.resources.ResourceArgs {

    public static final TagOptionState Empty = new TagOptionState();

    /**
     * Whether tag option is active. Default is `true`.
     * 
     */
    @Import(name="active")
      private final @Nullable Output<Boolean> active;

    public Output<Boolean> active() {
        return this.active == null ? Codegen.empty() : this.active;
    }

    /**
     * Tag option key.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> key() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    @Import(name="owner")
      private final @Nullable Output<String> owner;

    public Output<String> owner() {
        return this.owner == null ? Codegen.empty() : this.owner;
    }

    /**
     * Tag option value.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public TagOptionState(
        @Nullable Output<Boolean> active,
        @Nullable Output<String> key,
        @Nullable Output<String> owner,
        @Nullable Output<String> value) {
        this.active = active;
        this.key = key;
        this.owner = owner;
        this.value = value;
    }

    private TagOptionState() {
        this.active = Codegen.empty();
        this.key = Codegen.empty();
        this.owner = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagOptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> active;
        private @Nullable Output<String> key;
        private @Nullable Output<String> owner;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TagOptionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.key = defaults.key;
    	      this.owner = defaults.owner;
    	      this.value = defaults.value;
        }

        public Builder active(@Nullable Output<Boolean> active) {
            this.active = active;
            return this;
        }
        public Builder active(@Nullable Boolean active) {
            this.active = Codegen.ofNullable(active);
            return this;
        }
        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder owner(@Nullable Output<String> owner) {
            this.owner = owner;
            return this;
        }
        public Builder owner(@Nullable String owner) {
            this.owner = Codegen.ofNullable(owner);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public TagOptionState build() {
            return new TagOptionState(active, key, owner, value);
        }
    }
}
