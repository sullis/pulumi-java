// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.ImageRepositoryCredentialArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IoT edge agent details is optional, this will be used for download system Agent module while bootstrapping IoT Role if specified.
 * 
 */
public final class IoTEdgeAgentInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final IoTEdgeAgentInfoArgs Empty = new IoTEdgeAgentInfoArgs();

    /**
     * Name of the IoT edge agent image.
     * 
     */
    @InputImport(name="imageName", required=true)
      private final Input<String> imageName;

    public Input<String> getImageName() {
        return this.imageName;
    }

    /**
     * Image repository details.
     * 
     */
    @InputImport(name="imageRepository")
      private final @Nullable Input<ImageRepositoryCredentialArgs> imageRepository;

    public Input<ImageRepositoryCredentialArgs> getImageRepository() {
        return this.imageRepository == null ? Input.empty() : this.imageRepository;
    }

    /**
     * Image Tag.
     * 
     */
    @InputImport(name="tag", required=true)
      private final Input<String> tag;

    public Input<String> getTag() {
        return this.tag;
    }

    public IoTEdgeAgentInfoArgs(
        Input<String> imageName,
        @Nullable Input<ImageRepositoryCredentialArgs> imageRepository,
        Input<String> tag) {
        this.imageName = Objects.requireNonNull(imageName, "expected parameter 'imageName' to be non-null");
        this.imageRepository = imageRepository;
        this.tag = Objects.requireNonNull(tag, "expected parameter 'tag' to be non-null");
    }

    private IoTEdgeAgentInfoArgs() {
        this.imageName = Input.empty();
        this.imageRepository = Input.empty();
        this.tag = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoTEdgeAgentInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> imageName;
        private @Nullable Input<ImageRepositoryCredentialArgs> imageRepository;
        private Input<String> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(IoTEdgeAgentInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageName = defaults.imageName;
    	      this.imageRepository = defaults.imageRepository;
    	      this.tag = defaults.tag;
        }

        public Builder setImageName(Input<String> imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }

        public Builder setImageName(String imageName) {
            this.imageName = Input.of(Objects.requireNonNull(imageName));
            return this;
        }

        public Builder setImageRepository(@Nullable Input<ImageRepositoryCredentialArgs> imageRepository) {
            this.imageRepository = imageRepository;
            return this;
        }

        public Builder setImageRepository(@Nullable ImageRepositoryCredentialArgs imageRepository) {
            this.imageRepository = Input.ofNullable(imageRepository);
            return this;
        }

        public Builder setTag(Input<String> tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }

        public Builder setTag(String tag) {
            this.tag = Input.of(Objects.requireNonNull(tag));
            return this;
        }
        public IoTEdgeAgentInfoArgs build() {
            return new IoTEdgeAgentInfoArgs(imageName, imageRepository, tag);
        }
    }
}