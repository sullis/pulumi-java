// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.azurenative.appplatform.outputs.AppResourcePropertiesResponse;
import com.pulumi.azurenative.appplatform.outputs.ManagedIdentityPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppResult {
    /**
     * @return Fully qualified resource Id for the resource.
     * 
     */
    private final String id;
    /**
     * @return The Managed Identity type of the app resource
     * 
     */
    private final @Nullable ManagedIdentityPropertiesResponse identity;
    /**
     * @return The GEO location of the application, always the same with its parent resource
     * 
     */
    private final @Nullable String location;
    /**
     * @return The name of the resource.
     * 
     */
    private final String name;
    /**
     * @return Properties of the App resource
     * 
     */
    private final AppResourcePropertiesResponse properties;
    /**
     * @return The type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetAppResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable ManagedIdentityPropertiesResponse identity,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") AppResourcePropertiesResponse properties,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * @return Fully qualified resource Id for the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Managed Identity type of the app resource
     * 
     */
    public Optional<ManagedIdentityPropertiesResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return The GEO location of the application, always the same with its parent resource
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Properties of the App resource
     * 
     */
    public AppResourcePropertiesResponse properties() {
        return this.properties;
    }
    /**
     * @return The type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable ManagedIdentityPropertiesResponse identity;
        private @Nullable String location;
        private String name;
        private AppResourcePropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable ManagedIdentityPropertiesResponse identity) {
            this.identity = identity;
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
        public Builder properties(AppResourcePropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetAppResult build() {
            return new GetAppResult(id, identity, location, name, properties, type);
        }
    }
}
