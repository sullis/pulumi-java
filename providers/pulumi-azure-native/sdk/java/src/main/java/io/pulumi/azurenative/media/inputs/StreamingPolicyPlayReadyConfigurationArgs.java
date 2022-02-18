// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Class to specify configurations of PlayReady in Streaming Policy
 * 
 */
public final class StreamingPolicyPlayReadyConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamingPolicyPlayReadyConfigurationArgs Empty = new StreamingPolicyPlayReadyConfigurationArgs();

    /**
     * Template for the URL of the custom service delivering licenses to end user players.  Not required when using Azure Media Services for issuing licenses.  The template supports replaceable tokens that the service will update at runtime with the value specific to the request.  The currently supported token values are {AlternativeMediaId}, which is replaced with the value of StreamingLocatorId.AlternativeMediaId, and {ContentKeyId}, which is replaced with the value of identifier of the key being requested.
     * 
     */
    @InputImport(name="customLicenseAcquisitionUrlTemplate")
    private final @Nullable Input<String> customLicenseAcquisitionUrlTemplate;

    public Input<String> getCustomLicenseAcquisitionUrlTemplate() {
        return this.customLicenseAcquisitionUrlTemplate == null ? Input.empty() : this.customLicenseAcquisitionUrlTemplate;
    }

    /**
     * Custom attributes for PlayReady
     * 
     */
    @InputImport(name="playReadyCustomAttributes")
    private final @Nullable Input<String> playReadyCustomAttributes;

    public Input<String> getPlayReadyCustomAttributes() {
        return this.playReadyCustomAttributes == null ? Input.empty() : this.playReadyCustomAttributes;
    }

    public StreamingPolicyPlayReadyConfigurationArgs(
        @Nullable Input<String> customLicenseAcquisitionUrlTemplate,
        @Nullable Input<String> playReadyCustomAttributes) {
        this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
        this.playReadyCustomAttributes = playReadyCustomAttributes;
    }

    private StreamingPolicyPlayReadyConfigurationArgs() {
        this.customLicenseAcquisitionUrlTemplate = Input.empty();
        this.playReadyCustomAttributes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingPolicyPlayReadyConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> customLicenseAcquisitionUrlTemplate;
        private @Nullable Input<String> playReadyCustomAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingPolicyPlayReadyConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customLicenseAcquisitionUrlTemplate = defaults.customLicenseAcquisitionUrlTemplate;
    	      this.playReadyCustomAttributes = defaults.playReadyCustomAttributes;
        }

        public Builder setCustomLicenseAcquisitionUrlTemplate(@Nullable Input<String> customLicenseAcquisitionUrlTemplate) {
            this.customLicenseAcquisitionUrlTemplate = customLicenseAcquisitionUrlTemplate;
            return this;
        }

        public Builder setCustomLicenseAcquisitionUrlTemplate(@Nullable String customLicenseAcquisitionUrlTemplate) {
            this.customLicenseAcquisitionUrlTemplate = Input.ofNullable(customLicenseAcquisitionUrlTemplate);
            return this;
        }

        public Builder setPlayReadyCustomAttributes(@Nullable Input<String> playReadyCustomAttributes) {
            this.playReadyCustomAttributes = playReadyCustomAttributes;
            return this;
        }

        public Builder setPlayReadyCustomAttributes(@Nullable String playReadyCustomAttributes) {
            this.playReadyCustomAttributes = Input.ofNullable(playReadyCustomAttributes);
            return this;
        }

        public StreamingPolicyPlayReadyConfigurationArgs build() {
            return new StreamingPolicyPlayReadyConfigurationArgs(customLicenseAcquisitionUrlTemplate, playReadyCustomAttributes);
        }
    }
}
