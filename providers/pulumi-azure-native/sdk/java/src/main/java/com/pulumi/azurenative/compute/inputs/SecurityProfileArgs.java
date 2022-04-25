// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.SecurityTypes;
import com.pulumi.azurenative.compute.inputs.UefiSettingsArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the Security profile settings for the virtual machine or virtual machine scale set.
 * 
 */
public final class SecurityProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityProfileArgs Empty = new SecurityProfileArgs();

    /**
     * This property can be used by user in the request to enable or disable the Host Encryption for the virtual machine or virtual machine scale set. This will enable the encryption for all the disks including Resource/Temp disk at host itself. &lt;br&gt;&lt;br&gt; Default: The Encryption at host will be disabled unless this property is set to true for the resource.
     * 
     */
    @Import(name="encryptionAtHost")
    private @Nullable Output<Boolean> encryptionAtHost;

    /**
     * @return This property can be used by user in the request to enable or disable the Host Encryption for the virtual machine or virtual machine scale set. This will enable the encryption for all the disks including Resource/Temp disk at host itself. &lt;br&gt;&lt;br&gt; Default: The Encryption at host will be disabled unless this property is set to true for the resource.
     * 
     */
    public Optional<Output<Boolean>> encryptionAtHost() {
        return Optional.ofNullable(this.encryptionAtHost);
    }

    /**
     * Specifies the SecurityType of the virtual machine. It is set as TrustedLaunch to enable UefiSettings. &lt;br&gt;&lt;br&gt; Default: UefiSettings will not be enabled unless this property is set as TrustedLaunch.
     * 
     */
    @Import(name="securityType")
    private @Nullable Output<Either<String,SecurityTypes>> securityType;

    /**
     * @return Specifies the SecurityType of the virtual machine. It is set as TrustedLaunch to enable UefiSettings. &lt;br&gt;&lt;br&gt; Default: UefiSettings will not be enabled unless this property is set as TrustedLaunch.
     * 
     */
    public Optional<Output<Either<String,SecurityTypes>>> securityType() {
        return Optional.ofNullable(this.securityType);
    }

    /**
     * Specifies the security settings like secure boot and vTPM used while creating the virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-12-01
     * 
     */
    @Import(name="uefiSettings")
    private @Nullable Output<UefiSettingsArgs> uefiSettings;

    /**
     * @return Specifies the security settings like secure boot and vTPM used while creating the virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-12-01
     * 
     */
    public Optional<Output<UefiSettingsArgs>> uefiSettings() {
        return Optional.ofNullable(this.uefiSettings);
    }

    private SecurityProfileArgs() {}

    private SecurityProfileArgs(SecurityProfileArgs $) {
        this.encryptionAtHost = $.encryptionAtHost;
        this.securityType = $.securityType;
        this.uefiSettings = $.uefiSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityProfileArgs $;

        public Builder() {
            $ = new SecurityProfileArgs();
        }

        public Builder(SecurityProfileArgs defaults) {
            $ = new SecurityProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encryptionAtHost This property can be used by user in the request to enable or disable the Host Encryption for the virtual machine or virtual machine scale set. This will enable the encryption for all the disks including Resource/Temp disk at host itself. &lt;br&gt;&lt;br&gt; Default: The Encryption at host will be disabled unless this property is set to true for the resource.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAtHost(@Nullable Output<Boolean> encryptionAtHost) {
            $.encryptionAtHost = encryptionAtHost;
            return this;
        }

        /**
         * @param encryptionAtHost This property can be used by user in the request to enable or disable the Host Encryption for the virtual machine or virtual machine scale set. This will enable the encryption for all the disks including Resource/Temp disk at host itself. &lt;br&gt;&lt;br&gt; Default: The Encryption at host will be disabled unless this property is set to true for the resource.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAtHost(Boolean encryptionAtHost) {
            return encryptionAtHost(Output.of(encryptionAtHost));
        }

        /**
         * @param securityType Specifies the SecurityType of the virtual machine. It is set as TrustedLaunch to enable UefiSettings. &lt;br&gt;&lt;br&gt; Default: UefiSettings will not be enabled unless this property is set as TrustedLaunch.
         * 
         * @return builder
         * 
         */
        public Builder securityType(@Nullable Output<Either<String,SecurityTypes>> securityType) {
            $.securityType = securityType;
            return this;
        }

        /**
         * @param securityType Specifies the SecurityType of the virtual machine. It is set as TrustedLaunch to enable UefiSettings. &lt;br&gt;&lt;br&gt; Default: UefiSettings will not be enabled unless this property is set as TrustedLaunch.
         * 
         * @return builder
         * 
         */
        public Builder securityType(Either<String,SecurityTypes> securityType) {
            return securityType(Output.of(securityType));
        }

        /**
         * @param securityType Specifies the SecurityType of the virtual machine. It is set as TrustedLaunch to enable UefiSettings. &lt;br&gt;&lt;br&gt; Default: UefiSettings will not be enabled unless this property is set as TrustedLaunch.
         * 
         * @return builder
         * 
         */
        public Builder securityType(String securityType) {
            return securityType(Either.ofLeft(securityType));
        }

        /**
         * @param securityType Specifies the SecurityType of the virtual machine. It is set as TrustedLaunch to enable UefiSettings. &lt;br&gt;&lt;br&gt; Default: UefiSettings will not be enabled unless this property is set as TrustedLaunch.
         * 
         * @return builder
         * 
         */
        public Builder securityType(SecurityTypes securityType) {
            return securityType(Either.ofRight(securityType));
        }

        /**
         * @param uefiSettings Specifies the security settings like secure boot and vTPM used while creating the virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-12-01
         * 
         * @return builder
         * 
         */
        public Builder uefiSettings(@Nullable Output<UefiSettingsArgs> uefiSettings) {
            $.uefiSettings = uefiSettings;
            return this;
        }

        /**
         * @param uefiSettings Specifies the security settings like secure boot and vTPM used while creating the virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-12-01
         * 
         * @return builder
         * 
         */
        public Builder uefiSettings(UefiSettingsArgs uefiSettings) {
            return uefiSettings(Output.of(uefiSettings));
        }

        public SecurityProfileArgs build() {
            return $;
        }
    }

}
