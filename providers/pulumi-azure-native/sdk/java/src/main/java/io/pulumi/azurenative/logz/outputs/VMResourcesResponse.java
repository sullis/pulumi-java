// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VMResourcesResponse {
    /**
     * Version of the Logz agent installed on the VM.
     * 
     */
    private final @Nullable String agentVersion;
    /**
     * Request of a list vm host update operation.
     * 
     */
    private final @Nullable String id;

    @OutputCustomType.Constructor({"agentVersion","id"})
    private VMResourcesResponse(
        @Nullable String agentVersion,
        @Nullable String id) {
        this.agentVersion = agentVersion;
        this.id = id;
    }

    /**
     * Version of the Logz agent installed on the VM.
     * 
     */
    public Optional<String> getAgentVersion() {
        return Optional.ofNullable(this.agentVersion);
    }
    /**
     * Request of a list vm host update operation.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMResourcesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentVersion;
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(VMResourcesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentVersion = defaults.agentVersion;
    	      this.id = defaults.id;
        }

        public Builder setAgentVersion(@Nullable String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public VMResourcesResponse build() {
            return new VMResourcesResponse(agentVersion, id);
        }
    }
}
