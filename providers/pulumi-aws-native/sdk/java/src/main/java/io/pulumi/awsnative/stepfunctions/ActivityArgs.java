// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions;

import io.pulumi.awsnative.stepfunctions.inputs.ActivityTagsEntryArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ActivityArgs Empty = new ActivityArgs();

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<ActivityTagsEntryArgs>> tags;

    public Input<List<ActivityTagsEntryArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ActivityArgs(
        @Nullable Input<String> name,
        @Nullable Input<List<ActivityTagsEntryArgs>> tags) {
        this.name = name;
        this.tags = tags;
    }

    private ActivityArgs() {
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<List<ActivityTagsEntryArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTags(@Nullable Input<List<ActivityTagsEntryArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ActivityTagsEntryArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ActivityArgs build() {
            return new ActivityArgs(name, tags);
        }
    }
}
