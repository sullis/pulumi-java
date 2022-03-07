// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder;

import io.pulumi.aws.imagebuilder.inputs.ImagePipelineImageTestsConfigurationArgs;
import io.pulumi.aws.imagebuilder.inputs.ImagePipelineScheduleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImagePipelineArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImagePipelineArgs Empty = new ImagePipelineArgs();

    /**
     * Description of the image pipeline.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Amazon Resource Name (ARN) of the Image Builder Distribution Configuration.
     * 
     */
    @InputImport(name="distributionConfigurationArn")
      private final @Nullable Input<String> distributionConfigurationArn;

    public Input<String> getDistributionConfigurationArn() {
        return this.distributionConfigurationArn == null ? Input.empty() : this.distributionConfigurationArn;
    }

    /**
     * Whether additional information about the image being created is collected. Defaults to `true`.
     * 
     */
    @InputImport(name="enhancedImageMetadataEnabled")
      private final @Nullable Input<Boolean> enhancedImageMetadataEnabled;

    public Input<Boolean> getEnhancedImageMetadataEnabled() {
        return this.enhancedImageMetadataEnabled == null ? Input.empty() : this.enhancedImageMetadataEnabled;
    }

    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Recipe.
     * 
     */
    @InputImport(name="imageRecipeArn", required=true)
      private final Input<String> imageRecipeArn;

    public Input<String> getImageRecipeArn() {
        return this.imageRecipeArn;
    }

    /**
     * Configuration block with image tests configuration. Detailed below.
     * 
     */
    @InputImport(name="imageTestsConfiguration")
      private final @Nullable Input<ImagePipelineImageTestsConfigurationArgs> imageTestsConfiguration;

    public Input<ImagePipelineImageTestsConfigurationArgs> getImageTestsConfiguration() {
        return this.imageTestsConfiguration == null ? Input.empty() : this.imageTestsConfiguration;
    }

    /**
     * Amazon Resource Name (ARN) of the Image Builder Infrastructure Configuration.
     * 
     */
    @InputImport(name="infrastructureConfigurationArn", required=true)
      private final Input<String> infrastructureConfigurationArn;

    public Input<String> getInfrastructureConfigurationArn() {
        return this.infrastructureConfigurationArn;
    }

    /**
     * Name of the image pipeline.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Configuration block with schedule settings. Detailed below.
     * 
     */
    @InputImport(name="schedule")
      private final @Nullable Input<ImagePipelineScheduleArgs> schedule;

    public Input<ImagePipelineScheduleArgs> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    /**
     * Status of the image pipeline. Valid values are `DISABLED` and `ENABLED`. Defaults to `ENABLED`.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Key-value map of resource tags for the image pipeline. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ImagePipelineArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> distributionConfigurationArn,
        @Nullable Input<Boolean> enhancedImageMetadataEnabled,
        Input<String> imageRecipeArn,
        @Nullable Input<ImagePipelineImageTestsConfigurationArgs> imageTestsConfiguration,
        Input<String> infrastructureConfigurationArn,
        @Nullable Input<String> name,
        @Nullable Input<ImagePipelineScheduleArgs> schedule,
        @Nullable Input<String> status,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.distributionConfigurationArn = distributionConfigurationArn;
        this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
        this.imageRecipeArn = Objects.requireNonNull(imageRecipeArn, "expected parameter 'imageRecipeArn' to be non-null");
        this.imageTestsConfiguration = imageTestsConfiguration;
        this.infrastructureConfigurationArn = Objects.requireNonNull(infrastructureConfigurationArn, "expected parameter 'infrastructureConfigurationArn' to be non-null");
        this.name = name;
        this.schedule = schedule;
        this.status = status;
        this.tags = tags;
    }

    private ImagePipelineArgs() {
        this.description = Input.empty();
        this.distributionConfigurationArn = Input.empty();
        this.enhancedImageMetadataEnabled = Input.empty();
        this.imageRecipeArn = Input.empty();
        this.imageTestsConfiguration = Input.empty();
        this.infrastructureConfigurationArn = Input.empty();
        this.name = Input.empty();
        this.schedule = Input.empty();
        this.status = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImagePipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> distributionConfigurationArn;
        private @Nullable Input<Boolean> enhancedImageMetadataEnabled;
        private Input<String> imageRecipeArn;
        private @Nullable Input<ImagePipelineImageTestsConfigurationArgs> imageTestsConfiguration;
        private Input<String> infrastructureConfigurationArn;
        private @Nullable Input<String> name;
        private @Nullable Input<ImagePipelineScheduleArgs> schedule;
        private @Nullable Input<String> status;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ImagePipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.distributionConfigurationArn = defaults.distributionConfigurationArn;
    	      this.enhancedImageMetadataEnabled = defaults.enhancedImageMetadataEnabled;
    	      this.imageRecipeArn = defaults.imageRecipeArn;
    	      this.imageTestsConfiguration = defaults.imageTestsConfiguration;
    	      this.infrastructureConfigurationArn = defaults.infrastructureConfigurationArn;
    	      this.name = defaults.name;
    	      this.schedule = defaults.schedule;
    	      this.status = defaults.status;
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

        public Builder setDistributionConfigurationArn(@Nullable Input<String> distributionConfigurationArn) {
            this.distributionConfigurationArn = distributionConfigurationArn;
            return this;
        }

        public Builder setDistributionConfigurationArn(@Nullable String distributionConfigurationArn) {
            this.distributionConfigurationArn = Input.ofNullable(distributionConfigurationArn);
            return this;
        }

        public Builder setEnhancedImageMetadataEnabled(@Nullable Input<Boolean> enhancedImageMetadataEnabled) {
            this.enhancedImageMetadataEnabled = enhancedImageMetadataEnabled;
            return this;
        }

        public Builder setEnhancedImageMetadataEnabled(@Nullable Boolean enhancedImageMetadataEnabled) {
            this.enhancedImageMetadataEnabled = Input.ofNullable(enhancedImageMetadataEnabled);
            return this;
        }

        public Builder setImageRecipeArn(Input<String> imageRecipeArn) {
            this.imageRecipeArn = Objects.requireNonNull(imageRecipeArn);
            return this;
        }

        public Builder setImageRecipeArn(String imageRecipeArn) {
            this.imageRecipeArn = Input.of(Objects.requireNonNull(imageRecipeArn));
            return this;
        }

        public Builder setImageTestsConfiguration(@Nullable Input<ImagePipelineImageTestsConfigurationArgs> imageTestsConfiguration) {
            this.imageTestsConfiguration = imageTestsConfiguration;
            return this;
        }

        public Builder setImageTestsConfiguration(@Nullable ImagePipelineImageTestsConfigurationArgs imageTestsConfiguration) {
            this.imageTestsConfiguration = Input.ofNullable(imageTestsConfiguration);
            return this;
        }

        public Builder setInfrastructureConfigurationArn(Input<String> infrastructureConfigurationArn) {
            this.infrastructureConfigurationArn = Objects.requireNonNull(infrastructureConfigurationArn);
            return this;
        }

        public Builder setInfrastructureConfigurationArn(String infrastructureConfigurationArn) {
            this.infrastructureConfigurationArn = Input.of(Objects.requireNonNull(infrastructureConfigurationArn));
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

        public Builder setSchedule(@Nullable Input<ImagePipelineScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable ImagePipelineScheduleArgs schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ImagePipelineArgs build() {
            return new ImagePipelineArgs(description, distributionConfigurationArn, enhancedImageMetadataEnabled, imageRecipeArn, imageTestsConfiguration, infrastructureConfigurationArn, name, schedule, status, tags);
        }
    }
}