// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1alpha2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NetworkConfigResponse {
    /**
     * Immutable. The network definition that the workers are peered to. If this section is left empty, the workers will be peered to WorkerPool.project_id on the default network. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number, such as `12345`, and {network} is the name of a VPC network in the project.
     * 
     */
    private final String peeredNetwork;

    @CustomType.Constructor
    private NetworkConfigResponse(@CustomType.Parameter("peeredNetwork") String peeredNetwork) {
        this.peeredNetwork = peeredNetwork;
    }

    /**
     * Immutable. The network definition that the workers are peered to. If this section is left empty, the workers will be peered to WorkerPool.project_id on the default network. Must be in the format `projects/{project}/global/networks/{network}`, where {project} is a project number, such as `12345`, and {network} is the name of a VPC network in the project.
     * 
    */
    public String getPeeredNetwork() {
        return this.peeredNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String peeredNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peeredNetwork = defaults.peeredNetwork;
        }

        public Builder peeredNetwork(String peeredNetwork) {
            this.peeredNetwork = Objects.requireNonNull(peeredNetwork);
            return this;
        }        public NetworkConfigResponse build() {
            return new NetworkConfigResponse(peeredNetwork);
        }
    }
}
