// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DeviceCredentialPublicKeyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceCredentialPublicKeyGetArgs Empty = new DeviceCredentialPublicKeyGetArgs();

    /**
     * The format of the key.
     * Possible values are `RSA_PEM`, `RSA_X509_PEM`, `ES256_PEM`, and `ES256_X509_PEM`.
     * 
     */
    @Import(name="format", required=true)
    private Output<String> format;

    /**
     * @return The format of the key.
     * Possible values are `RSA_PEM`, `RSA_X509_PEM`, `ES256_PEM`, and `ES256_X509_PEM`.
     * 
     */
    public Output<String> format() {
        return this.format;
    }

    /**
     * The key data.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The key data.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    private DeviceCredentialPublicKeyGetArgs() {}

    private DeviceCredentialPublicKeyGetArgs(DeviceCredentialPublicKeyGetArgs $) {
        this.format = $.format;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceCredentialPublicKeyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceCredentialPublicKeyGetArgs $;

        public Builder() {
            $ = new DeviceCredentialPublicKeyGetArgs();
        }

        public Builder(DeviceCredentialPublicKeyGetArgs defaults) {
            $ = new DeviceCredentialPublicKeyGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param format The format of the key.
         * Possible values are `RSA_PEM`, `RSA_X509_PEM`, `ES256_PEM`, and `ES256_X509_PEM`.
         * 
         * @return builder
         * 
         */
        public Builder format(Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format The format of the key.
         * Possible values are `RSA_PEM`, `RSA_X509_PEM`, `ES256_PEM`, and `ES256_X509_PEM`.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param key The key data.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key data.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public DeviceCredentialPublicKeyGetArgs build() {
            $.format = Objects.requireNonNull($.format, "expected parameter 'format' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
