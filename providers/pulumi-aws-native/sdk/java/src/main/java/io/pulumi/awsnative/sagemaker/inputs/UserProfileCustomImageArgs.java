// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserProfileCustomImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserProfileCustomImageArgs Empty = new UserProfileCustomImageArgs();

    @InputImport(name="appImageConfigName", required=true)
    private final Input<String> appImageConfigName;

    public Input<String> getAppImageConfigName() {
        return this.appImageConfigName;
    }

    @InputImport(name="imageName", required=true)
    private final Input<String> imageName;

    public Input<String> getImageName() {
        return this.imageName;
    }

    @InputImport(name="imageVersionNumber")
    private final @Nullable Input<Integer> imageVersionNumber;

    public Input<Integer> getImageVersionNumber() {
        return this.imageVersionNumber == null ? Input.empty() : this.imageVersionNumber;
    }

    public UserProfileCustomImageArgs(
        Input<String> appImageConfigName,
        Input<String> imageName,
        @Nullable Input<Integer> imageVersionNumber) {
        this.appImageConfigName = Objects.requireNonNull(appImageConfigName, "expected parameter 'appImageConfigName' to be non-null");
        this.imageName = Objects.requireNonNull(imageName, "expected parameter 'imageName' to be non-null");
        this.imageVersionNumber = imageVersionNumber;
    }

    private UserProfileCustomImageArgs() {
        this.appImageConfigName = Input.empty();
        this.imageName = Input.empty();
        this.imageVersionNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileCustomImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appImageConfigName;
        private Input<String> imageName;
        private @Nullable Input<Integer> imageVersionNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileCustomImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appImageConfigName = defaults.appImageConfigName;
    	      this.imageName = defaults.imageName;
    	      this.imageVersionNumber = defaults.imageVersionNumber;
        }

        public Builder setAppImageConfigName(Input<String> appImageConfigName) {
            this.appImageConfigName = Objects.requireNonNull(appImageConfigName);
            return this;
        }

        public Builder setAppImageConfigName(String appImageConfigName) {
            this.appImageConfigName = Input.of(Objects.requireNonNull(appImageConfigName));
            return this;
        }

        public Builder setImageName(Input<String> imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }

        public Builder setImageName(String imageName) {
            this.imageName = Input.of(Objects.requireNonNull(imageName));
            return this;
        }

        public Builder setImageVersionNumber(@Nullable Input<Integer> imageVersionNumber) {
            this.imageVersionNumber = imageVersionNumber;
            return this;
        }

        public Builder setImageVersionNumber(@Nullable Integer imageVersionNumber) {
            this.imageVersionNumber = Input.ofNullable(imageVersionNumber);
            return this;
        }

        public UserProfileCustomImageArgs build() {
            return new UserProfileCustomImageArgs(appImageConfigName, imageName, imageVersionNumber);
        }
    }
}
