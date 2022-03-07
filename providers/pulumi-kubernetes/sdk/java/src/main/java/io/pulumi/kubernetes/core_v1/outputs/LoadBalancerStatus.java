// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.LoadBalancerIngress;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class LoadBalancerStatus {
    /**
     * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
     * 
     */
    private final @Nullable List<LoadBalancerIngress> ingress;

    @OutputCustomType.Constructor({"ingress"})
    private LoadBalancerStatus(@Nullable List<LoadBalancerIngress> ingress) {
        this.ingress = ingress;
    }

    /**
     * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
     * 
    */
    public List<LoadBalancerIngress> getIngress() {
        return this.ingress == null ? List.of() : this.ingress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<LoadBalancerIngress> ingress;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingress = defaults.ingress;
        }

        public Builder setIngress(@Nullable List<LoadBalancerIngress> ingress) {
            this.ingress = ingress;
            return this;
        }
        public LoadBalancerStatus build() {
            return new LoadBalancerStatus(ingress);
        }
    }
}