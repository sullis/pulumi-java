// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.cdn.enums.EnabledState;
import io.pulumi.azurenative.cdn.inputs.ResourceReferenceArgs;
import io.pulumi.azurenative.cdn.inputs.SharedPrivateLinkResourcePropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AFDOriginArgs extends io.pulumi.resources.ResourceArgs {

    public static final AFDOriginArgs Empty = new AFDOriginArgs();

    /**
     * Resource reference to the Azure origin resource.
     * 
     */
    @InputImport(name="azureOrigin")
      private final @Nullable Input<ResourceReferenceArgs> azureOrigin;

    public Input<ResourceReferenceArgs> getAzureOrigin() {
        return this.azureOrigin == null ? Input.empty() : this.azureOrigin;
    }

    /**
     * Whether to enable health probes to be made against backends defined under backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend pool.
     * 
     */
    @InputImport(name="enabledState")
      private final @Nullable Input<Either<String,EnabledState>> enabledState;

    public Input<Either<String,EnabledState>> getEnabledState() {
        return this.enabledState == null ? Input.empty() : this.enabledState;
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
     * Name of the origin group which is unique within the profile.
     * 
     */
    @InputImport(name="originGroupName", required=true)
      private final Input<String> originGroupName;

    public Input<String> getOriginGroupName() {
        return this.originGroupName;
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
     * Name of the origin that is unique within the profile.
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
     * The properties of the private link resource for private origin.
     * 
     */
    @InputImport(name="sharedPrivateLinkResource")
      private final @Nullable Input<SharedPrivateLinkResourcePropertiesArgs> sharedPrivateLinkResource;

    public Input<SharedPrivateLinkResourcePropertiesArgs> getSharedPrivateLinkResource() {
        return this.sharedPrivateLinkResource == null ? Input.empty() : this.sharedPrivateLinkResource;
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

    public AFDOriginArgs(
        @Nullable Input<ResourceReferenceArgs> azureOrigin,
        @Nullable Input<Either<String,EnabledState>> enabledState,
        Input<String> hostName,
        @Nullable Input<Integer> httpPort,
        @Nullable Input<Integer> httpsPort,
        Input<String> originGroupName,
        @Nullable Input<String> originHostHeader,
        @Nullable Input<String> originName,
        @Nullable Input<Integer> priority,
        Input<String> profileName,
        Input<String> resourceGroupName,
        @Nullable Input<SharedPrivateLinkResourcePropertiesArgs> sharedPrivateLinkResource,
        @Nullable Input<Integer> weight) {
        this.azureOrigin = azureOrigin;
        this.enabledState = enabledState;
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.httpPort = httpPort;
        this.httpsPort = httpsPort;
        this.originGroupName = Objects.requireNonNull(originGroupName, "expected parameter 'originGroupName' to be non-null");
        this.originHostHeader = originHostHeader;
        this.originName = originName;
        this.priority = priority;
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sharedPrivateLinkResource = sharedPrivateLinkResource;
        this.weight = weight;
    }

    private AFDOriginArgs() {
        this.azureOrigin = Input.empty();
        this.enabledState = Input.empty();
        this.hostName = Input.empty();
        this.httpPort = Input.empty();
        this.httpsPort = Input.empty();
        this.originGroupName = Input.empty();
        this.originHostHeader = Input.empty();
        this.originName = Input.empty();
        this.priority = Input.empty();
        this.profileName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sharedPrivateLinkResource = Input.empty();
        this.weight = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AFDOriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourceReferenceArgs> azureOrigin;
        private @Nullable Input<Either<String,EnabledState>> enabledState;
        private Input<String> hostName;
        private @Nullable Input<Integer> httpPort;
        private @Nullable Input<Integer> httpsPort;
        private Input<String> originGroupName;
        private @Nullable Input<String> originHostHeader;
        private @Nullable Input<String> originName;
        private @Nullable Input<Integer> priority;
        private Input<String> profileName;
        private Input<String> resourceGroupName;
        private @Nullable Input<SharedPrivateLinkResourcePropertiesArgs> sharedPrivateLinkResource;
        private @Nullable Input<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(AFDOriginArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureOrigin = defaults.azureOrigin;
    	      this.enabledState = defaults.enabledState;
    	      this.hostName = defaults.hostName;
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.originGroupName = defaults.originGroupName;
    	      this.originHostHeader = defaults.originHostHeader;
    	      this.originName = defaults.originName;
    	      this.priority = defaults.priority;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sharedPrivateLinkResource = defaults.sharedPrivateLinkResource;
    	      this.weight = defaults.weight;
        }

        public Builder setAzureOrigin(@Nullable Input<ResourceReferenceArgs> azureOrigin) {
            this.azureOrigin = azureOrigin;
            return this;
        }

        public Builder setAzureOrigin(@Nullable ResourceReferenceArgs azureOrigin) {
            this.azureOrigin = Input.ofNullable(azureOrigin);
            return this;
        }

        public Builder setEnabledState(@Nullable Input<Either<String,EnabledState>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setEnabledState(@Nullable Either<String,EnabledState> enabledState) {
            this.enabledState = Input.ofNullable(enabledState);
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

        public Builder setOriginGroupName(Input<String> originGroupName) {
            this.originGroupName = Objects.requireNonNull(originGroupName);
            return this;
        }

        public Builder setOriginGroupName(String originGroupName) {
            this.originGroupName = Input.of(Objects.requireNonNull(originGroupName));
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

        public Builder setSharedPrivateLinkResource(@Nullable Input<SharedPrivateLinkResourcePropertiesArgs> sharedPrivateLinkResource) {
            this.sharedPrivateLinkResource = sharedPrivateLinkResource;
            return this;
        }

        public Builder setSharedPrivateLinkResource(@Nullable SharedPrivateLinkResourcePropertiesArgs sharedPrivateLinkResource) {
            this.sharedPrivateLinkResource = Input.ofNullable(sharedPrivateLinkResource);
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
        public AFDOriginArgs build() {
            return new AFDOriginArgs(azureOrigin, enabledState, hostName, httpPort, httpsPort, originGroupName, originHostHeader, originName, priority, profileName, resourceGroupName, sharedPrivateLinkResource, weight);
        }
    }
}