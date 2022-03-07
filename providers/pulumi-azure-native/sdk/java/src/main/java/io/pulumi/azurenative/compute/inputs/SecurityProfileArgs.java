// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.SecurityTypes;
import io.pulumi.azurenative.compute.inputs.UefiSettingsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the Security profile settings for the virtual machine or virtual machine scale set.
 * 
 */
public final class SecurityProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityProfileArgs Empty = new SecurityProfileArgs();

    /**
     * This property can be used by user in the request to enable or disable the Host Encryption for the virtual machine or virtual machine scale set. This will enable the encryption for all the disks including Resource/Temp disk at host itself. <br><br> Default: The Encryption at host will be disabled unless this property is set to true for the resource.
     * 
     */
    @InputImport(name="encryptionAtHost")
      private final @Nullable Input<Boolean> encryptionAtHost;

    public Input<Boolean> getEncryptionAtHost() {
        return this.encryptionAtHost == null ? Input.empty() : this.encryptionAtHost;
    }

    /**
     * Specifies the SecurityType of the virtual machine. It is set as TrustedLaunch to enable UefiSettings. <br><br> Default: UefiSettings will not be enabled unless this property is set as TrustedLaunch.
     * 
     */
    @InputImport(name="securityType")
      private final @Nullable Input<Either<String,SecurityTypes>> securityType;

    public Input<Either<String,SecurityTypes>> getSecurityType() {
        return this.securityType == null ? Input.empty() : this.securityType;
    }

    /**
     * Specifies the security settings like secure boot and vTPM used while creating the virtual machine. <br><br>Minimum api-version: 2020-12-01
     * 
     */
    @InputImport(name="uefiSettings")
      private final @Nullable Input<UefiSettingsArgs> uefiSettings;

    public Input<UefiSettingsArgs> getUefiSettings() {
        return this.uefiSettings == null ? Input.empty() : this.uefiSettings;
    }

    public SecurityProfileArgs(
        @Nullable Input<Boolean> encryptionAtHost,
        @Nullable Input<Either<String,SecurityTypes>> securityType,
        @Nullable Input<UefiSettingsArgs> uefiSettings) {
        this.encryptionAtHost = encryptionAtHost;
        this.securityType = securityType;
        this.uefiSettings = uefiSettings;
    }

    private SecurityProfileArgs() {
        this.encryptionAtHost = Input.empty();
        this.securityType = Input.empty();
        this.uefiSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> encryptionAtHost;
        private @Nullable Input<Either<String,SecurityTypes>> securityType;
        private @Nullable Input<UefiSettingsArgs> uefiSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAtHost = defaults.encryptionAtHost;
    	      this.securityType = defaults.securityType;
    	      this.uefiSettings = defaults.uefiSettings;
        }

        public Builder setEncryptionAtHost(@Nullable Input<Boolean> encryptionAtHost) {
            this.encryptionAtHost = encryptionAtHost;
            return this;
        }

        public Builder setEncryptionAtHost(@Nullable Boolean encryptionAtHost) {
            this.encryptionAtHost = Input.ofNullable(encryptionAtHost);
            return this;
        }

        public Builder setSecurityType(@Nullable Input<Either<String,SecurityTypes>> securityType) {
            this.securityType = securityType;
            return this;
        }

        public Builder setSecurityType(@Nullable Either<String,SecurityTypes> securityType) {
            this.securityType = Input.ofNullable(securityType);
            return this;
        }

        public Builder setUefiSettings(@Nullable Input<UefiSettingsArgs> uefiSettings) {
            this.uefiSettings = uefiSettings;
            return this;
        }

        public Builder setUefiSettings(@Nullable UefiSettingsArgs uefiSettings) {
            this.uefiSettings = Input.ofNullable(uefiSettings);
            return this;
        }
        public SecurityProfileArgs build() {
            return new SecurityProfileArgs(encryptionAtHost, securityType, uefiSettings);
        }
    }
}