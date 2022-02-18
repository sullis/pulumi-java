// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.enums.CustomImageOsType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for creating a custom image from a VHD.
 * 
 */
public final class CustomImagePropertiesCustomArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomImagePropertiesCustomArgs Empty = new CustomImagePropertiesCustomArgs();

    /**
     * The image name.
     * 
     */
    @InputImport(name="imageName")
    private final @Nullable Input<String> imageName;

    public Input<String> getImageName() {
        return this.imageName == null ? Input.empty() : this.imageName;
    }

    /**
     * The OS type of the custom image (i.e. Windows, Linux)
     * 
     */
    @InputImport(name="osType", required=true)
    private final Input<Either<String,CustomImageOsType>> osType;

    public Input<Either<String,CustomImageOsType>> getOsType() {
        return this.osType;
    }

    /**
     * Indicates whether sysprep has been run on the VHD.
     * 
     */
    @InputImport(name="sysPrep")
    private final @Nullable Input<Boolean> sysPrep;

    public Input<Boolean> getSysPrep() {
        return this.sysPrep == null ? Input.empty() : this.sysPrep;
    }

    public CustomImagePropertiesCustomArgs(
        @Nullable Input<String> imageName,
        Input<Either<String,CustomImageOsType>> osType,
        @Nullable Input<Boolean> sysPrep) {
        this.imageName = imageName;
        this.osType = Objects.requireNonNull(osType, "expected parameter 'osType' to be non-null");
        this.sysPrep = sysPrep;
    }

    private CustomImagePropertiesCustomArgs() {
        this.imageName = Input.empty();
        this.osType = Input.empty();
        this.sysPrep = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomImagePropertiesCustomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> imageName;
        private Input<Either<String,CustomImageOsType>> osType;
        private @Nullable Input<Boolean> sysPrep;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomImagePropertiesCustomArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageName = defaults.imageName;
    	      this.osType = defaults.osType;
    	      this.sysPrep = defaults.sysPrep;
        }

        public Builder setImageName(@Nullable Input<String> imageName) {
            this.imageName = imageName;
            return this;
        }

        public Builder setImageName(@Nullable String imageName) {
            this.imageName = Input.ofNullable(imageName);
            return this;
        }

        public Builder setOsType(Input<Either<String,CustomImageOsType>> osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder setOsType(Either<String,CustomImageOsType> osType) {
            this.osType = Input.of(Objects.requireNonNull(osType));
            return this;
        }

        public Builder setSysPrep(@Nullable Input<Boolean> sysPrep) {
            this.sysPrep = sysPrep;
            return this;
        }

        public Builder setSysPrep(@Nullable Boolean sysPrep) {
            this.sysPrep = Input.ofNullable(sysPrep);
            return this;
        }

        public CustomImagePropertiesCustomArgs build() {
            return new CustomImagePropertiesCustomArgs(imageName, osType, sysPrep);
        }
    }
}
