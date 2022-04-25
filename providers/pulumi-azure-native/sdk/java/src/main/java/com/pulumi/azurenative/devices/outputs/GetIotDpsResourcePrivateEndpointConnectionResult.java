// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.outputs;

import com.pulumi.azurenative.devices.outputs.PrivateEndpointConnectionPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIotDpsResourcePrivateEndpointConnectionResult {
    /**
     * @return The resource identifier.
     * 
     */
    private final String id;
    /**
     * @return The resource name.
     * 
     */
    private final String name;
    /**
     * @return The properties of a private endpoint connection
     * 
     */
    private final PrivateEndpointConnectionPropertiesResponse properties;
    /**
     * @return The resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetIotDpsResourcePrivateEndpointConnectionResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") PrivateEndpointConnectionPropertiesResponse properties,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * @return The resource identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The properties of a private endpoint connection
     * 
     */
    public PrivateEndpointConnectionPropertiesResponse properties() {
        return this.properties;
    }
    /**
     * @return The resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIotDpsResourcePrivateEndpointConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private PrivateEndpointConnectionPropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIotDpsResourcePrivateEndpointConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(PrivateEndpointConnectionPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetIotDpsResourcePrivateEndpointConnectionResult build() {
            return new GetIotDpsResourcePrivateEndpointConnectionResult(id, name, properties, type);
        }
    }
}
