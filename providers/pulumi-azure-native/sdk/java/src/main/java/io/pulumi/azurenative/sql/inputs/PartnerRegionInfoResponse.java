// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Partner region information for the failover group.
 * 
 */
public final class PartnerRegionInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final PartnerRegionInfoResponse Empty = new PartnerRegionInfoResponse();

    /**
     * Geo location of the partner managed instances.
     * 
     */
    @InputImport(name="location")
      private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * Replication role of the partner managed instances.
     * 
     */
    @InputImport(name="replicationRole", required=true)
      private final String replicationRole;

    public String getReplicationRole() {
        return this.replicationRole;
    }

    public PartnerRegionInfoResponse(
        @Nullable String location,
        String replicationRole) {
        this.location = location;
        this.replicationRole = Objects.requireNonNull(replicationRole, "expected parameter 'replicationRole' to be non-null");
    }

    private PartnerRegionInfoResponse() {
        this.location = null;
        this.replicationRole = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartnerRegionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String location;
        private String replicationRole;

        public Builder() {
    	      // Empty
        }

        public Builder(PartnerRegionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.replicationRole = defaults.replicationRole;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setReplicationRole(String replicationRole) {
            this.replicationRole = Objects.requireNonNull(replicationRole);
            return this;
        }
        public PartnerRegionInfoResponse build() {
            return new PartnerRegionInfoResponse(location, replicationRole);
        }
    }
}