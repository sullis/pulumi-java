// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseInstanceServerCaCertGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceServerCaCertGetArgs Empty = new DatabaseInstanceServerCaCertGetArgs();

    @Import(name="cert")
    private @Nullable Output<String> cert;

    public Optional<Output<String>> cert() {
        return Optional.ofNullable(this.cert);
    }

    @Import(name="commonName")
    private @Nullable Output<String> commonName;

    public Optional<Output<String>> commonName() {
        return Optional.ofNullable(this.commonName);
    }

    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * formatted date time string indicating when this whitelist expires.
     * 
     */
    @Import(name="expirationTime")
    private @Nullable Output<String> expirationTime;

    /**
     * @return The [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * formatted date time string indicating when this whitelist expires.
     * 
     */
    public Optional<Output<String>> expirationTime() {
        return Optional.ofNullable(this.expirationTime);
    }

    @Import(name="sha1Fingerprint")
    private @Nullable Output<String> sha1Fingerprint;

    public Optional<Output<String>> sha1Fingerprint() {
        return Optional.ofNullable(this.sha1Fingerprint);
    }

    private DatabaseInstanceServerCaCertGetArgs() {}

    private DatabaseInstanceServerCaCertGetArgs(DatabaseInstanceServerCaCertGetArgs $) {
        this.cert = $.cert;
        this.commonName = $.commonName;
        this.createTime = $.createTime;
        this.expirationTime = $.expirationTime;
        this.sha1Fingerprint = $.sha1Fingerprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseInstanceServerCaCertGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseInstanceServerCaCertGetArgs $;

        public Builder() {
            $ = new DatabaseInstanceServerCaCertGetArgs();
        }

        public Builder(DatabaseInstanceServerCaCertGetArgs defaults) {
            $ = new DatabaseInstanceServerCaCertGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder cert(@Nullable Output<String> cert) {
            $.cert = cert;
            return this;
        }

        public Builder cert(String cert) {
            return cert(Output.of(cert));
        }

        public Builder commonName(@Nullable Output<String> commonName) {
            $.commonName = commonName;
            return this;
        }

        public Builder commonName(String commonName) {
            return commonName(Output.of(commonName));
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param expirationTime The [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * formatted date time string indicating when this whitelist expires.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            $.expirationTime = expirationTime;
            return this;
        }

        /**
         * @param expirationTime The [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * formatted date time string indicating when this whitelist expires.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(String expirationTime) {
            return expirationTime(Output.of(expirationTime));
        }

        public Builder sha1Fingerprint(@Nullable Output<String> sha1Fingerprint) {
            $.sha1Fingerprint = sha1Fingerprint;
            return this;
        }

        public Builder sha1Fingerprint(String sha1Fingerprint) {
            return sha1Fingerprint(Output.of(sha1Fingerprint));
        }

        public DatabaseInstanceServerCaCertGetArgs build() {
            return $;
        }
    }

}
