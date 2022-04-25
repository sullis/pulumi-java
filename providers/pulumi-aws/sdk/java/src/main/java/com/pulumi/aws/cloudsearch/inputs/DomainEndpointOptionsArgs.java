// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudsearch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainEndpointOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainEndpointOptionsArgs Empty = new DomainEndpointOptionsArgs();

    /**
     * Enables or disables the requirement that all requests to the domain arrive over HTTPS.
     * 
     */
    @Import(name="enforceHttps")
    private @Nullable Output<Boolean> enforceHttps;

    /**
     * @return Enables or disables the requirement that all requests to the domain arrive over HTTPS.
     * 
     */
    public Optional<Output<Boolean>> enforceHttps() {
        return Optional.ofNullable(this.enforceHttps);
    }

    /**
     * The minimum required TLS version. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DomainEndpointOptions.html) for valid values.
     * 
     */
    @Import(name="tlsSecurityPolicy")
    private @Nullable Output<String> tlsSecurityPolicy;

    /**
     * @return The minimum required TLS version. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DomainEndpointOptions.html) for valid values.
     * 
     */
    public Optional<Output<String>> tlsSecurityPolicy() {
        return Optional.ofNullable(this.tlsSecurityPolicy);
    }

    private DomainEndpointOptionsArgs() {}

    private DomainEndpointOptionsArgs(DomainEndpointOptionsArgs $) {
        this.enforceHttps = $.enforceHttps;
        this.tlsSecurityPolicy = $.tlsSecurityPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainEndpointOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainEndpointOptionsArgs $;

        public Builder() {
            $ = new DomainEndpointOptionsArgs();
        }

        public Builder(DomainEndpointOptionsArgs defaults) {
            $ = new DomainEndpointOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enforceHttps Enables or disables the requirement that all requests to the domain arrive over HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder enforceHttps(@Nullable Output<Boolean> enforceHttps) {
            $.enforceHttps = enforceHttps;
            return this;
        }

        /**
         * @param enforceHttps Enables or disables the requirement that all requests to the domain arrive over HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder enforceHttps(Boolean enforceHttps) {
            return enforceHttps(Output.of(enforceHttps));
        }

        /**
         * @param tlsSecurityPolicy The minimum required TLS version. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DomainEndpointOptions.html) for valid values.
         * 
         * @return builder
         * 
         */
        public Builder tlsSecurityPolicy(@Nullable Output<String> tlsSecurityPolicy) {
            $.tlsSecurityPolicy = tlsSecurityPolicy;
            return this;
        }

        /**
         * @param tlsSecurityPolicy The minimum required TLS version. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_DomainEndpointOptions.html) for valid values.
         * 
         * @return builder
         * 
         */
        public Builder tlsSecurityPolicy(String tlsSecurityPolicy) {
            return tlsSecurityPolicy(Output.of(tlsSecurityPolicy));
        }

        public DomainEndpointOptionsArgs build() {
            return $;
        }
    }

}
