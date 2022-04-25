// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.azurenative.devtestlab.enums.CustomImageOsType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for creating a custom image from a VHD.
 * 
 */
public final class CustomImagePropertiesCustomArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomImagePropertiesCustomArgs Empty = new CustomImagePropertiesCustomArgs();

    /**
     * The image name.
     * 
     */
    @Import(name="imageName")
    private @Nullable Output<String> imageName;

    /**
     * @return The image name.
     * 
     */
    public Optional<Output<String>> imageName() {
        return Optional.ofNullable(this.imageName);
    }

    /**
     * The OS type of the custom image (i.e. Windows, Linux)
     * 
     */
    @Import(name="osType", required=true)
    private Output<Either<String,CustomImageOsType>> osType;

    /**
     * @return The OS type of the custom image (i.e. Windows, Linux)
     * 
     */
    public Output<Either<String,CustomImageOsType>> osType() {
        return this.osType;
    }

    /**
     * Indicates whether sysprep has been run on the VHD.
     * 
     */
    @Import(name="sysPrep")
    private @Nullable Output<Boolean> sysPrep;

    /**
     * @return Indicates whether sysprep has been run on the VHD.
     * 
     */
    public Optional<Output<Boolean>> sysPrep() {
        return Optional.ofNullable(this.sysPrep);
    }

    private CustomImagePropertiesCustomArgs() {}

    private CustomImagePropertiesCustomArgs(CustomImagePropertiesCustomArgs $) {
        this.imageName = $.imageName;
        this.osType = $.osType;
        this.sysPrep = $.sysPrep;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomImagePropertiesCustomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomImagePropertiesCustomArgs $;

        public Builder() {
            $ = new CustomImagePropertiesCustomArgs();
        }

        public Builder(CustomImagePropertiesCustomArgs defaults) {
            $ = new CustomImagePropertiesCustomArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param imageName The image name.
         * 
         * @return builder
         * 
         */
        public Builder imageName(@Nullable Output<String> imageName) {
            $.imageName = imageName;
            return this;
        }

        /**
         * @param imageName The image name.
         * 
         * @return builder
         * 
         */
        public Builder imageName(String imageName) {
            return imageName(Output.of(imageName));
        }

        /**
         * @param osType The OS type of the custom image (i.e. Windows, Linux)
         * 
         * @return builder
         * 
         */
        public Builder osType(Output<Either<String,CustomImageOsType>> osType) {
            $.osType = osType;
            return this;
        }

        /**
         * @param osType The OS type of the custom image (i.e. Windows, Linux)
         * 
         * @return builder
         * 
         */
        public Builder osType(Either<String,CustomImageOsType> osType) {
            return osType(Output.of(osType));
        }

        /**
         * @param osType The OS type of the custom image (i.e. Windows, Linux)
         * 
         * @return builder
         * 
         */
        public Builder osType(String osType) {
            return osType(Either.ofLeft(osType));
        }

        /**
         * @param osType The OS type of the custom image (i.e. Windows, Linux)
         * 
         * @return builder
         * 
         */
        public Builder osType(CustomImageOsType osType) {
            return osType(Either.ofRight(osType));
        }

        /**
         * @param sysPrep Indicates whether sysprep has been run on the VHD.
         * 
         * @return builder
         * 
         */
        public Builder sysPrep(@Nullable Output<Boolean> sysPrep) {
            $.sysPrep = sysPrep;
            return this;
        }

        /**
         * @param sysPrep Indicates whether sysprep has been run on the VHD.
         * 
         * @return builder
         * 
         */
        public Builder sysPrep(Boolean sysPrep) {
            return sysPrep(Output.of(sysPrep));
        }

        public CustomImagePropertiesCustomArgs build() {
            $.osType = Objects.requireNonNull($.osType, "expected parameter 'osType' to be non-null");
            return $;
        }
    }

}
