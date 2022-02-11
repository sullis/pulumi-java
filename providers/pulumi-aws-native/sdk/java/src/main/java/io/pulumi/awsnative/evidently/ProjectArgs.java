// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently;

import io.pulumi.awsnative.evidently.inputs.ProjectDataDeliveryObjectArgs;
import io.pulumi.awsnative.evidently.inputs.ProjectTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    @InputImport(name="dataDelivery")
    private final @Nullable Input<ProjectDataDeliveryObjectArgs> dataDelivery;

    public Input<ProjectDataDeliveryObjectArgs> getDataDelivery() {
        return this.dataDelivery == null ? Input.empty() : this.dataDelivery;
    }

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
    private final @Nullable Input<List<ProjectTagArgs>> tags;

    public Input<List<ProjectTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ProjectArgs(
        @Nullable Input<ProjectDataDeliveryObjectArgs> dataDelivery,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<List<ProjectTagArgs>> tags) {
        this.dataDelivery = dataDelivery;
        this.description = description;
        this.name = name;
        this.tags = tags;
    }

    private ProjectArgs() {
        this.dataDelivery = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ProjectDataDeliveryObjectArgs> dataDelivery;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<List<ProjectTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDelivery = defaults.dataDelivery;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setDataDelivery(@Nullable Input<ProjectDataDeliveryObjectArgs> dataDelivery) {
            this.dataDelivery = dataDelivery;
            return this;
        }

        public Builder setDataDelivery(@Nullable ProjectDataDeliveryObjectArgs dataDelivery) {
            this.dataDelivery = Input.ofNullable(dataDelivery);
            return this;
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

        public Builder setTags(@Nullable Input<List<ProjectTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ProjectTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ProjectArgs build() {
            return new ProjectArgs(dataDelivery, description, name, tags);
        }
    }
}
