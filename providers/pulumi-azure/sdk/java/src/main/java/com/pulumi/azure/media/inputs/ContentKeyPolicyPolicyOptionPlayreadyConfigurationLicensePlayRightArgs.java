// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightArgs Empty = new ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightArgs();

    /**
     * Configures Automatic Gain Control (AGC) and Color Stripe in the license. Must be between 0 and 3 inclusive.
     * 
     */
    @Import(name="agcAndColorStripeRestriction")
    private @Nullable Output<Integer> agcAndColorStripeRestriction;

    /**
     * @return Configures Automatic Gain Control (AGC) and Color Stripe in the license. Must be between 0 and 3 inclusive.
     * 
     */
    public Optional<Output<Integer>> agcAndColorStripeRestriction() {
        return Optional.ofNullable(this.agcAndColorStripeRestriction);
    }

    /**
     * Configures Unknown output handling settings of the license. Supported values are `Allowed`, `AllowedWithVideoConstriction` or `NotAllowed`.
     * 
     */
    @Import(name="allowPassingVideoContentToUnknownOutput")
    private @Nullable Output<String> allowPassingVideoContentToUnknownOutput;

    /**
     * @return Configures Unknown output handling settings of the license. Supported values are `Allowed`, `AllowedWithVideoConstriction` or `NotAllowed`.
     * 
     */
    public Optional<Output<String>> allowPassingVideoContentToUnknownOutput() {
        return Optional.ofNullable(this.allowPassingVideoContentToUnknownOutput);
    }

    /**
     * Specifies the output protection level for compressed digital audio. Supported values are 100, 150 or 200.
     * 
     */
    @Import(name="analogVideoOpl")
    private @Nullable Output<Integer> analogVideoOpl;

    /**
     * @return Specifies the output protection level for compressed digital audio. Supported values are 100, 150 or 200.
     * 
     */
    public Optional<Output<Integer>> analogVideoOpl() {
        return Optional.ofNullable(this.analogVideoOpl);
    }

    /**
     * Specifies the output protection level for compressed digital audio.Supported values are 100, 150 or 200.
     * 
     */
    @Import(name="compressedDigitalAudioOpl")
    private @Nullable Output<Integer> compressedDigitalAudioOpl;

    /**
     * @return Specifies the output protection level for compressed digital audio.Supported values are 100, 150 or 200.
     * 
     */
    public Optional<Output<Integer>> compressedDigitalAudioOpl() {
        return Optional.ofNullable(this.compressedDigitalAudioOpl);
    }

    /**
     * Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    @Import(name="digitalVideoOnlyContentRestriction")
    private @Nullable Output<Boolean> digitalVideoOnlyContentRestriction;

    /**
     * @return Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    public Optional<Output<Boolean>> digitalVideoOnlyContentRestriction() {
        return Optional.ofNullable(this.digitalVideoOnlyContentRestriction);
    }

    /**
     * The amount of time that the license is valid after the license is first used to play content.
     * 
     */
    @Import(name="firstPlayExpiration")
    private @Nullable Output<String> firstPlayExpiration;

    /**
     * @return The amount of time that the license is valid after the license is first used to play content.
     * 
     */
    public Optional<Output<String>> firstPlayExpiration() {
        return Optional.ofNullable(this.firstPlayExpiration);
    }

    /**
     * Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    @Import(name="imageConstraintForAnalogComponentVideoRestriction")
    private @Nullable Output<Boolean> imageConstraintForAnalogComponentVideoRestriction;

    /**
     * @return Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    public Optional<Output<Boolean>> imageConstraintForAnalogComponentVideoRestriction() {
        return Optional.ofNullable(this.imageConstraintForAnalogComponentVideoRestriction);
    }

    /**
     * Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    @Import(name="imageConstraintForAnalogComputerMonitorRestriction")
    private @Nullable Output<Boolean> imageConstraintForAnalogComputerMonitorRestriction;

    /**
     * @return Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    public Optional<Output<Boolean>> imageConstraintForAnalogComputerMonitorRestriction() {
        return Optional.ofNullable(this.imageConstraintForAnalogComputerMonitorRestriction);
    }

    /**
     * Configures the Serial Copy Management System (SCMS) in the license. Must be between 0 and 3 inclusive.
     * 
     */
    @Import(name="scmsRestriction")
    private @Nullable Output<Integer> scmsRestriction;

    /**
     * @return Configures the Serial Copy Management System (SCMS) in the license. Must be between 0 and 3 inclusive.
     * 
     */
    public Optional<Output<Integer>> scmsRestriction() {
        return Optional.ofNullable(this.scmsRestriction);
    }

    /**
     * Specifies the output protection level for uncompressed digital audio. Supported values are 100, 150, 250 or 300.
     * 
     */
    @Import(name="uncompressedDigitalAudioOpl")
    private @Nullable Output<Integer> uncompressedDigitalAudioOpl;

    /**
     * @return Specifies the output protection level for uncompressed digital audio. Supported values are 100, 150, 250 or 300.
     * 
     */
    public Optional<Output<Integer>> uncompressedDigitalAudioOpl() {
        return Optional.ofNullable(this.uncompressedDigitalAudioOpl);
    }

    /**
     * Specifies the output protection level for uncompressed digital video. Supported values are 100, 150, 250 or 300.
     * 
     */
    @Import(name="uncompressedDigitalVideoOpl")
    private @Nullable Output<Integer> uncompressedDigitalVideoOpl;

    /**
     * @return Specifies the output protection level for uncompressed digital video. Supported values are 100, 150, 250 or 300.
     * 
     */
    public Optional<Output<Integer>> uncompressedDigitalVideoOpl() {
        return Optional.ofNullable(this.uncompressedDigitalVideoOpl);
    }

    private ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightArgs() {}

    private ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightArgs(ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightArgs $) {
        this.agcAndColorStripeRestriction = $.agcAndColorStripeRestriction;
        this.allowPassingVideoContentToUnknownOutput = $.allowPassingVideoContentToUnknownOutput;
        this.analogVideoOpl = $.analogVideoOpl;
        this.compressedDigitalAudioOpl = $.compressedDigitalAudioOpl;
        this.digitalVideoOnlyContentRestriction = $.digitalVideoOnlyContentRestriction;
        this.firstPlayExpiration = $.firstPlayExpiration;
        this.imageConstraintForAnalogComponentVideoRestriction = $.imageConstraintForAnalogComponentVideoRestriction;
        this.imageConstraintForAnalogComputerMonitorRestriction = $.imageConstraintForAnalogComputerMonitorRestriction;
        this.scmsRestriction = $.scmsRestriction;
        this.uncompressedDigitalAudioOpl = $.uncompressedDigitalAudioOpl;
        this.uncompressedDigitalVideoOpl = $.uncompressedDigitalVideoOpl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightArgs $;

        public Builder() {
            $ = new ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightArgs();
        }

        public Builder(ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightArgs defaults) {
            $ = new ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param agcAndColorStripeRestriction Configures Automatic Gain Control (AGC) and Color Stripe in the license. Must be between 0 and 3 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder agcAndColorStripeRestriction(@Nullable Output<Integer> agcAndColorStripeRestriction) {
            $.agcAndColorStripeRestriction = agcAndColorStripeRestriction;
            return this;
        }

        /**
         * @param agcAndColorStripeRestriction Configures Automatic Gain Control (AGC) and Color Stripe in the license. Must be between 0 and 3 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder agcAndColorStripeRestriction(Integer agcAndColorStripeRestriction) {
            return agcAndColorStripeRestriction(Output.of(agcAndColorStripeRestriction));
        }

        /**
         * @param allowPassingVideoContentToUnknownOutput Configures Unknown output handling settings of the license. Supported values are `Allowed`, `AllowedWithVideoConstriction` or `NotAllowed`.
         * 
         * @return builder
         * 
         */
        public Builder allowPassingVideoContentToUnknownOutput(@Nullable Output<String> allowPassingVideoContentToUnknownOutput) {
            $.allowPassingVideoContentToUnknownOutput = allowPassingVideoContentToUnknownOutput;
            return this;
        }

        /**
         * @param allowPassingVideoContentToUnknownOutput Configures Unknown output handling settings of the license. Supported values are `Allowed`, `AllowedWithVideoConstriction` or `NotAllowed`.
         * 
         * @return builder
         * 
         */
        public Builder allowPassingVideoContentToUnknownOutput(String allowPassingVideoContentToUnknownOutput) {
            return allowPassingVideoContentToUnknownOutput(Output.of(allowPassingVideoContentToUnknownOutput));
        }

        /**
         * @param analogVideoOpl Specifies the output protection level for compressed digital audio. Supported values are 100, 150 or 200.
         * 
         * @return builder
         * 
         */
        public Builder analogVideoOpl(@Nullable Output<Integer> analogVideoOpl) {
            $.analogVideoOpl = analogVideoOpl;
            return this;
        }

        /**
         * @param analogVideoOpl Specifies the output protection level for compressed digital audio. Supported values are 100, 150 or 200.
         * 
         * @return builder
         * 
         */
        public Builder analogVideoOpl(Integer analogVideoOpl) {
            return analogVideoOpl(Output.of(analogVideoOpl));
        }

        /**
         * @param compressedDigitalAudioOpl Specifies the output protection level for compressed digital audio.Supported values are 100, 150 or 200.
         * 
         * @return builder
         * 
         */
        public Builder compressedDigitalAudioOpl(@Nullable Output<Integer> compressedDigitalAudioOpl) {
            $.compressedDigitalAudioOpl = compressedDigitalAudioOpl;
            return this;
        }

        /**
         * @param compressedDigitalAudioOpl Specifies the output protection level for compressed digital audio.Supported values are 100, 150 or 200.
         * 
         * @return builder
         * 
         */
        public Builder compressedDigitalAudioOpl(Integer compressedDigitalAudioOpl) {
            return compressedDigitalAudioOpl(Output.of(compressedDigitalAudioOpl));
        }

        /**
         * @param digitalVideoOnlyContentRestriction Enables the Image Constraint For Analog Component Video Restriction in the license.
         * 
         * @return builder
         * 
         */
        public Builder digitalVideoOnlyContentRestriction(@Nullable Output<Boolean> digitalVideoOnlyContentRestriction) {
            $.digitalVideoOnlyContentRestriction = digitalVideoOnlyContentRestriction;
            return this;
        }

        /**
         * @param digitalVideoOnlyContentRestriction Enables the Image Constraint For Analog Component Video Restriction in the license.
         * 
         * @return builder
         * 
         */
        public Builder digitalVideoOnlyContentRestriction(Boolean digitalVideoOnlyContentRestriction) {
            return digitalVideoOnlyContentRestriction(Output.of(digitalVideoOnlyContentRestriction));
        }

        /**
         * @param firstPlayExpiration The amount of time that the license is valid after the license is first used to play content.
         * 
         * @return builder
         * 
         */
        public Builder firstPlayExpiration(@Nullable Output<String> firstPlayExpiration) {
            $.firstPlayExpiration = firstPlayExpiration;
            return this;
        }

        /**
         * @param firstPlayExpiration The amount of time that the license is valid after the license is first used to play content.
         * 
         * @return builder
         * 
         */
        public Builder firstPlayExpiration(String firstPlayExpiration) {
            return firstPlayExpiration(Output.of(firstPlayExpiration));
        }

        /**
         * @param imageConstraintForAnalogComponentVideoRestriction Enables the Image Constraint For Analog Component Video Restriction in the license.
         * 
         * @return builder
         * 
         */
        public Builder imageConstraintForAnalogComponentVideoRestriction(@Nullable Output<Boolean> imageConstraintForAnalogComponentVideoRestriction) {
            $.imageConstraintForAnalogComponentVideoRestriction = imageConstraintForAnalogComponentVideoRestriction;
            return this;
        }

        /**
         * @param imageConstraintForAnalogComponentVideoRestriction Enables the Image Constraint For Analog Component Video Restriction in the license.
         * 
         * @return builder
         * 
         */
        public Builder imageConstraintForAnalogComponentVideoRestriction(Boolean imageConstraintForAnalogComponentVideoRestriction) {
            return imageConstraintForAnalogComponentVideoRestriction(Output.of(imageConstraintForAnalogComponentVideoRestriction));
        }

        /**
         * @param imageConstraintForAnalogComputerMonitorRestriction Enables the Image Constraint For Analog Component Video Restriction in the license.
         * 
         * @return builder
         * 
         */
        public Builder imageConstraintForAnalogComputerMonitorRestriction(@Nullable Output<Boolean> imageConstraintForAnalogComputerMonitorRestriction) {
            $.imageConstraintForAnalogComputerMonitorRestriction = imageConstraintForAnalogComputerMonitorRestriction;
            return this;
        }

        /**
         * @param imageConstraintForAnalogComputerMonitorRestriction Enables the Image Constraint For Analog Component Video Restriction in the license.
         * 
         * @return builder
         * 
         */
        public Builder imageConstraintForAnalogComputerMonitorRestriction(Boolean imageConstraintForAnalogComputerMonitorRestriction) {
            return imageConstraintForAnalogComputerMonitorRestriction(Output.of(imageConstraintForAnalogComputerMonitorRestriction));
        }

        /**
         * @param scmsRestriction Configures the Serial Copy Management System (SCMS) in the license. Must be between 0 and 3 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder scmsRestriction(@Nullable Output<Integer> scmsRestriction) {
            $.scmsRestriction = scmsRestriction;
            return this;
        }

        /**
         * @param scmsRestriction Configures the Serial Copy Management System (SCMS) in the license. Must be between 0 and 3 inclusive.
         * 
         * @return builder
         * 
         */
        public Builder scmsRestriction(Integer scmsRestriction) {
            return scmsRestriction(Output.of(scmsRestriction));
        }

        /**
         * @param uncompressedDigitalAudioOpl Specifies the output protection level for uncompressed digital audio. Supported values are 100, 150, 250 or 300.
         * 
         * @return builder
         * 
         */
        public Builder uncompressedDigitalAudioOpl(@Nullable Output<Integer> uncompressedDigitalAudioOpl) {
            $.uncompressedDigitalAudioOpl = uncompressedDigitalAudioOpl;
            return this;
        }

        /**
         * @param uncompressedDigitalAudioOpl Specifies the output protection level for uncompressed digital audio. Supported values are 100, 150, 250 or 300.
         * 
         * @return builder
         * 
         */
        public Builder uncompressedDigitalAudioOpl(Integer uncompressedDigitalAudioOpl) {
            return uncompressedDigitalAudioOpl(Output.of(uncompressedDigitalAudioOpl));
        }

        /**
         * @param uncompressedDigitalVideoOpl Specifies the output protection level for uncompressed digital video. Supported values are 100, 150, 250 or 300.
         * 
         * @return builder
         * 
         */
        public Builder uncompressedDigitalVideoOpl(@Nullable Output<Integer> uncompressedDigitalVideoOpl) {
            $.uncompressedDigitalVideoOpl = uncompressedDigitalVideoOpl;
            return this;
        }

        /**
         * @param uncompressedDigitalVideoOpl Specifies the output protection level for uncompressed digital video. Supported values are 100, 150, 250 or 300.
         * 
         * @return builder
         * 
         */
        public Builder uncompressedDigitalVideoOpl(Integer uncompressedDigitalVideoOpl) {
            return uncompressedDigitalVideoOpl(Output.of(uncompressedDigitalVideoOpl));
        }

        public ContentKeyPolicyPolicyOptionPlayreadyConfigurationLicensePlayRightArgs build() {
            return $;
        }
    }

}
