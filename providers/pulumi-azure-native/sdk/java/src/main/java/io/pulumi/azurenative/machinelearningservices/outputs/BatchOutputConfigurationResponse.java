// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BatchOutputConfigurationResponse {
    /**
     * Customized output file name for append_row output action.
     * 
     */
    private final @Nullable String appendRowFileName;
    /**
     * Indicates how the output will be organized.
     * 
     */
    private final @Nullable String outputAction;

    @OutputCustomType.Constructor({"appendRowFileName","outputAction"})
    private BatchOutputConfigurationResponse(
        @Nullable String appendRowFileName,
        @Nullable String outputAction) {
        this.appendRowFileName = appendRowFileName;
        this.outputAction = outputAction;
    }

    /**
     * Customized output file name for append_row output action.
     * 
     */
    public Optional<String> getAppendRowFileName() {
        return Optional.ofNullable(this.appendRowFileName);
    }
    /**
     * Indicates how the output will be organized.
     * 
     */
    public Optional<String> getOutputAction() {
        return Optional.ofNullable(this.outputAction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchOutputConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appendRowFileName;
        private @Nullable String outputAction;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchOutputConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appendRowFileName = defaults.appendRowFileName;
    	      this.outputAction = defaults.outputAction;
        }

        public Builder setAppendRowFileName(@Nullable String appendRowFileName) {
            this.appendRowFileName = appendRowFileName;
            return this;
        }

        public Builder setOutputAction(@Nullable String outputAction) {
            this.outputAction = outputAction;
            return this;
        }

        public BatchOutputConfigurationResponse build() {
            return new BatchOutputConfigurationResponse(appendRowFileName, outputAction);
        }
    }
}
