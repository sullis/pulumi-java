// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * The AS2 agreement message connection settings.
 * 
 */
public final class AS2MessageConnectionSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AS2MessageConnectionSettingsResponse Empty = new AS2MessageConnectionSettingsResponse();

    /**
     * The value indicating whether to ignore mismatch in certificate name.
     * 
     */
    @Import(name="ignoreCertificateNameMismatch", required=true)
    private Boolean ignoreCertificateNameMismatch;

    /**
     * @return The value indicating whether to ignore mismatch in certificate name.
     * 
     */
    public Boolean ignoreCertificateNameMismatch() {
        return this.ignoreCertificateNameMismatch;
    }

    /**
     * The value indicating whether to keep the connection alive.
     * 
     */
    @Import(name="keepHttpConnectionAlive", required=true)
    private Boolean keepHttpConnectionAlive;

    /**
     * @return The value indicating whether to keep the connection alive.
     * 
     */
    public Boolean keepHttpConnectionAlive() {
        return this.keepHttpConnectionAlive;
    }

    /**
     * The value indicating whether to support HTTP status code &#39;CONTINUE&#39;.
     * 
     */
    @Import(name="supportHttpStatusCodeContinue", required=true)
    private Boolean supportHttpStatusCodeContinue;

    /**
     * @return The value indicating whether to support HTTP status code &#39;CONTINUE&#39;.
     * 
     */
    public Boolean supportHttpStatusCodeContinue() {
        return this.supportHttpStatusCodeContinue;
    }

    /**
     * The value indicating whether to unfold the HTTP headers.
     * 
     */
    @Import(name="unfoldHttpHeaders", required=true)
    private Boolean unfoldHttpHeaders;

    /**
     * @return The value indicating whether to unfold the HTTP headers.
     * 
     */
    public Boolean unfoldHttpHeaders() {
        return this.unfoldHttpHeaders;
    }

    private AS2MessageConnectionSettingsResponse() {}

    private AS2MessageConnectionSettingsResponse(AS2MessageConnectionSettingsResponse $) {
        this.ignoreCertificateNameMismatch = $.ignoreCertificateNameMismatch;
        this.keepHttpConnectionAlive = $.keepHttpConnectionAlive;
        this.supportHttpStatusCodeContinue = $.supportHttpStatusCodeContinue;
        this.unfoldHttpHeaders = $.unfoldHttpHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AS2MessageConnectionSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AS2MessageConnectionSettingsResponse $;

        public Builder() {
            $ = new AS2MessageConnectionSettingsResponse();
        }

        public Builder(AS2MessageConnectionSettingsResponse defaults) {
            $ = new AS2MessageConnectionSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param ignoreCertificateNameMismatch The value indicating whether to ignore mismatch in certificate name.
         * 
         * @return builder
         * 
         */
        public Builder ignoreCertificateNameMismatch(Boolean ignoreCertificateNameMismatch) {
            $.ignoreCertificateNameMismatch = ignoreCertificateNameMismatch;
            return this;
        }

        /**
         * @param keepHttpConnectionAlive The value indicating whether to keep the connection alive.
         * 
         * @return builder
         * 
         */
        public Builder keepHttpConnectionAlive(Boolean keepHttpConnectionAlive) {
            $.keepHttpConnectionAlive = keepHttpConnectionAlive;
            return this;
        }

        /**
         * @param supportHttpStatusCodeContinue The value indicating whether to support HTTP status code &#39;CONTINUE&#39;.
         * 
         * @return builder
         * 
         */
        public Builder supportHttpStatusCodeContinue(Boolean supportHttpStatusCodeContinue) {
            $.supportHttpStatusCodeContinue = supportHttpStatusCodeContinue;
            return this;
        }

        /**
         * @param unfoldHttpHeaders The value indicating whether to unfold the HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder unfoldHttpHeaders(Boolean unfoldHttpHeaders) {
            $.unfoldHttpHeaders = unfoldHttpHeaders;
            return this;
        }

        public AS2MessageConnectionSettingsResponse build() {
            $.ignoreCertificateNameMismatch = Objects.requireNonNull($.ignoreCertificateNameMismatch, "expected parameter 'ignoreCertificateNameMismatch' to be non-null");
            $.keepHttpConnectionAlive = Objects.requireNonNull($.keepHttpConnectionAlive, "expected parameter 'keepHttpConnectionAlive' to be non-null");
            $.supportHttpStatusCodeContinue = Objects.requireNonNull($.supportHttpStatusCodeContinue, "expected parameter 'supportHttpStatusCodeContinue' to be non-null");
            $.unfoldHttpHeaders = Objects.requireNonNull($.unfoldHttpHeaders, "expected parameter 'unfoldHttpHeaders' to be non-null");
            return $;
        }
    }

}
