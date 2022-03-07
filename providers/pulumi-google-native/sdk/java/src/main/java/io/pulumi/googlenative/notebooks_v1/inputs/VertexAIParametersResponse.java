// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Parameters used in Vertex AI JobType executions.
 * 
 */
public final class VertexAIParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final VertexAIParametersResponse Empty = new VertexAIParametersResponse();

    /**
     * Environment variables. At most 100 environment variables can be specified and unique. Example: GCP_BUCKET=gs://my-bucket/samples/
     * 
     */
    @InputImport(name="env", required=true)
      private final Map<String,String> env;

    public Map<String,String> getEnv() {
        return this.env;
    }

    /**
     * The full name of the Compute Engine [network](/compute/docs/networks-and-firewalls#networks) to which the Job should be peered. For example, `projects/12345/global/networks/myVPC`. [Format](https://cloud.google.com/compute/docs/reference/rest/v1/networks/insert) is of the form `projects/{project}/global/networks/{network}`. Where {project} is a project number, as in `12345`, and {network} is a network name. Private services access must already be configured for the network. If left unspecified, the job is not peered with any network.
     * 
     */
    @InputImport(name="network", required=true)
      private final String network;

    public String getNetwork() {
        return this.network;
    }

    public VertexAIParametersResponse(
        Map<String,String> env,
        String network) {
        this.env = Objects.requireNonNull(env, "expected parameter 'env' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
    }

    private VertexAIParametersResponse() {
        this.env = Map.of();
        this.network = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VertexAIParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> env;
        private String network;

        public Builder() {
    	      // Empty
        }

        public Builder(VertexAIParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.env = defaults.env;
    	      this.network = defaults.network;
        }

        public Builder setEnv(Map<String,String> env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public VertexAIParametersResponse build() {
            return new VertexAIParametersResponse(env, network);
        }
    }
}