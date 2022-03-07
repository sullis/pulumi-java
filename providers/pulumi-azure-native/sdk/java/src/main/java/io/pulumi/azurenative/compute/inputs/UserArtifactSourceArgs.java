// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The source image from which the Image Version is going to be created.
 * 
 */
public final class UserArtifactSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserArtifactSourceArgs Empty = new UserArtifactSourceArgs();

    /**
     * Optional. The defaultConfigurationLink of the artifact, must be a readable storage page blob.
     * 
     */
    @InputImport(name="defaultConfigurationLink")
      private final @Nullable Input<String> defaultConfigurationLink;

    public Input<String> getDefaultConfigurationLink() {
        return this.defaultConfigurationLink == null ? Input.empty() : this.defaultConfigurationLink;
    }

    /**
     * Required. The mediaLink of the artifact, must be a readable storage page blob.
     * 
     */
    @InputImport(name="mediaLink", required=true)
      private final Input<String> mediaLink;

    public Input<String> getMediaLink() {
        return this.mediaLink;
    }

    public UserArtifactSourceArgs(
        @Nullable Input<String> defaultConfigurationLink,
        Input<String> mediaLink) {
        this.defaultConfigurationLink = defaultConfigurationLink;
        this.mediaLink = Objects.requireNonNull(mediaLink, "expected parameter 'mediaLink' to be non-null");
    }

    private UserArtifactSourceArgs() {
        this.defaultConfigurationLink = Input.empty();
        this.mediaLink = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserArtifactSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> defaultConfigurationLink;
        private Input<String> mediaLink;

        public Builder() {
    	      // Empty
        }

        public Builder(UserArtifactSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultConfigurationLink = defaults.defaultConfigurationLink;
    	      this.mediaLink = defaults.mediaLink;
        }

        public Builder setDefaultConfigurationLink(@Nullable Input<String> defaultConfigurationLink) {
            this.defaultConfigurationLink = defaultConfigurationLink;
            return this;
        }

        public Builder setDefaultConfigurationLink(@Nullable String defaultConfigurationLink) {
            this.defaultConfigurationLink = Input.ofNullable(defaultConfigurationLink);
            return this;
        }

        public Builder setMediaLink(Input<String> mediaLink) {
            this.mediaLink = Objects.requireNonNull(mediaLink);
            return this;
        }

        public Builder setMediaLink(String mediaLink) {
            this.mediaLink = Input.of(Objects.requireNonNull(mediaLink));
            return this;
        }
        public UserArtifactSourceArgs build() {
            return new UserArtifactSourceArgs(defaultConfigurationLink, mediaLink);
        }
    }
}