// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.outputs;

import io.pulumi.awsnative.mediaconnect.outputs.FlowFailoverConfig;
import io.pulumi.awsnative.mediaconnect.outputs.FlowSource;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFlowResult {
    /**
     * The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
     * 
     */
    private final @Nullable String flowArn;
    /**
     * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones within the current AWS.(ReadOnly)
     * 
     */
    private final @Nullable String flowAvailabilityZone;
    /**
     * The source of the flow.
     * 
     */
    private final @Nullable FlowSource source;
    /**
     * The source failover config of the flow.
     * 
     */
    private final @Nullable FlowFailoverConfig sourceFailoverConfig;

    @OutputCustomType.Constructor({"flowArn","flowAvailabilityZone","source","sourceFailoverConfig"})
    private GetFlowResult(
        @Nullable String flowArn,
        @Nullable String flowAvailabilityZone,
        @Nullable FlowSource source,
        @Nullable FlowFailoverConfig sourceFailoverConfig) {
        this.flowArn = flowArn;
        this.flowAvailabilityZone = flowAvailabilityZone;
        this.source = source;
        this.sourceFailoverConfig = sourceFailoverConfig;
    }

    /**
     * The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
     * 
    */
    public Optional<String> getFlowArn() {
        return Optional.ofNullable(this.flowArn);
    }
    /**
     * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones within the current AWS.(ReadOnly)
     * 
    */
    public Optional<String> getFlowAvailabilityZone() {
        return Optional.ofNullable(this.flowAvailabilityZone);
    }
    /**
     * The source of the flow.
     * 
    */
    public Optional<FlowSource> getSource() {
        return Optional.ofNullable(this.source);
    }
    /**
     * The source failover config of the flow.
     * 
    */
    public Optional<FlowFailoverConfig> getSourceFailoverConfig() {
        return Optional.ofNullable(this.sourceFailoverConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlowResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String flowArn;
        private @Nullable String flowAvailabilityZone;
        private @Nullable FlowSource source;
        private @Nullable FlowFailoverConfig sourceFailoverConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFlowResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flowArn = defaults.flowArn;
    	      this.flowAvailabilityZone = defaults.flowAvailabilityZone;
    	      this.source = defaults.source;
    	      this.sourceFailoverConfig = defaults.sourceFailoverConfig;
        }

        public Builder setFlowArn(@Nullable String flowArn) {
            this.flowArn = flowArn;
            return this;
        }

        public Builder setFlowAvailabilityZone(@Nullable String flowAvailabilityZone) {
            this.flowAvailabilityZone = flowAvailabilityZone;
            return this;
        }

        public Builder setSource(@Nullable FlowSource source) {
            this.source = source;
            return this;
        }

        public Builder setSourceFailoverConfig(@Nullable FlowFailoverConfig sourceFailoverConfig) {
            this.sourceFailoverConfig = sourceFailoverConfig;
            return this;
        }
        public GetFlowResult build() {
            return new GetFlowResult(flowArn, flowAvailabilityZone, source, sourceFailoverConfig);
        }
    }
}