// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The main origin of CDN content which is added when creating a CDN endpoint.
 * 
 */
public final class DeepCreatedOriginResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeepCreatedOriginResponse Empty = new DeepCreatedOriginResponse();

    /**
     * Origin is enabled for load balancing or not. By default, origin is always enabled.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * The address of the origin. It can be a domain name, IPv4 address, or IPv6 address. This should be unique across all origins in an endpoint.
     * 
     */
    @InputImport(name="hostName", required=true)
      private final String hostName;

    public String getHostName() {
        return this.hostName;
    }

    /**
     * The value of the HTTP port. Must be between 1 and 65535.
     * 
     */
    @InputImport(name="httpPort")
      private final @Nullable Integer httpPort;

    public Optional<Integer> getHttpPort() {
        return this.httpPort == null ? Optional.empty() : Optional.ofNullable(this.httpPort);
    }

    /**
     * The value of the HTTPS port. Must be between 1 and 65535.
     * 
     */
    @InputImport(name="httpsPort")
      private final @Nullable Integer httpsPort;

    public Optional<Integer> getHttpsPort() {
        return this.httpsPort == null ? Optional.empty() : Optional.ofNullable(this.httpsPort);
    }

    /**
     * Origin name which must be unique within the endpoint.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default.
     * 
     */
    @InputImport(name="originHostHeader")
      private final @Nullable String originHostHeader;

    public Optional<String> getOriginHostHeader() {
        return this.originHostHeader == null ? Optional.empty() : Optional.ofNullable(this.originHostHeader);
    }

    /**
     * Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Integer priority;

    public Optional<Integer> getPriority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    /**
     * The Alias of the Private Link resource. Populating this optional field indicates that this origin is 'Private'
     * 
     */
    @InputImport(name="privateLinkAlias")
      private final @Nullable String privateLinkAlias;

    public Optional<String> getPrivateLinkAlias() {
        return this.privateLinkAlias == null ? Optional.empty() : Optional.ofNullable(this.privateLinkAlias);
    }

    /**
     * A custom message to be included in the approval request to connect to the Private Link.
     * 
     */
    @InputImport(name="privateLinkApprovalMessage")
      private final @Nullable String privateLinkApprovalMessage;

    public Optional<String> getPrivateLinkApprovalMessage() {
        return this.privateLinkApprovalMessage == null ? Optional.empty() : Optional.ofNullable(this.privateLinkApprovalMessage);
    }

    /**
     * The location of the Private Link resource. Required only if 'privateLinkResourceId' is populated
     * 
     */
    @InputImport(name="privateLinkLocation")
      private final @Nullable String privateLinkLocation;

    public Optional<String> getPrivateLinkLocation() {
        return this.privateLinkLocation == null ? Optional.empty() : Optional.ofNullable(this.privateLinkLocation);
    }

    /**
     * The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is 'Private'
     * 
     */
    @InputImport(name="privateLinkResourceId")
      private final @Nullable String privateLinkResourceId;

    public Optional<String> getPrivateLinkResourceId() {
        return this.privateLinkResourceId == null ? Optional.empty() : Optional.ofNullable(this.privateLinkResourceId);
    }

    /**
     * Weight of the origin in given origin group for load balancing. Must be between 1 and 1000
     * 
     */
    @InputImport(name="weight")
      private final @Nullable Integer weight;

    public Optional<Integer> getWeight() {
        return this.weight == null ? Optional.empty() : Optional.ofNullable(this.weight);
    }

    public DeepCreatedOriginResponse(
        @Nullable Boolean enabled,
        String hostName,
        @Nullable Integer httpPort,
        @Nullable Integer httpsPort,
        String name,
        @Nullable String originHostHeader,
        @Nullable Integer priority,
        @Nullable String privateLinkAlias,
        @Nullable String privateLinkApprovalMessage,
        @Nullable String privateLinkLocation,
        @Nullable String privateLinkResourceId,
        @Nullable Integer weight) {
        this.enabled = enabled;
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.httpPort = httpPort;
        this.httpsPort = httpsPort;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.originHostHeader = originHostHeader;
        this.priority = priority;
        this.privateLinkAlias = privateLinkAlias;
        this.privateLinkApprovalMessage = privateLinkApprovalMessage;
        this.privateLinkLocation = privateLinkLocation;
        this.privateLinkResourceId = privateLinkResourceId;
        this.weight = weight;
    }

    private DeepCreatedOriginResponse() {
        this.enabled = null;
        this.hostName = null;
        this.httpPort = null;
        this.httpsPort = null;
        this.name = null;
        this.originHostHeader = null;
        this.priority = null;
        this.privateLinkAlias = null;
        this.privateLinkApprovalMessage = null;
        this.privateLinkLocation = null;
        this.privateLinkResourceId = null;
        this.weight = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeepCreatedOriginResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private String hostName;
        private @Nullable Integer httpPort;
        private @Nullable Integer httpsPort;
        private String name;
        private @Nullable String originHostHeader;
        private @Nullable Integer priority;
        private @Nullable String privateLinkAlias;
        private @Nullable String privateLinkApprovalMessage;
        private @Nullable String privateLinkLocation;
        private @Nullable String privateLinkResourceId;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(DeepCreatedOriginResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.hostName = defaults.hostName;
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.name = defaults.name;
    	      this.originHostHeader = defaults.originHostHeader;
    	      this.priority = defaults.priority;
    	      this.privateLinkAlias = defaults.privateLinkAlias;
    	      this.privateLinkApprovalMessage = defaults.privateLinkApprovalMessage;
    	      this.privateLinkLocation = defaults.privateLinkLocation;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.weight = defaults.weight;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setHttpPort(@Nullable Integer httpPort) {
            this.httpPort = httpPort;
            return this;
        }

        public Builder setHttpsPort(@Nullable Integer httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOriginHostHeader(@Nullable String originHostHeader) {
            this.originHostHeader = originHostHeader;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPrivateLinkAlias(@Nullable String privateLinkAlias) {
            this.privateLinkAlias = privateLinkAlias;
            return this;
        }

        public Builder setPrivateLinkApprovalMessage(@Nullable String privateLinkApprovalMessage) {
            this.privateLinkApprovalMessage = privateLinkApprovalMessage;
            return this;
        }

        public Builder setPrivateLinkLocation(@Nullable String privateLinkLocation) {
            this.privateLinkLocation = privateLinkLocation;
            return this;
        }

        public Builder setPrivateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        public Builder setWeight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }
        public DeepCreatedOriginResponse build() {
            return new DeepCreatedOriginResponse(enabled, hostName, httpPort, httpsPort, name, originHostHeader, priority, privateLinkAlias, privateLinkApprovalMessage, privateLinkLocation, privateLinkResourceId, weight);
        }
    }
}