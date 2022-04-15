// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Image tests configuration.
 * 
 */
public final class ImagePipelineImageTestsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImagePipelineImageTestsConfigurationArgs Empty = new ImagePipelineImageTestsConfigurationArgs();

    /**
     * Defines if tests should be executed when building this image.
     * 
     */
    @Import(name="imageTestsEnabled")
      private final @Nullable Output<Boolean> imageTestsEnabled;

    public Output<Boolean> imageTestsEnabled() {
        return this.imageTestsEnabled == null ? Codegen.empty() : this.imageTestsEnabled;
    }

    /**
     * The maximum time in minutes that tests are permitted to run.
     * 
     */
    @Import(name="timeoutMinutes")
      private final @Nullable Output<Integer> timeoutMinutes;

    public Output<Integer> timeoutMinutes() {
        return this.timeoutMinutes == null ? Codegen.empty() : this.timeoutMinutes;
    }

    public ImagePipelineImageTestsConfigurationArgs(
        @Nullable Output<Boolean> imageTestsEnabled,
        @Nullable Output<Integer> timeoutMinutes) {
        this.imageTestsEnabled = imageTestsEnabled;
        this.timeoutMinutes = timeoutMinutes;
    }

    private ImagePipelineImageTestsConfigurationArgs() {
        this.imageTestsEnabled = Codegen.empty();
        this.timeoutMinutes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImagePipelineImageTestsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> imageTestsEnabled;
        private @Nullable Output<Integer> timeoutMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(ImagePipelineImageTestsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageTestsEnabled = defaults.imageTestsEnabled;
    	      this.timeoutMinutes = defaults.timeoutMinutes;
        }

        public Builder imageTestsEnabled(@Nullable Output<Boolean> imageTestsEnabled) {
            this.imageTestsEnabled = imageTestsEnabled;
            return this;
        }
        public Builder imageTestsEnabled(@Nullable Boolean imageTestsEnabled) {
            this.imageTestsEnabled = Codegen.ofNullable(imageTestsEnabled);
            return this;
        }
        public Builder timeoutMinutes(@Nullable Output<Integer> timeoutMinutes) {
            this.timeoutMinutes = timeoutMinutes;
            return this;
        }
        public Builder timeoutMinutes(@Nullable Integer timeoutMinutes) {
            this.timeoutMinutes = Codegen.ofNullable(timeoutMinutes);
            return this;
        }        public ImagePipelineImageTestsConfigurationArgs build() {
            return new ImagePipelineImageTestsConfigurationArgs(imageTestsEnabled, timeoutMinutes);
        }
    }
}
