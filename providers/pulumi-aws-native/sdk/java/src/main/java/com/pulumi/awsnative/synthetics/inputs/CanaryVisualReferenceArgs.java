// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.synthetics.inputs;

import com.pulumi.awsnative.synthetics.inputs.CanaryBaseScreenshotArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CanaryVisualReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CanaryVisualReferenceArgs Empty = new CanaryVisualReferenceArgs();

    /**
     * Canary run id to be used as base reference for visual testing
     * 
     */
    @Import(name="baseCanaryRunId", required=true)
    private Output<String> baseCanaryRunId;

    /**
     * @return Canary run id to be used as base reference for visual testing
     * 
     */
    public Output<String> baseCanaryRunId() {
        return this.baseCanaryRunId;
    }

    /**
     * List of screenshots used as base reference for visual testing
     * 
     */
    @Import(name="baseScreenshots")
    private @Nullable Output<List<CanaryBaseScreenshotArgs>> baseScreenshots;

    /**
     * @return List of screenshots used as base reference for visual testing
     * 
     */
    public Optional<Output<List<CanaryBaseScreenshotArgs>>> baseScreenshots() {
        return Optional.ofNullable(this.baseScreenshots);
    }

    private CanaryVisualReferenceArgs() {}

    private CanaryVisualReferenceArgs(CanaryVisualReferenceArgs $) {
        this.baseCanaryRunId = $.baseCanaryRunId;
        this.baseScreenshots = $.baseScreenshots;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CanaryVisualReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CanaryVisualReferenceArgs $;

        public Builder() {
            $ = new CanaryVisualReferenceArgs();
        }

        public Builder(CanaryVisualReferenceArgs defaults) {
            $ = new CanaryVisualReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseCanaryRunId Canary run id to be used as base reference for visual testing
         * 
         * @return builder
         * 
         */
        public Builder baseCanaryRunId(Output<String> baseCanaryRunId) {
            $.baseCanaryRunId = baseCanaryRunId;
            return this;
        }

        /**
         * @param baseCanaryRunId Canary run id to be used as base reference for visual testing
         * 
         * @return builder
         * 
         */
        public Builder baseCanaryRunId(String baseCanaryRunId) {
            return baseCanaryRunId(Output.of(baseCanaryRunId));
        }

        /**
         * @param baseScreenshots List of screenshots used as base reference for visual testing
         * 
         * @return builder
         * 
         */
        public Builder baseScreenshots(@Nullable Output<List<CanaryBaseScreenshotArgs>> baseScreenshots) {
            $.baseScreenshots = baseScreenshots;
            return this;
        }

        /**
         * @param baseScreenshots List of screenshots used as base reference for visual testing
         * 
         * @return builder
         * 
         */
        public Builder baseScreenshots(List<CanaryBaseScreenshotArgs> baseScreenshots) {
            return baseScreenshots(Output.of(baseScreenshots));
        }

        /**
         * @param baseScreenshots List of screenshots used as base reference for visual testing
         * 
         * @return builder
         * 
         */
        public Builder baseScreenshots(CanaryBaseScreenshotArgs... baseScreenshots) {
            return baseScreenshots(List.of(baseScreenshots));
        }

        public CanaryVisualReferenceArgs build() {
            $.baseCanaryRunId = Objects.requireNonNull($.baseCanaryRunId, "expected parameter 'baseCanaryRunId' to be non-null");
            return $;
        }
    }

}
