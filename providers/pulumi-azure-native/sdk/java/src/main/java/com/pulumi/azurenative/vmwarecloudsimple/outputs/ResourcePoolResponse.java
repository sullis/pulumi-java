// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.vmwarecloudsimple.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourcePoolResponse {
    /**
     * @return Hierarchical resource pool name
     * 
     */
    private final String fullName;
    /**
     * @return resource pool id (privateCloudId:vsphereId)
     * 
     */
    private final String id;
    /**
     * @return Azure region
     * 
     */
    private final String location;
    /**
     * @return {ResourcePoolName}
     * 
     */
    private final String name;
    /**
     * @return The Private Cloud Id
     * 
     */
    private final String privateCloudId;
    /**
     * @return {resourceProviderNamespace}/{resourceType}
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ResourcePoolResponse(
        @CustomType.Parameter("fullName") String fullName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateCloudId") String privateCloudId,
        @CustomType.Parameter("type") String type) {
        this.fullName = fullName;
        this.id = id;
        this.location = location;
        this.name = name;
        this.privateCloudId = privateCloudId;
        this.type = type;
    }

    /**
     * @return Hierarchical resource pool name
     * 
     */
    public String fullName() {
        return this.fullName;
    }
    /**
     * @return resource pool id (privateCloudId:vsphereId)
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Azure region
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return {ResourcePoolName}
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Private Cloud Id
     * 
     */
    public String privateCloudId() {
        return this.privateCloudId;
    }
    /**
     * @return {resourceProviderNamespace}/{resourceType}
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePoolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fullName;
        private String id;
        private String location;
        private String name;
        private String privateCloudId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePoolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullName = defaults.fullName;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.privateCloudId = defaults.privateCloudId;
    	      this.type = defaults.type;
        }

        public Builder fullName(String fullName) {
            this.fullName = Objects.requireNonNull(fullName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateCloudId(String privateCloudId) {
            this.privateCloudId = Objects.requireNonNull(privateCloudId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ResourcePoolResponse build() {
            return new ResourcePoolResponse(fullName, id, location, name, privateCloudId, type);
        }
    }
}
