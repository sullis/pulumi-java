// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.MySqlReplicaConfigurationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Read-replica configuration for connecting to the primary instance.
 * 
 */
public final class ReplicaConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicaConfigurationArgs Empty = new ReplicaConfigurationArgs();

    /**
     * Specifies if the replica is the failover target. If the field is set to `true` the replica will be designated as a failover replica. In case the primary instance fails, the replica instance will be promoted as the new primary instance. Only one replica can be specified as failover target, and the replica has to be in different zone with the primary instance.
     * 
     */
    @Import(name="failoverTarget")
    private @Nullable Output<Boolean> failoverTarget;

    /**
     * @return Specifies if the replica is the failover target. If the field is set to `true` the replica will be designated as a failover replica. In case the primary instance fails, the replica instance will be promoted as the new primary instance. Only one replica can be specified as failover target, and the replica has to be in different zone with the primary instance.
     * 
     */
    public Optional<Output<Boolean>> failoverTarget() {
        return Optional.ofNullable(this.failoverTarget);
    }

    /**
     * This is always `sql#replicaConfiguration`.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return This is always `sql#replicaConfiguration`.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * MySQL specific configuration when replicating from a MySQL on-premises primary instance. Replication configuration information such as the username, password, certificates, and keys are not stored in the instance metadata. The configuration information is used only to set up the replication connection and is stored by MySQL in a file named `master.info` in the data directory.
     * 
     */
    @Import(name="mysqlReplicaConfiguration")
    private @Nullable Output<MySqlReplicaConfigurationArgs> mysqlReplicaConfiguration;

    /**
     * @return MySQL specific configuration when replicating from a MySQL on-premises primary instance. Replication configuration information such as the username, password, certificates, and keys are not stored in the instance metadata. The configuration information is used only to set up the replication connection and is stored by MySQL in a file named `master.info` in the data directory.
     * 
     */
    public Optional<Output<MySqlReplicaConfigurationArgs>> mysqlReplicaConfiguration() {
        return Optional.ofNullable(this.mysqlReplicaConfiguration);
    }

    private ReplicaConfigurationArgs() {}

    private ReplicaConfigurationArgs(ReplicaConfigurationArgs $) {
        this.failoverTarget = $.failoverTarget;
        this.kind = $.kind;
        this.mysqlReplicaConfiguration = $.mysqlReplicaConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicaConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicaConfigurationArgs $;

        public Builder() {
            $ = new ReplicaConfigurationArgs();
        }

        public Builder(ReplicaConfigurationArgs defaults) {
            $ = new ReplicaConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failoverTarget Specifies if the replica is the failover target. If the field is set to `true` the replica will be designated as a failover replica. In case the primary instance fails, the replica instance will be promoted as the new primary instance. Only one replica can be specified as failover target, and the replica has to be in different zone with the primary instance.
         * 
         * @return builder
         * 
         */
        public Builder failoverTarget(@Nullable Output<Boolean> failoverTarget) {
            $.failoverTarget = failoverTarget;
            return this;
        }

        /**
         * @param failoverTarget Specifies if the replica is the failover target. If the field is set to `true` the replica will be designated as a failover replica. In case the primary instance fails, the replica instance will be promoted as the new primary instance. Only one replica can be specified as failover target, and the replica has to be in different zone with the primary instance.
         * 
         * @return builder
         * 
         */
        public Builder failoverTarget(Boolean failoverTarget) {
            return failoverTarget(Output.of(failoverTarget));
        }

        /**
         * @param kind This is always `sql#replicaConfiguration`.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind This is always `sql#replicaConfiguration`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param mysqlReplicaConfiguration MySQL specific configuration when replicating from a MySQL on-premises primary instance. Replication configuration information such as the username, password, certificates, and keys are not stored in the instance metadata. The configuration information is used only to set up the replication connection and is stored by MySQL in a file named `master.info` in the data directory.
         * 
         * @return builder
         * 
         */
        public Builder mysqlReplicaConfiguration(@Nullable Output<MySqlReplicaConfigurationArgs> mysqlReplicaConfiguration) {
            $.mysqlReplicaConfiguration = mysqlReplicaConfiguration;
            return this;
        }

        /**
         * @param mysqlReplicaConfiguration MySQL specific configuration when replicating from a MySQL on-premises primary instance. Replication configuration information such as the username, password, certificates, and keys are not stored in the instance metadata. The configuration information is used only to set up the replication connection and is stored by MySQL in a file named `master.info` in the data directory.
         * 
         * @return builder
         * 
         */
        public Builder mysqlReplicaConfiguration(MySqlReplicaConfigurationArgs mysqlReplicaConfiguration) {
            return mysqlReplicaConfiguration(Output.of(mysqlReplicaConfiguration));
        }

        public ReplicaConfigurationArgs build() {
            return $;
        }
    }

}
