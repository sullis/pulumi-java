// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSyncResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Incoming traffic policy.
     * 
     */
    private final String incomingTrafficPolicy;
    /**
     * @return The Azure Region where the Storage Sync exists.
     * 
     */
    private final String location;
    private final String name;
    private final String resourceGroupName;
    /**
     * @return A mapping of tags assigned to the Storage Sync.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetSyncResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("incomingTrafficPolicy") String incomingTrafficPolicy,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.id = id;
        this.incomingTrafficPolicy = incomingTrafficPolicy;
        this.location = location;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.tags = tags;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Incoming traffic policy.
     * 
     */
    public String incomingTrafficPolicy() {
        return this.incomingTrafficPolicy;
    }
    /**
     * @return The Azure Region where the Storage Sync exists.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return A mapping of tags assigned to the Storage Sync.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSyncResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String incomingTrafficPolicy;
        private String location;
        private String name;
        private String resourceGroupName;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSyncResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.incomingTrafficPolicy = defaults.incomingTrafficPolicy;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder incomingTrafficPolicy(String incomingTrafficPolicy) {
            this.incomingTrafficPolicy = Objects.requireNonNull(incomingTrafficPolicy);
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
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetSyncResult build() {
            return new GetSyncResult(id, incomingTrafficPolicy, location, name, resourceGroupName, tags);
        }
    }
}
