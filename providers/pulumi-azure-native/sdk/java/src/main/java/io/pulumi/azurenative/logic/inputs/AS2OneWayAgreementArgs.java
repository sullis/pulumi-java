// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.AS2ProtocolSettingsArgs;
import io.pulumi.azurenative.logic.inputs.BusinessIdentityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * The integration account AS2 one-way agreement.
 * 
 */
public final class AS2OneWayAgreementArgs extends io.pulumi.resources.ResourceArgs {

    public static final AS2OneWayAgreementArgs Empty = new AS2OneWayAgreementArgs();

    /**
     * The AS2 protocol settings.
     * 
     */
    @InputImport(name="protocolSettings", required=true)
      private final Input<AS2ProtocolSettingsArgs> protocolSettings;

    public Input<AS2ProtocolSettingsArgs> getProtocolSettings() {
        return this.protocolSettings;
    }

    /**
     * The receiver business identity
     * 
     */
    @InputImport(name="receiverBusinessIdentity", required=true)
      private final Input<BusinessIdentityArgs> receiverBusinessIdentity;

    public Input<BusinessIdentityArgs> getReceiverBusinessIdentity() {
        return this.receiverBusinessIdentity;
    }

    /**
     * The sender business identity
     * 
     */
    @InputImport(name="senderBusinessIdentity", required=true)
      private final Input<BusinessIdentityArgs> senderBusinessIdentity;

    public Input<BusinessIdentityArgs> getSenderBusinessIdentity() {
        return this.senderBusinessIdentity;
    }

    public AS2OneWayAgreementArgs(
        Input<AS2ProtocolSettingsArgs> protocolSettings,
        Input<BusinessIdentityArgs> receiverBusinessIdentity,
        Input<BusinessIdentityArgs> senderBusinessIdentity) {
        this.protocolSettings = Objects.requireNonNull(protocolSettings, "expected parameter 'protocolSettings' to be non-null");
        this.receiverBusinessIdentity = Objects.requireNonNull(receiverBusinessIdentity, "expected parameter 'receiverBusinessIdentity' to be non-null");
        this.senderBusinessIdentity = Objects.requireNonNull(senderBusinessIdentity, "expected parameter 'senderBusinessIdentity' to be non-null");
    }

    private AS2OneWayAgreementArgs() {
        this.protocolSettings = Input.empty();
        this.receiverBusinessIdentity = Input.empty();
        this.senderBusinessIdentity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2OneWayAgreementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AS2ProtocolSettingsArgs> protocolSettings;
        private Input<BusinessIdentityArgs> receiverBusinessIdentity;
        private Input<BusinessIdentityArgs> senderBusinessIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2OneWayAgreementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocolSettings = defaults.protocolSettings;
    	      this.receiverBusinessIdentity = defaults.receiverBusinessIdentity;
    	      this.senderBusinessIdentity = defaults.senderBusinessIdentity;
        }

        public Builder setProtocolSettings(Input<AS2ProtocolSettingsArgs> protocolSettings) {
            this.protocolSettings = Objects.requireNonNull(protocolSettings);
            return this;
        }

        public Builder setProtocolSettings(AS2ProtocolSettingsArgs protocolSettings) {
            this.protocolSettings = Input.of(Objects.requireNonNull(protocolSettings));
            return this;
        }

        public Builder setReceiverBusinessIdentity(Input<BusinessIdentityArgs> receiverBusinessIdentity) {
            this.receiverBusinessIdentity = Objects.requireNonNull(receiverBusinessIdentity);
            return this;
        }

        public Builder setReceiverBusinessIdentity(BusinessIdentityArgs receiverBusinessIdentity) {
            this.receiverBusinessIdentity = Input.of(Objects.requireNonNull(receiverBusinessIdentity));
            return this;
        }

        public Builder setSenderBusinessIdentity(Input<BusinessIdentityArgs> senderBusinessIdentity) {
            this.senderBusinessIdentity = Objects.requireNonNull(senderBusinessIdentity);
            return this;
        }

        public Builder setSenderBusinessIdentity(BusinessIdentityArgs senderBusinessIdentity) {
            this.senderBusinessIdentity = Input.of(Objects.requireNonNull(senderBusinessIdentity));
            return this;
        }
        public AS2OneWayAgreementArgs build() {
            return new AS2OneWayAgreementArgs(protocolSettings, receiverBusinessIdentity, senderBusinessIdentity);
        }
    }
}