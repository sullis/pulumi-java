// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class LocationNFSOnPremConfig {
    /**
     * ARN(s) of the agent(s) to use for an NFS location.
     * 
     */
    private final List<String> agentArns;

    @OutputCustomType.Constructor
    private LocationNFSOnPremConfig(@OutputCustomType.Parameter("agentArns") List<String> agentArns) {
        this.agentArns = agentArns;
    }

    /**
     * ARN(s) of the agent(s) to use for an NFS location.
     * 
    */
    public List<String> getAgentArns() {
        return this.agentArns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationNFSOnPremConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> agentArns;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationNFSOnPremConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentArns = defaults.agentArns;
        }

        public Builder setAgentArns(List<String> agentArns) {
            this.agentArns = Objects.requireNonNull(agentArns);
            return this;
        }
        public LocationNFSOnPremConfig build() {
            return new LocationNFSOnPremConfig(agentArns);
        }
    }
}
