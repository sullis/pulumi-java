// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationTargetContainerRepositoryArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container distribution settings for encryption, licensing, and sharing in a specific Region.
 * 
 */
public final class DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs Empty = new DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs();

    /**
     * Tags that are attached to the container distribution configuration.
     * 
     */
    @InputImport(name="containerTags")
      private final @Nullable Input<List<String>> containerTags;

    public Input<List<String>> getContainerTags() {
        return this.containerTags == null ? Input.empty() : this.containerTags;
    }

    /**
     * The description of the container distribution configuration.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The destination repository for the container distribution configuration.
     * 
     */
    @InputImport(name="targetRepository")
      private final @Nullable Input<DistributionConfigurationTargetContainerRepositoryArgs> targetRepository;

    public Input<DistributionConfigurationTargetContainerRepositoryArgs> getTargetRepository() {
        return this.targetRepository == null ? Input.empty() : this.targetRepository;
    }

    public DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs(
        @Nullable Input<List<String>> containerTags,
        @Nullable Input<String> description,
        @Nullable Input<DistributionConfigurationTargetContainerRepositoryArgs> targetRepository) {
        this.containerTags = containerTags;
        this.description = description;
        this.targetRepository = targetRepository;
    }

    private DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs() {
        this.containerTags = Input.empty();
        this.description = Input.empty();
        this.targetRepository = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> containerTags;
        private @Nullable Input<String> description;
        private @Nullable Input<DistributionConfigurationTargetContainerRepositoryArgs> targetRepository;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerTags = defaults.containerTags;
    	      this.description = defaults.description;
    	      this.targetRepository = defaults.targetRepository;
        }

        public Builder setContainerTags(@Nullable Input<List<String>> containerTags) {
            this.containerTags = containerTags;
            return this;
        }

        public Builder setContainerTags(@Nullable List<String> containerTags) {
            this.containerTags = Input.ofNullable(containerTags);
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

        public Builder setTargetRepository(@Nullable Input<DistributionConfigurationTargetContainerRepositoryArgs> targetRepository) {
            this.targetRepository = targetRepository;
            return this;
        }

        public Builder setTargetRepository(@Nullable DistributionConfigurationTargetContainerRepositoryArgs targetRepository) {
            this.targetRepository = Input.ofNullable(targetRepository);
            return this;
        }
        public DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs build() {
            return new DistributionConfigurationDistributionContainerDistributionConfigurationPropertiesArgs(containerTags, description, targetRepository);
        }
    }
}