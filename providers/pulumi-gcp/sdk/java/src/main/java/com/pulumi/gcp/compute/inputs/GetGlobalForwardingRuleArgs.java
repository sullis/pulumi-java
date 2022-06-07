// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGlobalForwardingRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGlobalForwardingRuleArgs Empty = new GetGlobalForwardingRuleArgs();

    /**
     * The name of the global forwarding rule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the global forwarding rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetGlobalForwardingRuleArgs() {}

    private GetGlobalForwardingRuleArgs(GetGlobalForwardingRuleArgs $) {
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGlobalForwardingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlobalForwardingRuleArgs $;

        public Builder() {
            $ = new GetGlobalForwardingRuleArgs();
        }

        public Builder(GetGlobalForwardingRuleArgs defaults) {
            $ = new GetGlobalForwardingRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the global forwarding rule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the global forwarding rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetGlobalForwardingRuleArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
