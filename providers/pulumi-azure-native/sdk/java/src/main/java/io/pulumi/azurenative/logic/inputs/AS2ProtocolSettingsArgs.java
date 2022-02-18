// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.AS2AcknowledgementConnectionSettingsArgs;
import io.pulumi.azurenative.logic.inputs.AS2EnvelopeSettingsArgs;
import io.pulumi.azurenative.logic.inputs.AS2ErrorSettingsArgs;
import io.pulumi.azurenative.logic.inputs.AS2MdnSettingsArgs;
import io.pulumi.azurenative.logic.inputs.AS2MessageConnectionSettingsArgs;
import io.pulumi.azurenative.logic.inputs.AS2SecuritySettingsArgs;
import io.pulumi.azurenative.logic.inputs.AS2ValidationSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


/**
 * The AS2 agreement protocol settings.
 * 
 */
public final class AS2ProtocolSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AS2ProtocolSettingsArgs Empty = new AS2ProtocolSettingsArgs();

    /**
     * The acknowledgement connection settings.
     * 
     */
    @InputImport(name="acknowledgementConnectionSettings", required=true)
    private final Input<AS2AcknowledgementConnectionSettingsArgs> acknowledgementConnectionSettings;

    public Input<AS2AcknowledgementConnectionSettingsArgs> getAcknowledgementConnectionSettings() {
        return this.acknowledgementConnectionSettings;
    }

    /**
     * The envelope settings.
     * 
     */
    @InputImport(name="envelopeSettings", required=true)
    private final Input<AS2EnvelopeSettingsArgs> envelopeSettings;

    public Input<AS2EnvelopeSettingsArgs> getEnvelopeSettings() {
        return this.envelopeSettings;
    }

    /**
     * The error settings.
     * 
     */
    @InputImport(name="errorSettings", required=true)
    private final Input<AS2ErrorSettingsArgs> errorSettings;

    public Input<AS2ErrorSettingsArgs> getErrorSettings() {
        return this.errorSettings;
    }

    /**
     * The MDN settings.
     * 
     */
    @InputImport(name="mdnSettings", required=true)
    private final Input<AS2MdnSettingsArgs> mdnSettings;

    public Input<AS2MdnSettingsArgs> getMdnSettings() {
        return this.mdnSettings;
    }

    /**
     * The message connection settings.
     * 
     */
    @InputImport(name="messageConnectionSettings", required=true)
    private final Input<AS2MessageConnectionSettingsArgs> messageConnectionSettings;

    public Input<AS2MessageConnectionSettingsArgs> getMessageConnectionSettings() {
        return this.messageConnectionSettings;
    }

    /**
     * The security settings.
     * 
     */
    @InputImport(name="securitySettings", required=true)
    private final Input<AS2SecuritySettingsArgs> securitySettings;

    public Input<AS2SecuritySettingsArgs> getSecuritySettings() {
        return this.securitySettings;
    }

    /**
     * The validation settings.
     * 
     */
    @InputImport(name="validationSettings", required=true)
    private final Input<AS2ValidationSettingsArgs> validationSettings;

    public Input<AS2ValidationSettingsArgs> getValidationSettings() {
        return this.validationSettings;
    }

    public AS2ProtocolSettingsArgs(
        Input<AS2AcknowledgementConnectionSettingsArgs> acknowledgementConnectionSettings,
        Input<AS2EnvelopeSettingsArgs> envelopeSettings,
        Input<AS2ErrorSettingsArgs> errorSettings,
        Input<AS2MdnSettingsArgs> mdnSettings,
        Input<AS2MessageConnectionSettingsArgs> messageConnectionSettings,
        Input<AS2SecuritySettingsArgs> securitySettings,
        Input<AS2ValidationSettingsArgs> validationSettings) {
        this.acknowledgementConnectionSettings = Objects.requireNonNull(acknowledgementConnectionSettings, "expected parameter 'acknowledgementConnectionSettings' to be non-null");
        this.envelopeSettings = Objects.requireNonNull(envelopeSettings, "expected parameter 'envelopeSettings' to be non-null");
        this.errorSettings = Objects.requireNonNull(errorSettings, "expected parameter 'errorSettings' to be non-null");
        this.mdnSettings = Objects.requireNonNull(mdnSettings, "expected parameter 'mdnSettings' to be non-null");
        this.messageConnectionSettings = Objects.requireNonNull(messageConnectionSettings, "expected parameter 'messageConnectionSettings' to be non-null");
        this.securitySettings = Objects.requireNonNull(securitySettings, "expected parameter 'securitySettings' to be non-null");
        this.validationSettings = Objects.requireNonNull(validationSettings, "expected parameter 'validationSettings' to be non-null");
    }

    private AS2ProtocolSettingsArgs() {
        this.acknowledgementConnectionSettings = Input.empty();
        this.envelopeSettings = Input.empty();
        this.errorSettings = Input.empty();
        this.mdnSettings = Input.empty();
        this.messageConnectionSettings = Input.empty();
        this.securitySettings = Input.empty();
        this.validationSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2ProtocolSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AS2AcknowledgementConnectionSettingsArgs> acknowledgementConnectionSettings;
        private Input<AS2EnvelopeSettingsArgs> envelopeSettings;
        private Input<AS2ErrorSettingsArgs> errorSettings;
        private Input<AS2MdnSettingsArgs> mdnSettings;
        private Input<AS2MessageConnectionSettingsArgs> messageConnectionSettings;
        private Input<AS2SecuritySettingsArgs> securitySettings;
        private Input<AS2ValidationSettingsArgs> validationSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2ProtocolSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acknowledgementConnectionSettings = defaults.acknowledgementConnectionSettings;
    	      this.envelopeSettings = defaults.envelopeSettings;
    	      this.errorSettings = defaults.errorSettings;
    	      this.mdnSettings = defaults.mdnSettings;
    	      this.messageConnectionSettings = defaults.messageConnectionSettings;
    	      this.securitySettings = defaults.securitySettings;
    	      this.validationSettings = defaults.validationSettings;
        }

        public Builder setAcknowledgementConnectionSettings(Input<AS2AcknowledgementConnectionSettingsArgs> acknowledgementConnectionSettings) {
            this.acknowledgementConnectionSettings = Objects.requireNonNull(acknowledgementConnectionSettings);
            return this;
        }

        public Builder setAcknowledgementConnectionSettings(AS2AcknowledgementConnectionSettingsArgs acknowledgementConnectionSettings) {
            this.acknowledgementConnectionSettings = Input.of(Objects.requireNonNull(acknowledgementConnectionSettings));
            return this;
        }

        public Builder setEnvelopeSettings(Input<AS2EnvelopeSettingsArgs> envelopeSettings) {
            this.envelopeSettings = Objects.requireNonNull(envelopeSettings);
            return this;
        }

        public Builder setEnvelopeSettings(AS2EnvelopeSettingsArgs envelopeSettings) {
            this.envelopeSettings = Input.of(Objects.requireNonNull(envelopeSettings));
            return this;
        }

        public Builder setErrorSettings(Input<AS2ErrorSettingsArgs> errorSettings) {
            this.errorSettings = Objects.requireNonNull(errorSettings);
            return this;
        }

        public Builder setErrorSettings(AS2ErrorSettingsArgs errorSettings) {
            this.errorSettings = Input.of(Objects.requireNonNull(errorSettings));
            return this;
        }

        public Builder setMdnSettings(Input<AS2MdnSettingsArgs> mdnSettings) {
            this.mdnSettings = Objects.requireNonNull(mdnSettings);
            return this;
        }

        public Builder setMdnSettings(AS2MdnSettingsArgs mdnSettings) {
            this.mdnSettings = Input.of(Objects.requireNonNull(mdnSettings));
            return this;
        }

        public Builder setMessageConnectionSettings(Input<AS2MessageConnectionSettingsArgs> messageConnectionSettings) {
            this.messageConnectionSettings = Objects.requireNonNull(messageConnectionSettings);
            return this;
        }

        public Builder setMessageConnectionSettings(AS2MessageConnectionSettingsArgs messageConnectionSettings) {
            this.messageConnectionSettings = Input.of(Objects.requireNonNull(messageConnectionSettings));
            return this;
        }

        public Builder setSecuritySettings(Input<AS2SecuritySettingsArgs> securitySettings) {
            this.securitySettings = Objects.requireNonNull(securitySettings);
            return this;
        }

        public Builder setSecuritySettings(AS2SecuritySettingsArgs securitySettings) {
            this.securitySettings = Input.of(Objects.requireNonNull(securitySettings));
            return this;
        }

        public Builder setValidationSettings(Input<AS2ValidationSettingsArgs> validationSettings) {
            this.validationSettings = Objects.requireNonNull(validationSettings);
            return this;
        }

        public Builder setValidationSettings(AS2ValidationSettingsArgs validationSettings) {
            this.validationSettings = Input.of(Objects.requireNonNull(validationSettings));
            return this;
        }

        public AS2ProtocolSettingsArgs build() {
            return new AS2ProtocolSettingsArgs(acknowledgementConnectionSettings, envelopeSettings, errorSettings, mdnSettings, messageConnectionSettings, securitySettings, validationSettings);
        }
    }
}
