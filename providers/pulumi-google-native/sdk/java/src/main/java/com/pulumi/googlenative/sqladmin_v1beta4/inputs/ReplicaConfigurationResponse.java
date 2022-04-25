// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.sqladmin_v1beta4.inputs.MySqlReplicaConfigurationResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Read-replica configuration for connecting to the primary instance.
 * 
 */
public final class ReplicaConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReplicaConfigurationResponse Empty = new ReplicaConfigurationResponse();

    /**
     * Specifies if the replica is the failover target. If the field is set to `true` the replica will be designated as a failover replica. In case the primary instance fails, the replica instance will be promoted as the new primary instance. Only one replica can be specified as failover target, and the replica has to be in different zone with the primary instance.
     * 
     */
    @Import(name="failoverTarget", required=true)
    private Boolean failoverTarget;

    /**
     * @return Specifies if the replica is the failover target. If the field is set to `true` the replica will be designated as a failover replica. In case the primary instance fails, the replica instance will be promoted as the new primary instance. Only one replica can be specified as failover target, and the replica has to be in different zone with the primary instance.
     * 
     */
    public Boolean failoverTarget() {
        return this.failoverTarget;
    }

    /**
     * This is always `sql#replicaConfiguration`.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    /**
     * @return This is always `sql#replicaConfiguration`.
     * 
     */
    public String kind() {
        return this.kind;
    }

    /**
     * MySQL specific configuration when replicating from a MySQL on-premises primary instance. Replication configuration information such as the username, password, certificates, and keys are not stored in the instance metadata. The configuration information is used only to set up the replication connection and is stored by MySQL in a file named `master.info` in the data directory.
     * 
     */
    @Import(name="mysqlReplicaConfiguration", required=true)
    private MySqlReplicaConfigurationResponse mysqlReplicaConfiguration;

    /**
     * @return MySQL specific configuration when replicating from a MySQL on-premises primary instance. Replication configuration information such as the username, password, certificates, and keys are not stored in the instance metadata. The configuration information is used only to set up the replication connection and is stored by MySQL in a file named `master.info` in the data directory.
     * 
     */
    public MySqlReplicaConfigurationResponse mysqlReplicaConfiguration() {
        return this.mysqlReplicaConfiguration;
    }

    private ReplicaConfigurationResponse() {}

    private ReplicaConfigurationResponse(ReplicaConfigurationResponse $) {
        this.failoverTarget = $.failoverTarget;
        this.kind = $.kind;
        this.mysqlReplicaConfiguration = $.mysqlReplicaConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicaConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicaConfigurationResponse $;

        public Builder() {
            $ = new ReplicaConfigurationResponse();
        }

        public Builder(ReplicaConfigurationResponse defaults) {
            $ = new ReplicaConfigurationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param failoverTarget Specifies if the replica is the failover target. If the field is set to `true` the replica will be designated as a failover replica. In case the primary instance fails, the replica instance will be promoted as the new primary instance. Only one replica can be specified as failover target, and the replica has to be in different zone with the primary instance.
         * 
         * @return builder
         * 
         */
        public Builder failoverTarget(Boolean failoverTarget) {
            $.failoverTarget = failoverTarget;
            return this;
        }

        /**
         * @param kind This is always `sql#replicaConfiguration`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param mysqlReplicaConfiguration MySQL specific configuration when replicating from a MySQL on-premises primary instance. Replication configuration information such as the username, password, certificates, and keys are not stored in the instance metadata. The configuration information is used only to set up the replication connection and is stored by MySQL in a file named `master.info` in the data directory.
         * 
         * @return builder
         * 
         */
        public Builder mysqlReplicaConfiguration(MySqlReplicaConfigurationResponse mysqlReplicaConfiguration) {
            $.mysqlReplicaConfiguration = mysqlReplicaConfiguration;
            return this;
        }

        public ReplicaConfigurationResponse build() {
            $.failoverTarget = Objects.requireNonNull($.failoverTarget, "expected parameter 'failoverTarget' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.mysqlReplicaConfiguration = Objects.requireNonNull($.mysqlReplicaConfiguration, "expected parameter 'mysqlReplicaConfiguration' to be non-null");
            return $;
        }
    }

}
