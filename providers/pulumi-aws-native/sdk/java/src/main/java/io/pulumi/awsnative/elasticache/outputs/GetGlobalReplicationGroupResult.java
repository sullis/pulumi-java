// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticache.outputs;

import io.pulumi.awsnative.elasticache.outputs.GlobalReplicationGroupMember;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGlobalReplicationGroupResult {
    /**
     * Cache parameter group name to use for the new engine version. This parameter cannot be modified independently.
     * 
     */
    private final @Nullable String cacheParameterGroupName;
    /**
     * The name of the Global Datastore, it is generated by ElastiCache adding a prefix to GlobalReplicationGroupIdSuffix.
     * 
     */
    private final @Nullable String globalReplicationGroupId;
    /**
     * The replication groups that comprise the Global Datastore.
     * 
     */
    private final @Nullable List<GlobalReplicationGroupMember> members;
    /**
     * The status of the Global Datastore
     * 
     */
    private final @Nullable String status;

    @OutputCustomType.Constructor({"cacheParameterGroupName","globalReplicationGroupId","members","status"})
    private GetGlobalReplicationGroupResult(
        @Nullable String cacheParameterGroupName,
        @Nullable String globalReplicationGroupId,
        @Nullable List<GlobalReplicationGroupMember> members,
        @Nullable String status) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        this.globalReplicationGroupId = globalReplicationGroupId;
        this.members = members;
        this.status = status;
    }

    /**
     * Cache parameter group name to use for the new engine version. This parameter cannot be modified independently.
     * 
    */
    public Optional<String> getCacheParameterGroupName() {
        return Optional.ofNullable(this.cacheParameterGroupName);
    }
    /**
     * The name of the Global Datastore, it is generated by ElastiCache adding a prefix to GlobalReplicationGroupIdSuffix.
     * 
    */
    public Optional<String> getGlobalReplicationGroupId() {
        return Optional.ofNullable(this.globalReplicationGroupId);
    }
    /**
     * The replication groups that comprise the Global Datastore.
     * 
    */
    public List<GlobalReplicationGroupMember> getMembers() {
        return this.members == null ? List.of() : this.members;
    }
    /**
     * The status of the Global Datastore
     * 
    */
    public Optional<String> getStatus() {
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

        public Builder setCacheParameterGroupName(@Nullable String cacheParameterGroupName) {
            this.cacheParameterGroupName = cacheParameterGroupName;
            return this;
        }

        public Builder setGlobalReplicationGroupId(@Nullable String globalReplicationGroupId) {
            this.globalReplicationGroupId = globalReplicationGroupId;
            return this;
        }

        public Builder setMembers(@Nullable List<GlobalReplicationGroupMember> members) {
            this.members = members;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }
        public GetGlobalReplicationGroupResult build() {
            return new GetGlobalReplicationGroupResult(cacheParameterGroupName, globalReplicationGroupId, members, status);
        }
    }
}