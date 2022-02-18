// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScriptReferenceResponse {
    /**
     * Optional command line arguments passed to the script to run.
     * 
     */
    private final @Nullable String scriptArguments;
    /**
     * The location of scripts in the mounted volume.
     * 
     */
    private final @Nullable String scriptData;
    /**
     * The storage source of the script: inline, workspace.
     * 
     */
    private final @Nullable String scriptSource;
    /**
     * Optional time period passed to timeout command.
     * 
     */
    private final @Nullable String timeout;

    @OutputCustomType.Constructor({"scriptArguments","scriptData","scriptSource","timeout"})
    private ScriptReferenceResponse(
        @Nullable String scriptArguments,
        @Nullable String scriptData,
        @Nullable String scriptSource,
        @Nullable String timeout) {
        this.scriptArguments = scriptArguments;
        this.scriptData = scriptData;
        this.scriptSource = scriptSource;
        this.timeout = timeout;
    }

    /**
     * Optional command line arguments passed to the script to run.
     * 
     */
    public Optional<String> getScriptArguments() {
        return Optional.ofNullable(this.scriptArguments);
    }
    /**
     * The location of scripts in the mounted volume.
     * 
     */
    public Optional<String> getScriptData() {
        return Optional.ofNullable(this.scriptData);
    }
    /**
     * The storage source of the script: inline, workspace.
     * 
     */
    public Optional<String> getScriptSource() {
        return Optional.ofNullable(this.scriptSource);
    }
    /**
     * Optional time period passed to timeout command.
     * 
     */
    public Optional<String> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String scriptArguments;
        private @Nullable String scriptData;
        private @Nullable String scriptSource;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scriptArguments = defaults.scriptArguments;
    	      this.scriptData = defaults.scriptData;
    	      this.scriptSource = defaults.scriptSource;
    	      this.timeout = defaults.timeout;
        }

        public Builder setScriptArguments(@Nullable String scriptArguments) {
            this.scriptArguments = scriptArguments;
            return this;
        }

        public Builder setScriptData(@Nullable String scriptData) {
            this.scriptData = scriptData;
            return this;
        }

        public Builder setScriptSource(@Nullable String scriptSource) {
            this.scriptSource = scriptSource;
            return this;
        }

        public Builder setTimeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }

        public ScriptReferenceResponse build() {
            return new ScriptReferenceResponse(scriptArguments, scriptData, scriptSource, timeout);
        }
    }
}
