// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNodeTypesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNodeTypesArgs Empty = new GetNodeTypesArgs();

    /**
     * ID of the project to list available node types for.
     * Should match the project the nodes of this type will be deployed to.
     * Defaults to the project that the provider is authenticated with.
     * 
     */
    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    /**
     * The zone to list node types for. Should be in zone of intended node groups and region of referencing node template. If `zone` is not specified, the provider-level zone must be set and is used
     * instead.
     * 
     */
    @InputImport(name="zone")
    private final @Nullable String zone;

    public Optional<String> getZone() {
        return this.zone == null ? Optional.empty() : Optional.ofNullable(this.zone);
    }

    public GetNodeTypesArgs(
        @Nullable String project,
        @Nullable String zone) {
        this.project = project;
        this.zone = zone;
    }

    private GetNodeTypesArgs() {
        this.project = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private @Nullable String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeTypesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }

        public GetNodeTypesArgs build() {
            return new GetNodeTypesArgs(project, zone);
        }
    }
}
