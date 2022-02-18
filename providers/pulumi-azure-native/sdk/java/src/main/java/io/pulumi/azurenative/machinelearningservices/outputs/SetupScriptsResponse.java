// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.ScriptsToExecuteResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SetupScriptsResponse {
    /**
     * Customized setup scripts
     * 
     */
    private final @Nullable ScriptsToExecuteResponse scripts;

    @OutputCustomType.Constructor({"scripts"})
    private SetupScriptsResponse(@Nullable ScriptsToExecuteResponse scripts) {
        this.scripts = scripts;
    }

    /**
     * Customized setup scripts
     * 
     */
    public Optional<ScriptsToExecuteResponse> getScripts() {
        return Optional.ofNullable(this.scripts);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SetupScriptsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ScriptsToExecuteResponse scripts;

        public Builder() {
    	      // Empty
        }

        public Builder(SetupScriptsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scripts = defaults.scripts;
        }

        public Builder setScripts(@Nullable ScriptsToExecuteResponse scripts) {
            this.scripts = scripts;
            return this;
        }

        public SetupScriptsResponse build() {
            return new SetupScriptsResponse(scripts);
        }
    }
}
