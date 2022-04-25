// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1alpha2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Network describes the network configuration for a `WorkerPool`.
 * 
 */
public final class NetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkConfigArgs Empty = new NetworkConfigArgs();

    /**
     * Immutable. The network definition that the workers are peered to. If this section is left empty, the workers will be peered to WorkerPool.project_id on the default network. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number, such as `12345`, and {network} is the name of a VPC network in the project.
     * 
     */
    @Import(name="peeredNetwork", required=true)
    private Output<String> peeredNetwork;

    /**
     * @return Immutable. The network definition that the workers are peered to. If this section is left empty, the workers will be peered to WorkerPool.project_id on the default network. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number, such as `12345`, and {network} is the name of a VPC network in the project.
     * 
     */
    public Output<String> peeredNetwork() {
        return this.peeredNetwork;
    }

    private NetworkConfigArgs() {}

    private NetworkConfigArgs(NetworkConfigArgs $) {
        this.peeredNetwork = $.peeredNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkConfigArgs $;

        public Builder() {
            $ = new NetworkConfigArgs();
        }

        public Builder(NetworkConfigArgs defaults) {
            $ = new NetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param peeredNetwork Immutable. The network definition that the workers are peered to. If this section is left empty, the workers will be peered to WorkerPool.project_id on the default network. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number, such as `12345`, and {network} is the name of a VPC network in the project.
         * 
         * @return builder
         * 
         */
        public Builder peeredNetwork(Output<String> peeredNetwork) {
            $.peeredNetwork = peeredNetwork;
            return this;
        }

        /**
         * @param peeredNetwork Immutable. The network definition that the workers are peered to. If this section is left empty, the workers will be peered to WorkerPool.project_id on the default network. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number, such as `12345`, and {network} is the name of a VPC network in the project.
         * 
         * @return builder
         * 
         */
        public Builder peeredNetwork(String peeredNetwork) {
            return peeredNetwork(Output.of(peeredNetwork));
        }

        public NetworkConfigArgs build() {
            $.peeredNetwork = Objects.requireNonNull($.peeredNetwork, "expected parameter 'peeredNetwork' to be non-null");
            return $;
        }
    }

}
