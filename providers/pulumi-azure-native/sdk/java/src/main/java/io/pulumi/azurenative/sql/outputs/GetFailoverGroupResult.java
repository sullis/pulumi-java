// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.FailoverGroupReadOnlyEndpointResponse;
import io.pulumi.azurenative.sql.outputs.FailoverGroupReadWriteEndpointResponse;
import io.pulumi.azurenative.sql.outputs.PartnerInfoResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFailoverGroupResult {
    /**
     * List of databases in the failover group.
     * 
     */
    private final @Nullable List<String> databases;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * List of partner server information for the failover group.
     * 
     */
    private final List<PartnerInfoResponse> partnerServers;
    /**
     * Read-only endpoint of the failover group instance.
     * 
     */
    private final @Nullable FailoverGroupReadOnlyEndpointResponse readOnlyEndpoint;
    /**
     * Read-write endpoint of the failover group instance.
     * 
     */
    private final FailoverGroupReadWriteEndpointResponse readWriteEndpoint;
    /**
     * Local replication role of the failover group instance.
     * 
     */
    private final String replicationRole;
    /**
     * Replication state of the failover group instance.
     * 
     */
    private final String replicationState;
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

    @CustomType.Constructor
    private GetFailoverGroupResult(
        @CustomType.Parameter("databases") @Nullable List<String> databases,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("partnerServers") List<PartnerInfoResponse> partnerServers,
        @CustomType.Parameter("readOnlyEndpoint") @Nullable FailoverGroupReadOnlyEndpointResponse readOnlyEndpoint,
        @CustomType.Parameter("readWriteEndpoint") FailoverGroupReadWriteEndpointResponse readWriteEndpoint,
        @CustomType.Parameter("replicationRole") String replicationRole,
        @CustomType.Parameter("replicationState") String replicationState,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.databases = databases;
        this.id = id;
        this.location = location;
        this.name = name;
        this.partnerServers = partnerServers;
        this.readOnlyEndpoint = readOnlyEndpoint;
        this.readWriteEndpoint = readWriteEndpoint;
        this.replicationRole = replicationRole;
        this.replicationState = replicationState;
        this.tags = tags;
        this.type = type;
    }

    /**
     * List of databases in the failover group.
     * 
    */
    public List<String> getDatabases() {
        return this.databases == null ? List.of() : this.databases;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location.
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
     * List of partner server information for the failover group.
     * 
    */
    public List<PartnerInfoResponse> getPartnerServers() {
        return this.partnerServers;
    }
    /**
     * Read-only endpoint of the failover group instance.
     * 
    */
    public Optional<FailoverGroupReadOnlyEndpointResponse> getReadOnlyEndpoint() {
        return Optional.ofNullable(this.readOnlyEndpoint);
    }
    /**
     * Read-write endpoint of the failover group instance.
     * 
    */
    public FailoverGroupReadWriteEndpointResponse getReadWriteEndpoint() {
        return this.readWriteEndpoint;
    }
    /**
     * Local replication role of the failover group instance.
     * 
    */
    public String getReplicationRole() {
        return this.replicationRole;
    }
    /**
     * Replication state of the failover group instance.
     * 
    */
    public String getReplicationState() {
        return this.replicationState;
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFailoverGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> databases;
        private String id;
        private String location;
        private String name;
        private List<PartnerInfoResponse> partnerServers;
        private @Nullable FailoverGroupReadOnlyEndpointResponse readOnlyEndpoint;
        private FailoverGroupReadWriteEndpointResponse readWriteEndpoint;
        private String replicationRole;
        private String replicationState;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFailoverGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databases = defaults.databases;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.partnerServers = defaults.partnerServers;
    	      this.readOnlyEndpoint = defaults.readOnlyEndpoint;
    	      this.readWriteEndpoint = defaults.readWriteEndpoint;
    	      this.replicationRole = defaults.replicationRole;
    	      this.replicationState = defaults.replicationState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder databases(@Nullable List<String> databases) {
            this.databases = databases;
            return this;
        }
        public Builder databases(String... databases) {
            return databases(List.of(databases));
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
        public Builder partnerServers(List<PartnerInfoResponse> partnerServers) {
            this.partnerServers = Objects.requireNonNull(partnerServers);
            return this;
        }
        public Builder partnerServers(PartnerInfoResponse... partnerServers) {
            return partnerServers(List.of(partnerServers));
        }
        public Builder readOnlyEndpoint(@Nullable FailoverGroupReadOnlyEndpointResponse readOnlyEndpoint) {
            this.readOnlyEndpoint = readOnlyEndpoint;
            return this;
        }
        public Builder readWriteEndpoint(FailoverGroupReadWriteEndpointResponse readWriteEndpoint) {
            this.readWriteEndpoint = Objects.requireNonNull(readWriteEndpoint);
            return this;
        }
        public Builder replicationRole(String replicationRole) {
            this.replicationRole = Objects.requireNonNull(replicationRole);
            return this;
        }
        public Builder replicationState(String replicationState) {
            this.replicationState = Objects.requireNonNull(replicationState);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetFailoverGroupResult build() {
            return new GetFailoverGroupResult(databases, id, location, name, partnerServers, readOnlyEndpoint, readWriteEndpoint, replicationRole, replicationState, tags, type);
        }
    }
}
