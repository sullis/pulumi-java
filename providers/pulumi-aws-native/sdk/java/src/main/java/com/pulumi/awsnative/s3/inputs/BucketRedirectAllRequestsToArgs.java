// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.enums.BucketRedirectAllRequestsToProtocol;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the redirect behavior of all requests to a website endpoint of an Amazon S3 bucket.
 * 
 */
public final class BucketRedirectAllRequestsToArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketRedirectAllRequestsToArgs Empty = new BucketRedirectAllRequestsToArgs();

    /**
     * Name of the host where requests are redirected.
     * 
     */
    @Import(name="hostName", required=true)
    private Output<String> hostName;

    /**
     * @return Name of the host where requests are redirected.
     * 
     */
    public Output<String> hostName() {
        return this.hostName;
    }

    /**
     * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<BucketRedirectAllRequestsToProtocol> protocol;

    /**
     * @return Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
     * 
     */
    public Optional<Output<BucketRedirectAllRequestsToProtocol>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    private BucketRedirectAllRequestsToArgs() {}

    private BucketRedirectAllRequestsToArgs(BucketRedirectAllRequestsToArgs $) {
        this.hostName = $.hostName;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketRedirectAllRequestsToArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketRedirectAllRequestsToArgs $;

        public Builder() {
            $ = new BucketRedirectAllRequestsToArgs();
        }

        public Builder(BucketRedirectAllRequestsToArgs defaults) {
            $ = new BucketRedirectAllRequestsToArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostName Name of the host where requests are redirected.
         * 
         * @return builder
         * 
         */
        public Builder hostName(Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName Name of the host where requests are redirected.
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param protocol Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<BucketRedirectAllRequestsToProtocol> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
         * 
         * @return builder
         * 
         */
        public Builder protocol(BucketRedirectAllRequestsToProtocol protocol) {
            return protocol(Output.of(protocol));
        }

        public BucketRedirectAllRequestsToArgs build() {
            $.hostName = Objects.requireNonNull($.hostName, "expected parameter 'hostName' to be non-null");
            return $;
        }
    }

}
