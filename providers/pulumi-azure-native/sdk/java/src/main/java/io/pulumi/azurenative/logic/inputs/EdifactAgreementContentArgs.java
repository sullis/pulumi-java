// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.EdifactOneWayAgreementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


/**
 * The Edifact agreement content.
 * 
 */
public final class EdifactAgreementContentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdifactAgreementContentArgs Empty = new EdifactAgreementContentArgs();

    /**
     * The EDIFACT one-way receive agreement.
     * 
     */
    @InputImport(name="receiveAgreement", required=true)
    private final Input<EdifactOneWayAgreementArgs> receiveAgreement;

    public Input<EdifactOneWayAgreementArgs> getReceiveAgreement() {
        return this.receiveAgreement;
    }

    /**
     * The EDIFACT one-way send agreement.
     * 
     */
    @InputImport(name="sendAgreement", required=true)
    private final Input<EdifactOneWayAgreementArgs> sendAgreement;

    public Input<EdifactOneWayAgreementArgs> getSendAgreement() {
        return this.sendAgreement;
    }

    public EdifactAgreementContentArgs(
        Input<EdifactOneWayAgreementArgs> receiveAgreement,
        Input<EdifactOneWayAgreementArgs> sendAgreement) {
        this.receiveAgreement = Objects.requireNonNull(receiveAgreement, "expected parameter 'receiveAgreement' to be non-null");
        this.sendAgreement = Objects.requireNonNull(sendAgreement, "expected parameter 'sendAgreement' to be non-null");
    }

    private EdifactAgreementContentArgs() {
        this.receiveAgreement = Input.empty();
        this.sendAgreement = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactAgreementContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<EdifactOneWayAgreementArgs> receiveAgreement;
        private Input<EdifactOneWayAgreementArgs> sendAgreement;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactAgreementContentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.receiveAgreement = defaults.receiveAgreement;
    	      this.sendAgreement = defaults.sendAgreement;
        }

        public Builder setReceiveAgreement(Input<EdifactOneWayAgreementArgs> receiveAgreement) {
            this.receiveAgreement = Objects.requireNonNull(receiveAgreement);
            return this;
        }

        public Builder setReceiveAgreement(EdifactOneWayAgreementArgs receiveAgreement) {
            this.receiveAgreement = Input.of(Objects.requireNonNull(receiveAgreement));
            return this;
        }

        public Builder setSendAgreement(Input<EdifactOneWayAgreementArgs> sendAgreement) {
            this.sendAgreement = Objects.requireNonNull(sendAgreement);
            return this;
        }

        public Builder setSendAgreement(EdifactOneWayAgreementArgs sendAgreement) {
            this.sendAgreement = Input.of(Objects.requireNonNull(sendAgreement));
            return this;
        }

        public EdifactAgreementContentArgs build() {
            return new EdifactAgreementContentArgs(receiveAgreement, sendAgreement);
        }
    }
}
