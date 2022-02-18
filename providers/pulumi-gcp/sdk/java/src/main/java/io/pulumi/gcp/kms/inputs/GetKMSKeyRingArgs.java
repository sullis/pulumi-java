// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKMSKeyRingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetKMSKeyRingArgs Empty = new GetKMSKeyRingArgs();

    /**
     * The Google Cloud Platform location for the KeyRing.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     * 
     */
    @InputImport(name="location", required=true)
    private final String location;

    public String getLocation() {
        return this.location;
    }

    /**
     * The KeyRing's name.
     * A KeyRing name must exist within the provided location and match the regular expression `[a-zA-Z0-9_-]{1,63}`
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetKMSKeyRingArgs(
        String location,
        String name,
        @Nullable String project) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.project = project;
    }

    private GetKMSKeyRingArgs() {
        this.location = null;
        this.name = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKMSKeyRingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String name;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKMSKeyRingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetKMSKeyRingArgs build() {
            return new GetKMSKeyRingArgs(location, name, project);
        }
    }
}
