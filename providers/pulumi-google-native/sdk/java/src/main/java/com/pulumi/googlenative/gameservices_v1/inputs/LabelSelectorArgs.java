// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The label selector, used to group labels on the resources.
 * 
 */
public final class LabelSelectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final LabelSelectorArgs Empty = new LabelSelectorArgs();

    /**
     * Resource labels for this selector.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Resource labels for this selector.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    private LabelSelectorArgs() {}

    private LabelSelectorArgs(LabelSelectorArgs $) {
        this.labels = $.labels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LabelSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LabelSelectorArgs $;

        public Builder() {
            $ = new LabelSelectorArgs();
        }

        public Builder(LabelSelectorArgs defaults) {
            $ = new LabelSelectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labels Resource labels for this selector.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Resource labels for this selector.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public LabelSelectorArgs build() {
            return $;
        }
    }

}
