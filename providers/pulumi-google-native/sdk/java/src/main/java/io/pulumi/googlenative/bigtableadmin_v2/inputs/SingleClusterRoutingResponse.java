// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Unconditionally routes all read/write requests to a specific cluster. This option preserves read-your-writes consistency but does not improve availability.
 * 
 */
public final class SingleClusterRoutingResponse extends io.pulumi.resources.InvokeArgs {

    public static final SingleClusterRoutingResponse Empty = new SingleClusterRoutingResponse();

    /**
     * Whether or not `CheckAndMutateRow` and `ReadModifyWriteRow` requests are allowed by this app profile. It is unsafe to send these requests to the same table/row/column in multiple clusters.
     * 
     */
    @InputImport(name="allowTransactionalWrites", required=true)
      private final Boolean allowTransactionalWrites;

    public Boolean getAllowTransactionalWrites() {
        return this.allowTransactionalWrites;
    }

    /**
     * The cluster to which read/write requests should be routed.
     * 
     */
    @InputImport(name="clusterId", required=true)
      private final String clusterId;

    public String getClusterId() {
        return this.clusterId;
    }

    public SingleClusterRoutingResponse(
        Boolean allowTransactionalWrites,
        String clusterId) {
        this.allowTransactionalWrites = Objects.requireNonNull(allowTransactionalWrites, "expected parameter 'allowTransactionalWrites' to be non-null");
        this.clusterId = Objects.requireNonNull(clusterId, "expected parameter 'clusterId' to be non-null");
    }

    private SingleClusterRoutingResponse() {
        this.allowTransactionalWrites = null;
        this.clusterId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SingleClusterRoutingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowTransactionalWrites;
        private String clusterId;

        public Builder() {
    	      // Empty
        }

        public Builder(SingleClusterRoutingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowTransactionalWrites = defaults.allowTransactionalWrites;
    	      this.clusterId = defaults.clusterId;
        }

        public Builder setAllowTransactionalWrites(Boolean allowTransactionalWrites) {
            this.allowTransactionalWrites = Objects.requireNonNull(allowTransactionalWrites);
            return this;
        }

        public Builder setClusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public SingleClusterRoutingResponse build() {
            return new SingleClusterRoutingResponse(allowTransactionalWrites, clusterId);
        }
    }
}