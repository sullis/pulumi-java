// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class DaemonEndpoint {
    /**
     * Port number of the given endpoint.
     * 
     */
    private final Integer Port;

    @OutputCustomType.Constructor({"Port"})
    private DaemonEndpoint(Integer Port) {
        this.Port = Objects.requireNonNull(Port);
    }

    /**
     * Port number of the given endpoint.
     * 
     */
    public Integer getPort() {
        return this.Port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaemonEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer Port;

        public Builder() {
    	      // Empty
        }

        public Builder(DaemonEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.Port = defaults.Port;
        }

        public Builder setPort(Integer Port) {
            this.Port = Objects.requireNonNull(Port);
            return this;
        }

        public DaemonEndpoint build() {
            return new DaemonEndpoint(Port);
        }
    }
}
