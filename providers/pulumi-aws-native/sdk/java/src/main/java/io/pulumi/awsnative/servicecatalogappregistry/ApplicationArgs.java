// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalogappregistry;

import io.pulumi.awsnative.servicecatalogappregistry.inputs.ApplicationTagsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="tags")
    private final @Nullable Input<ApplicationTagsArgs> tags;

    public Input<ApplicationTagsArgs> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ApplicationArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<ApplicationTagsArgs> tags) {
        this.description = description;
        this.name = name;
        this.tags = tags;
    }

    private ApplicationArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<ApplicationTagsArgs> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTags(@Nullable Input<ApplicationTagsArgs> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable ApplicationTagsArgs tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ApplicationArgs build() {
            return new ApplicationArgs(description, name, tags);
        }
    }
}
