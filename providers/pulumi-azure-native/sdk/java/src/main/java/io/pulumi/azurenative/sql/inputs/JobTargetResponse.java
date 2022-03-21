// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A job target, for example a specific database or a container of databases that is evaluated during job execution.
 * 
 */
public final class JobTargetResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobTargetResponse Empty = new JobTargetResponse();

    /**
     * The target database name.
     * 
     */
    @Import(name="databaseName")
      private final @Nullable String databaseName;

    public Optional<String> getDatabaseName() {
        return this.databaseName == null ? Optional.empty() : Optional.ofNullable(this.databaseName);
    }

    /**
     * The target elastic pool name.
     * 
     */
    @Import(name="elasticPoolName")
      private final @Nullable String elasticPoolName;

    public Optional<String> getElasticPoolName() {
        return this.elasticPoolName == null ? Optional.empty() : Optional.ofNullable(this.elasticPoolName);
    }

    /**
     * Whether the target is included or excluded from the group.
     * 
     */
    @Import(name="membershipType")
      private final @Nullable String membershipType;

    public Optional<String> getMembershipType() {
        return this.membershipType == null ? Optional.empty() : Optional.ofNullable(this.membershipType);
    }

    /**
     * The resource ID of the credential that is used during job execution to connect to the target and determine the list of databases inside the target.
     * 
     */
    @Import(name="refreshCredential")
      private final @Nullable String refreshCredential;

    public Optional<String> getRefreshCredential() {
        return this.refreshCredential == null ? Optional.empty() : Optional.ofNullable(this.refreshCredential);
    }

    /**
     * The target server name.
     * 
     */
    @Import(name="serverName")
      private final @Nullable String serverName;

    public Optional<String> getServerName() {
        return this.serverName == null ? Optional.empty() : Optional.ofNullable(this.serverName);
    }

    /**
     * The target shard map.
     * 
     */
    @Import(name="shardMapName")
      private final @Nullable String shardMapName;

    public Optional<String> getShardMapName() {
        return this.shardMapName == null ? Optional.empty() : Optional.ofNullable(this.shardMapName);
    }

    /**
     * The target type.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public JobTargetResponse(
        @Nullable String databaseName,
        @Nullable String elasticPoolName,
        @Nullable String membershipType,
        @Nullable String refreshCredential,
        @Nullable String serverName,
        @Nullable String shardMapName,
        String type) {
        this.databaseName = databaseName;
        this.elasticPoolName = elasticPoolName;
        this.membershipType = membershipType == null ? "Include" : membershipType;
        this.refreshCredential = refreshCredential;
        this.serverName = serverName;
        this.shardMapName = shardMapName;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private JobTargetResponse() {
        this.databaseName = null;
        this.elasticPoolName = null;
        this.membershipType = null;
        this.refreshCredential = null;
        this.serverName = null;
        this.shardMapName = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String databaseName;
        private @Nullable String elasticPoolName;
        private @Nullable String membershipType;
        private @Nullable String refreshCredential;
        private @Nullable String serverName;
        private @Nullable String shardMapName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.elasticPoolName = defaults.elasticPoolName;
    	      this.membershipType = defaults.membershipType;
    	      this.refreshCredential = defaults.refreshCredential;
    	      this.serverName = defaults.serverName;
    	      this.shardMapName = defaults.shardMapName;
    	      this.type = defaults.type;
        }

        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public Builder elasticPoolName(@Nullable String elasticPoolName) {
            this.elasticPoolName = elasticPoolName;
            return this;
        }
        public Builder membershipType(@Nullable String membershipType) {
            this.membershipType = membershipType;
            return this;
        }
        public Builder refreshCredential(@Nullable String refreshCredential) {
            this.refreshCredential = refreshCredential;
            return this;
        }
        public Builder serverName(@Nullable String serverName) {
            this.serverName = serverName;
            return this;
        }
        public Builder shardMapName(@Nullable String shardMapName) {
            this.shardMapName = shardMapName;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public JobTargetResponse build() {
            return new JobTargetResponse(databaseName, elasticPoolName, membershipType, refreshCredential, serverName, shardMapName, type);
        }
    }
}
