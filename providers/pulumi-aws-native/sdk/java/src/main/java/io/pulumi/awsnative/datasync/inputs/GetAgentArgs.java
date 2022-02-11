// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAgentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAgentArgs Empty = new GetAgentArgs();

    @InputImport(name="agentArn", required=true)
    private final String agentArn;

    public String getAgentArn() {
        return this.agentArn;
    }

    public GetAgentArgs(String agentArn) {
        this.agentArn = Objects.requireNonNull(agentArn, "expected parameter 'agentArn' to be non-null");
    }

    private GetAgentArgs() {
        this.agentArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAgentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentArn = defaults.agentArn;
        }

        public Builder setAgentArn(String agentArn) {
            this.agentArn = Objects.requireNonNull(agentArn);
            return this;
        }

        public GetAgentArgs build() {
            return new GetAgentArgs(agentArn);
        }
    }
}
