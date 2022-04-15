// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A custom SageMaker image.
 * 
 */
public final class UserProfileCustomImage extends io.pulumi.resources.InvokeArgs {

    public static final UserProfileCustomImage Empty = new UserProfileCustomImage();

    /**
     * The Name of the AppImageConfig.
     * 
     */
    @Import(name="appImageConfigName", required=true)
      private final String appImageConfigName;

    public String appImageConfigName() {
        return this.appImageConfigName;
    }

    /**
     * The name of the CustomImage. Must be unique to your account.
     * 
     */
    @Import(name="imageName", required=true)
      private final String imageName;

    public String imageName() {
        return this.imageName;
    }

    /**
     * The version number of the CustomImage.
     * 
     */
    @Import(name="imageVersionNumber")
      private final @Nullable Integer imageVersionNumber;

    public Optional<Integer> imageVersionNumber() {
        return this.imageVersionNumber == null ? Optional.empty() : Optional.ofNullable(this.imageVersionNumber);
    }

    public UserProfileCustomImage(
        String appImageConfigName,
        String imageName,
        @Nullable Integer imageVersionNumber) {
        this.appImageConfigName = Objects.requireNonNull(appImageConfigName, "expected parameter 'appImageConfigName' to be non-null");
        this.imageName = Objects.requireNonNull(imageName, "expected parameter 'imageName' to be non-null");
        this.imageVersionNumber = imageVersionNumber;
    }

    private UserProfileCustomImage() {
        this.appImageConfigName = null;
        this.imageName = null;
        this.imageVersionNumber = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileCustomImage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appImageConfigName;
        private String imageName;
        private @Nullable Integer imageVersionNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileCustomImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appImageConfigName = defaults.appImageConfigName;
    	      this.imageName = defaults.imageName;
    	      this.imageVersionNumber = defaults.imageVersionNumber;
        }

        public Builder appImageConfigName(String appImageConfigName) {
            this.appImageConfigName = Objects.requireNonNull(appImageConfigName);
            return this;
        }
        public Builder imageName(String imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }
        public Builder imageVersionNumber(@Nullable Integer imageVersionNumber) {
            this.imageVersionNumber = imageVersionNumber;
            return this;
        }        public UserProfileCustomImage build() {
            return new UserProfileCustomImage(appImageConfigName, imageName, imageVersionNumber);
        }
    }
}
