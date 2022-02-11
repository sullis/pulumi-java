// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkInsightsPathArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkInsightsPathArgs Empty = new GetNetworkInsightsPathArgs();

    @InputImport(name="networkInsightsPathId", required=true)
    private final String networkInsightsPathId;

    public String getNetworkInsightsPathId() {
        return this.networkInsightsPathId;
    }

    public GetNetworkInsightsPathArgs(String networkInsightsPathId) {
        this.networkInsightsPathId = Objects.requireNonNull(networkInsightsPathId, "expected parameter 'networkInsightsPathId' to be non-null");
    }

    private GetNetworkInsightsPathArgs() {
        this.networkInsightsPathId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInsightsPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkInsightsPathId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkInsightsPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInsightsPathId = defaults.networkInsightsPathId;
        }

        public Builder setNetworkInsightsPathId(String networkInsightsPathId) {
            this.networkInsightsPathId = Objects.requireNonNull(networkInsightsPathId);
            return this;
        }

        public GetNetworkInsightsPathArgs build() {
            return new GetNetworkInsightsPathArgs(networkInsightsPathId);
        }
    }
}
