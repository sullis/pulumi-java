// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIpAllocationResult {
    /**
     * IpAllocation tags.
     * 
     */
    private final @Nullable Map<String,String> allocationTags;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The IPAM allocation ID.
     * 
     */
    private final @Nullable String ipamAllocationId;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The address prefix for the IpAllocation.
     * 
     */
    private final @Nullable String prefix;
    /**
     * The address prefix length for the IpAllocation.
     * 
     */
    private final @Nullable Integer prefixLength;
    /**
     * The address prefix Type for the IpAllocation.
     * 
     */
    private final @Nullable String prefixType;
    /**
     * The Subnet that using the prefix of this IpAllocation resource.
     * 
     */
    private final SubResourceResponse subnet;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * The VirtualNetwork that using the prefix of this IpAllocation resource.
     * 
     */
    private final SubResourceResponse virtualNetwork;

    @OutputCustomType.Constructor({"allocationTags","etag","id","ipamAllocationId","location","name","prefix","prefixLength","prefixType","subnet","tags","type","virtualNetwork"})
    private GetIpAllocationResult(
        @Nullable Map<String,String> allocationTags,
        String etag,
        @Nullable String id,
        @Nullable String ipamAllocationId,
        @Nullable String location,
        String name,
        @Nullable String prefix,
        @Nullable Integer prefixLength,
        @Nullable String prefixType,
        SubResourceResponse subnet,
        @Nullable Map<String,String> tags,
        String type,
        SubResourceResponse virtualNetwork) {
        this.allocationTags = allocationTags;
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.ipamAllocationId = ipamAllocationId;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.prefix = prefix;
        this.prefixLength = prefixLength;
        this.prefixType = prefixType;
        this.subnet = Objects.requireNonNull(subnet);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.virtualNetwork = Objects.requireNonNull(virtualNetwork);
    }

    /**
     * IpAllocation tags.
     * 
    */
    public Map<String,String> getAllocationTags() {
        return this.allocationTags == null ? Map.of() : this.allocationTags;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The IPAM allocation ID.
     * 
    */
    public Optional<String> getIpamAllocationId() {
        return Optional.ofNullable(this.ipamAllocationId);
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The address prefix for the IpAllocation.
     * 
    */
    public Optional<String> getPrefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * The address prefix length for the IpAllocation.
     * 
    */
    public Optional<Integer> getPrefixLength() {
        return Optional.ofNullable(this.prefixLength);
    }
    /**
     * The address prefix Type for the IpAllocation.
     * 
    */
    public Optional<String> getPrefixType() {
        return Optional.ofNullable(this.prefixType);
    }
    /**
     * The Subnet that using the prefix of this IpAllocation resource.
     * 
    */
    public SubResourceResponse getSubnet() {
        return this.subnet;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The VirtualNetwork that using the prefix of this IpAllocation resource.
     * 
    */
    public SubResourceResponse getVirtualNetwork() {
        return this.virtualNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpAllocationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> allocationTags;
        private String etag;
        private @Nullable String id;
        private @Nullable String ipamAllocationId;
        private @Nullable String location;
        private String name;
        private @Nullable String prefix;
        private @Nullable Integer prefixLength;
        private @Nullable String prefixType;
        private SubResourceResponse subnet;
        private @Nullable Map<String,String> tags;
        private String type;
        private SubResourceResponse virtualNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIpAllocationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationTags = defaults.allocationTags;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.ipamAllocationId = defaults.ipamAllocationId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.prefix = defaults.prefix;
    	      this.prefixLength = defaults.prefixLength;
    	      this.prefixType = defaults.prefixType;
    	      this.subnet = defaults.subnet;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualNetwork = defaults.virtualNetwork;
        }

        public Builder setAllocationTags(@Nullable Map<String,String> allocationTags) {
            this.allocationTags = allocationTags;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIpamAllocationId(@Nullable String ipamAllocationId) {
            this.ipamAllocationId = ipamAllocationId;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefixLength(@Nullable Integer prefixLength) {
            this.prefixLength = prefixLength;
            return this;
        }

        public Builder setPrefixType(@Nullable String prefixType) {
            this.prefixType = prefixType;
            return this;
        }

        public Builder setSubnet(SubResourceResponse subnet) {
            this.subnet = Objects.requireNonNull(subnet);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVirtualNetwork(SubResourceResponse virtualNetwork) {
            this.virtualNetwork = Objects.requireNonNull(virtualNetwork);
            return this;
        }
        public GetIpAllocationResult build() {
            return new GetIpAllocationResult(allocationTags, etag, id, ipamAllocationId, location, name, prefix, prefixLength, prefixType, subnet, tags, type, virtualNetwork);
        }
    }
}