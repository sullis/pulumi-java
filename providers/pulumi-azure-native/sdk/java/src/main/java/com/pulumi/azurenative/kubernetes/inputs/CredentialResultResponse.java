// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetes.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The credential result response.
 * 
 */
public final class CredentialResultResponse extends com.pulumi.resources.InvokeArgs {

    public static final CredentialResultResponse Empty = new CredentialResultResponse();

    /**
     * The name of the credential.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the credential.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Base64-encoded Kubernetes configuration file.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return Base64-encoded Kubernetes configuration file.
     * 
     */
    public String value() {
        return this.value;
    }

    private CredentialResultResponse() {}

    private CredentialResultResponse(CredentialResultResponse $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CredentialResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CredentialResultResponse $;

        public Builder() {
            $ = new CredentialResultResponse();
        }

        public Builder(CredentialResultResponse defaults) {
            $ = new CredentialResultResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the credential.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param value Base64-encoded Kubernetes configuration file.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public CredentialResultResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
