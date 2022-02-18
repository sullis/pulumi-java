// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.firebase.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectLocationState extends io.pulumi.resources.ResourceArgs {

    public static final ProjectLocationState Empty = new ProjectLocationState();

    /**
     * The ID of the default GCP resource location for the Project. The location must be one of the available GCP
     * resource locations.
     * 
     */
    @InputImport(name="locationId")
    private final @Nullable Input<String> locationId;

    public Input<String> getLocationId() {
        return this.locationId == null ? Input.empty() : this.locationId;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public ProjectLocationState(
        @Nullable Input<String> locationId,
        @Nullable Input<String> project) {
        this.locationId = locationId;
        this.project = project;
    }

    private ProjectLocationState() {
        this.locationId = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectLocationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> locationId;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectLocationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locationId = defaults.locationId;
    	      this.project = defaults.project;
        }

        public Builder setLocationId(@Nullable Input<String> locationId) {
            this.locationId = locationId;
            return this;
        }

        public Builder setLocationId(@Nullable String locationId) {
            this.locationId = Input.ofNullable(locationId);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public ProjectLocationState build() {
            return new ProjectLocationState(locationId, project);
        }
    }
}
