// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Vault.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSecretVersionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretVersionPlainArgs Empty = new GetSecretVersionPlainArgs();

    /**
     * The OCID of the secret.
     * 
     */
    @Import(name="secretId", required=true)
    private String secretId;

    /**
     * @return The OCID of the secret.
     * 
     */
    public String secretId() {
        return this.secretId;
    }

    /**
     * The version number of the secret.
     * 
     */
    @Import(name="secretVersionNumber", required=true)
    private String secretVersionNumber;

    /**
     * @return The version number of the secret.
     * 
     */
    public String secretVersionNumber() {
        return this.secretVersionNumber;
    }

    private GetSecretVersionPlainArgs() {}

    private GetSecretVersionPlainArgs(GetSecretVersionPlainArgs $) {
        this.secretId = $.secretId;
        this.secretVersionNumber = $.secretVersionNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretVersionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretVersionPlainArgs $;

        public Builder() {
            $ = new GetSecretVersionPlainArgs();
        }

        public Builder(GetSecretVersionPlainArgs defaults) {
            $ = new GetSecretVersionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretId The OCID of the secret.
         * 
         * @return builder
         * 
         */
        public Builder secretId(String secretId) {
            $.secretId = secretId;
            return this;
        }

        /**
         * @param secretVersionNumber The version number of the secret.
         * 
         * @return builder
         * 
         */
        public Builder secretVersionNumber(String secretVersionNumber) {
            $.secretVersionNumber = secretVersionNumber;
            return this;
        }

        public GetSecretVersionPlainArgs build() {
            $.secretId = Objects.requireNonNull($.secretId, "expected parameter 'secretId' to be non-null");
            $.secretVersionNumber = Objects.requireNonNull($.secretVersionNumber, "expected parameter 'secretVersionNumber' to be non-null");
            return $;
        }
    }

}
