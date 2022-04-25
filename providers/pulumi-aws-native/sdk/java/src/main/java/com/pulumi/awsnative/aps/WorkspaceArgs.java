// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.aps;

import com.pulumi.awsnative.aps.inputs.WorkspaceTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceArgs Empty = new WorkspaceArgs();

    /**
     * The AMP Workspace alert manager definition data
     * 
     */
    @Import(name="alertManagerDefinition")
    private @Nullable Output<String> alertManagerDefinition;

    /**
     * @return The AMP Workspace alert manager definition data
     * 
     */
    public Optional<Output<String>> alertManagerDefinition() {
        return Optional.ofNullable(this.alertManagerDefinition);
    }

    /**
     * AMP Workspace alias.
     * 
     */
    @Import(name="alias")
    private @Nullable Output<String> alias;

    /**
     * @return AMP Workspace alias.
     * 
     */
    public Optional<Output<String>> alias() {
        return Optional.ofNullable(this.alias);
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<WorkspaceTagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Optional<Output<List<WorkspaceTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private WorkspaceArgs() {}

    private WorkspaceArgs(WorkspaceArgs $) {
        this.alertManagerDefinition = $.alertManagerDefinition;
        this.alias = $.alias;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceArgs $;

        public Builder() {
            $ = new WorkspaceArgs();
        }

        public Builder(WorkspaceArgs defaults) {
            $ = new WorkspaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertManagerDefinition The AMP Workspace alert manager definition data
         * 
         * @return builder
         * 
         */
        public Builder alertManagerDefinition(@Nullable Output<String> alertManagerDefinition) {
            $.alertManagerDefinition = alertManagerDefinition;
            return this;
        }

        /**
         * @param alertManagerDefinition The AMP Workspace alert manager definition data
         * 
         * @return builder
         * 
         */
        public Builder alertManagerDefinition(String alertManagerDefinition) {
            return alertManagerDefinition(Output.of(alertManagerDefinition));
        }

        /**
         * @param alias AMP Workspace alias.
         * 
         * @return builder
         * 
         */
        public Builder alias(@Nullable Output<String> alias) {
            $.alias = alias;
            return this;
        }

        /**
         * @param alias AMP Workspace alias.
         * 
         * @return builder
         * 
         */
        public Builder alias(String alias) {
            return alias(Output.of(alias));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<WorkspaceTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<WorkspaceTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(WorkspaceTagArgs... tags) {
            return tags(List.of(tags));
        }

        public WorkspaceArgs build() {
            return $;
        }
    }

}
