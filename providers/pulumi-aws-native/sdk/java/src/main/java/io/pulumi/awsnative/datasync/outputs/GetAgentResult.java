// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.awsnative.datasync.enums.AgentEndpointType;
import io.pulumi.awsnative.datasync.outputs.AgentTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAgentResult {
    /**
     * The DataSync Agent ARN.
     * 
     */
    private final @Nullable String agentArn;
    /**
     * The name configured for the agent. Text reference used to identify the agent in the console.
     * 
     */
    private final @Nullable String agentName;
    /**
     * The service endpoints that the agent will connect to.
     * 
     */
    private final @Nullable AgentEndpointType endpointType;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<AgentTag> tags;

    @CustomType.Constructor
    private GetAgentResult(
        @CustomType.Parameter("agentArn") @Nullable String agentArn,
        @CustomType.Parameter("agentName") @Nullable String agentName,
        @CustomType.Parameter("endpointType") @Nullable AgentEndpointType endpointType,
        @CustomType.Parameter("tags") @Nullable List<AgentTag> tags) {
        this.agentArn = agentArn;
        this.agentName = agentName;
        this.endpointType = endpointType;
        this.tags = tags;
    }

    /**
     * The DataSync Agent ARN.
     * 
    */
    public Optional<String> agentArn() {
        return Optional.ofNullable(this.agentArn);
    }
    /**
     * The name configured for the agent. Text reference used to identify the agent in the console.
     * 
    */
    public Optional<String> agentName() {
        return Optional.ofNullable(this.agentName);
    }
    /**
     * The service endpoints that the agent will connect to.
     * 
    */
    public Optional<AgentEndpointType> endpointType() {
        return Optional.ofNullable(this.endpointType);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<AgentTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAgentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentArn;
        private @Nullable String agentName;
        private @Nullable AgentEndpointType endpointType;
        private @Nullable List<AgentTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAgentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentArn = defaults.agentArn;
    	      this.agentName = defaults.agentName;
    	      this.endpointType = defaults.endpointType;
    	      this.tags = defaults.tags;
        }

        public Builder agentArn(@Nullable String agentArn) {
            this.agentArn = agentArn;
            return this;
        }
        public Builder agentName(@Nullable String agentName) {
            this.agentName = agentName;
            return this;
        }
        public Builder endpointType(@Nullable AgentEndpointType endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public Builder tags(@Nullable List<AgentTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(AgentTag... tags) {
            return tags(List.of(tags));
        }        public GetAgentResult build() {
            return new GetAgentResult(agentArn, agentName, endpointType, tags);
        }
    }
}
