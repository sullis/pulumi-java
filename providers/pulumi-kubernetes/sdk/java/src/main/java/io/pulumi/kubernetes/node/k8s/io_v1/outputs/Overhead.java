// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.node.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class Overhead {
    /**
     * PodFixed represents the fixed resource overhead associated with running a pod.
     * 
     */
    private final @Nullable Map<String,String> podFixed;

    @OutputCustomType.Constructor
    private Overhead(@OutputCustomType.Parameter("podFixed") @Nullable Map<String,String> podFixed) {
        this.podFixed = podFixed;
    }

    /**
     * PodFixed represents the fixed resource overhead associated with running a pod.
     * 
    */
    public Map<String,String> getPodFixed() {
        return this.podFixed == null ? Map.of() : this.podFixed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Overhead defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> podFixed;

        public Builder() {
    	      // Empty
        }

        public Builder(Overhead defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podFixed = defaults.podFixed;
        }

        public Builder setPodFixed(@Nullable Map<String,String> podFixed) {
            this.podFixed = podFixed;
            return this;
        }
        public Overhead build() {
            return new Overhead(podFixed);
        }
    }
}
