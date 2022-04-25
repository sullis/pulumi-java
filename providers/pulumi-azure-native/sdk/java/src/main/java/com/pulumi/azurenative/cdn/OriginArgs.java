// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OriginArgs extends com.pulumi.resources.ResourceArgs {

    public static final OriginArgs Empty = new OriginArgs();

    /**
     * Origin is enabled for load balancing or not
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Origin is enabled for load balancing or not
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Name of the endpoint under the profile which is unique globally.
     * 
     */
    @Import(name="endpointName", required=true)
    private Output<String> endpointName;

    /**
     * @return Name of the endpoint under the profile which is unique globally.
     * 
     */
    public Output<String> endpointName() {
        return this.endpointName;
    }

    /**
     * The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.This should be unique across all origins in an endpoint.
     * 
     */
    @Import(name="hostName", required=true)
    private Output<String> hostName;

    /**
     * @return The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.This should be unique across all origins in an endpoint.
     * 
     */
    public Output<String> hostName() {
        return this.hostName;
    }

    /**
     * The value of the HTTP port. Must be between 1 and 65535.
     * 
     */
    @Import(name="httpPort")
    private @Nullable Output<Integer> httpPort;

    /**
     * @return The value of the HTTP port. Must be between 1 and 65535.
     * 
     */
    public Optional<Output<Integer>> httpPort() {
        return Optional.ofNullable(this.httpPort);
    }

    /**
     * The value of the HTTPS port. Must be between 1 and 65535.
     * 
     */
    @Import(name="httpsPort")
    private @Nullable Output<Integer> httpsPort;

    /**
     * @return The value of the HTTPS port. Must be between 1 and 65535.
     * 
     */
    public Optional<Output<Integer>> httpsPort() {
        return Optional.ofNullable(this.httpsPort);
    }

    /**
     * The host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default. This overrides the host header defined at Endpoint
     * 
     */
    @Import(name="originHostHeader")
    private @Nullable Output<String> originHostHeader;

    /**
     * @return The host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default. This overrides the host header defined at Endpoint
     * 
     */
    public Optional<Output<String>> originHostHeader() {
        return Optional.ofNullable(this.originHostHeader);
    }

    /**
     * Name of the origin that is unique within the endpoint.
     * 
     */
    @Import(name="originName")
    private @Nullable Output<String> originName;

    /**
     * @return Name of the origin that is unique within the endpoint.
     * 
     */
    public Optional<Output<String>> originName() {
        return Optional.ofNullable(this.originName);
    }

    /**
     * Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The Alias of the Private Link resource. Populating this optional field indicates that this origin is &#39;Private&#39;
     * 
     */
    @Import(name="privateLinkAlias")
    private @Nullable Output<String> privateLinkAlias;

    /**
     * @return The Alias of the Private Link resource. Populating this optional field indicates that this origin is &#39;Private&#39;
     * 
     */
    public Optional<Output<String>> privateLinkAlias() {
        return Optional.ofNullable(this.privateLinkAlias);
    }

    /**
     * A custom message to be included in the approval request to connect to the Private Link.
     * 
     */
    @Import(name="privateLinkApprovalMessage")
    private @Nullable Output<String> privateLinkApprovalMessage;

    /**
     * @return A custom message to be included in the approval request to connect to the Private Link.
     * 
     */
    public Optional<Output<String>> privateLinkApprovalMessage() {
        return Optional.ofNullable(this.privateLinkApprovalMessage);
    }

    /**
     * The location of the Private Link resource. Required only if &#39;privateLinkResourceId&#39; is populated
     * 
     */
    @Import(name="privateLinkLocation")
    private @Nullable Output<String> privateLinkLocation;

    /**
     * @return The location of the Private Link resource. Required only if &#39;privateLinkResourceId&#39; is populated
     * 
     */
    public Optional<Output<String>> privateLinkLocation() {
        return Optional.ofNullable(this.privateLinkLocation);
    }

    /**
     * The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
     * 
     */
    @Import(name="privateLinkResourceId")
    private @Nullable Output<String> privateLinkResourceId;

    /**
     * @return The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
     * 
     */
    public Optional<Output<String>> privateLinkResourceId() {
        return Optional.ofNullable(this.privateLinkResourceId);
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @Import(name="profileName", required=true)
    private Output<String> profileName;

    /**
     * @return Name of the CDN profile which is unique within the resource group.
     * 
     */
    public Output<String> profileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the Resource group within the Azure subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Weight of the origin in given origin group for load balancing. Must be between 1 and 1000
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return Weight of the origin in given origin group for load balancing. Must be between 1 and 1000
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private OriginArgs() {}

    private OriginArgs(OriginArgs $) {
        this.enabled = $.enabled;
        this.endpointName = $.endpointName;
        this.hostName = $.hostName;
        this.httpPort = $.httpPort;
        this.httpsPort = $.httpsPort;
        this.originHostHeader = $.originHostHeader;
        this.originName = $.originName;
        this.priority = $.priority;
        this.privateLinkAlias = $.privateLinkAlias;
        this.privateLinkApprovalMessage = $.privateLinkApprovalMessage;
        this.privateLinkLocation = $.privateLinkLocation;
        this.privateLinkResourceId = $.privateLinkResourceId;
        this.profileName = $.profileName;
        this.resourceGroupName = $.resourceGroupName;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OriginArgs $;

        public Builder() {
            $ = new OriginArgs();
        }

        public Builder(OriginArgs defaults) {
            $ = new OriginArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Origin is enabled for load balancing or not
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Origin is enabled for load balancing or not
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param endpointName Name of the endpoint under the profile which is unique globally.
         * 
         * @return builder
         * 
         */
        public Builder endpointName(Output<String> endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        /**
         * @param endpointName Name of the endpoint under the profile which is unique globally.
         * 
         * @return builder
         * 
         */
        public Builder endpointName(String endpointName) {
            return endpointName(Output.of(endpointName));
        }

        /**
         * @param hostName The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.This should be unique across all origins in an endpoint.
         * 
         * @return builder
         * 
         */
        public Builder hostName(Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.This should be unique across all origins in an endpoint.
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param httpPort The value of the HTTP port. Must be between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder httpPort(@Nullable Output<Integer> httpPort) {
            $.httpPort = httpPort;
            return this;
        }

        /**
         * @param httpPort The value of the HTTP port. Must be between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder httpPort(Integer httpPort) {
            return httpPort(Output.of(httpPort));
        }

        /**
         * @param httpsPort The value of the HTTPS port. Must be between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder httpsPort(@Nullable Output<Integer> httpsPort) {
            $.httpsPort = httpsPort;
            return this;
        }

        /**
         * @param httpsPort The value of the HTTPS port. Must be between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder httpsPort(Integer httpsPort) {
            return httpsPort(Output.of(httpsPort));
        }

        /**
         * @param originHostHeader The host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default. This overrides the host header defined at Endpoint
         * 
         * @return builder
         * 
         */
        public Builder originHostHeader(@Nullable Output<String> originHostHeader) {
            $.originHostHeader = originHostHeader;
            return this;
        }

        /**
         * @param originHostHeader The host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default. This overrides the host header defined at Endpoint
         * 
         * @return builder
         * 
         */
        public Builder originHostHeader(String originHostHeader) {
            return originHostHeader(Output.of(originHostHeader));
        }

        /**
         * @param originName Name of the origin that is unique within the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder originName(@Nullable Output<String> originName) {
            $.originName = originName;
            return this;
        }

        /**
         * @param originName Name of the origin that is unique within the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder originName(String originName) {
            return originName(Output.of(originName));
        }

        /**
         * @param priority Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param privateLinkAlias The Alias of the Private Link resource. Populating this optional field indicates that this origin is &#39;Private&#39;
         * 
         * @return builder
         * 
         */
        public Builder privateLinkAlias(@Nullable Output<String> privateLinkAlias) {
            $.privateLinkAlias = privateLinkAlias;
            return this;
        }

        /**
         * @param privateLinkAlias The Alias of the Private Link resource. Populating this optional field indicates that this origin is &#39;Private&#39;
         * 
         * @return builder
         * 
         */
        public Builder privateLinkAlias(String privateLinkAlias) {
            return privateLinkAlias(Output.of(privateLinkAlias));
        }

        /**
         * @param privateLinkApprovalMessage A custom message to be included in the approval request to connect to the Private Link.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkApprovalMessage(@Nullable Output<String> privateLinkApprovalMessage) {
            $.privateLinkApprovalMessage = privateLinkApprovalMessage;
            return this;
        }

        /**
         * @param privateLinkApprovalMessage A custom message to be included in the approval request to connect to the Private Link.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkApprovalMessage(String privateLinkApprovalMessage) {
            return privateLinkApprovalMessage(Output.of(privateLinkApprovalMessage));
        }

        /**
         * @param privateLinkLocation The location of the Private Link resource. Required only if &#39;privateLinkResourceId&#39; is populated
         * 
         * @return builder
         * 
         */
        public Builder privateLinkLocation(@Nullable Output<String> privateLinkLocation) {
            $.privateLinkLocation = privateLinkLocation;
            return this;
        }

        /**
         * @param privateLinkLocation The location of the Private Link resource. Required only if &#39;privateLinkResourceId&#39; is populated
         * 
         * @return builder
         * 
         */
        public Builder privateLinkLocation(String privateLinkLocation) {
            return privateLinkLocation(Output.of(privateLinkLocation));
        }

        /**
         * @param privateLinkResourceId The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
         * 
         * @return builder
         * 
         */
        public Builder privateLinkResourceId(@Nullable Output<String> privateLinkResourceId) {
            $.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        /**
         * @param privateLinkResourceId The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
         * 
         * @return builder
         * 
         */
        public Builder privateLinkResourceId(String privateLinkResourceId) {
            return privateLinkResourceId(Output.of(privateLinkResourceId));
        }

        /**
         * @param profileName Name of the CDN profile which is unique within the resource group.
         * 
         * @return builder
         * 
         */
        public Builder profileName(Output<String> profileName) {
            $.profileName = profileName;
            return this;
        }

        /**
         * @param profileName Name of the CDN profile which is unique within the resource group.
         * 
         * @return builder
         * 
         */
        public Builder profileName(String profileName) {
            return profileName(Output.of(profileName));
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param weight Weight of the origin in given origin group for load balancing. Must be between 1 and 1000
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight Weight of the origin in given origin group for load balancing. Must be between 1 and 1000
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public OriginArgs build() {
            $.endpointName = Objects.requireNonNull($.endpointName, "expected parameter 'endpointName' to be non-null");
            $.hostName = Objects.requireNonNull($.hostName, "expected parameter 'hostName' to be non-null");
            $.profileName = Objects.requireNonNull($.profileName, "expected parameter 'profileName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
