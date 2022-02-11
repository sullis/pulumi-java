// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPrimaryTaskSetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrimaryTaskSetArgs Empty = new GetPrimaryTaskSetArgs();

    @InputImport(name="cluster", required=true)
    private final String cluster;

    public String getCluster() {
        return this.cluster;
    }

    @InputImport(name="service", required=true)
    private final String service;

    public String getService() {
        return this.service;
    }

    public GetPrimaryTaskSetArgs(
        String cluster,
        String service) {
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private GetPrimaryTaskSetArgs() {
        this.cluster = null;
        this.service = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrimaryTaskSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cluster;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrimaryTaskSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.service = defaults.service;
        }

        public Builder setCluster(String cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public GetPrimaryTaskSetArgs build() {
            return new GetPrimaryTaskSetArgs(cluster, service);
        }
    }
}
