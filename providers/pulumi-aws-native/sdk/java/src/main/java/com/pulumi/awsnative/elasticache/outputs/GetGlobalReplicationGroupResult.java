// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticache.outputs;

import com.pulumi.awsnative.elasticache.outputs.GlobalReplicationGroupMember;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGlobalReplicationGroupResult {
    /**
     * @return Cache parameter group name to use for the new engine version. This parameter cannot be modified independently.
     * 
     */
    private final @Nullable String cacheParameterGroupName;
    /**
     * @return The name of the Global Datastore, it is generated by ElastiCache adding a prefix to GlobalReplicationGroupIdSuffix.
     * 
     */
    private final @Nullable String globalReplicationGroupId;
    /**
     * @return The replication groups that comprise the Global Datastore.
     * 
     */
    private final @Nullable List<GlobalReplicationGroupMember> members;
    /**
     * @return The status of the Global Datastore
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private GetGlobalReplicationGroupResult(
        @CustomType.Parameter("cacheParameterGroupName") @Nullable String cacheParameterGroupName,
        @CustomType.Parameter("globalReplicationGroupId") @Nullable String globalReplicationGroupId,
        @CustomType.Parameter("members") @Nullable List<GlobalReplicationGroupMember> members,
        @CustomType.Parameter("status") @Nullable String status) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        this.globalReplicationGroupId = globalReplicationGroupId;
        this.members = members;
        this.status = status;
    }

    /**
     * @return Cache parameter group name to use for the new engine version. This parameter cannot be modified independently.
     * 
     */
    public Optional<String> cacheParameterGroupName() {
        return Optional.ofNullable(this.cacheParameterGroupName);
    }
    /**
     * @return The name of the Global Datastore, it is generated by ElastiCache adding a prefix to GlobalReplicationGroupIdSuffix.
     * 
     */
    public Optional<String> globalReplicationGroupId() {
        return Optional.ofNullable(this.globalReplicationGroupId);
    }
    /**
     * @return The replication groups that comprise the Global Datastore.
     * 
     */
    public List<GlobalReplicationGroupMember> members() {
        return this.members == null ? List.of() : this.members;
    }
    /**
     * @return The status of the Global Datastore
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalReplicationGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cacheParameterGroupName;
        private @Nullable String globalReplicationGroupId;
        private @Nullable List<GlobalReplicationGroupMember> members;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalReplicationGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheParameterGroupName = defaults.cacheParameterGroupName;
    	      this.globalReplicationGroupId = defaults.globalReplicationGroupId;
    	      this.members = defaults.members;
    	      this.status = defaults.status;
        }

        public Builder cacheParameterGroupName(@Nullable String cacheParameterGroupName) {
            this.cacheParameterGroupName = cacheParameterGroupName;
            return this;
        }
        public Builder globalReplicationGroupId(@Nullable String globalReplicationGroupId) {
            this.globalReplicationGroupId = globalReplicationGroupId;
            return this;
        }
        public Builder members(@Nullable List<GlobalReplicationGroupMember> members) {
            this.members = members;
            return this;
        }
        public Builder members(GlobalReplicationGroupMember... members) {
            return members(List.of(members));
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public GetGlobalReplicationGroupResult build() {
            return new GetGlobalReplicationGroupResult(cacheParameterGroupName, globalReplicationGroupId, members, status);
        }
    }
}
