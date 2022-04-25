// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.VCenterPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetReplicationvCenterResult {
    /**
     * @return Resource Id
     * 
     */
    private final String id;
    /**
     * @return Resource Location
     * 
     */
    private final @Nullable String location;
    /**
     * @return Resource Name
     * 
     */
    private final String name;
    /**
     * @return VCenter related data.
     * 
     */
    private final VCenterPropertiesResponse properties;
    /**
     * @return Resource Type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetReplicationvCenterResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") VCenterPropertiesResponse properties,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * @return Resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource Location
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Resource Name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return VCenter related data.
     * 
     */
    public VCenterPropertiesResponse properties() {
        return this.properties;
    }
    /**
     * @return Resource Type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplicationvCenterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String location;
        private String name;
        private VCenterPropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReplicationvCenterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(VCenterPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetReplicationvCenterResult build() {
            return new GetReplicationvCenterResult(id, location, name, properties, type);
        }
    }
}
