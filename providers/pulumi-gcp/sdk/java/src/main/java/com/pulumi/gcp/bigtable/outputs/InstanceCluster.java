// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceCluster {
    /**
     * @return The ID of the Cloud Bigtable cluster.
     * 
     */
    private final String clusterId;
    /**
     * @return Describes the Cloud KMS encryption key that will be used to protect the destination Bigtable cluster. The requirements for this key are: 1) The Cloud Bigtable service account associated with the project that contains this cluster must be granted the `cloudkms.cryptoKeyEncrypterDecrypter` role on the CMEK key. 2) Only regional keys can be used and the region of the CMEK key must match the region of the cluster. 3) All clusters within an instance must use the same CMEK key. Values are of the form `projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{key}`
     * 
     */
    private final @Nullable String kmsKeyName;
    /**
     * @return The number of nodes in your Cloud Bigtable cluster.
     * Required, with a minimum of `1` for a `PRODUCTION` instance. Must be left unset
     * for a `DEVELOPMENT` instance.
     * 
     */
    private final @Nullable Integer numNodes;
    /**
     * @return The storage type to use. One of `&#34;SSD&#34;` or
     * `&#34;HDD&#34;`. Defaults to `&#34;SSD&#34;`.
     * 
     */
    private final @Nullable String storageType;
    /**
     * @return The zone to create the Cloud Bigtable cluster in. If it not
     * specified, the provider zone is used. Each cluster must have a different zone in the same region. Zones that support
     * Bigtable instances are noted on the [Cloud Bigtable locations page](https://cloud.google.com/bigtable/docs/locations).
     * 
     */
    private final @Nullable String zone;

    @CustomType.Constructor
    private InstanceCluster(
        @CustomType.Parameter("clusterId") String clusterId,
        @CustomType.Parameter("kmsKeyName") @Nullable String kmsKeyName,
        @CustomType.Parameter("numNodes") @Nullable Integer numNodes,
        @CustomType.Parameter("storageType") @Nullable String storageType,
        @CustomType.Parameter("zone") @Nullable String zone) {
        this.clusterId = clusterId;
        this.kmsKeyName = kmsKeyName;
        this.numNodes = numNodes;
        this.storageType = storageType;
        this.zone = zone;
    }

    /**
     * @return The ID of the Cloud Bigtable cluster.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return Describes the Cloud KMS encryption key that will be used to protect the destination Bigtable cluster. The requirements for this key are: 1) The Cloud Bigtable service account associated with the project that contains this cluster must be granted the `cloudkms.cryptoKeyEncrypterDecrypter` role on the CMEK key. 2) Only regional keys can be used and the region of the CMEK key must match the region of the cluster. 3) All clusters within an instance must use the same CMEK key. Values are of the form `projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{key}`
     * 
     */
    public Optional<String> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }
    /**
     * @return The number of nodes in your Cloud Bigtable cluster.
     * Required, with a minimum of `1` for a `PRODUCTION` instance. Must be left unset
     * for a `DEVELOPMENT` instance.
     * 
     */
    public Optional<Integer> numNodes() {
        return Optional.ofNullable(this.numNodes);
    }
    /**
     * @return The storage type to use. One of `&#34;SSD&#34;` or
     * `&#34;HDD&#34;`. Defaults to `&#34;SSD&#34;`.
     * 
     */
    public Optional<String> storageType() {
        return Optional.ofNullable(this.storageType);
    }
    /**
     * @return The zone to create the Cloud Bigtable cluster in. If it not
     * specified, the provider zone is used. Each cluster must have a different zone in the same region. Zones that support
     * Bigtable instances are noted on the [Cloud Bigtable locations page](https://cloud.google.com/bigtable/docs/locations).
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterId;
        private @Nullable String kmsKeyName;
        private @Nullable Integer numNodes;
        private @Nullable String storageType;
        private @Nullable String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.numNodes = defaults.numNodes;
    	      this.storageType = defaults.storageType;
    	      this.zone = defaults.zone;
        }

        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        public Builder numNodes(@Nullable Integer numNodes) {
            this.numNodes = numNodes;
            return this;
        }
        public Builder storageType(@Nullable String storageType) {
            this.storageType = storageType;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }        public InstanceCluster build() {
            return new InstanceCluster(clusterId, kmsKeyName, numNodes, storageType, zone);
        }
    }
}
