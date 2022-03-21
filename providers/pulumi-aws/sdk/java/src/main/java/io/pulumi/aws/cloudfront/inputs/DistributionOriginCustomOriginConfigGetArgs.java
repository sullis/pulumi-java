// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionOriginCustomOriginConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOriginCustomOriginConfigGetArgs Empty = new DistributionOriginCustomOriginConfigGetArgs();

    /**
     * The HTTP port the custom origin listens on.
     * 
     */
    @Import(name="httpPort", required=true)
      private final Output<Integer> httpPort;

    public Output<Integer> getHttpPort() {
        return this.httpPort;
    }

    /**
     * The HTTPS port the custom origin listens on.
     * 
     */
    @Import(name="httpsPort", required=true)
      private final Output<Integer> httpsPort;

    public Output<Integer> getHttpsPort() {
        return this.httpsPort;
    }

    /**
     * The Custom KeepAlive timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
     * 
     */
    @Import(name="originKeepaliveTimeout")
      private final @Nullable Output<Integer> originKeepaliveTimeout;

    public Output<Integer> getOriginKeepaliveTimeout() {
        return this.originKeepaliveTimeout == null ? Output.empty() : this.originKeepaliveTimeout;
    }

    /**
     * The origin protocol policy to apply to
     * your origin. One of `http-only`, `https-only`, or `match-viewer`.
     * 
     */
    @Import(name="originProtocolPolicy", required=true)
      private final Output<String> originProtocolPolicy;

    public Output<String> getOriginProtocolPolicy() {
        return this.originProtocolPolicy;
    }

    /**
     * The Custom Read timeout, in seconds. By default, AWS enforces a limit of `60`. But you can request an [increase](http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-request-timeout).
     * 
     */
    @Import(name="originReadTimeout")
      private final @Nullable Output<Integer> originReadTimeout;

    public Output<Integer> getOriginReadTimeout() {
        return this.originReadTimeout == null ? Output.empty() : this.originReadTimeout;
    }

    /**
     * The SSL/TLS protocols that you want
     * CloudFront to use when communicating with your origin over HTTPS. A list of
     * one or more of `SSLv3`, `TLSv1`, `TLSv1.1`, and `TLSv1.2`.
     * 
     */
    @Import(name="originSslProtocols", required=true)
      private final Output<List<String>> originSslProtocols;

    public Output<List<String>> getOriginSslProtocols() {
        return this.originSslProtocols;
    }

    public DistributionOriginCustomOriginConfigGetArgs(
        Output<Integer> httpPort,
        Output<Integer> httpsPort,
        @Nullable Output<Integer> originKeepaliveTimeout,
        Output<String> originProtocolPolicy,
        @Nullable Output<Integer> originReadTimeout,
        Output<List<String>> originSslProtocols) {
        this.httpPort = Objects.requireNonNull(httpPort, "expected parameter 'httpPort' to be non-null");
        this.httpsPort = Objects.requireNonNull(httpsPort, "expected parameter 'httpsPort' to be non-null");
        this.originKeepaliveTimeout = originKeepaliveTimeout;
        this.originProtocolPolicy = Objects.requireNonNull(originProtocolPolicy, "expected parameter 'originProtocolPolicy' to be non-null");
        this.originReadTimeout = originReadTimeout;
        this.originSslProtocols = Objects.requireNonNull(originSslProtocols, "expected parameter 'originSslProtocols' to be non-null");
    }

    private DistributionOriginCustomOriginConfigGetArgs() {
        this.httpPort = Output.empty();
        this.httpsPort = Output.empty();
        this.originKeepaliveTimeout = Output.empty();
        this.originProtocolPolicy = Output.empty();
        this.originReadTimeout = Output.empty();
        this.originSslProtocols = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginCustomOriginConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> httpPort;
        private Output<Integer> httpsPort;
        private @Nullable Output<Integer> originKeepaliveTimeout;
        private Output<String> originProtocolPolicy;
        private @Nullable Output<Integer> originReadTimeout;
        private Output<List<String>> originSslProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginCustomOriginConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.originKeepaliveTimeout = defaults.originKeepaliveTimeout;
    	      this.originProtocolPolicy = defaults.originProtocolPolicy;
    	      this.originReadTimeout = defaults.originReadTimeout;
    	      this.originSslProtocols = defaults.originSslProtocols;
        }

        public Builder httpPort(Output<Integer> httpPort) {
            this.httpPort = Objects.requireNonNull(httpPort);
            return this;
        }
        public Builder httpPort(Integer httpPort) {
            this.httpPort = Output.of(Objects.requireNonNull(httpPort));
            return this;
        }
        public Builder httpsPort(Output<Integer> httpsPort) {
            this.httpsPort = Objects.requireNonNull(httpsPort);
            return this;
        }
        public Builder httpsPort(Integer httpsPort) {
            this.httpsPort = Output.of(Objects.requireNonNull(httpsPort));
            return this;
        }
        public Builder originKeepaliveTimeout(@Nullable Output<Integer> originKeepaliveTimeout) {
            this.originKeepaliveTimeout = originKeepaliveTimeout;
            return this;
        }
        public Builder originKeepaliveTimeout(@Nullable Integer originKeepaliveTimeout) {
            this.originKeepaliveTimeout = Output.ofNullable(originKeepaliveTimeout);
            return this;
        }
        public Builder originProtocolPolicy(Output<String> originProtocolPolicy) {
            this.originProtocolPolicy = Objects.requireNonNull(originProtocolPolicy);
            return this;
        }
        public Builder originProtocolPolicy(String originProtocolPolicy) {
            this.originProtocolPolicy = Output.of(Objects.requireNonNull(originProtocolPolicy));
            return this;
        }
        public Builder originReadTimeout(@Nullable Output<Integer> originReadTimeout) {
            this.originReadTimeout = originReadTimeout;
            return this;
        }
        public Builder originReadTimeout(@Nullable Integer originReadTimeout) {
            this.originReadTimeout = Output.ofNullable(originReadTimeout);
            return this;
        }
        public Builder originSslProtocols(Output<List<String>> originSslProtocols) {
            this.originSslProtocols = Objects.requireNonNull(originSslProtocols);
            return this;
        }
        public Builder originSslProtocols(List<String> originSslProtocols) {
            this.originSslProtocols = Output.of(Objects.requireNonNull(originSslProtocols));
            return this;
        }
        public Builder originSslProtocols(String... originSslProtocols) {
            return originSslProtocols(List.of(originSslProtocols));
        }        public DistributionOriginCustomOriginConfigGetArgs build() {
            return new DistributionOriginCustomOriginConfigGetArgs(httpPort, httpsPort, originKeepaliveTimeout, originProtocolPolicy, originReadTimeout, originSslProtocols);
        }
    }
}
