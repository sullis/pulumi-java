// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner.inputs;

import com.pulumi.awsnative.apprunner.enums.ServiceImageRepositoryImageRepositoryType;
import com.pulumi.awsnative.apprunner.inputs.ServiceImageConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Image Repository
 * 
 */
public final class ServiceImageRepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceImageRepositoryArgs Empty = new ServiceImageRepositoryArgs();

    @Import(name="imageConfiguration")
    private @Nullable Output<ServiceImageConfigurationArgs> imageConfiguration;

    public Optional<Output<ServiceImageConfigurationArgs>> imageConfiguration() {
        return Optional.ofNullable(this.imageConfiguration);
    }

    /**
     * Image Identifier
     * 
     */
    @Import(name="imageIdentifier", required=true)
    private Output<String> imageIdentifier;

    /**
     * @return Image Identifier
     * 
     */
    public Output<String> imageIdentifier() {
        return this.imageIdentifier;
    }

    /**
     * Image Repository Type
     * 
     */
    @Import(name="imageRepositoryType", required=true)
    private Output<ServiceImageRepositoryImageRepositoryType> imageRepositoryType;

    /**
     * @return Image Repository Type
     * 
     */
    public Output<ServiceImageRepositoryImageRepositoryType> imageRepositoryType() {
        return this.imageRepositoryType;
    }

    private ServiceImageRepositoryArgs() {}

    private ServiceImageRepositoryArgs(ServiceImageRepositoryArgs $) {
        this.imageConfiguration = $.imageConfiguration;
        this.imageIdentifier = $.imageIdentifier;
        this.imageRepositoryType = $.imageRepositoryType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceImageRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceImageRepositoryArgs $;

        public Builder() {
            $ = new ServiceImageRepositoryArgs();
        }

        public Builder(ServiceImageRepositoryArgs defaults) {
            $ = new ServiceImageRepositoryArgs(Objects.requireNonNull(defaults));
        }

        public Builder imageConfiguration(@Nullable Output<ServiceImageConfigurationArgs> imageConfiguration) {
            $.imageConfiguration = imageConfiguration;
            return this;
        }

        public Builder imageConfiguration(ServiceImageConfigurationArgs imageConfiguration) {
            return imageConfiguration(Output.of(imageConfiguration));
        }

        /**
         * @param imageIdentifier Image Identifier
         * 
         * @return builder
         * 
         */
        public Builder imageIdentifier(Output<String> imageIdentifier) {
            $.imageIdentifier = imageIdentifier;
            return this;
        }

        /**
         * @param imageIdentifier Image Identifier
         * 
         * @return builder
         * 
         */
        public Builder imageIdentifier(String imageIdentifier) {
            return imageIdentifier(Output.of(imageIdentifier));
        }

        /**
         * @param imageRepositoryType Image Repository Type
         * 
         * @return builder
         * 
         */
        public Builder imageRepositoryType(Output<ServiceImageRepositoryImageRepositoryType> imageRepositoryType) {
            $.imageRepositoryType = imageRepositoryType;
            return this;
        }

        /**
         * @param imageRepositoryType Image Repository Type
         * 
         * @return builder
         * 
         */
        public Builder imageRepositoryType(ServiceImageRepositoryImageRepositoryType imageRepositoryType) {
            return imageRepositoryType(Output.of(imageRepositoryType));
        }

        public ServiceImageRepositoryArgs build() {
            $.imageIdentifier = Objects.requireNonNull($.imageIdentifier, "expected parameter 'imageIdentifier' to be non-null");
            $.imageRepositoryType = Objects.requireNonNull($.imageRepositoryType, "expected parameter 'imageRepositoryType' to be non-null");
            return $;
        }
    }

}
