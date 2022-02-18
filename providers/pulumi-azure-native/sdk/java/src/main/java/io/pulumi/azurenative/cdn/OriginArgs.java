// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OriginArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginArgs Empty = new OriginArgs();

    /**
     * Origin is enabled for load balancing or not
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Name of the endpoint under the profile which is unique globally.
     * 
     */
    @InputImport(name="endpointName", required=true)
    private final Input<String> endpointName;

    public Input<String> getEndpointName() {
        return this.endpointName;
    }

    /**
     * The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.This should be unique across all origins in an endpoint.
     * 
     */
    @InputImport(name="hostName", required=true)
    private final Input<String> hostName;

    public Input<String> getHostName() {
        return this.hostName;
    }

    /**
     * The value of the HTTP port. Must be between 1 and 65535.
     * 
     */
    @InputImport(name="httpPort")
    private final @Nullable Input<Integer> httpPort;

    public Input<Integer> getHttpPort() {
        return this.httpPort == null ? Input.empty() : this.httpPort;
    }

    /**
     * The value of the HTTPS port. Must be between 1 and 65535.
     * 
     */
    @InputImport(name="httpsPort")
    private final @Nullable Input<Integer> httpsPort;

    public Input<Integer> getHttpsPort() {
        return this.httpsPort == null ? Input.empty() : this.httpsPort;
    }

    /**
     * The host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default. This overrides the host header defined at Endpoint
     * 
     */
    @InputImport(name="originHostHeader")
    private final @Nullable Input<String> originHostHeader;

    public Input<String> getOriginHostHeader() {
        return this.originHostHeader == null ? Input.empty() : this.originHostHeader;
    }

    /**
     * Name of the origin that is unique within the endpoint.
     * 
     */
    @InputImport(name="originName")
    private final @Nullable Input<String> originName;

    public Input<String> getOriginName() {
        return this.originName == null ? Input.empty() : this.originName;
    }

    /**
     * Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * The Alias of the Private Link resource. Populating this optional field indicates that this origin is 'Private'
     * 
     */
    @InputImport(name="privateLinkAlias")
    private final @Nullable Input<String> privateLinkAlias;

    public Input<String> getPrivateLinkAlias() {
        return this.privateLinkAlias == null ? Input.empty() : this.privateLinkAlias;
    }

    /**
     * A custom message to be included in the approval request to connect to the Private Link.
     * 
     */
    @InputImport(name="privateLinkApprovalMessage")
    private final @Nullable Input<String> privateLinkApprovalMessage;

    public Input<String> getPrivateLinkApprovalMessage() {
        return this.privateLinkApprovalMessage == null ? Input.empty() : this.privateLinkApprovalMessage;
    }

    /**
     * The location of the Private Link resource. Required only if 'privateLinkResourceId' is populated
     * 
     */
    @InputImport(name="privateLinkLocation")
    private final @Nullable Input<String> privateLinkLocation;

    public Input<String> getPrivateLinkLocation() {
        return this.privateLinkLocation == null ? Input.empty() : this.privateLinkLocation;
    }

    /**
     * The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is 'Private'
     * 
     */
    @InputImport(name="privateLinkResourceId")
    private final @Nullable Input<String> privateLinkResourceId;

    public Input<String> getPrivateLinkResourceId() {
        return this.privateLinkResourceId == null ? Input.empty() : this.privateLinkResourceId;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @InputImport(name="profileName", required=true)
    private final Input<String> profileName;

    public Input<String> getProfileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Weight of the origin in given origin group for load balancing. Must be between 1 and 1000
     * 
     */
    @InputImport(name="weight")
    private final @Nullable Input<Integer> weight;

    public Input<Integer> getWeight() {
        return this.weight == null ? Input.empty() : this.weight;
    }

    public OriginArgs(
        @Nullable Input<Boolean> enabled,
        Input<String> endpointName,
        Input<String> hostName,
        @Nullable Input<Integer> httpPort,
        @Nullable Input<Integer> httpsPort,
        @Nullable Input<String> originHostHeader,
        @Nullable Input<String> originName,
        @Nullable Input<Integer> priority,
        @Nullable Input<String> privateLinkAlias,
        @Nullable Input<String> privateLinkApprovalMessage,
        @Nullable Input<String> privateLinkLocation,
        @Nullable Input<String> privateLinkResourceId,
        Input<String> profileName,
        Input<String> resourceGroupName,
        @Nullable Input<Integer> weight) {
        this.enabled = enabled;
        this.endpointName = Objects.requireNonNull(endpointName, "expected parameter 'endpointName' to be non-null");
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.httpPort = httpPort;
        this.httpsPort = httpsPort;
        this.originHostHeader = originHostHeader;
        this.originName = originName;
        this.priority = priority;
        this.privateLinkAlias = privateLinkAlias;
        this.privateLinkApprovalMessage = privateLinkApprovalMessage;
        this.privateLinkLocation = privateLinkLocation;
        this.privateLinkResourceId = privateLinkResourceId;
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.weight = weight;
    }

    private OriginArgs() {
        this.enabled = Input.empty();
        this.endpointName = Input.empty();
        this.hostName = Input.empty();
        this.httpPort = Input.empty();
        this.httpsPort = Input.empty();
        this.originHostHeader = Input.empty();
        this.originName = Input.empty();
        this.priority = Input.empty();
        this.privateLinkAlias = Input.empty();
        this.privateLinkApprovalMessage = Input.empty();
        this.privateLinkLocation = Input.empty();
        this.privateLinkResourceId = Input.empty();
        this.profileName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.weight = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private Input<String> endpointName;
        private Input<String> hostName;
        private @Nullable Input<Integer> httpPort;
        private @Nullable Input<Integer> httpsPort;
        private @Nullable Input<String> originHostHeader;
        private @Nullable Input<String> originName;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<String> privateLinkAlias;
        private @Nullable Input<String> privateLinkApprovalMessage;
        private @Nullable Input<String> privateLinkLocation;
        private @Nullable Input<String> privateLinkResourceId;
        private Input<String> profileName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.endpointName = defaults.endpointName;
    	      this.hostName = defaults.hostName;
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.originHostHeader = defaults.originHostHeader;
    	      this.originName = defaults.originName;
    	      this.priority = defaults.priority;
    	      this.privateLinkAlias = defaults.privateLinkAlias;
    	      this.privateLinkApprovalMessage = defaults.privateLinkApprovalMessage;
    	      this.privateLinkLocation = defaults.privateLinkLocation;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.weight = defaults.weight;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setEndpointName(Input<String> endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }

        public Builder setEndpointName(String endpointName) {
            this.endpointName = Input.of(Objects.requireNonNull(endpointName));
            return this;
        }

        public Builder setHostName(Input<String> hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Input.of(Objects.requireNonNull(hostName));
            return this;
        }

        public Builder setHttpPort(@Nullable Input<Integer> httpPort) {
            this.httpPort = httpPort;
            return this;
        }

        public Builder setHttpPort(@Nullable Integer httpPort) {
            this.httpPort = Input.ofNullable(httpPort);
            return this;
        }

        public Builder setHttpsPort(@Nullable Input<Integer> httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }

        public Builder setHttpsPort(@Nullable Integer httpsPort) {
            this.httpsPort = Input.ofNullable(httpsPort);
            return this;
        }

        public Builder setOriginHostHeader(@Nullable Input<String> originHostHeader) {
            this.originHostHeader = originHostHeader;
            return this;
        }

        public Builder setOriginHostHeader(@Nullable String originHostHeader) {
            this.originHostHeader = Input.ofNullable(originHostHeader);
            return this;
        }

        public Builder setOriginName(@Nullable Input<String> originName) {
            this.originName = originName;
            return this;
        }

        public Builder setOriginName(@Nullable String originName) {
            this.originName = Input.ofNullable(originName);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setPrivateLinkAlias(@Nullable Input<String> privateLinkAlias) {
            this.privateLinkAlias = privateLinkAlias;
            return this;
        }

        public Builder setPrivateLinkAlias(@Nullable String privateLinkAlias) {
            this.privateLinkAlias = Input.ofNullable(privateLinkAlias);
            return this;
        }

        public Builder setPrivateLinkApprovalMessage(@Nullable Input<String> privateLinkApprovalMessage) {
            this.privateLinkApprovalMessage = privateLinkApprovalMessage;
            return this;
        }

        public Builder setPrivateLinkApprovalMessage(@Nullable String privateLinkApprovalMessage) {
            this.privateLinkApprovalMessage = Input.ofNullable(privateLinkApprovalMessage);
            return this;
        }

        public Builder setPrivateLinkLocation(@Nullable Input<String> privateLinkLocation) {
            this.privateLinkLocation = privateLinkLocation;
            return this;
        }

        public Builder setPrivateLinkLocation(@Nullable String privateLinkLocation) {
            this.privateLinkLocation = Input.ofNullable(privateLinkLocation);
            return this;
        }

        public Builder setPrivateLinkResourceId(@Nullable Input<String> privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        public Builder setPrivateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = Input.ofNullable(privateLinkResourceId);
            return this;
        }

        public Builder setProfileName(Input<String> profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder setProfileName(String profileName) {
            this.profileName = Input.of(Objects.requireNonNull(profileName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setWeight(@Nullable Input<Integer> weight) {
            this.weight = weight;
            return this;
        }

        public Builder setWeight(@Nullable Integer weight) {
            this.weight = Input.ofNullable(weight);
            return this;
        }

        public OriginArgs build() {
            return new OriginArgs(enabled, endpointName, hostName, httpPort, httpsPort, originHostHeader, originName, priority, privateLinkAlias, privateLinkApprovalMessage, privateLinkLocation, privateLinkResourceId, profileName, resourceGroupName, weight);
        }
    }
}
