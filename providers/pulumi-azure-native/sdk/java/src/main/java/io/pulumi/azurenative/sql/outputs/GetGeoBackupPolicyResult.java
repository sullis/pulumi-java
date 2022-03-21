// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGeoBackupPolicyResult {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Kind of geo backup policy.  This is metadata used for the Azure portal experience.
     * 
     */
    private final String kind;
    /**
     * Backup policy location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The state of the geo backup policy.
     * 
     */
    private final String state;
    /**
     * The storage type of the geo backup policy.
     * 
     */
    private final String storageType;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetGeoBackupPolicyResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("storageType") String storageType,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.state = state;
        this.storageType = storageType;
        this.type = type;
    }

    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of geo backup policy.  This is metadata used for the Azure portal experience.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Backup policy location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The state of the geo backup policy.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The storage type of the geo backup policy.
     * 
    */
    public String getStorageType() {
        return this.storageType;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGeoBackupPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String kind;
        private String location;
        private String name;
        private String state;
        private String storageType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGeoBackupPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.storageType = defaults.storageType;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
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
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder storageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetGeoBackupPolicyResult build() {
            return new GetGeoBackupPolicyResult(id, kind, location, name, state, storageType, type);
        }
    }
}
