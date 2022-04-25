// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs Empty = new DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs();

    /**
     * The name of the App Image Config.
     * 
     */
    @Import(name="appImageConfigName", required=true)
    private Output<String> appImageConfigName;

    /**
     * @return The name of the App Image Config.
     * 
     */
    public Output<String> appImageConfigName() {
        return this.appImageConfigName;
    }

    /**
     * The name of the Custom Image.
     * 
     */
    @Import(name="imageName", required=true)
    private Output<String> imageName;

    /**
     * @return The name of the Custom Image.
     * 
     */
    public Output<String> imageName() {
        return this.imageName;
    }

    /**
     * The version number of the Custom Image.
     * 
     */
    @Import(name="imageVersionNumber")
    private @Nullable Output<Integer> imageVersionNumber;

    /**
     * @return The version number of the Custom Image.
     * 
     */
    public Optional<Output<Integer>> imageVersionNumber() {
        return Optional.ofNullable(this.imageVersionNumber);
    }

    private DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs() {}

    private DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs(DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs $) {
        this.appImageConfigName = $.appImageConfigName;
        this.imageName = $.imageName;
        this.imageVersionNumber = $.imageVersionNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs $;

        public Builder() {
            $ = new DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs();
        }

        public Builder(DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs defaults) {
            $ = new DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appImageConfigName The name of the App Image Config.
         * 
         * @return builder
         * 
         */
        public Builder appImageConfigName(Output<String> appImageConfigName) {
            $.appImageConfigName = appImageConfigName;
            return this;
        }

        /**
         * @param appImageConfigName The name of the App Image Config.
         * 
         * @return builder
         * 
         */
        public Builder appImageConfigName(String appImageConfigName) {
            return appImageConfigName(Output.of(appImageConfigName));
        }

        /**
         * @param imageName The name of the Custom Image.
         * 
         * @return builder
         * 
         */
        public Builder imageName(Output<String> imageName) {
            $.imageName = imageName;
            return this;
        }

        /**
         * @param imageName The name of the Custom Image.
         * 
         * @return builder
         * 
         */
        public Builder imageName(String imageName) {
            return imageName(Output.of(imageName));
        }

        /**
         * @param imageVersionNumber The version number of the Custom Image.
         * 
         * @return builder
         * 
         */
        public Builder imageVersionNumber(@Nullable Output<Integer> imageVersionNumber) {
            $.imageVersionNumber = imageVersionNumber;
            return this;
        }

        /**
         * @param imageVersionNumber The version number of the Custom Image.
         * 
         * @return builder
         * 
         */
        public Builder imageVersionNumber(Integer imageVersionNumber) {
            return imageVersionNumber(Output.of(imageVersionNumber));
        }

        public DomainDefaultUserSettingsKernelGatewayAppSettingsCustomImageArgs build() {
            $.appImageConfigName = Objects.requireNonNull($.appImageConfigName, "expected parameter 'appImageConfigName' to be non-null");
            $.imageName = Objects.requireNonNull($.imageName, "expected parameter 'imageName' to be non-null");
            return $;
        }
    }

}
