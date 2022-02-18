// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Batch inference output configuration.
 * 
 */
public final class BatchOutputConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final BatchOutputConfigurationResponse Empty = new BatchOutputConfigurationResponse();

    /**
     * Customized output file name for append_row output action.
     * 
     */
    @InputImport(name="appendRowFileName")
    private final @Nullable String appendRowFileName;

    public Optional<String> getAppendRowFileName() {
        return this.appendRowFileName == null ? Optional.empty() : Optional.ofNullable(this.appendRowFileName);
    }

    /**
     * Indicates how the output will be organized.
     * 
     */
    @InputImport(name="outputAction")
    private final @Nullable String outputAction;

    public Optional<String> getOutputAction() {
        return this.outputAction == null ? Optional.empty() : Optional.ofNullable(this.outputAction);
    }

    public BatchOutputConfigurationResponse(
        @Nullable String appendRowFileName,
        @Nullable String outputAction) {
        this.appendRowFileName = appendRowFileName;
        this.outputAction = outputAction;
    }

    private BatchOutputConfigurationResponse() {
        this.appendRowFileName = null;
        this.outputAction = null;
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
