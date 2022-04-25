// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.NetworkInterfaceResponse;
import com.pulumi.azurenative.network.outputs.QosIpRangeResponse;
import com.pulumi.azurenative.network.outputs.QosPortRangeResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDscpConfigurationResult {
    /**
     * @return Associated Network Interfaces to the DSCP Configuration.
     * 
     */
    private final List<NetworkInterfaceResponse> associatedNetworkInterfaces;
    /**
     * @return Destination IP ranges.
     * 
     */
    private final @Nullable List<QosIpRangeResponse> destinationIpRanges;
    /**
     * @return Destination port ranges.
     * 
     */
    private final @Nullable List<QosPortRangeResponse> destinationPortRanges;
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * @return List of markings to be used in the configuration.
     * 
     */
    private final @Nullable List<Integer> markings;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return RNM supported protocol types.
     * 
     */
    private final @Nullable String protocol;
    /**
     * @return The provisioning state of the DSCP Configuration resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return Qos Collection ID generated by RNM.
     * 
     */
    private final String qosCollectionId;
    /**
     * @return The resource GUID property of the DSCP Configuration resource.
     * 
     */
    private final String resourceGuid;
    /**
     * @return Source IP ranges.
     * 
     */
    private final @Nullable List<QosIpRangeResponse> sourceIpRanges;
    /**
     * @return Sources port ranges.
     * 
     */
    private final @Nullable List<QosPortRangeResponse> sourcePortRanges;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDscpConfigurationResult(
        @CustomType.Parameter("associatedNetworkInterfaces") List<NetworkInterfaceResponse> associatedNetworkInterfaces,
        @CustomType.Parameter("destinationIpRanges") @Nullable List<QosIpRangeResponse> destinationIpRanges,
        @CustomType.Parameter("destinationPortRanges") @Nullable List<QosPortRangeResponse> destinationPortRanges,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("markings") @Nullable List<Integer> markings,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("protocol") @Nullable String protocol,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("qosCollectionId") String qosCollectionId,
        @CustomType.Parameter("resourceGuid") String resourceGuid,
        @CustomType.Parameter("sourceIpRanges") @Nullable List<QosIpRangeResponse> sourceIpRanges,
        @CustomType.Parameter("sourcePortRanges") @Nullable List<QosPortRangeResponse> sourcePortRanges,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.associatedNetworkInterfaces = associatedNetworkInterfaces;
        this.destinationIpRanges = destinationIpRanges;
        this.destinationPortRanges = destinationPortRanges;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.markings = markings;
        this.name = name;
        this.protocol = protocol;
        this.provisioningState = provisioningState;
        this.qosCollectionId = qosCollectionId;
        this.resourceGuid = resourceGuid;
        this.sourceIpRanges = sourceIpRanges;
        this.sourcePortRanges = sourcePortRanges;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return Associated Network Interfaces to the DSCP Configuration.
     * 
     */
    public List<NetworkInterfaceResponse> associatedNetworkInterfaces() {
        return this.associatedNetworkInterfaces;
    }
    /**
     * @return Destination IP ranges.
     * 
     */
    public List<QosIpRangeResponse> destinationIpRanges() {
        return this.destinationIpRanges == null ? List.of() : this.destinationIpRanges;
    }
    /**
     * @return Destination port ranges.
     * 
     */
    public List<QosPortRangeResponse> destinationPortRanges() {
        return this.destinationPortRanges == null ? List.of() : this.destinationPortRanges;
    }
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Resource location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return List of markings to be used in the configuration.
     * 
     */
    public List<Integer> markings() {
        return this.markings == null ? List.of() : this.markings;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return RNM supported protocol types.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return The provisioning state of the DSCP Configuration resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Qos Collection ID generated by RNM.
     * 
     */
    public String qosCollectionId() {
        return this.qosCollectionId;
    }
    /**
     * @return The resource GUID property of the DSCP Configuration resource.
     * 
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * @return Source IP ranges.
     * 
     */
    public List<QosIpRangeResponse> sourceIpRanges() {
        return this.sourceIpRanges == null ? List.of() : this.sourceIpRanges;
    }
    /**
     * @return Sources port ranges.
     * 
     */
    public List<QosPortRangeResponse> sourcePortRanges() {
        return this.sourcePortRanges == null ? List.of() : this.sourcePortRanges;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDscpConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<NetworkInterfaceResponse> associatedNetworkInterfaces;
        private @Nullable List<QosIpRangeResponse> destinationIpRanges;
        private @Nullable List<QosPortRangeResponse> destinationPortRanges;
        private String etag;
        private @Nullable String id;
        private @Nullable String location;
        private @Nullable List<Integer> markings;
        private String name;
        private @Nullable String protocol;
        private String provisioningState;
        private String qosCollectionId;
        private String resourceGuid;
        private @Nullable List<QosIpRangeResponse> sourceIpRanges;
        private @Nullable List<QosPortRangeResponse> sourcePortRanges;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDscpConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatedNetworkInterfaces = defaults.associatedNetworkInterfaces;
    	      this.destinationIpRanges = defaults.destinationIpRanges;
    	      this.destinationPortRanges = defaults.destinationPortRanges;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.markings = defaults.markings;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.qosCollectionId = defaults.qosCollectionId;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.sourceIpRanges = defaults.sourceIpRanges;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder associatedNetworkInterfaces(List<NetworkInterfaceResponse> associatedNetworkInterfaces) {
            this.associatedNetworkInterfaces = Objects.requireNonNull(associatedNetworkInterfaces);
            return this;
        }
        public Builder associatedNetworkInterfaces(NetworkInterfaceResponse... associatedNetworkInterfaces) {
            return associatedNetworkInterfaces(List.of(associatedNetworkInterfaces));
        }
        public Builder destinationIpRanges(@Nullable List<QosIpRangeResponse> destinationIpRanges) {
            this.destinationIpRanges = destinationIpRanges;
            return this;
        }
        public Builder destinationIpRanges(QosIpRangeResponse... destinationIpRanges) {
            return destinationIpRanges(List.of(destinationIpRanges));
        }
        public Builder destinationPortRanges(@Nullable List<QosPortRangeResponse> destinationPortRanges) {
            this.destinationPortRanges = destinationPortRanges;
            return this;
        }
        public Builder destinationPortRanges(QosPortRangeResponse... destinationPortRanges) {
            return destinationPortRanges(List.of(destinationPortRanges));
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder markings(@Nullable List<Integer> markings) {
            this.markings = markings;
            return this;
        }
        public Builder markings(Integer... markings) {
            return markings(List.of(markings));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder qosCollectionId(String qosCollectionId) {
            this.qosCollectionId = Objects.requireNonNull(qosCollectionId);
            return this;
        }
        public Builder resourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }
        public Builder sourceIpRanges(@Nullable List<QosIpRangeResponse> sourceIpRanges) {
            this.sourceIpRanges = sourceIpRanges;
            return this;
        }
        public Builder sourceIpRanges(QosIpRangeResponse... sourceIpRanges) {
            return sourceIpRanges(List.of(sourceIpRanges));
        }
        public Builder sourcePortRanges(@Nullable List<QosPortRangeResponse> sourcePortRanges) {
            this.sourcePortRanges = sourcePortRanges;
            return this;
        }
        public Builder sourcePortRanges(QosPortRangeResponse... sourcePortRanges) {
            return sourcePortRanges(List.of(sourcePortRanges));
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetDscpConfigurationResult build() {
            return new GetDscpConfigurationResult(associatedNetworkInterfaces, destinationIpRanges, destinationPortRanges, etag, id, location, markings, name, protocol, provisioningState, qosCollectionId, resourceGuid, sourceIpRanges, sourcePortRanges, tags, type);
        }
    }
}
