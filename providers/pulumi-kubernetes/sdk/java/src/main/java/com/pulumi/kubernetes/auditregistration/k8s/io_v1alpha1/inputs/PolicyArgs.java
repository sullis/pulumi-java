// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.auditregistration.k8s.io_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Policy defines the configuration of how audit events are logged
 * 
 */
public final class PolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
     * 
     */
    @Import(name="level", required=true)
    private Output<String> level;

    /**
     * @return The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
     * 
     */
    public Output<String> level() {
        return this.level;
    }

    /**
     * Stages is a list of stages for which events are created.
     * 
     */
    @Import(name="stages")
    private @Nullable Output<List<String>> stages;

    /**
     * @return Stages is a list of stages for which events are created.
     * 
     */
    public Optional<Output<List<String>>> stages() {
        return Optional.ofNullable(this.stages);
    }

    private PolicyArgs() {}

    private PolicyArgs(PolicyArgs $) {
        this.level = $.level;
        this.stages = $.stages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyArgs $;

        public Builder() {
            $ = new PolicyArgs();
        }

        public Builder(PolicyArgs defaults) {
            $ = new PolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param level The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
         * 
         * @return builder
         * 
         */
        public Builder level(Output<String> level) {
            $.level = level;
            return this;
        }

        /**
         * @param level The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
         * 
         * @return builder
         * 
         */
        public Builder level(String level) {
            return level(Output.of(level));
        }

        /**
         * @param stages Stages is a list of stages for which events are created.
         * 
         * @return builder
         * 
         */
        public Builder stages(@Nullable Output<List<String>> stages) {
            $.stages = stages;
            return this;
        }

        /**
         * @param stages Stages is a list of stages for which events are created.
         * 
         * @return builder
         * 
         */
        public Builder stages(List<String> stages) {
            return stages(Output.of(stages));
        }

        /**
         * @param stages Stages is a list of stages for which events are created.
         * 
         * @return builder
         * 
         */
        public Builder stages(String... stages) {
            return stages(List.of(stages));
        }

        public PolicyArgs build() {
            $.level = Objects.requireNonNull($.level, "expected parameter 'level' to be non-null");
            return $;
        }
    }

}
