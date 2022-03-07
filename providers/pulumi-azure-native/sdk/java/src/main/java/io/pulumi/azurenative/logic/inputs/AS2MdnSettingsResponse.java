// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The AS2 agreement mdn settings.
 * 
 */
public final class AS2MdnSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AS2MdnSettingsResponse Empty = new AS2MdnSettingsResponse();

    /**
     * The disposition notification to header value.
     * 
     */
    @InputImport(name="dispositionNotificationTo")
      private final @Nullable String dispositionNotificationTo;

    public Optional<String> getDispositionNotificationTo() {
        return this.dispositionNotificationTo == null ? Optional.empty() : Optional.ofNullable(this.dispositionNotificationTo);
    }

    /**
     * The MDN text.
     * 
     */
    @InputImport(name="mdnText")
      private final @Nullable String mdnText;

    public Optional<String> getMdnText() {
        return this.mdnText == null ? Optional.empty() : Optional.ofNullable(this.mdnText);
    }

    /**
     * The signing or hashing algorithm.
     * 
     */
    @InputImport(name="micHashingAlgorithm", required=true)
      private final String micHashingAlgorithm;

    public String getMicHashingAlgorithm() {
        return this.micHashingAlgorithm;
    }

    /**
     * The value indicating whether to send or request a MDN.
     * 
     */
    @InputImport(name="needMDN", required=true)
      private final Boolean needMDN;

    public Boolean getNeedMDN() {
        return this.needMDN;
    }

    /**
     * The receipt delivery URL.
     * 
     */
    @InputImport(name="receiptDeliveryUrl")
      private final @Nullable String receiptDeliveryUrl;

    public Optional<String> getReceiptDeliveryUrl() {
        return this.receiptDeliveryUrl == null ? Optional.empty() : Optional.ofNullable(this.receiptDeliveryUrl);
    }

    /**
     * The value indicating whether to send inbound MDN to message box.
     * 
     */
    @InputImport(name="sendInboundMDNToMessageBox", required=true)
      private final Boolean sendInboundMDNToMessageBox;

    public Boolean getSendInboundMDNToMessageBox() {
        return this.sendInboundMDNToMessageBox;
    }

    /**
     * The value indicating whether to send the asynchronous MDN.
     * 
     */
    @InputImport(name="sendMDNAsynchronously", required=true)
      private final Boolean sendMDNAsynchronously;

    public Boolean getSendMDNAsynchronously() {
        return this.sendMDNAsynchronously;
    }

    /**
     * The value indicating whether the MDN needs to be signed or not.
     * 
     */
    @InputImport(name="signMDN", required=true)
      private final Boolean signMDN;

    public Boolean getSignMDN() {
        return this.signMDN;
    }

    /**
     * The value indicating whether to sign the outbound MDN if optional.
     * 
     */
    @InputImport(name="signOutboundMDNIfOptional", required=true)
      private final Boolean signOutboundMDNIfOptional;

    public Boolean getSignOutboundMDNIfOptional() {
        return this.signOutboundMDNIfOptional;
    }

    public AS2MdnSettingsResponse(
        @Nullable String dispositionNotificationTo,
        @Nullable String mdnText,
        String micHashingAlgorithm,
        Boolean needMDN,
        @Nullable String receiptDeliveryUrl,
        Boolean sendInboundMDNToMessageBox,
        Boolean sendMDNAsynchronously,
        Boolean signMDN,
        Boolean signOutboundMDNIfOptional) {
        this.dispositionNotificationTo = dispositionNotificationTo;
        this.mdnText = mdnText;
        this.micHashingAlgorithm = Objects.requireNonNull(micHashingAlgorithm, "expected parameter 'micHashingAlgorithm' to be non-null");
        this.needMDN = Objects.requireNonNull(needMDN, "expected parameter 'needMDN' to be non-null");
        this.receiptDeliveryUrl = receiptDeliveryUrl;
        this.sendInboundMDNToMessageBox = Objects.requireNonNull(sendInboundMDNToMessageBox, "expected parameter 'sendInboundMDNToMessageBox' to be non-null");
        this.sendMDNAsynchronously = Objects.requireNonNull(sendMDNAsynchronously, "expected parameter 'sendMDNAsynchronously' to be non-null");
        this.signMDN = Objects.requireNonNull(signMDN, "expected parameter 'signMDN' to be non-null");
        this.signOutboundMDNIfOptional = Objects.requireNonNull(signOutboundMDNIfOptional, "expected parameter 'signOutboundMDNIfOptional' to be non-null");
    }

    private AS2MdnSettingsResponse() {
        this.dispositionNotificationTo = null;
        this.mdnText = null;
        this.micHashingAlgorithm = null;
        this.needMDN = null;
        this.receiptDeliveryUrl = null;
        this.sendInboundMDNToMessageBox = null;
        this.sendMDNAsynchronously = null;
        this.signMDN = null;
        this.signOutboundMDNIfOptional = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2MdnSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dispositionNotificationTo;
        private @Nullable String mdnText;
        private String micHashingAlgorithm;
        private Boolean needMDN;
        private @Nullable String receiptDeliveryUrl;
        private Boolean sendInboundMDNToMessageBox;
        private Boolean sendMDNAsynchronously;
        private Boolean signMDN;
        private Boolean signOutboundMDNIfOptional;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2MdnSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dispositionNotificationTo = defaults.dispositionNotificationTo;
    	      this.mdnText = defaults.mdnText;
    	      this.micHashingAlgorithm = defaults.micHashingAlgorithm;
    	      this.needMDN = defaults.needMDN;
    	      this.receiptDeliveryUrl = defaults.receiptDeliveryUrl;
    	      this.sendInboundMDNToMessageBox = defaults.sendInboundMDNToMessageBox;
    	      this.sendMDNAsynchronously = defaults.sendMDNAsynchronously;
    	      this.signMDN = defaults.signMDN;
    	      this.signOutboundMDNIfOptional = defaults.signOutboundMDNIfOptional;
        }

        public Builder setDispositionNotificationTo(@Nullable String dispositionNotificationTo) {
            this.dispositionNotificationTo = dispositionNotificationTo;
            return this;
        }

        public Builder setMdnText(@Nullable String mdnText) {
            this.mdnText = mdnText;
            return this;
        }

        public Builder setMicHashingAlgorithm(String micHashingAlgorithm) {
            this.micHashingAlgorithm = Objects.requireNonNull(micHashingAlgorithm);
            return this;
        }

        public Builder setNeedMDN(Boolean needMDN) {
            this.needMDN = Objects.requireNonNull(needMDN);
            return this;
        }

        public Builder setReceiptDeliveryUrl(@Nullable String receiptDeliveryUrl) {
            this.receiptDeliveryUrl = receiptDeliveryUrl;
            return this;
        }

        public Builder setSendInboundMDNToMessageBox(Boolean sendInboundMDNToMessageBox) {
            this.sendInboundMDNToMessageBox = Objects.requireNonNull(sendInboundMDNToMessageBox);
            return this;
        }

        public Builder setSendMDNAsynchronously(Boolean sendMDNAsynchronously) {
            this.sendMDNAsynchronously = Objects.requireNonNull(sendMDNAsynchronously);
            return this;
        }

        public Builder setSignMDN(Boolean signMDN) {
            this.signMDN = Objects.requireNonNull(signMDN);
            return this;
        }

        public Builder setSignOutboundMDNIfOptional(Boolean signOutboundMDNIfOptional) {
            this.signOutboundMDNIfOptional = Objects.requireNonNull(signOutboundMDNIfOptional);
            return this;
        }
        public AS2MdnSettingsResponse build() {
            return new AS2MdnSettingsResponse(dispositionNotificationTo, mdnText, micHashingAlgorithm, needMDN, receiptDeliveryUrl, sendInboundMDNToMessageBox, sendMDNAsynchronously, signMDN, signOutboundMDNIfOptional);
        }
    }
}