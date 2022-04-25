// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.azurenative.media.outputs.ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContentKeyPolicyPlayReadyPlayRightResponse {
    /**
     * @return Configures Automatic Gain Control (AGC) and Color Stripe in the license. Must be between 0 and 3 inclusive.
     * 
     */
    private final @Nullable Integer agcAndColorStripeRestriction;
    /**
     * @return Configures Unknown output handling settings of the license.
     * 
     */
    private final String allowPassingVideoContentToUnknownOutput;
    /**
     * @return Specifies the output protection level for compressed digital audio.
     * 
     */
    private final @Nullable Integer analogVideoOpl;
    /**
     * @return Specifies the output protection level for compressed digital audio.
     * 
     */
    private final @Nullable Integer compressedDigitalAudioOpl;
    /**
     * @return Specifies the output protection level for compressed digital video.
     * 
     */
    private final @Nullable Integer compressedDigitalVideoOpl;
    /**
     * @return Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    private final Boolean digitalVideoOnlyContentRestriction;
    /**
     * @return Configures the Explicit Analog Television Output Restriction in the license. Configuration data must be between 0 and 3 inclusive.
     * 
     */
    private final @Nullable ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse explicitAnalogTelevisionOutputRestriction;
    /**
     * @return The amount of time that the license is valid after the license is first used to play content.
     * 
     */
    private final @Nullable String firstPlayExpiration;
    /**
     * @return Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    private final Boolean imageConstraintForAnalogComponentVideoRestriction;
    /**
     * @return Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    private final Boolean imageConstraintForAnalogComputerMonitorRestriction;
    /**
     * @return Configures the Serial Copy Management System (SCMS) in the license. Must be between 0 and 3 inclusive.
     * 
     */
    private final @Nullable Integer scmsRestriction;
    /**
     * @return Specifies the output protection level for uncompressed digital audio.
     * 
     */
    private final @Nullable Integer uncompressedDigitalAudioOpl;
    /**
     * @return Specifies the output protection level for uncompressed digital video.
     * 
     */
    private final @Nullable Integer uncompressedDigitalVideoOpl;

    @CustomType.Constructor
    private ContentKeyPolicyPlayReadyPlayRightResponse(
        @CustomType.Parameter("agcAndColorStripeRestriction") @Nullable Integer agcAndColorStripeRestriction,
        @CustomType.Parameter("allowPassingVideoContentToUnknownOutput") String allowPassingVideoContentToUnknownOutput,
        @CustomType.Parameter("analogVideoOpl") @Nullable Integer analogVideoOpl,
        @CustomType.Parameter("compressedDigitalAudioOpl") @Nullable Integer compressedDigitalAudioOpl,
        @CustomType.Parameter("compressedDigitalVideoOpl") @Nullable Integer compressedDigitalVideoOpl,
        @CustomType.Parameter("digitalVideoOnlyContentRestriction") Boolean digitalVideoOnlyContentRestriction,
        @CustomType.Parameter("explicitAnalogTelevisionOutputRestriction") @Nullable ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse explicitAnalogTelevisionOutputRestriction,
        @CustomType.Parameter("firstPlayExpiration") @Nullable String firstPlayExpiration,
        @CustomType.Parameter("imageConstraintForAnalogComponentVideoRestriction") Boolean imageConstraintForAnalogComponentVideoRestriction,
        @CustomType.Parameter("imageConstraintForAnalogComputerMonitorRestriction") Boolean imageConstraintForAnalogComputerMonitorRestriction,
        @CustomType.Parameter("scmsRestriction") @Nullable Integer scmsRestriction,
        @CustomType.Parameter("uncompressedDigitalAudioOpl") @Nullable Integer uncompressedDigitalAudioOpl,
        @CustomType.Parameter("uncompressedDigitalVideoOpl") @Nullable Integer uncompressedDigitalVideoOpl) {
        this.agcAndColorStripeRestriction = agcAndColorStripeRestriction;
        this.allowPassingVideoContentToUnknownOutput = allowPassingVideoContentToUnknownOutput;
        this.analogVideoOpl = analogVideoOpl;
        this.compressedDigitalAudioOpl = compressedDigitalAudioOpl;
        this.compressedDigitalVideoOpl = compressedDigitalVideoOpl;
        this.digitalVideoOnlyContentRestriction = digitalVideoOnlyContentRestriction;
        this.explicitAnalogTelevisionOutputRestriction = explicitAnalogTelevisionOutputRestriction;
        this.firstPlayExpiration = firstPlayExpiration;
        this.imageConstraintForAnalogComponentVideoRestriction = imageConstraintForAnalogComponentVideoRestriction;
        this.imageConstraintForAnalogComputerMonitorRestriction = imageConstraintForAnalogComputerMonitorRestriction;
        this.scmsRestriction = scmsRestriction;
        this.uncompressedDigitalAudioOpl = uncompressedDigitalAudioOpl;
        this.uncompressedDigitalVideoOpl = uncompressedDigitalVideoOpl;
    }

    /**
     * @return Configures Automatic Gain Control (AGC) and Color Stripe in the license. Must be between 0 and 3 inclusive.
     * 
     */
    public Optional<Integer> agcAndColorStripeRestriction() {
        return Optional.ofNullable(this.agcAndColorStripeRestriction);
    }
    /**
     * @return Configures Unknown output handling settings of the license.
     * 
     */
    public String allowPassingVideoContentToUnknownOutput() {
        return this.allowPassingVideoContentToUnknownOutput;
    }
    /**
     * @return Specifies the output protection level for compressed digital audio.
     * 
     */
    public Optional<Integer> analogVideoOpl() {
        return Optional.ofNullable(this.analogVideoOpl);
    }
    /**
     * @return Specifies the output protection level for compressed digital audio.
     * 
     */
    public Optional<Integer> compressedDigitalAudioOpl() {
        return Optional.ofNullable(this.compressedDigitalAudioOpl);
    }
    /**
     * @return Specifies the output protection level for compressed digital video.
     * 
     */
    public Optional<Integer> compressedDigitalVideoOpl() {
        return Optional.ofNullable(this.compressedDigitalVideoOpl);
    }
    /**
     * @return Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    public Boolean digitalVideoOnlyContentRestriction() {
        return this.digitalVideoOnlyContentRestriction;
    }
    /**
     * @return Configures the Explicit Analog Television Output Restriction in the license. Configuration data must be between 0 and 3 inclusive.
     * 
     */
    public Optional<ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse> explicitAnalogTelevisionOutputRestriction() {
        return Optional.ofNullable(this.explicitAnalogTelevisionOutputRestriction);
    }
    /**
     * @return The amount of time that the license is valid after the license is first used to play content.
     * 
     */
    public Optional<String> firstPlayExpiration() {
        return Optional.ofNullable(this.firstPlayExpiration);
    }
    /**
     * @return Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    public Boolean imageConstraintForAnalogComponentVideoRestriction() {
        return this.imageConstraintForAnalogComponentVideoRestriction;
    }
    /**
     * @return Enables the Image Constraint For Analog Component Video Restriction in the license.
     * 
     */
    public Boolean imageConstraintForAnalogComputerMonitorRestriction() {
        return this.imageConstraintForAnalogComputerMonitorRestriction;
    }
    /**
     * @return Configures the Serial Copy Management System (SCMS) in the license. Must be between 0 and 3 inclusive.
     * 
     */
    public Optional<Integer> scmsRestriction() {
        return Optional.ofNullable(this.scmsRestriction);
    }
    /**
     * @return Specifies the output protection level for uncompressed digital audio.
     * 
     */
    public Optional<Integer> uncompressedDigitalAudioOpl() {
        return Optional.ofNullable(this.uncompressedDigitalAudioOpl);
    }
    /**
     * @return Specifies the output protection level for uncompressed digital video.
     * 
     */
    public Optional<Integer> uncompressedDigitalVideoOpl() {
        return Optional.ofNullable(this.uncompressedDigitalVideoOpl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPlayReadyPlayRightResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer agcAndColorStripeRestriction;
        private String allowPassingVideoContentToUnknownOutput;
        private @Nullable Integer analogVideoOpl;
        private @Nullable Integer compressedDigitalAudioOpl;
        private @Nullable Integer compressedDigitalVideoOpl;
        private Boolean digitalVideoOnlyContentRestriction;
        private @Nullable ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse explicitAnalogTelevisionOutputRestriction;
        private @Nullable String firstPlayExpiration;
        private Boolean imageConstraintForAnalogComponentVideoRestriction;
        private Boolean imageConstraintForAnalogComputerMonitorRestriction;
        private @Nullable Integer scmsRestriction;
        private @Nullable Integer uncompressedDigitalAudioOpl;
        private @Nullable Integer uncompressedDigitalVideoOpl;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPlayReadyPlayRightResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agcAndColorStripeRestriction = defaults.agcAndColorStripeRestriction;
    	      this.allowPassingVideoContentToUnknownOutput = defaults.allowPassingVideoContentToUnknownOutput;
    	      this.analogVideoOpl = defaults.analogVideoOpl;
    	      this.compressedDigitalAudioOpl = defaults.compressedDigitalAudioOpl;
    	      this.compressedDigitalVideoOpl = defaults.compressedDigitalVideoOpl;
    	      this.digitalVideoOnlyContentRestriction = defaults.digitalVideoOnlyContentRestriction;
    	      this.explicitAnalogTelevisionOutputRestriction = defaults.explicitAnalogTelevisionOutputRestriction;
    	      this.firstPlayExpiration = defaults.firstPlayExpiration;
    	      this.imageConstraintForAnalogComponentVideoRestriction = defaults.imageConstraintForAnalogComponentVideoRestriction;
    	      this.imageConstraintForAnalogComputerMonitorRestriction = defaults.imageConstraintForAnalogComputerMonitorRestriction;
    	      this.scmsRestriction = defaults.scmsRestriction;
    	      this.uncompressedDigitalAudioOpl = defaults.uncompressedDigitalAudioOpl;
    	      this.uncompressedDigitalVideoOpl = defaults.uncompressedDigitalVideoOpl;
        }

        public Builder agcAndColorStripeRestriction(@Nullable Integer agcAndColorStripeRestriction) {
            this.agcAndColorStripeRestriction = agcAndColorStripeRestriction;
            return this;
        }
        public Builder allowPassingVideoContentToUnknownOutput(String allowPassingVideoContentToUnknownOutput) {
            this.allowPassingVideoContentToUnknownOutput = Objects.requireNonNull(allowPassingVideoContentToUnknownOutput);
            return this;
        }
        public Builder analogVideoOpl(@Nullable Integer analogVideoOpl) {
            this.analogVideoOpl = analogVideoOpl;
            return this;
        }
        public Builder compressedDigitalAudioOpl(@Nullable Integer compressedDigitalAudioOpl) {
            this.compressedDigitalAudioOpl = compressedDigitalAudioOpl;
            return this;
        }
        public Builder compressedDigitalVideoOpl(@Nullable Integer compressedDigitalVideoOpl) {
            this.compressedDigitalVideoOpl = compressedDigitalVideoOpl;
            return this;
        }
        public Builder digitalVideoOnlyContentRestriction(Boolean digitalVideoOnlyContentRestriction) {
            this.digitalVideoOnlyContentRestriction = Objects.requireNonNull(digitalVideoOnlyContentRestriction);
            return this;
        }
        public Builder explicitAnalogTelevisionOutputRestriction(@Nullable ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse explicitAnalogTelevisionOutputRestriction) {
            this.explicitAnalogTelevisionOutputRestriction = explicitAnalogTelevisionOutputRestriction;
            return this;
        }
        public Builder firstPlayExpiration(@Nullable String firstPlayExpiration) {
            this.firstPlayExpiration = firstPlayExpiration;
            return this;
        }
        public Builder imageConstraintForAnalogComponentVideoRestriction(Boolean imageConstraintForAnalogComponentVideoRestriction) {
            this.imageConstraintForAnalogComponentVideoRestriction = Objects.requireNonNull(imageConstraintForAnalogComponentVideoRestriction);
            return this;
        }
        public Builder imageConstraintForAnalogComputerMonitorRestriction(Boolean imageConstraintForAnalogComputerMonitorRestriction) {
            this.imageConstraintForAnalogComputerMonitorRestriction = Objects.requireNonNull(imageConstraintForAnalogComputerMonitorRestriction);
            return this;
        }
        public Builder scmsRestriction(@Nullable Integer scmsRestriction) {
            this.scmsRestriction = scmsRestriction;
            return this;
        }
        public Builder uncompressedDigitalAudioOpl(@Nullable Integer uncompressedDigitalAudioOpl) {
            this.uncompressedDigitalAudioOpl = uncompressedDigitalAudioOpl;
            return this;
        }
        public Builder uncompressedDigitalVideoOpl(@Nullable Integer uncompressedDigitalVideoOpl) {
            this.uncompressedDigitalVideoOpl = uncompressedDigitalVideoOpl;
            return this;
        }        public ContentKeyPolicyPlayReadyPlayRightResponse build() {
            return new ContentKeyPolicyPlayReadyPlayRightResponse(agcAndColorStripeRestriction, allowPassingVideoContentToUnknownOutput, analogVideoOpl, compressedDigitalAudioOpl, compressedDigitalVideoOpl, digitalVideoOnlyContentRestriction, explicitAnalogTelevisionOutputRestriction, firstPlayExpiration, imageConstraintForAnalogComponentVideoRestriction, imageConstraintForAnalogComputerMonitorRestriction, scmsRestriction, uncompressedDigitalAudioOpl, uncompressedDigitalVideoOpl);
        }
    }
}
