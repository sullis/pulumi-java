// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gameservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GameServerConfigScalingConfigSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final GameServerConfigScalingConfigSelectorArgs Empty = new GameServerConfigScalingConfigSelectorArgs();

    /**
     * Set of labels to group by.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Set of labels to group by.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    private GameServerConfigScalingConfigSelectorArgs() {}

    private GameServerConfigScalingConfigSelectorArgs(GameServerConfigScalingConfigSelectorArgs $) {
        this.labels = $.labels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GameServerConfigScalingConfigSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GameServerConfigScalingConfigSelectorArgs $;

        public Builder() {
            $ = new GameServerConfigScalingConfigSelectorArgs();
        }

        public Builder(GameServerConfigScalingConfigSelectorArgs defaults) {
            $ = new GameServerConfigScalingConfigSelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labels Set of labels to group by.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Set of labels to group by.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public GameServerConfigScalingConfigSelectorArgs build() {
            return $;
        }
    }

}
