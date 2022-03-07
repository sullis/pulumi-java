// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.secretmanager.outputs.SecretReplicationUserManagedReplicaCustomerManagedEncryption;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecretReplicationUserManagedReplica {
    /**
     * Customer Managed Encryption for the secret.
     * Structure is documented below.
     * 
     */
    private final @Nullable SecretReplicationUserManagedReplicaCustomerManagedEncryption customerManagedEncryption;
    /**
     * The canonical IDs of the location to replicate data. For example: "us-east1".
     * 
     */
    private final String location;

    @OutputCustomType.Constructor({"customerManagedEncryption","location"})
    private SecretReplicationUserManagedReplica(
        @Nullable SecretReplicationUserManagedReplicaCustomerManagedEncryption customerManagedEncryption,
        String location) {
        this.customerManagedEncryption = customerManagedEncryption;
        this.location = Objects.requireNonNull(location);
    }

    /**
     * Customer Managed Encryption for the secret.
     * Structure is documented below.
     * 
    */
    public Optional<SecretReplicationUserManagedReplicaCustomerManagedEncryption> getCustomerManagedEncryption() {
        return Optional.ofNullable(this.customerManagedEncryption);
    }
    /**
     * The canonical IDs of the location to replicate data. For example: "us-east1".
     * 
    */
    public String getLocation() {
        return this.location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretReplicationUserManagedReplica defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SecretReplicationUserManagedReplicaCustomerManagedEncryption customerManagedEncryption;
        private String location;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretReplicationUserManagedReplica defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerManagedEncryption = defaults.customerManagedEncryption;
    	      this.location = defaults.location;
        }

        public Builder setCustomerManagedEncryption(@Nullable SecretReplicationUserManagedReplicaCustomerManagedEncryption customerManagedEncryption) {
            this.customerManagedEncryption = customerManagedEncryption;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public SecretReplicationUserManagedReplica build() {
            return new SecretReplicationUserManagedReplica(customerManagedEncryption, location);
        }
    }
}