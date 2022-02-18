// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.BusinessIdentityResponse;
import io.pulumi.azurenative.logic.outputs.X12ProtocolSettingsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class X12OneWayAgreementResponse {
    /**
     * The X12 protocol settings.
     * 
     */
    private final X12ProtocolSettingsResponse protocolSettings;
    /**
     * The receiver business identity
     * 
     */
    private final BusinessIdentityResponse receiverBusinessIdentity;
    /**
     * The sender business identity
     * 
     */
    private final BusinessIdentityResponse senderBusinessIdentity;

    @OutputCustomType.Constructor({"protocolSettings","receiverBusinessIdentity","senderBusinessIdentity"})
    private X12OneWayAgreementResponse(
        X12ProtocolSettingsResponse protocolSettings,
        BusinessIdentityResponse receiverBusinessIdentity,
        BusinessIdentityResponse senderBusinessIdentity) {
        this.protocolSettings = Objects.requireNonNull(protocolSettings);
        this.receiverBusinessIdentity = Objects.requireNonNull(receiverBusinessIdentity);
        this.senderBusinessIdentity = Objects.requireNonNull(senderBusinessIdentity);
    }

    /**
     * The X12 protocol settings.
     * 
     */
    public X12ProtocolSettingsResponse getProtocolSettings() {
        return this.protocolSettings;
    }
    /**
     * The receiver business identity
     * 
     */
    public BusinessIdentityResponse getReceiverBusinessIdentity() {
        return this.receiverBusinessIdentity;
    }
    /**
     * The sender business identity
     * 
     */
    public BusinessIdentityResponse getSenderBusinessIdentity() {
        return this.senderBusinessIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12OneWayAgreementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12ProtocolSettingsResponse protocolSettings;
        private BusinessIdentityResponse receiverBusinessIdentity;
        private BusinessIdentityResponse senderBusinessIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(X12OneWayAgreementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocolSettings = defaults.protocolSettings;
    	      this.receiverBusinessIdentity = defaults.receiverBusinessIdentity;
    	      this.senderBusinessIdentity = defaults.senderBusinessIdentity;
        }

        public Builder setProtocolSettings(X12ProtocolSettingsResponse protocolSettings) {
            this.protocolSettings = Objects.requireNonNull(protocolSettings);
            return this;
        }

        public Builder setReceiverBusinessIdentity(BusinessIdentityResponse receiverBusinessIdentity) {
            this.receiverBusinessIdentity = Objects.requireNonNull(receiverBusinessIdentity);
            return this;
        }

        public Builder setSenderBusinessIdentity(BusinessIdentityResponse senderBusinessIdentity) {
            this.senderBusinessIdentity = Objects.requireNonNull(senderBusinessIdentity);
            return this;
        }

        public X12OneWayAgreementResponse build() {
            return new X12OneWayAgreementResponse(protocolSettings, receiverBusinessIdentity, senderBusinessIdentity);
        }
    }
}
