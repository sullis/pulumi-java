// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticache.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalReplicationGroupState extends com.pulumi.resources.ResourceArgs {

    public static final GlobalReplicationGroupState Empty = new GlobalReplicationGroupState();

    /**
     * (**DEPRECATED** use `engine_version_actual` instead) The full version number of the cache engine running on the members of this global replication group.
     * 
     * @deprecated
     * Use engine_version_actual instead
     * 
     */
    @Deprecated /* Use engine_version_actual instead */
    @Import(name="actualEngineVersion")
    private @Nullable Output<String> actualEngineVersion;

    /**
     * @return (**DEPRECATED** use `engine_version_actual` instead) The full version number of the cache engine running on the members of this global replication group.
     * 
     * @deprecated
     * Use engine_version_actual instead
     * 
     */
    @Deprecated /* Use engine_version_actual instead */
    public Optional<Output<String>> actualEngineVersion() {
        return Optional.ofNullable(this.actualEngineVersion);
    }

    /**
     * The ARN of the ElastiCache Global Replication Group.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the ElastiCache Global Replication Group.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A flag that indicate whether the encryption at rest is enabled.
     * 
     */
    @Import(name="atRestEncryptionEnabled")
    private @Nullable Output<Boolean> atRestEncryptionEnabled;

    /**
     * @return A flag that indicate whether the encryption at rest is enabled.
     * 
     */
    public Optional<Output<Boolean>> atRestEncryptionEnabled() {
        return Optional.ofNullable(this.atRestEncryptionEnabled);
    }

    /**
     * A flag that indicate whether AuthToken (password) is enabled.
     * 
     */
    @Import(name="authTokenEnabled")
    private @Nullable Output<Boolean> authTokenEnabled;

    /**
     * @return A flag that indicate whether AuthToken (password) is enabled.
     * 
     */
    public Optional<Output<Boolean>> authTokenEnabled() {
        return Optional.ofNullable(this.authTokenEnabled);
    }

    /**
     * The instance class used. See AWS documentation for information on [supported node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html) and [guidance on selecting node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/nodes-select-size.html).
     * 
     */
    @Import(name="cacheNodeType")
    private @Nullable Output<String> cacheNodeType;

    /**
     * @return The instance class used. See AWS documentation for information on [supported node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html) and [guidance on selecting node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/nodes-select-size.html).
     * 
     */
    public Optional<Output<String>> cacheNodeType() {
        return Optional.ofNullable(this.cacheNodeType);
    }

    /**
     * Indicates whether the Global Datastore is cluster enabled.
     * 
     */
    @Import(name="clusterEnabled")
    private @Nullable Output<Boolean> clusterEnabled;

    /**
     * @return Indicates whether the Global Datastore is cluster enabled.
     * 
     */
    public Optional<Output<Boolean>> clusterEnabled() {
        return Optional.ofNullable(this.clusterEnabled);
    }

    /**
     * The name of the cache engine to be used for the clusters in this global replication group.
     * 
     */
    @Import(name="engine")
    private @Nullable Output<String> engine;

    /**
     * @return The name of the cache engine to be used for the clusters in this global replication group.
     * 
     */
    public Optional<Output<String>> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * The full version number of the cache engine running on the members of this global replication group.
     * 
     */
    @Import(name="engineVersionActual")
    private @Nullable Output<String> engineVersionActual;

    /**
     * @return The full version number of the cache engine running on the members of this global replication group.
     * 
     */
    public Optional<Output<String>> engineVersionActual() {
        return Optional.ofNullable(this.engineVersionActual);
    }

    /**
     * A user-created description for the global replication group.
     * 
     */
    @Import(name="globalReplicationGroupDescription")
    private @Nullable Output<String> globalReplicationGroupDescription;

    /**
     * @return A user-created description for the global replication group.
     * 
     */
    public Optional<Output<String>> globalReplicationGroupDescription() {
        return Optional.ofNullable(this.globalReplicationGroupDescription);
    }

    /**
     * The full ID of the global replication group.
     * 
     */
    @Import(name="globalReplicationGroupId")
    private @Nullable Output<String> globalReplicationGroupId;

    /**
     * @return The full ID of the global replication group.
     * 
     */
    public Optional<Output<String>> globalReplicationGroupId() {
        return Optional.ofNullable(this.globalReplicationGroupId);
    }

    /**
     * The suffix name of a Global Datastore. If `global_replication_group_id_suffix` is changed, creates a new resource.
     * 
     */
    @Import(name="globalReplicationGroupIdSuffix")
    private @Nullable Output<String> globalReplicationGroupIdSuffix;

    /**
     * @return The suffix name of a Global Datastore. If `global_replication_group_id_suffix` is changed, creates a new resource.
     * 
     */
    public Optional<Output<String>> globalReplicationGroupIdSuffix() {
        return Optional.ofNullable(this.globalReplicationGroupIdSuffix);
    }

    /**
     * The ID of the primary cluster that accepts writes and will replicate updates to the secondary cluster. If `primary_replication_group_id` is changed, creates a new resource.
     * 
     */
    @Import(name="primaryReplicationGroupId")
    private @Nullable Output<String> primaryReplicationGroupId;

    /**
     * @return The ID of the primary cluster that accepts writes and will replicate updates to the secondary cluster. If `primary_replication_group_id` is changed, creates a new resource.
     * 
     */
    public Optional<Output<String>> primaryReplicationGroupId() {
        return Optional.ofNullable(this.primaryReplicationGroupId);
    }

    /**
     * A flag that indicates whether the encryption in transit is enabled.
     * 
     */
    @Import(name="transitEncryptionEnabled")
    private @Nullable Output<Boolean> transitEncryptionEnabled;

    /**
     * @return A flag that indicates whether the encryption in transit is enabled.
     * 
     */
    public Optional<Output<Boolean>> transitEncryptionEnabled() {
        return Optional.ofNullable(this.transitEncryptionEnabled);
    }

    private GlobalReplicationGroupState() {}

    private GlobalReplicationGroupState(GlobalReplicationGroupState $) {
        this.actualEngineVersion = $.actualEngineVersion;
        this.arn = $.arn;
        this.atRestEncryptionEnabled = $.atRestEncryptionEnabled;
        this.authTokenEnabled = $.authTokenEnabled;
        this.cacheNodeType = $.cacheNodeType;
        this.clusterEnabled = $.clusterEnabled;
        this.engine = $.engine;
        this.engineVersionActual = $.engineVersionActual;
        this.globalReplicationGroupDescription = $.globalReplicationGroupDescription;
        this.globalReplicationGroupId = $.globalReplicationGroupId;
        this.globalReplicationGroupIdSuffix = $.globalReplicationGroupIdSuffix;
        this.primaryReplicationGroupId = $.primaryReplicationGroupId;
        this.transitEncryptionEnabled = $.transitEncryptionEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalReplicationGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalReplicationGroupState $;

        public Builder() {
            $ = new GlobalReplicationGroupState();
        }

        public Builder(GlobalReplicationGroupState defaults) {
            $ = new GlobalReplicationGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param actualEngineVersion (**DEPRECATED** use `engine_version_actual` instead) The full version number of the cache engine running on the members of this global replication group.
         * 
         * @return builder
         * 
         * @deprecated
         * Use engine_version_actual instead
         * 
         */
        @Deprecated /* Use engine_version_actual instead */
        public Builder actualEngineVersion(@Nullable Output<String> actualEngineVersion) {
            $.actualEngineVersion = actualEngineVersion;
            return this;
        }

        /**
         * @param actualEngineVersion (**DEPRECATED** use `engine_version_actual` instead) The full version number of the cache engine running on the members of this global replication group.
         * 
         * @return builder
         * 
         * @deprecated
         * Use engine_version_actual instead
         * 
         */
        @Deprecated /* Use engine_version_actual instead */
        public Builder actualEngineVersion(String actualEngineVersion) {
            return actualEngineVersion(Output.of(actualEngineVersion));
        }

        /**
         * @param arn The ARN of the ElastiCache Global Replication Group.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the ElastiCache Global Replication Group.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param atRestEncryptionEnabled A flag that indicate whether the encryption at rest is enabled.
         * 
         * @return builder
         * 
         */
        public Builder atRestEncryptionEnabled(@Nullable Output<Boolean> atRestEncryptionEnabled) {
            $.atRestEncryptionEnabled = atRestEncryptionEnabled;
            return this;
        }

        /**
         * @param atRestEncryptionEnabled A flag that indicate whether the encryption at rest is enabled.
         * 
         * @return builder
         * 
         */
        public Builder atRestEncryptionEnabled(Boolean atRestEncryptionEnabled) {
            return atRestEncryptionEnabled(Output.of(atRestEncryptionEnabled));
        }

        /**
         * @param authTokenEnabled A flag that indicate whether AuthToken (password) is enabled.
         * 
         * @return builder
         * 
         */
        public Builder authTokenEnabled(@Nullable Output<Boolean> authTokenEnabled) {
            $.authTokenEnabled = authTokenEnabled;
            return this;
        }

        /**
         * @param authTokenEnabled A flag that indicate whether AuthToken (password) is enabled.
         * 
         * @return builder
         * 
         */
        public Builder authTokenEnabled(Boolean authTokenEnabled) {
            return authTokenEnabled(Output.of(authTokenEnabled));
        }

        /**
         * @param cacheNodeType The instance class used. See AWS documentation for information on [supported node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html) and [guidance on selecting node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/nodes-select-size.html).
         * 
         * @return builder
         * 
         */
        public Builder cacheNodeType(@Nullable Output<String> cacheNodeType) {
            $.cacheNodeType = cacheNodeType;
            return this;
        }

        /**
         * @param cacheNodeType The instance class used. See AWS documentation for information on [supported node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html) and [guidance on selecting node types](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/nodes-select-size.html).
         * 
         * @return builder
         * 
         */
        public Builder cacheNodeType(String cacheNodeType) {
            return cacheNodeType(Output.of(cacheNodeType));
        }

        /**
         * @param clusterEnabled Indicates whether the Global Datastore is cluster enabled.
         * 
         * @return builder
         * 
         */
        public Builder clusterEnabled(@Nullable Output<Boolean> clusterEnabled) {
            $.clusterEnabled = clusterEnabled;
            return this;
        }

        /**
         * @param clusterEnabled Indicates whether the Global Datastore is cluster enabled.
         * 
         * @return builder
         * 
         */
        public Builder clusterEnabled(Boolean clusterEnabled) {
            return clusterEnabled(Output.of(clusterEnabled));
        }

        /**
         * @param engine The name of the cache engine to be used for the clusters in this global replication group.
         * 
         * @return builder
         * 
         */
        public Builder engine(@Nullable Output<String> engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engine The name of the cache engine to be used for the clusters in this global replication group.
         * 
         * @return builder
         * 
         */
        public Builder engine(String engine) {
            return engine(Output.of(engine));
        }

        /**
         * @param engineVersionActual The full version number of the cache engine running on the members of this global replication group.
         * 
         * @return builder
         * 
         */
        public Builder engineVersionActual(@Nullable Output<String> engineVersionActual) {
            $.engineVersionActual = engineVersionActual;
            return this;
        }

        /**
         * @param engineVersionActual The full version number of the cache engine running on the members of this global replication group.
         * 
         * @return builder
         * 
         */
        public Builder engineVersionActual(String engineVersionActual) {
            return engineVersionActual(Output.of(engineVersionActual));
        }

        /**
         * @param globalReplicationGroupDescription A user-created description for the global replication group.
         * 
         * @return builder
         * 
         */
        public Builder globalReplicationGroupDescription(@Nullable Output<String> globalReplicationGroupDescription) {
            $.globalReplicationGroupDescription = globalReplicationGroupDescription;
            return this;
        }

        /**
         * @param globalReplicationGroupDescription A user-created description for the global replication group.
         * 
         * @return builder
         * 
         */
        public Builder globalReplicationGroupDescription(String globalReplicationGroupDescription) {
            return globalReplicationGroupDescription(Output.of(globalReplicationGroupDescription));
        }

        /**
         * @param globalReplicationGroupId The full ID of the global replication group.
         * 
         * @return builder
         * 
         */
        public Builder globalReplicationGroupId(@Nullable Output<String> globalReplicationGroupId) {
            $.globalReplicationGroupId = globalReplicationGroupId;
            return this;
        }

        /**
         * @param globalReplicationGroupId The full ID of the global replication group.
         * 
         * @return builder
         * 
         */
        public Builder globalReplicationGroupId(String globalReplicationGroupId) {
            return globalReplicationGroupId(Output.of(globalReplicationGroupId));
        }

        /**
         * @param globalReplicationGroupIdSuffix The suffix name of a Global Datastore. If `global_replication_group_id_suffix` is changed, creates a new resource.
         * 
         * @return builder
         * 
         */
        public Builder globalReplicationGroupIdSuffix(@Nullable Output<String> globalReplicationGroupIdSuffix) {
            $.globalReplicationGroupIdSuffix = globalReplicationGroupIdSuffix;
            return this;
        }

        /**
         * @param globalReplicationGroupIdSuffix The suffix name of a Global Datastore. If `global_replication_group_id_suffix` is changed, creates a new resource.
         * 
         * @return builder
         * 
         */
        public Builder globalReplicationGroupIdSuffix(String globalReplicationGroupIdSuffix) {
            return globalReplicationGroupIdSuffix(Output.of(globalReplicationGroupIdSuffix));
        }

        /**
         * @param primaryReplicationGroupId The ID of the primary cluster that accepts writes and will replicate updates to the secondary cluster. If `primary_replication_group_id` is changed, creates a new resource.
         * 
         * @return builder
         * 
         */
        public Builder primaryReplicationGroupId(@Nullable Output<String> primaryReplicationGroupId) {
            $.primaryReplicationGroupId = primaryReplicationGroupId;
            return this;
        }

        /**
         * @param primaryReplicationGroupId The ID of the primary cluster that accepts writes and will replicate updates to the secondary cluster. If `primary_replication_group_id` is changed, creates a new resource.
         * 
         * @return builder
         * 
         */
        public Builder primaryReplicationGroupId(String primaryReplicationGroupId) {
            return primaryReplicationGroupId(Output.of(primaryReplicationGroupId));
        }

        /**
         * @param transitEncryptionEnabled A flag that indicates whether the encryption in transit is enabled.
         * 
         * @return builder
         * 
         */
        public Builder transitEncryptionEnabled(@Nullable Output<Boolean> transitEncryptionEnabled) {
            $.transitEncryptionEnabled = transitEncryptionEnabled;
            return this;
        }

        /**
         * @param transitEncryptionEnabled A flag that indicates whether the encryption in transit is enabled.
         * 
         * @return builder
         * 
         */
        public Builder transitEncryptionEnabled(Boolean transitEncryptionEnabled) {
            return transitEncryptionEnabled(Output.of(transitEncryptionEnabled));
        }

        public GlobalReplicationGroupState build() {
            return $;
        }
    }

}
