// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The name and status of the failover replica.
 * 
 */
public final class InstanceFailoverReplicaArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFailoverReplicaArgs Empty = new InstanceFailoverReplicaArgs();

    /**
     * The availability status of the failover replica. A false status indicates that the failover replica is out of sync. The primary instance can only failover to the failover replica when the status is true.
     * 
     */
    @Import(name="available")
    private @Nullable Output<Boolean> available;

    /**
     * @return The availability status of the failover replica. A false status indicates that the failover replica is out of sync. The primary instance can only failover to the failover replica when the status is true.
     * 
     */
    public Optional<Output<Boolean>> available() {
        return Optional.ofNullable(this.available);
    }

    /**
     * The name of the failover replica. If specified at instance creation, a failover replica is created for the instance. The name doesn&#39;t include the project ID.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the failover replica. If specified at instance creation, a failover replica is created for the instance. The name doesn&#39;t include the project ID.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private InstanceFailoverReplicaArgs() {}

    private InstanceFailoverReplicaArgs(InstanceFailoverReplicaArgs $) {
        this.available = $.available;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFailoverReplicaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFailoverReplicaArgs $;

        public Builder() {
            $ = new InstanceFailoverReplicaArgs();
        }

        public Builder(InstanceFailoverReplicaArgs defaults) {
            $ = new InstanceFailoverReplicaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param available The availability status of the failover replica. A false status indicates that the failover replica is out of sync. The primary instance can only failover to the failover replica when the status is true.
         * 
         * @return builder
         * 
         */
        public Builder available(@Nullable Output<Boolean> available) {
            $.available = available;
            return this;
        }

        /**
         * @param available The availability status of the failover replica. A false status indicates that the failover replica is out of sync. The primary instance can only failover to the failover replica when the status is true.
         * 
         * @return builder
         * 
         */
        public Builder available(Boolean available) {
            return available(Output.of(available));
        }

        /**
         * @param name The name of the failover replica. If specified at instance creation, a failover replica is created for the instance. The name doesn&#39;t include the project ID.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the failover replica. If specified at instance creation, a failover replica is created for the instance. The name doesn&#39;t include the project ID.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public InstanceFailoverReplicaArgs build() {
            return $;
        }
    }

}
