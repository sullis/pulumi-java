// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.clouddeploy_v1.inputs.StageArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SerialPipeline defines a sequential set of stages for a `DeliveryPipeline`.
 * 
 */
public final class SerialPipelineArgs extends com.pulumi.resources.ResourceArgs {

    public static final SerialPipelineArgs Empty = new SerialPipelineArgs();

    /**
     * Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
     * 
     */
    @Import(name="stages")
    private @Nullable Output<List<StageArgs>> stages;

    /**
     * @return Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
     * 
     */
    public Optional<Output<List<StageArgs>>> stages() {
        return Optional.ofNullable(this.stages);
    }

    private SerialPipelineArgs() {}

    private SerialPipelineArgs(SerialPipelineArgs $) {
        this.stages = $.stages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SerialPipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SerialPipelineArgs $;

        public Builder() {
            $ = new SerialPipelineArgs();
        }

        public Builder(SerialPipelineArgs defaults) {
            $ = new SerialPipelineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param stages Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
         * 
         * @return builder
         * 
         */
        public Builder stages(@Nullable Output<List<StageArgs>> stages) {
            $.stages = stages;
            return this;
        }

        /**
         * @param stages Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
         * 
         * @return builder
         * 
         */
        public Builder stages(List<StageArgs> stages) {
            return stages(Output.of(stages));
        }

        /**
         * @param stages Each stage specifies configuration for a `Target`. The ordering of this list defines the promotion flow.
         * 
         * @return builder
         * 
         */
        public Builder stages(StageArgs... stages) {
            return stages(List.of(stages));
        }

        public SerialPipelineArgs build() {
            return $;
        }
    }

}
