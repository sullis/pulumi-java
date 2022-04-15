// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserProfileUserSettingsKernelGatewayAppSettingsCustomImage {
    /**
     * The name of the App Image Config.
     * 
     */
    private final String appImageConfigName;
    /**
     * The name of the Custom Image.
     * 
     */
    private final String imageName;
    /**
     * The version number of the Custom Image.
     * 
     */
    private final @Nullable Integer imageVersionNumber;

    @CustomType.Constructor
    private UserProfileUserSettingsKernelGatewayAppSettingsCustomImage(
        @CustomType.Parameter("appImageConfigName") String appImageConfigName,
        @CustomType.Parameter("imageName") String imageName,
        @CustomType.Parameter("imageVersionNumber") @Nullable Integer imageVersionNumber) {
        this.appImageConfigName = appImageConfigName;
        this.imageName = imageName;
        this.imageVersionNumber = imageVersionNumber;
    }

    /**
     * The name of the App Image Config.
     * 
    */
    public String appImageConfigName() {
        return this.appImageConfigName;
    }
    /**
     * The name of the Custom Image.
     * 
    */
    public String imageName() {
        return this.imageName;
    }
    /**
     * The version number of the Custom Image.
     * 
    */
    public Optional<Integer> imageVersionNumber() {
        return Optional.ofNullable(this.imageVersionNumber);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettingsKernelGatewayAppSettingsCustomImage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appImageConfigName;
        private String imageName;
        private @Nullable Integer imageVersionNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileUserSettingsKernelGatewayAppSettingsCustomImage defaults) {
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
        }        public UserProfileUserSettingsKernelGatewayAppSettingsCustomImage build() {
            return new UserProfileUserSettingsKernelGatewayAppSettingsCustomImage(appImageConfigName, imageName, imageVersionNumber);
        }
    }
}
