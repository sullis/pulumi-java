// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServerCertificateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerCertificateArgs Empty = new GetServerCertificateArgs();

    /**
     * sort results by expiration date. returns the certificate with expiration date in furthest in the future.
     * 
     */
    @Import(name="latest")
    private @Nullable Output<Boolean> latest;

    /**
     * @return sort results by expiration date. returns the certificate with expiration date in furthest in the future.
     * 
     */
    public Optional<Output<Boolean>> latest() {
        return Optional.ofNullable(this.latest);
    }

    /**
     * exact name of the cert to lookup
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return exact name of the cert to lookup
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * prefix of cert to filter by
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return prefix of cert to filter by
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * prefix of path to filter by
     * 
     */
    @Import(name="pathPrefix")
    private @Nullable Output<String> pathPrefix;

    /**
     * @return prefix of path to filter by
     * 
     */
    public Optional<Output<String>> pathPrefix() {
        return Optional.ofNullable(this.pathPrefix);
    }

    private GetServerCertificateArgs() {}

    private GetServerCertificateArgs(GetServerCertificateArgs $) {
        this.latest = $.latest;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.pathPrefix = $.pathPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerCertificateArgs $;

        public Builder() {
            $ = new GetServerCertificateArgs();
        }

        public Builder(GetServerCertificateArgs defaults) {
            $ = new GetServerCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param latest sort results by expiration date. returns the certificate with expiration date in furthest in the future.
         * 
         * @return builder
         * 
         */
        public Builder latest(@Nullable Output<Boolean> latest) {
            $.latest = latest;
            return this;
        }

        /**
         * @param latest sort results by expiration date. returns the certificate with expiration date in furthest in the future.
         * 
         * @return builder
         * 
         */
        public Builder latest(Boolean latest) {
            return latest(Output.of(latest));
        }

        /**
         * @param name exact name of the cert to lookup
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name exact name of the cert to lookup
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namePrefix prefix of cert to filter by
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix prefix of cert to filter by
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param pathPrefix prefix of path to filter by
         * 
         * @return builder
         * 
         */
        public Builder pathPrefix(@Nullable Output<String> pathPrefix) {
            $.pathPrefix = pathPrefix;
            return this;
        }

        /**
         * @param pathPrefix prefix of path to filter by
         * 
         * @return builder
         * 
         */
        public Builder pathPrefix(String pathPrefix) {
            return pathPrefix(Output.of(pathPrefix));
        }

        public GetServerCertificateArgs build() {
            return $;
        }
    }

}
