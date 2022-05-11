// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspacePrivateEndpointConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspacePrivateEndpointConnectionArgs Empty = new WorkspacePrivateEndpointConnectionArgs();

    /**
     * The ID of the Healthcare Workspace.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the Healthcare Workspace.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Specifies the name of the Healthcare Workspace. Changing this forces a new Healthcare Workspace to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Healthcare Workspace. Changing this forces a new Healthcare Workspace to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private WorkspacePrivateEndpointConnectionArgs() {}

    private WorkspacePrivateEndpointConnectionArgs(WorkspacePrivateEndpointConnectionArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspacePrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspacePrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new WorkspacePrivateEndpointConnectionArgs();
        }

        public Builder(WorkspacePrivateEndpointConnectionArgs defaults) {
            $ = new WorkspacePrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Healthcare Workspace.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Healthcare Workspace.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name Specifies the name of the Healthcare Workspace. Changing this forces a new Healthcare Workspace to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Healthcare Workspace. Changing this forces a new Healthcare Workspace to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public WorkspacePrivateEndpointConnectionArgs build() {
            return $;
        }
    }

}
