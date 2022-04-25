// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The ssl configuration for scoring
 * 
 */
public final class SslConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SslConfigurationArgs Empty = new SslConfigurationArgs();

    /**
     * Cert data
     * 
     */
    @Import(name="cert")
    private @Nullable Output<String> cert;

    /**
     * @return Cert data
     * 
     */
    public Optional<Output<String>> cert() {
        return Optional.ofNullable(this.cert);
    }

    /**
     * CNAME of the cert
     * 
     */
    @Import(name="cname")
    private @Nullable Output<String> cname;

    /**
     * @return CNAME of the cert
     * 
     */
    public Optional<Output<String>> cname() {
        return Optional.ofNullable(this.cname);
    }

    /**
     * Key data
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Key data
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Enable or disable ssl for scoring
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Enable or disable ssl for scoring
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private SslConfigurationArgs() {}

    private SslConfigurationArgs(SslConfigurationArgs $) {
        this.cert = $.cert;
        this.cname = $.cname;
        this.key = $.key;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SslConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SslConfigurationArgs $;

        public Builder() {
            $ = new SslConfigurationArgs();
        }

        public Builder(SslConfigurationArgs defaults) {
            $ = new SslConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cert Cert data
         * 
         * @return builder
         * 
         */
        public Builder cert(@Nullable Output<String> cert) {
            $.cert = cert;
            return this;
        }

        /**
         * @param cert Cert data
         * 
         * @return builder
         * 
         */
        public Builder cert(String cert) {
            return cert(Output.of(cert));
        }

        /**
         * @param cname CNAME of the cert
         * 
         * @return builder
         * 
         */
        public Builder cname(@Nullable Output<String> cname) {
            $.cname = cname;
            return this;
        }

        /**
         * @param cname CNAME of the cert
         * 
         * @return builder
         * 
         */
        public Builder cname(String cname) {
            return cname(Output.of(cname));
        }

        /**
         * @param key Key data
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Key data
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param status Enable or disable ssl for scoring
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Enable or disable ssl for scoring
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public SslConfigurationArgs build() {
            return $;
        }
    }

}
