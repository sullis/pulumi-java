// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.inputs.X12OneWayAgreementResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The X12 agreement content.
 * 
 */
public final class X12AgreementContentResponse extends com.pulumi.resources.InvokeArgs {

    public static final X12AgreementContentResponse Empty = new X12AgreementContentResponse();

    /**
     * The X12 one-way receive agreement.
     * 
     */
    @Import(name="receiveAgreement", required=true)
    private X12OneWayAgreementResponse receiveAgreement;

    /**
     * @return The X12 one-way receive agreement.
     * 
     */
    public X12OneWayAgreementResponse receiveAgreement() {
        return this.receiveAgreement;
    }

    /**
     * The X12 one-way send agreement.
     * 
     */
    @Import(name="sendAgreement", required=true)
    private X12OneWayAgreementResponse sendAgreement;

    /**
     * @return The X12 one-way send agreement.
     * 
     */
    public X12OneWayAgreementResponse sendAgreement() {
        return this.sendAgreement;
    }

    private X12AgreementContentResponse() {}

    private X12AgreementContentResponse(X12AgreementContentResponse $) {
        this.receiveAgreement = $.receiveAgreement;
        this.sendAgreement = $.sendAgreement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(X12AgreementContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12AgreementContentResponse $;

        public Builder() {
            $ = new X12AgreementContentResponse();
        }

        public Builder(X12AgreementContentResponse defaults) {
            $ = new X12AgreementContentResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param receiveAgreement The X12 one-way receive agreement.
         * 
         * @return builder
         * 
         */
        public Builder receiveAgreement(X12OneWayAgreementResponse receiveAgreement) {
            $.receiveAgreement = receiveAgreement;
            return this;
        }

        /**
         * @param sendAgreement The X12 one-way send agreement.
         * 
         * @return builder
         * 
         */
        public Builder sendAgreement(X12OneWayAgreementResponse sendAgreement) {
            $.sendAgreement = sendAgreement;
            return this;
        }

        public X12AgreementContentResponse build() {
            $.receiveAgreement = Objects.requireNonNull($.receiveAgreement, "expected parameter 'receiveAgreement' to be non-null");
            $.sendAgreement = Objects.requireNonNull($.sendAgreement, "expected parameter 'sendAgreement' to be non-null");
            return $;
        }
    }

}
