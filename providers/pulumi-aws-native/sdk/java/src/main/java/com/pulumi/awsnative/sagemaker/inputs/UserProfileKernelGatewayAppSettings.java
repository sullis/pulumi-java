// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.UserProfileCustomImage;
import com.pulumi.awsnative.sagemaker.inputs.UserProfileResourceSpec;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The kernel gateway app settings.
 * 
 */
public final class UserProfileKernelGatewayAppSettings extends com.pulumi.resources.InvokeArgs {

    public static final UserProfileKernelGatewayAppSettings Empty = new UserProfileKernelGatewayAppSettings();

    /**
     * A list of custom SageMaker images that are configured to run as a KernelGateway app.
     * 
     */
    @Import(name="customImages")
    private @Nullable List<UserProfileCustomImage> customImages;

    /**
     * @return A list of custom SageMaker images that are configured to run as a KernelGateway app.
     * 
     */
    public Optional<List<UserProfileCustomImage>> customImages() {
        return Optional.ofNullable(this.customImages);
    }

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the KernelGateway app.
     * 
     */
    @Import(name="defaultResourceSpec")
    private @Nullable UserProfileResourceSpec defaultResourceSpec;

    /**
     * @return The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the KernelGateway app.
     * 
     */
    public Optional<UserProfileResourceSpec> defaultResourceSpec() {
        return Optional.ofNullable(this.defaultResourceSpec);
    }

    private UserProfileKernelGatewayAppSettings() {}

    private UserProfileKernelGatewayAppSettings(UserProfileKernelGatewayAppSettings $) {
        this.customImages = $.customImages;
        this.defaultResourceSpec = $.defaultResourceSpec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserProfileKernelGatewayAppSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserProfileKernelGatewayAppSettings $;

        public Builder() {
            $ = new UserProfileKernelGatewayAppSettings();
        }

        public Builder(UserProfileKernelGatewayAppSettings defaults) {
            $ = new UserProfileKernelGatewayAppSettings(Objects.requireNonNull(defaults));
        }

        /**
         * @param customImages A list of custom SageMaker images that are configured to run as a KernelGateway app.
         * 
         * @return builder
         * 
         */
        public Builder customImages(@Nullable List<UserProfileCustomImage> customImages) {
            $.customImages = customImages;
            return this;
        }

        /**
         * @param customImages A list of custom SageMaker images that are configured to run as a KernelGateway app.
         * 
         * @return builder
         * 
         */
        public Builder customImages(UserProfileCustomImage... customImages) {
            return customImages(List.of(customImages));
        }

        /**
         * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the KernelGateway app.
         * 
         * @return builder
         * 
         */
        public Builder defaultResourceSpec(@Nullable UserProfileResourceSpec defaultResourceSpec) {
            $.defaultResourceSpec = defaultResourceSpec;
            return this;
        }

        public UserProfileKernelGatewayAppSettings build() {
            return $;
        }
    }

}
