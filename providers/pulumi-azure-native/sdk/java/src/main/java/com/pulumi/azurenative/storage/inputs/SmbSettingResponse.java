// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.inputs.MultichannelResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Setting for SMB protocol
 * 
 */
public final class SmbSettingResponse extends com.pulumi.resources.InvokeArgs {

    public static final SmbSettingResponse Empty = new SmbSettingResponse();

    /**
     * SMB authentication methods supported by server. Valid values are NTLMv2, Kerberos. Should be passed as a string with delimiter &#39;;&#39;.
     * 
     */
    @Import(name="authenticationMethods")
    private @Nullable String authenticationMethods;

    /**
     * @return SMB authentication methods supported by server. Valid values are NTLMv2, Kerberos. Should be passed as a string with delimiter &#39;;&#39;.
     * 
     */
    public Optional<String> authenticationMethods() {
        return Optional.ofNullable(this.authenticationMethods);
    }

    /**
     * SMB channel encryption supported by server. Valid values are AES-128-CCM, AES-128-GCM, AES-256-GCM. Should be passed as a string with delimiter &#39;;&#39;.
     * 
     */
    @Import(name="channelEncryption")
    private @Nullable String channelEncryption;

    /**
     * @return SMB channel encryption supported by server. Valid values are AES-128-CCM, AES-128-GCM, AES-256-GCM. Should be passed as a string with delimiter &#39;;&#39;.
     * 
     */
    public Optional<String> channelEncryption() {
        return Optional.ofNullable(this.channelEncryption);
    }

    /**
     * Kerberos ticket encryption supported by server. Valid values are RC4-HMAC, AES-256. Should be passed as a string with delimiter &#39;;&#39;
     * 
     */
    @Import(name="kerberosTicketEncryption")
    private @Nullable String kerberosTicketEncryption;

    /**
     * @return Kerberos ticket encryption supported by server. Valid values are RC4-HMAC, AES-256. Should be passed as a string with delimiter &#39;;&#39;
     * 
     */
    public Optional<String> kerberosTicketEncryption() {
        return Optional.ofNullable(this.kerberosTicketEncryption);
    }

    /**
     * Multichannel setting. Applies to Premium FileStorage only.
     * 
     */
    @Import(name="multichannel")
    private @Nullable MultichannelResponse multichannel;

    /**
     * @return Multichannel setting. Applies to Premium FileStorage only.
     * 
     */
    public Optional<MultichannelResponse> multichannel() {
        return Optional.ofNullable(this.multichannel);
    }

    /**
     * SMB protocol versions supported by server. Valid values are SMB2.1, SMB3.0, SMB3.1.1. Should be passed as a string with delimiter &#39;;&#39;.
     * 
     */
    @Import(name="versions")
    private @Nullable String versions;

    /**
     * @return SMB protocol versions supported by server. Valid values are SMB2.1, SMB3.0, SMB3.1.1. Should be passed as a string with delimiter &#39;;&#39;.
     * 
     */
    public Optional<String> versions() {
        return Optional.ofNullable(this.versions);
    }

    private SmbSettingResponse() {}

    private SmbSettingResponse(SmbSettingResponse $) {
        this.authenticationMethods = $.authenticationMethods;
        this.channelEncryption = $.channelEncryption;
        this.kerberosTicketEncryption = $.kerberosTicketEncryption;
        this.multichannel = $.multichannel;
        this.versions = $.versions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SmbSettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SmbSettingResponse $;

        public Builder() {
            $ = new SmbSettingResponse();
        }

        public Builder(SmbSettingResponse defaults) {
            $ = new SmbSettingResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationMethods SMB authentication methods supported by server. Valid values are NTLMv2, Kerberos. Should be passed as a string with delimiter &#39;;&#39;.
         * 
         * @return builder
         * 
         */
        public Builder authenticationMethods(@Nullable String authenticationMethods) {
            $.authenticationMethods = authenticationMethods;
            return this;
        }

        /**
         * @param channelEncryption SMB channel encryption supported by server. Valid values are AES-128-CCM, AES-128-GCM, AES-256-GCM. Should be passed as a string with delimiter &#39;;&#39;.
         * 
         * @return builder
         * 
         */
        public Builder channelEncryption(@Nullable String channelEncryption) {
            $.channelEncryption = channelEncryption;
            return this;
        }

        /**
         * @param kerberosTicketEncryption Kerberos ticket encryption supported by server. Valid values are RC4-HMAC, AES-256. Should be passed as a string with delimiter &#39;;&#39;
         * 
         * @return builder
         * 
         */
        public Builder kerberosTicketEncryption(@Nullable String kerberosTicketEncryption) {
            $.kerberosTicketEncryption = kerberosTicketEncryption;
            return this;
        }

        /**
         * @param multichannel Multichannel setting. Applies to Premium FileStorage only.
         * 
         * @return builder
         * 
         */
        public Builder multichannel(@Nullable MultichannelResponse multichannel) {
            $.multichannel = multichannel;
            return this;
        }

        /**
         * @param versions SMB protocol versions supported by server. Valid values are SMB2.1, SMB3.0, SMB3.1.1. Should be passed as a string with delimiter &#39;;&#39;.
         * 
         * @return builder
         * 
         */
        public Builder versions(@Nullable String versions) {
            $.versions = versions;
            return this;
        }

        public SmbSettingResponse build() {
            return $;
        }
    }

}
