// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.UserProfileCustomImageArgs;
import io.pulumi.awsnative.sagemaker.inputs.UserProfileResourceSpecArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The kernel gateway app settings.
 * 
 */
public final class UserProfileKernelGatewayAppSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserProfileKernelGatewayAppSettingsArgs Empty = new UserProfileKernelGatewayAppSettingsArgs();

    /**
     * A list of custom SageMaker images that are configured to run as a KernelGateway app.
     * 
     */
    @InputImport(name="customImages")
    private final @Nullable Input<List<UserProfileCustomImageArgs>> customImages;

    public Input<List<UserProfileCustomImageArgs>> getCustomImages() {
        return this.customImages == null ? Input.empty() : this.customImages;
    }

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the KernelGateway app.
     * 
     */
    @InputImport(name="defaultResourceSpec")
    private final @Nullable Input<UserProfileResourceSpecArgs> defaultResourceSpec;

    public Input<UserProfileResourceSpecArgs> getDefaultResourceSpec() {
        return this.defaultResourceSpec == null ? Input.empty() : this.defaultResourceSpec;
    }

    public UserProfileKernelGatewayAppSettingsArgs(
        @Nullable Input<List<UserProfileCustomImageArgs>> customImages,
        @Nullable Input<UserProfileResourceSpecArgs> defaultResourceSpec) {
        this.customImages = customImages;
        this.defaultResourceSpec = defaultResourceSpec;
    }

    private UserProfileKernelGatewayAppSettingsArgs() {
        this.customImages = Input.empty();
        this.defaultResourceSpec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileKernelGatewayAppSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<UserProfileCustomImageArgs>> customImages;
        private @Nullable Input<UserProfileResourceSpecArgs> defaultResourceSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileKernelGatewayAppSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customImages = defaults.customImages;
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
        }

        public Builder setCustomImages(@Nullable Input<List<UserProfileCustomImageArgs>> customImages) {
            this.customImages = customImages;
            return this;
        }

        public Builder setCustomImages(@Nullable List<UserProfileCustomImageArgs> customImages) {
            this.customImages = Input.ofNullable(customImages);
            return this;
        }

        public Builder setDefaultResourceSpec(@Nullable Input<UserProfileResourceSpecArgs> defaultResourceSpec) {
            this.defaultResourceSpec = defaultResourceSpec;
            return this;
        }

        public Builder setDefaultResourceSpec(@Nullable UserProfileResourceSpecArgs defaultResourceSpec) {
            this.defaultResourceSpec = Input.ofNullable(defaultResourceSpec);
            return this;
        }

        public UserProfileKernelGatewayAppSettingsArgs build() {
            return new UserProfileKernelGatewayAppSettingsArgs(customImages, defaultResourceSpec);
        }
    }
}
