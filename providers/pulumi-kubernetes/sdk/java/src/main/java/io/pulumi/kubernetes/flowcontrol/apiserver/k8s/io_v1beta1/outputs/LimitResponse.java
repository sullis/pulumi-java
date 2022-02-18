// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.outputs.QueuingConfiguration;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LimitResponse {
    /**
     * `queuing` holds the configuration parameters for queuing. This field may be non-empty only if `type` is `"Queue"`.
     * 
     */
    private final @Nullable QueuingConfiguration queuing;
    /**
     * `type` is "Queue" or "Reject". "Queue" means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. "Reject" means that requests that can not be executed upon arrival are rejected. Required.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"queuing","type"})
    private LimitResponse(
        @Nullable QueuingConfiguration queuing,
        String type) {
        this.queuing = queuing;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * `queuing` holds the configuration parameters for queuing. This field may be non-empty only if `type` is `"Queue"`.
     * 
     */
    public Optional<QueuingConfiguration> getQueuing() {
        return Optional.ofNullable(this.queuing);
    }
    /**
     * `type` is "Queue" or "Reject". "Queue" means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. "Reject" means that requests that can not be executed upon arrival are rejected. Required.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LimitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable QueuingConfiguration queuing;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(LimitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queuing = defaults.queuing;
    	      this.type = defaults.type;
        }

        public Builder setQueuing(@Nullable QueuingConfiguration queuing) {
            this.queuing = queuing;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public LimitResponse build() {
            return new LimitResponse(queuing, type);
        }
    }
}
