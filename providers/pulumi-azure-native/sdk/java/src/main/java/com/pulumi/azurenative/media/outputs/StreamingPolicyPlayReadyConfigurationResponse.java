// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamingPolicyPlayReadyConfigurationResponse {
    /**
     * @return Template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     * 
     */
    private final @Nullable String customLicenseAcquisitionUrlTemplate;
    /**
     * @return Custom attributes for PlayReady
     * 
     */
    private final @Nullable String playReadyCustomAttributes;

    @CustomType.Constructor
    private StreamingPolicyPlayReadyConfigurationResponse(
        @CustomType.Parameter("customLicenseAcquisitionUrlTemplate") @Nullable String customLicenseAcquisitionUrlTemplate,
        @CustomType.Parameter("playReadyCustomAttributes") @Nullable String playReadyCustomAttributes) {
        this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
        this.playReadyCustomAttributes = playReadyCustomAttributes;
    }

    /**
     * @return Template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     * 
     */
    public Optional<String> customLicenseAcquisitionUrlTemplate() {
        return Optional.ofNullable(this.customLicenseAcquisitionUrlTemplate);
    }
    /**
     * @return Custom attributes for PlayReady
     * 
     */
    public Optional<String> playReadyCustomAttributes() {
        return Optional.ofNullable(this.playReadyCustomAttributes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingPolicyPlayReadyConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customLicenseAcquisitionUrlTemplate;
        private @Nullable String playReadyCustomAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingPolicyPlayReadyConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customLicenseAcquisitionUrlTemplate = defaults.customLicenseAcquisitionUrlTemplate;
    	      this.playReadyCustomAttributes = defaults.playReadyCustomAttributes;
        }

        public Builder customLicenseAcquisitionUrlTemplate(@Nullable String customLicenseAcquisitionUrlTemplate) {
            this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
            return this;
        }
        public Builder playReadyCustomAttributes(@Nullable String playReadyCustomAttributes) {
            this.playReadyCustomAttributes = playReadyCustomAttributes;
            return this;
        }        public StreamingPolicyPlayReadyConfigurationResponse build() {
            return new StreamingPolicyPlayReadyConfigurationResponse(customLicenseAcquisitionUrlTemplate, playReadyCustomAttributes);
        }
    }
}
