// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder;

import io.pulumi.awsnative.amplifyuibuilder.inputs.ThemeTagsArgs;
import io.pulumi.awsnative.amplifyuibuilder.inputs.ThemeValuesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThemeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThemeArgs Empty = new ThemeArgs();

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="overrides")
    private final @Nullable Input<List<ThemeValuesArgs>> overrides;

    public Input<List<ThemeValuesArgs>> getOverrides() {
        return this.overrides == null ? Input.empty() : this.overrides;
    }

    @InputImport(name="tags")
    private final @Nullable Input<ThemeTagsArgs> tags;

    public Input<ThemeTagsArgs> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="values", required=true)
    private final Input<List<ThemeValuesArgs>> values;

    public Input<List<ThemeValuesArgs>> getValues() {
        return this.values;
    }

    public ThemeArgs(
        @Nullable Input<String> name,
        @Nullable Input<List<ThemeValuesArgs>> overrides,
        @Nullable Input<ThemeTagsArgs> tags,
        Input<List<ThemeValuesArgs>> values) {
        this.name = name;
        this.overrides = overrides;
        this.tags = tags;
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private ThemeArgs() {
        this.name = Input.empty();
        this.overrides = Input.empty();
        this.tags = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<List<ThemeValuesArgs>> overrides;
        private @Nullable Input<ThemeTagsArgs> tags;
        private Input<List<ThemeValuesArgs>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.overrides = defaults.overrides;
    	      this.tags = defaults.tags;
    	      this.values = defaults.values;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOverrides(@Nullable Input<List<ThemeValuesArgs>> overrides) {
            this.overrides = overrides;
            return this;
        }

        public Builder setOverrides(@Nullable List<ThemeValuesArgs> overrides) {
            this.overrides = Input.ofNullable(overrides);
            return this;
        }

        public Builder setTags(@Nullable Input<ThemeTagsArgs> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable ThemeTagsArgs tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setValues(Input<List<ThemeValuesArgs>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder setValues(List<ThemeValuesArgs> values) {
            this.values = Input.of(Objects.requireNonNull(values));
            return this;
        }

        public ThemeArgs build() {
            return new ThemeArgs(name, overrides, tags, values);
        }
    }
}
