// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.secretmanager_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.secretmanager_v1.inputs.ReplicaArgs;
import java.util.List;
import java.util.Objects;


/**
 * A replication policy that replicates the Secret payload into the locations specified in Secret.replication.user_managed.replicas
 * 
 */
public final class UserManagedArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserManagedArgs Empty = new UserManagedArgs();

    /**
     * The list of Replicas for this Secret. Cannot be empty.
     * 
     */
    @Import(name="replicas", required=true)
    private Output<List<ReplicaArgs>> replicas;

    /**
     * @return The list of Replicas for this Secret. Cannot be empty.
     * 
     */
    public Output<List<ReplicaArgs>> replicas() {
        return this.replicas;
    }

    private UserManagedArgs() {}

    private UserManagedArgs(UserManagedArgs $) {
        this.replicas = $.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserManagedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserManagedArgs $;

        public Builder() {
            $ = new UserManagedArgs();
        }

        public Builder(UserManagedArgs defaults) {
            $ = new UserManagedArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param replicas The list of Replicas for this Secret. Cannot be empty.
         * 
         * @return builder
         * 
         */
        public Builder replicas(Output<List<ReplicaArgs>> replicas) {
            $.replicas = replicas;
            return this;
        }

        /**
         * @param replicas The list of Replicas for this Secret. Cannot be empty.
         * 
         * @return builder
         * 
         */
        public Builder replicas(List<ReplicaArgs> replicas) {
            return replicas(Output.of(replicas));
        }

        /**
         * @param replicas The list of Replicas for this Secret. Cannot be empty.
         * 
         * @return builder
         * 
         */
        public Builder replicas(ReplicaArgs... replicas) {
            return replicas(List.of(replicas));
        }

        public UserManagedArgs build() {
            $.replicas = Objects.requireNonNull($.replicas, "expected parameter 'replicas' to be non-null");
            return $;
        }
    }

}
