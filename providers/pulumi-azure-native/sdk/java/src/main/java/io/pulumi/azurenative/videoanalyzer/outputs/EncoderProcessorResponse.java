// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.azurenative.videoanalyzer.outputs.EncoderCustomPresetResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.EncoderSystemPresetResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.NodeInputResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class EncoderProcessorResponse {
    /**
     * An array of upstream node references within the topology to be used as inputs for this node.
     * 
     */
    private final List<NodeInputResponse> inputs;
    /**
     * Node name. Must be unique within the topology.
     * 
     */
    private final String name;
    /**
     * The encoder preset, which defines the recipe or instructions on how the input content should be processed.
     * 
     */
    private final Either<EncoderCustomPresetResponse,EncoderSystemPresetResponse> preset;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.EncoderProcessor'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"inputs","name","preset","type"})
    private EncoderProcessorResponse(
        List<NodeInputResponse> inputs,
        String name,
        Either<EncoderCustomPresetResponse,EncoderSystemPresetResponse> preset,
        String type) {
        this.inputs = Objects.requireNonNull(inputs);
        this.name = Objects.requireNonNull(name);
        this.preset = Objects.requireNonNull(preset);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * An array of upstream node references within the topology to be used as inputs for this node.
     * 
     */
    public List<NodeInputResponse> getInputs() {
        return this.inputs;
    }
    /**
     * Node name. Must be unique within the topology.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The encoder preset, which defines the recipe or instructions on how the input content should be processed.
     * 
     */
    public Either<EncoderCustomPresetResponse,EncoderSystemPresetResponse> getPreset() {
        return this.preset;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.EncoderProcessor'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncoderProcessorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<NodeInputResponse> inputs;
        private String name;
        private Either<EncoderCustomPresetResponse,EncoderSystemPresetResponse> preset;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EncoderProcessorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputs = defaults.inputs;
    	      this.name = defaults.name;
    	      this.preset = defaults.preset;
    	      this.type = defaults.type;
        }

        public Builder setInputs(List<NodeInputResponse> inputs) {
            this.inputs = Objects.requireNonNull(inputs);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPreset(Either<EncoderCustomPresetResponse,EncoderSystemPresetResponse> preset) {
            this.preset = Objects.requireNonNull(preset);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public EncoderProcessorResponse build() {
            return new EncoderProcessorResponse(inputs, name, preset, type);
        }
    }
}
