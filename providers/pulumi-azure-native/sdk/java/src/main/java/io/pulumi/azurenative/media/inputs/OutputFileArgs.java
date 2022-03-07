// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents an output file produced.
 * 
 */
public final class OutputFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final OutputFileArgs Empty = new OutputFileArgs();

    /**
     * The list of labels that describe how the encoder should multiplex video and audio into an output file. For example, if the encoder is producing two video layers with labels v1 and v2, and one audio layer with label a1, then an array like '[v1, a1]' tells the encoder to produce an output file with the video track represented by v1 and the audio track represented by a1.
     * 
     */
    @InputImport(name="labels", required=true)
      private final Input<List<String>> labels;

    public Input<List<String>> getLabels() {
        return this.labels;
    }

    public OutputFileArgs(Input<List<String>> labels) {
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
    }

    private OutputFileArgs() {
        this.labels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutputFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(OutputFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder setLabels(Input<List<String>> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLabels(List<String> labels) {
            this.labels = Input.of(Objects.requireNonNull(labels));
            return this;
        }
        public OutputFileArgs build() {
            return new OutputFileArgs(labels);
        }
    }
}