// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticache.inputs;

import io.pulumi.awsnative.elasticache.enums.GlobalReplicationGroupMemberRole;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalReplicationGroupMember extends io.pulumi.resources.InvokeArgs {

    public static final GlobalReplicationGroupMember Empty = new GlobalReplicationGroupMember();

    /**
     * Regionally unique identifier for the member i.e. ReplicationGroupId.
     * 
     */
    @InputImport(name="replicationGroupId")
      private final @Nullable String replicationGroupId;

    public Optional<String> getReplicationGroupId() {
        return this.replicationGroupId == null ? Optional.empty() : Optional.ofNullable(this.replicationGroupId);
    }

    /**
     * The AWS region of the Global Datastore member.
     * 
     */
    @InputImport(name="replicationGroupRegion")
      private final @Nullable String replicationGroupRegion;

    public Optional<String> getReplicationGroupRegion() {
        return this.replicationGroupRegion == null ? Optional.empty() : Optional.ofNullable(this.replicationGroupRegion);
    }

    /**
     * Indicates the role of the member, primary or secondary.
     * 
     */
    @InputImport(name="role")
      private final @Nullable GlobalReplicationGroupMemberRole role;

    public Optional<GlobalReplicationGroupMemberRole> getRole() {
        return this.role == null ? Optional.empty() : Optional.ofNullable(this.role);
    }

    public GlobalReplicationGroupMember(
        @Nullable String replicationGroupId,
        @Nullable String replicationGroupRegion,
        @Nullable GlobalReplicationGroupMemberRole role) {
        this.replicationGroupId = replicationGroupId;
        this.replicationGroupRegion = replicationGroupRegion;
        this.role = role;
    }

    private GlobalReplicationGroupMember() {
        this.replicationGroupId = null;
        this.replicationGroupRegion = null;
        this.role = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalReplicationGroupMember defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String replicationGroupId;
        private @Nullable String replicationGroupRegion;
        private @Nullable GlobalReplicationGroupMemberRole role;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalReplicationGroupMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicationGroupId = defaults.replicationGroupId;
    	      this.replicationGroupRegion = defaults.replicationGroupRegion;
    	      this.role = defaults.role;
        }

        public Builder setReplicationGroupId(@Nullable String replicationGroupId) {
            this.replicationGroupId = replicationGroupId;
            return this;
        }

        public Builder setReplicationGroupRegion(@Nullable String replicationGroupRegion) {
            this.replicationGroupRegion = replicationGroupRegion;
            return this;
        }

        public Builder setRole(@Nullable GlobalReplicationGroupMemberRole role) {
            this.role = role;
            return this;
        }
        public GlobalReplicationGroupMember build() {
            return new GlobalReplicationGroupMember(replicationGroupId, replicationGroupRegion, role);
        }
    }
}