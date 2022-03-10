// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAccessScopeResourceStatementRequest;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkInsightsAccessScopeThroughResourcesStatementRequest {
    private final @Nullable NetworkInsightsAccessScopeResourceStatementRequest resourceStatement;

    @OutputCustomType.Constructor
    private NetworkInsightsAccessScopeThroughResourcesStatementRequest(@OutputCustomType.Parameter("resourceStatement") @Nullable NetworkInsightsAccessScopeResourceStatementRequest resourceStatement) {
        this.resourceStatement = resourceStatement;
    }

    public Optional<NetworkInsightsAccessScopeResourceStatementRequest> getResourceStatement() {
        return Optional.ofNullable(this.resourceStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAccessScopeThroughResourcesStatementRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NetworkInsightsAccessScopeResourceStatementRequest resourceStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAccessScopeThroughResourcesStatementRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceStatement = defaults.resourceStatement;
        }

        public Builder setResourceStatement(@Nullable NetworkInsightsAccessScopeResourceStatementRequest resourceStatement) {
            this.resourceStatement = resourceStatement;
            return this;
        }
        public NetworkInsightsAccessScopeThroughResourcesStatementRequest build() {
            return new NetworkInsightsAccessScopeThroughResourcesStatementRequest(resourceStatement);
        }
    }
}
