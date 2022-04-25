// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for an App Engine network endpoint group (NEG). The service is optional, may be provided explicitly or in the URL mask. The version is optional and can only be provided explicitly or in the URL mask when service is present. Note: App Engine service must be in the same project and located in the same region as the Serverless NEG.
 * 
 */
public final class NetworkEndpointGroupAppEngineArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkEndpointGroupAppEngineArgs Empty = new NetworkEndpointGroupAppEngineArgs();

    /**
     * Optional serving service. The service name is case-sensitive and must be 1-63 characters long. Example value: &#34;default&#34;, &#34;my-service&#34;.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return Optional serving service. The service name is case-sensitive and must be 1-63 characters long. Example value: &#34;default&#34;, &#34;my-service&#34;.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services. For example, the request URLs &#34;foo1-dot-appname.appspot.com/v1&#34; and &#34;foo1-dot-appname.appspot.com/v2&#34; can be backed by the same Serverless NEG with URL mask &#34;-dot-appname.appspot.com/&#34;. The URL mask will parse them to { service = &#34;foo1&#34;, version = &#34;v1&#34; } and { service = &#34;foo1&#34;, version = &#34;v2&#34; } respectively.
     * 
     */
    @Import(name="urlMask")
    private @Nullable Output<String> urlMask;

    /**
     * @return A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services. For example, the request URLs &#34;foo1-dot-appname.appspot.com/v1&#34; and &#34;foo1-dot-appname.appspot.com/v2&#34; can be backed by the same Serverless NEG with URL mask &#34;-dot-appname.appspot.com/&#34;. The URL mask will parse them to { service = &#34;foo1&#34;, version = &#34;v1&#34; } and { service = &#34;foo1&#34;, version = &#34;v2&#34; } respectively.
     * 
     */
    public Optional<Output<String>> urlMask() {
        return Optional.ofNullable(this.urlMask);
    }

    /**
     * Optional serving version. The version name is case-sensitive and must be 1-100 characters long. Example value: &#34;v1&#34;, &#34;v2&#34;.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Optional serving version. The version name is case-sensitive and must be 1-100 characters long. Example value: &#34;v1&#34;, &#34;v2&#34;.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private NetworkEndpointGroupAppEngineArgs() {}

    private NetworkEndpointGroupAppEngineArgs(NetworkEndpointGroupAppEngineArgs $) {
        this.service = $.service;
        this.urlMask = $.urlMask;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkEndpointGroupAppEngineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkEndpointGroupAppEngineArgs $;

        public Builder() {
            $ = new NetworkEndpointGroupAppEngineArgs();
        }

        public Builder(NetworkEndpointGroupAppEngineArgs defaults) {
            $ = new NetworkEndpointGroupAppEngineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param service Optional serving service. The service name is case-sensitive and must be 1-63 characters long. Example value: &#34;default&#34;, &#34;my-service&#34;.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Optional serving service. The service name is case-sensitive and must be 1-63 characters long. Example value: &#34;default&#34;, &#34;my-service&#34;.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param urlMask A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services. For example, the request URLs &#34;foo1-dot-appname.appspot.com/v1&#34; and &#34;foo1-dot-appname.appspot.com/v2&#34; can be backed by the same Serverless NEG with URL mask &#34;-dot-appname.appspot.com/&#34;. The URL mask will parse them to { service = &#34;foo1&#34;, version = &#34;v1&#34; } and { service = &#34;foo1&#34;, version = &#34;v2&#34; } respectively.
         * 
         * @return builder
         * 
         */
        public Builder urlMask(@Nullable Output<String> urlMask) {
            $.urlMask = urlMask;
            return this;
        }

        /**
         * @param urlMask A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services. For example, the request URLs &#34;foo1-dot-appname.appspot.com/v1&#34; and &#34;foo1-dot-appname.appspot.com/v2&#34; can be backed by the same Serverless NEG with URL mask &#34;-dot-appname.appspot.com/&#34;. The URL mask will parse them to { service = &#34;foo1&#34;, version = &#34;v1&#34; } and { service = &#34;foo1&#34;, version = &#34;v2&#34; } respectively.
         * 
         * @return builder
         * 
         */
        public Builder urlMask(String urlMask) {
            return urlMask(Output.of(urlMask));
        }

        /**
         * @param version Optional serving version. The version name is case-sensitive and must be 1-100 characters long. Example value: &#34;v1&#34;, &#34;v2&#34;.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Optional serving version. The version name is case-sensitive and must be 1-100 characters long. Example value: &#34;v1&#34;, &#34;v2&#34;.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public NetworkEndpointGroupAppEngineArgs build() {
            return $;
        }
    }

}
